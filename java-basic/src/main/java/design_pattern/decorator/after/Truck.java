package design_pattern.decorator.after;

public class Truck extends Car {
  int weight;
  @Override
  public void run() {
    System.out.println("덜컹 덜컹 달린다.");
  }
 

}
