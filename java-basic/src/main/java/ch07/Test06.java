package ch07;
//가비지, 가비지 컬렉터 그리고 레퍼런스 카운트 
public class Test06 {
  static class Score{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  public static void main(String[] args) {

    Score s1 = new Score();
    Score s2 = new Score();
    
    s2 = s1; // 가비지 
    
    s1 = new Score();
    
  }

}