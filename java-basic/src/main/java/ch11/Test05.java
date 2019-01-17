package ch11;
// String 클래스 사용법 - immutable 객체이다.(값을 바꿀수 없는객체이다).

public class Test05 {
  public static void main(String[] args) {
    
    
    String s1 = new String("Hello"); // 힙에 생성된다.
    System.out.println(s1);
  //String 인스턴스가 한번생성되면 절대로 값을 바꿀 수 없다.
    String s2 = s1.replace('l', 'x');
  String s3 = s1.replace("ll", "dd");
  System.out.println(s1);
  System.out.println(s1.hashCode());
  System.out.println(s2.hashCode());


  String s5 = "hoho";
  System.out.println(s5.hashCode());

  s1 = "hoho";
  System.out.println(s1.hashCode());
  
if (s5 == s1)
  System.out.println("dd");
  System.out.println(s1);
  System.out.println(s2);
System.out.println(s3);
  System.out.println(s1== s2);
  System.out.println(s1==s3);
  System.out.println(s2==s3);
  }
}