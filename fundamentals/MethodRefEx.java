import java.util.Arrays;
import java.util.List;

class Student{
  String name;

  Student(String name){
    this.name = name;
  }
}

public class MethodRefEx {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("some", "this", "that", "than");

    // method reference
    List<String> upperNames = names.stream().map(String::toUpperCase).toList();

    upperNames.forEach(System.out::println);
    upperNames.forEach(MethodRefEx::print);


    //constructor reference
    List<Student> studs = names.stream().map(Student::new).toList();
    studs.forEach(System.out::println);
  }

  static public void print(Object o){
    System.out.println(o);
  }
}
