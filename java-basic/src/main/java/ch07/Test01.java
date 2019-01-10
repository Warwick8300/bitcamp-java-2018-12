package ch07;
// 클래스 사용전
public class Test01 {

  public static void main(String[] args) {
   //학생의 성적 정보를 다루고 싶다.
    //학생의 성적 정보는 이름. 국어. 영어. 수학. 합계. 평균 값들로 되어 있다.
    // 자바는 우리가 원하는 형식의 값(성적 데이터을 저장할 수 있는 메모리 유형을 제공하지 않는다
    
    String name  = "홍길동";
    int kor = 100;
    int eng = 100;
    int math = 100;
    int sum = kor + eng + math;
    float aver = sum /3f;
    
    System.out.printf("%s : %d %d %d %d %f\n",name,kor,eng,math,sum,aver);
    
  }
}
