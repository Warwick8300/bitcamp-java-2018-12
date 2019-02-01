package ch19.h;
//Lambda 문법 - functional interface를 효과적으로 다루는 문법
public class Test01 {
  
  //functional interface
  static interface Player{
    void play();
  }

  public static void main(String[] args) {
      
    // 익명 클래스로 인터페이스 구현
    
    Player p1 = new Player() {
      public void play() {
        System.out.println("테스트1");
      }
    };
    p1.play();
    Player p2 = () -> {
      
        System.out.println("테스트1");
      
    };
    p2.play();
  }

}
