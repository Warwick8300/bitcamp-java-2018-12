package ch06;

//매서드 - 메인 메소드의 파라미터
public class Test13 {

  public static void main(String[] args) {
    //                                위 args 파라미터
    System.out.println("======================");
    for (String arg : args)
      System.out.println(arg);
System.out.println("------------------------");
  }
  static int sum1(int a,int b) {
    return a + b;
  }
 
}




