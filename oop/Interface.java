interface Computer{
  abstract void code();
}

class Laptop implements Computer{
  public void code(){
    System.out.println("Coding on Laptop");
  }
}

class Desktop implements Computer{
  public void code(){
    System.out.println("Coding on Desktop");
  }
}

public class Interface {
  public static void main(String[] args) {
    Computer laptop = new Laptop();
    Computer desktop = new Desktop();

    laptop.code();
    desktop.code();
  }
}
