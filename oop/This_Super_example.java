class A{
  public A(){
    System.out.println("A's constructor");
  }

  public A(int n){
    System.out.println("A's constructor with parameter: " + n);
  }
}

class B extends A{
  public B(){
    super(); // Calls A's default constructor
    System.out.println("B's constructor");
  }

  public B(int n){
    // super(n); // Calls A's parameterized constructor
    this();
    System.out.println("B's constructor with parameter: " + n);
    // this(); // It must be the first statement in the constructor
  }
}

public class This_Super_example {
  public static void main(String[] args){
    B b1 = new B(); // Calls B's default constructor
    System.out.println();

    B b2 = new B(10); // Calls B's parameterized constructor
  }
}
