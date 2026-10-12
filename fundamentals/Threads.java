class A extends Thread{
  public void run(){
    for(int i = 0; i < 10; i++){
      System.out.println("Hi");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class B implements Runnable{
  public void run(){
    for(int i = 0; i < 10; i++){
      System.out.println("Hello");
       try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class Threads {
  public static void main(String[] a){
    A obj = new A();
    Runnable obj2 = new B();

    Thread t1 = new Thread(obj2);

    obj.start();
    t1.start();
  }
}
