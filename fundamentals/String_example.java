public class String_example {
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "World";
    String str3 = str1 + " " + str2;

    System.out.println("String 1: " + str1);
    System.out.println("String 2: " + str2);
    System.out.println("Concatenated String: " + str3);

    int length = str3.length();
    System.out.println("Length of concatenated string: " + length);

    String upperCaseStr = str3.toUpperCase();
    System.out.println("Uppercase String: " + upperCaseStr);

    String lowerCaseStr = str3.toLowerCase();
    System.out.println("Lowercase String: " + lowerCaseStr);

    boolean containsHello = str3.contains("Hello");
    System.out.println("Does the concatenated string contain 'Hello'? " + containsHello);

    System.out.println("\n--------------------\nChecking 2 strings for equality: \n");

    String str4 = "Hello";
    boolean isEqual = str1 == str4;
    System.out.println("Are str1 and str4 equal? " + isEqual);

    String str5 = new String("Hello");
    System.out.println("Are str1 and str5 equal? " + (str1 == str5));

    String str6 = new String("Hello");
    System.out.println("Are str5 and str6 equal? " + (str5 == str6));
  }
  
}
