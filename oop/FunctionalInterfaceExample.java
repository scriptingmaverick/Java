@FunctionalInterface 
interface A{
  void display();
}

@FunctionalInterface 
interface Calc{
  int add(int a, int b);
}

public class FunctionalInterfaceExample {
  public static void main(String[] args) {

    A a = new A() {
      @Override
      public void display() {
        System.out.println("This is a functional interface implementation using anonymous inner class");
      }
    };

    a.display();

    A obj = () -> System.out.println("This is a functional interface implementation using lambda expression");
    obj.display();

    Calc calc = (a1, b1) -> a1 + b1;
    
    System.out.println("Sum: " + calc.add(5, 10));
  }
}
