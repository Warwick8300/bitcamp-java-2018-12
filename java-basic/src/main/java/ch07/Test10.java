package ch07;
//패키지 맴버 클래스 와 중첩 클래스(nested class)

// 패키지 맴버 클래스
// 단독으로 선언 하는 클래스이다.


public class Test10 {
  
  
  public static void main(String[] args) {
    Score10 s1 = new Score10();
    Score11 s2 = new Score11();
  
    // 공개된 패키지 맴버 클래스는 다른 패키지에서 사용할수 있다.
    ch07.sub.Score12 s3 = new ch07.sub.Score12();
    
    //공개 되지 않는 패키지 맴버 클래스는 다른 패키지에서 사용할수 없다.
    //ch07.sub.Score13 s4 = new ch07.sub.Score13();
  }
}

