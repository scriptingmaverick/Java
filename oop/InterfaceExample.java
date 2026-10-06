interface A{
  void show();
  void display();
}

interface B{
  void run();
}

class C implements A, B{
  public void show(){
    System.out.println("Show method from interface A");
  }

  public void display(){
    System.out.println("Display method from interface A");
  }

  public void run(){
    System.out.println("Run method from interface B");
  }
}

public class InterfaceExample {
 public static void main(String[] args) {
    A obj = new C();
    obj.show();
    obj.display();
    // obj.run();  // This line will cause a compilation error because the run() method is not accessible from the reference type A.

    B obj2 = new C();
    obj2.run(); 
    // obj2.show(); || obj2.display(); // These statements will cause a compilation error because the show() method is not accessible from the reference type B.

  } 
}
