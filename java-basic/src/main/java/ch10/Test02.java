package ch10;
// 인스턴스 맴버

class My2{
  // 1) 인스턴스 필드
  int a = 100;
  My2(){
    System.out.println("생성자 호출 = a " + this.a);
  }
  // 인스턴스 블록
  {
    System.out.println("인스턴스블록 실행 ! a=> ? " + this.a);
  }
  {
    System.out.println("여러개의 인스턴스블록 실행 !");
  }
  
  void m1() {
    System.out.println("인스턴스 메서드 : m1");
  }
  
  
}

public class Test02 {
  public static void main(String[] args) {
   new My2();
  }
}
