package ch08;
// 그 밖의 클래스 맴버들
class My4  {
  //클래스 필드 = 스태틱 필드(변수)
  //클래스가 로딩될 때 생성되는 변수
  static int a;
  //클래스 블록 = 스태틱 블록
  static {
    System.out.println("오호라");
  }
  static {
    System.out.println("이것이 스태틱 블록이네 !여러개를 선언할수 있네");
  }
  static void m1() {
    System.out.println("나를 호출");
  }


}

public class Test05 {

  public static void main(String[] args) {
    System.out.println("**************************");
    My4 obj1; //= new My4();
    System.out.println("**************************");
    // My4.a  = 300;      
 // obj1.m1();
    
    //  My4.m1();
    //My4.m1();
  }
}
