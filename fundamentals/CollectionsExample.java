import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
  int age;
  String name;

  public Student(int age, String name){
    this.age = age;
    this.name = name;
  }

  public int compareTo(Student that){
    if(that.age > this.age)
      return -1;
    
    return 1;
  }

  public String toString(){
    return this.name + " is " + this.age + "'s old.";
  }
}

public class CollectionsExample {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();

    nums.add(25);
    nums.add(67);
    nums.add(34);
    nums.add(9);

    Collections.sort(nums);

    System.out.println(nums);


    List<String> strs = new ArrayList<>();

    strs.add("some");
    strs.add("dog");
    strs.add("elephant");
    strs.add("lion");

    Comparator<String> cmp = (String i, String j) -> {
        if(i.length() < j.length())
          return -1;
        
        return 1;
    };

    Collections.sort(strs, cmp);

    System.out.println(strs);

    List<Student> studs = new ArrayList<>();
    studs.add(new Student(12, "naveed"));
    studs.add(new Student(8, "jaanu"));
    studs.add(new Student(5, "liyaz"));
    studs.add(new Student(19, "nazma"));

    Collections.sort(studs);

    for(Student s : studs){
      System.out.println(s);
    }
  }
}
