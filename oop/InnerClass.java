class A{
  int value = 10;

  void display(){
    System.out.println("Value: " + value);
  }

  class B{
    void show(){
      System.out.println("Value from inner class: " + value);
    }
  }

  static class C{
    void print(){
      System.out.println("This is a static inner class");
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {
    A a = new A();
    a.display();

    A.B b = a.new B();
    b.show();

    A.C c = new A.C();
    c.print();
  }
}
