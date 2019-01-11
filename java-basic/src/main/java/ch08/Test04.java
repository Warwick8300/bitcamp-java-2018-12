package ch08;
// 클래스 필드 공유
public class Test04 {
  static int a;
  public static void main(String[] args) {

    a = 100;
    System.out.println(a);
    m1();
    System.out.println(a);
    m2();
    System.out.println(a);
    
  }
  static void m1() {
    a= 200;    
  }
  static void m2() {
    a=300;
  }

}

