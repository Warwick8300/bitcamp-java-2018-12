package ch13.f;
//수퍼 클래스를 지정하지 않으면 자동으로 java.lang.Object를 상속받는다.
public class A {
  private int v1 =100;

  public A(){
   super();// 수퍼클래스는 제일 맨위에 있어야한다
    System.out.println("A.A()");
  }
  public void m1() {
    System.out.printf("A.v1 = %d\n",this.v1);
  }

}
