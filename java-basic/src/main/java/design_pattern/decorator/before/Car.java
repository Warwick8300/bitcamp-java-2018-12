package design_pattern.decorator.before;

public abstract class Car {

  protected int speed;
  public void start() {
    System.out.println("출발");
  }
  public void stop(){
    System.out.println("멈춘다");
  }
  public abstract void run();
}
