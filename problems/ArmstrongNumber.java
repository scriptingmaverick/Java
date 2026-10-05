public class ArmstrongNumber {
  public static void main(String[] a){
    Integer number = 154;

    int orig_num = number;
    int power = number.toString().length();

    int sum = 0;
    while(number > 0){
      int remainder = number % 10;
      sum += Math.pow(remainder, power);
      number = number / 10;
    }

    
    System.out.println(orig_num + " is" + (sum == orig_num ? "" : "n't") + " an armstrong number");
  }  
}
