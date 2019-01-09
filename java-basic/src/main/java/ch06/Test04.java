package ch06;

//매서드 - 파라미터와 리턴값
public class Test04 {

  public static void main(String[] args) {
    String str = greet("홍길동");
    System.out.println(str);
    System.out.println(greet("유관순"));
    
    int result = plus(10,20);
    System.out.println(10);
    System.out.println(plus(5,2));
  }
  
  //매소드 정의(definition)
  static String greet(String name)
  {
    return name + "님 반갑습니다";
  }
  static int plus(int a, int b)
  {
    return a + b;
  }
}















