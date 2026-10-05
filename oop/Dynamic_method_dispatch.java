class parent {
  void display(){
    System.out.println("Parent's display method");
  }
}

class Child extends parent {
  void display(){
    System.out.println("Child's display method");
  }
}

class GrandChild extends Child {
  void display(){
    System.out.println("GrandChild's display method");
  }
}

public class Dynamic_method_dispatch {
  public static void main(String[] args){
    parent obj = new parent();
    obj.display(); // Calls Parent's display method

    obj = new Child();
    obj.display(); // Calls Child's display method

    obj = new GrandChild();
    obj.display(); // Calls GrandChild's display method
  } 
}
