package ch13.a;
// 기능확장 : 기존 코드를 가져와서 그냥 하는 방법
public class Test01 {
  public static void main(String[] args) {
    Calculator2 c1 = new Calculator2();
    c1.plus(5);
    c1.multiple(2);
    c1.minus(2);
    c1.divide(4);
    System.out.println(c1.getResult());
  }
}


