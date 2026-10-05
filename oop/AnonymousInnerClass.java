class A{
  int value = 10;

  void display(){
    System.out.println("Value: " + value);
  }
}

public class AnonymousInnerClass {
  public static void main(String[] args) {
    A a = new A();
    a.display();

    A b = new A() {
      void display() {
        System.out.println("Overridden Value: " + value);
        System.out.println("calling show() method from anonymous inner class");
        show();
      }

      void show() {
        System.out.println("Value: " + value);
      }
    };

    b.display();

    // b.show(); // This line will cause a compilation error because the show() method is not accessible from the reference type A.
  }
}
