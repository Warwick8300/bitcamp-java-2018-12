package ch11;
// String 클래스 사용법 -String 인스턴스에 있는 값을 비교하기 : equals()

public class Test03 {
  public static void main(String[] args) {
    
    
    String s1 = new String("Hello"); // 힙에 생성된다.
    String s2 = new String("Hello"); // 힙에 생성된다.
   
     
    if( s1 == s2)
      System.out.println("s1 == s2");
    else
      System.out.println("s1 != s2");
    if( s1.equals(s2))//인스턴스에 있는 문자열이 같은지 비교한다.
      System.out.println("문자열같다");
    else
      System.out.println("문자열이 다르다");
    
    String s3 = "hello";
    String s4 = "HELLO";
    if(s3.equals(s4))// 대소문자 구분
      System.out.println("같다");
    else
      System.out.println("다르다");
    if(s3.equalsIgnoreCase(s4))// 대소문자 구분
      System.out.println("같다");
    else
      System.out.println("다르다");

    
  }
}