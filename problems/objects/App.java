public class App { 
  public static void main(String[] args){
    Rectangle rectangle = new Rectangle();
    System.out.println("Rectangle of 5 rows and 10 columns");
    rectangle.drawRectangle(5, 10);

    System.out.println("\n\n");

    Square square = new Square();
    System.out.println("Square of side length 5");
    square.drawSquare(5);
  }
}
