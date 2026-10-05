abstract class A{
  abstract void display();
}

public class AbstractOnymousClass {
  public static void main(String[] args) {
    A a = new A() {
      void display() {
        System.out.println("This is an anonymous inner class extending abstract class A");
      }
    };

    a.display();
  }
}
