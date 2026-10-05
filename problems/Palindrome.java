public class Palindrome {
  public static void main(String[] a){
    int number = 122;

    int orig_num = number;

    int palindrome = 0;
    while(number > 0){
      int remainder = number % 10;
      palindrome = palindrome * 10 + remainder;
      number = number / 10;
    }

    System.out.println(orig_num + " is" + (orig_num == palindrome ? "" : "n't") + " a palindrome");
  }  
}
