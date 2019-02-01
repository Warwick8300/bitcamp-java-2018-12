package ch19.h;
//Lambda 문법 - 람다 문법 body
public class Test02 {
  
  //functional interface
  static interface Player{
    void play();
  }

  public static void main(String[] args) {
      

    Player p1 = () -> System.out.println("테스트1");
      
    p1.play();
    Player p2 = () ->{ System.out.println("테스트1");};
    
    p2.play();
  }

}
