package ch06;

//매서드 - jvm 아규먼트 응용
public class Test17 {

  public static void main(String[] args) {
    //                                위 args 파라미터


    String value1 = System.getProperty("name");
    int kor = Integer.parseInt(System.getProperty("kor"));
    int eng = Integer.parseInt(System.getProperty("eng"));
    int math = Integer.parseInt(System.getProperty("math"));
    int sum = kor + eng + math;


    System.out.printf("이름 : %s\n", value1);
    System.out.printf("합계 : %s\n", sum);
    System.out.printf("평균 : %s\n", sum/3f);


  }
}
