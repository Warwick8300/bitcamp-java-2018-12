package ch14.b;
// 오버라이딩 규칙

public class B extends A{
  
  // 오버라이딩 규칙
  //파라 미터 의 이름은 상관없다.
  // @Override void m1(int XX) {} //ok
  //@Override int m1(int a) {} // 컴파일 오류 ;
 // @Override void m1(long a) {} // 컴파일 오류 ;
 // @Override void m1(long a, int b) {} // 컴파일 오류 ;
  
 /// @Override private void m1(int a) {} // 컴파일 오류 ;
 @Override protected void m1(int a) {} // ok;
  //@Override public void m1(int a) {} // ok ;
  
  
  //@Override void m2(String a, int b) {} // ok ;
 // @Override protected void m2(String a, int b) {} // 컴파일 오류 ;
 @Override public void m2(String a, int b) {} // ok ;

 

}
