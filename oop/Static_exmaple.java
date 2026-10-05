class Mobile{
  int price;
  String brand;
  static String category;

  public void show(){
    System.out.println("Price: " + price);
    System.out.println("Brand: " + brand);
    System.out.println("Category: " + category);
  }

  public static void displayCategory(Mobile mobile){
    System.out.println("Price: " + mobile.price + " Brand: " + mobile.brand + " Category: " + category);
  }
}

public class Static_exmaple {
  public static void main(String[] args) {

    Mobile.category = "Electronics";

    Mobile mobile1 = new Mobile();
    mobile1.price = 1000;
    mobile1.brand = "Brand A";

    Mobile mobile2 = new Mobile();
    mobile2.price = 1500;
    mobile2.brand = "Brand B";

    mobile1.category = "Gadgets"; // Changing the static variable for all instances

    System.out.println("Mobile 1 Details:");
    mobile1.show();

    System.out.println("\nMobile 2 Details:");
    mobile2.show();

    Mobile.displayCategory(mobile1);
  }
}
