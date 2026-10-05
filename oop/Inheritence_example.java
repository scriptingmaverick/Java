class Calc {
  public int add(int a, int b){
    return a + b;
  }
  public int sub(int a, int b){
    return a - b;
  }
}

class AdvCalc extends Calc {
  public int mul(int a, int b){
    return a * b;
  }
  public int div(int a, int b){
    return a / b;
  }
}

public class Inheritence_example {
  public static void main(String[] args){
    Calc calc = new Calc();
    System.out.println("Addition of 10 and 20 is: " + calc.add(10, 20));
    System.out.println("Subtraction of 10 and 20 is: " + calc.sub(10, 20));

    AdvCalc advCalc = new AdvCalc();
    System.out.println("Addition of 10 and 20 is: " + advCalc.add(10, 20));
    System.out.println("Subtraction of 10 and 20 is: " + advCalc.sub(10, 20));
    System.out.println("Multiplication of 10 and 20 is: " + advCalc.mul(10, 20));
    System.out.println("Division of 10 and 20 is: " + advCalc.div(20, 10));
  }
}
