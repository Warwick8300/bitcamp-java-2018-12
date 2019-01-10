package ch06;

//매서드 - 메인 메소드의 파라미터응용
public class Test15 {

  public static void main(String[] args) {
    //                                위 args 파라미터

    //합계를 출력하는 프로그램 작성
    // 학생의 이름 과 국영수 점수를 입력 받아 총점과 평균을 출력하라
    // 이름 :홍길동
    // 총점 :290
    // 평균 : 96
    
    int sum = 0;
    System.out.println("======================");
    for (String arg : args) {
      //if(args)
      sum += Integer.parseInt(arg);
      System.out.printf("합계 : %d\n", sum);
    }
    System.out.printf("합계 : %d\n", sum);
    System.out.println("------------------------");


  }
}
