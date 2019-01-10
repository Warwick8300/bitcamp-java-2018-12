
package ch07;



// 클래스 레퍼런스와 인스턴스관
public class Test05 {

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

    s2 = s1;

    System.out.println(s2.name);
    s1.name = "임꺽정";
    System.out.println(s2.name);

    Score s3 = createScore("유관순", 90, 90, 90);
    System.out.println(s3.name);
    System.out.println(s3.kor);
  }

  static Score createScore(String name, int kor, int eng, int math) {
    Score s= new Score();
    s.name = name;
    s.kor = kor;
    s.eng = eng;
    s.math = math;
    s.sum = kor + eng + math;
    s.aver = s.sum / 3f;
    return s; // s에 저장된 인스턴스의 주소를 리턴한다
  }

}
