package ch07;
// 클래스 레퍼런스와 인스턴스
public class Test04 {

  static class Score{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  public static void main(String[] args) {
   
    Score s1 ; // 설계도에 따라 준비한 메모리
    
    s1 = new Score();// 설계도에 따라 메모리(변수들)를 준비시킨다.
                        // 그리고 메모리 주소를 레퍼런스에 저장한다
    Score s2 = new Score();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 100;
    s1.math = 100;
    
    s2.name = "임꺽정";
    s2.kor = 90;
    s2.eng = 90;
    s2.math = 90;

    printScore(s1);
    printScore(s2);

  }
  //유지 보수 
  static void printScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum /3f;
    System.out.printf("%s : %d %d %d %d %f\n",
        s.name,s.kor,s.eng,s.math,s.sum,s.aver);    
  }
}


