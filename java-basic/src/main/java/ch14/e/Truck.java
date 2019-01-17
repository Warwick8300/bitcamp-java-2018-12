package ch14.e;

public class Truck extends Car {
  int weight; // 짐싣는 무게
  
  
  @Override
  public void run() {
    System.out.println("썡썡달린다.");
  }
}
