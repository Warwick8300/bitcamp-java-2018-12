package ch13.f;

public class Y extends X {
  private int v2 =200;
  public Y(){
    //super(); // a클래스의 기본 생성자 호출
    super(500); // 이런경우 개발자가 호출할 수퍼클래스이 생성자를 명시    
    System.out.println("B.B()");
  }
  public void m2() {
    System.out.printf("B.v2 = %d\n",this.v2);
  }

}
