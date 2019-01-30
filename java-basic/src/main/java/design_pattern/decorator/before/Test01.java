package design_pattern.decorator.before;

public class Test01 {

  public static void main(String[] args) {
    //전기차 트럭을 만들어 보자

    // hybrid를 상속 받고 트럭 기능을 덛붙인다


    HybridTruck c1 = new HybridTruck();
    c1.dump();


    HybridConvertible c2 = new HybridConvertible();
    c2.open(true);
    c2.run2();
  }

}
