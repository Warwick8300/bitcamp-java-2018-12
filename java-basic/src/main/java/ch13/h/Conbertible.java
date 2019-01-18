package ch13.h;
//상송ㄱ generalization(일반화) 수행전
public class Conbertible {
  String model;;
  int cc;
  boolean open;
  public void run() {
    System.out.println("달린다");
  }
  public void stop() {
    System.out.println("멈춘다");
  }
  public void openRoof() {
    open = true;
  }
  public void clossRoof() {
    open = false;
  }
}
