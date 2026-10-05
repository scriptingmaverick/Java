class parent{
  public void display(){
    System.out.println("Parent's display method");
  }
}

class Child extends parent{
  public void display(){
    System.out.println("Child's display method");
  }
}

public class Method_overriding {
  public static void main(String[] args){
    Child child = new Child();
    child.display(); // Calls Child's display method
  }
}
