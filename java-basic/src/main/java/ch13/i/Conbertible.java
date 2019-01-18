package ch13.i;
//상송ㄱ generalization(일반화) 수행후
public class Conbertible extends Car {
  
  boolean open;

  public void openRoof() {
    open = true;
  }
  public void clossRoof() {
    open = false;
  }
}
