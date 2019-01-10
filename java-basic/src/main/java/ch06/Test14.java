package ch06;

//매서드 - 메인 메소드의 파라미터응용
public class Test14 {

  public static void main(String[] args) {
    //                                위 args 파라미터

    //합계를 출력하는 프로그램 작성
    // java -cp ./bin/main ch06.Test14 200 43 56
    int sum = 0;
    System.out.println("======================");
    for (String arg : args) {
      sum += Integer.parseInt(arg);
      System.out.printf("합계 : %d\n", sum);
    }
    System.out.printf("합계 : %d\n", sum);
    System.out.println("------------------------");


  }
}
