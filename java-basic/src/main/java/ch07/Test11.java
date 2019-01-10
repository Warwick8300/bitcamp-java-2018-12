package ch07;

import ch07.sub.*;
public class Test11 {
  
  
  public static void main(String[] args) {
  // 다른 패키지의 클래스를 사용하려면 패키지명 까지 지정해야 한다.
    ch07.sub.Score12 s1 = new ch07.sub.Score12();
    // 문제는 코드가 길어 진다는 것이다.
    // 이를 해결하기 위해 자바는 import 라는 명령을 제공한다.
    Score12 s2 = new Score12();
    
  }
}

