package ch13.j;
//추상 클래스 


public abstract class Car {
  
  String model;
  int cc;
  public void run() {
    System.out.println("달린다");
  }
  public void stop() {
    System.out.println("멈춘다");
  }
}
