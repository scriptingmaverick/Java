abstract class Car{
  public abstract void drive();

  public void playMusic(){
    System.out.println("Playing music");
  }
}

class Wagonr extends Car{ // concrete class
  public void drive(){
    System.out.println("Driving Wagonr");
  }
}

public class AbstractExample {
  public static void main(String[] args) {
    Car car = new Wagonr();
    car.drive();
    car.playMusic();
  }
}
