package ch07;
//패키지 맴버 클래스 와 중첩 클래스(nested class)

// 패키지 맴버 클래스
// 단독으로 선언 하는 클래스이다.
class Score1 {
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
}

public class Test09 {
  //중첩클래스
  static class Score2 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  //논 스태틱 중첩 클래스
  class Score3 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  
  public static void main(String[] args) {
   //로컬 클래스
    class Score4 {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }
    //익명 클래스 (Anonymous class)
    
    Object obj = new Object() {
      String name;
      int age;
    };    
  }
  static void m1(){
    
    Score1 s1 = new Score1();
    Score2 s2 = new Score2();
    //Score3 s3 = new Score3();
    
    //Score4 s4 = new Score4();
  }
  
    void m2(){
    
    Score1 s1 = new Score1();
    Score2 s2 = new Score2();
    Score3 s3 = new Score3();
    
    //Score4 s4 = new Score4();
  }
}

