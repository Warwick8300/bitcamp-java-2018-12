package ch14.f;

public class Test01 {

  public static void main(String[] args) {
    //레퍼런스 변수 선언
    
    A obj;
    obj = new A();
    obj.m1();
    
    //서브 클래스 (타입)의 인스턴스 주소 저장
    obj = new B();
    //obj.m2();
    
    obj.m1();
    
  }

}
