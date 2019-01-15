package ch11;
// String 클래스 사용법 - 문자열 리터럴로 String 인스턴스 생성하

public class Test02 {
  public static void main(String[] args) {
    
    
    String s1;
    s1 = "Hello";
    // String 레퍼런스에 문자열 리터럴을 할당하면 내부적으로 다음 코드로 바뀐다.
    // s1 = new String ("Hello");
    // 단 리터럴(값을 직접 작성한 것)
    
    String s2 = "Hello";
    String s3 = new String("Hello");
    if( s1 == s2)
      System.out.println("같다");
    else
      System.out.println("다르다");
  //instanceof 연산자
    // => 레퍼런스에 저장된 인스턴스 주소가 특정 클래스의 주소인지 확인하는 연산자
    System.out.println();
    
    System.out.println(s1 instanceof String);
    System.out.println(s2 instanceof String);
    System.out.println(s3 instanceof String);
  }
}