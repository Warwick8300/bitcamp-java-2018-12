package ch13.f;

public class X {
  private int v1 =100;

  public X(int value){
//   super();// 수퍼클래스는 제일 맨위에 있어야한다
//    System.out.println("A.A()");
  this.v1 = value;
  System.out.println("A.A()");
  }
  public void m1() {
    System.out.printf("A.v1 = %d\n",this.v1);
  }

}
