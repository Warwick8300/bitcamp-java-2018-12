package ch14.f;

public abstract class Car {
  String model;
  int cc;
  
  
  //서브 클래스 마다 달리는 방식이 다를경우 
  //
  //몸체(method body) 
  
  public abstract void run();
  public void stop() {
    System.out.println("멈춘다");
  }

}
