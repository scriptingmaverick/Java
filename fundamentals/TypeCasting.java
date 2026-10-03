public class TypeCasting {
    public static void main(String[] args) {
       System.out.println("Type Casting and conversion in Java");

       int num1 = 1203;
       int num2 = 12;

       byte num = 10;

       System.out.println("Integer: " + num1);
       System.out.println("Byte: " + num);
       System.out.println("Integer: " + num2);

       num = (byte) num2; // Explicit type casting from int to byte
       System.out.println("After type casting from int to byte: " + num);

       num1 = num; // Explicit type conversion from byte to int
       System.out.println("After type conversion from byte to int: " + num1);
    }
}
