package ch08;
// 클래스 필드와 Method Area 메모리 영역
class My3  {

  int ia;

  static int sa ; // 클래스 필드 = 스태틱 필드 


}

public class Test03 {

  public static void main(String[] args) {
//
    My3.sa = 100;
    
    My3 obj1 = new My3();
    My3 obj2 = new My3();
    
    obj1.ia = 200;
    obj2.ia = 300;

    //My3.ia =500; 컴파일 오류
    obj1.sa = 500;//ok
    // 
    
    
    
  }
}
