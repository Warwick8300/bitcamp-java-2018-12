package ch07;
//인스턴스 배열?
public class Test08 {
  static class Score{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }
  public static void main(String[] args) {
    
    // 낱개 변수 선언
    int v1, v2, v3;
    //int배열
    int[] value = new int[3];
    // values : 배열의 주소를 담는 변수 (레퍼런스)
    // new int[3] : int 변수 3개 생성한다 . 각 항목에 저장하는 갑은 int 값
    
    Score s1, s2, s3;
    
    Score [] scores = new Score[3];
    // scores : 배열의 주소를 저장하는 레퍼런스
    // new Score[3] : Score 레퍼런스를 3개 생성한다. 주의 인스턴스를생성하는 것이 아니다.
    // 인스턴스 배열을 만들 수는 없다. 자바에서

    // 레퍼런스 배열을 생성하면 모든 항목이 null로 초기화된다
    // 아직 레퍼런스 배열의 각 항목에 인스턴스 주소가 없는 상태이다.
    // 이런 상태에서 레퍼런스 배열에 있는 항복을 사용하면 nullpointerException 오류가 발생한다
    //System.out.println(scores[0].name); // 실행 오류 (runtime exception 발생);
             
    //배열 레퍼런스에 인스턴스 주소를 넣은 다음에 사용하라
    scores[0] = new Score();
    scores[1] = new Score();
    scores[2] = new Score();
    
    System.out.println(scores[0].name);
    System.out.println(scores[0].kor);
    

  }
}

