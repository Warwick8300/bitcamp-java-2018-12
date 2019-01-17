package ch13.f;

public class B extends A {
  private int v2 =200;
  public B(){
    super(); // a클래스의 기본 생성자 호출
    System.out.println("B.B()");
  }
  public void m2() {
    System.out.printf("B.v2 = %d\n",this.v2);
  }

}
