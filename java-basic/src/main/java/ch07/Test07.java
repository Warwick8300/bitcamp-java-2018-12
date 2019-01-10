package ch07;
//로컬 변수와 인스턴스 필드(변수)의 초기화

public class Test07 {
  static class Score{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  public static void main(String[] args) {
    
    
    String name;
    int kor;
    int maht;
    int sum;
    float aver;
  //  System.out.println(name); 컴파일 오류 반드 시 한번은 초기화 해야함
    Score s = new Score();
    System.out.println(s.name);
    System.out.println(s.kor);
    System.out.println(s.aver);

  }
}

