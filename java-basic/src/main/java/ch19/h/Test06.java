package ch19.h;
//Lambda 문법 - funcionalinterface의 자격
public class Test06 {

  //functional interface
  static interface Player{
    void play();
  }
  static interface Player2{
    static String info() {
      return "Player2입니다.";
    }
    //인터페이스는 디폴트 메서드를 가질수 있다.
    default void stop() {



    }
    void play();
  }

  static interface Player3{

    void play2();
    void play();
  }
  static abstract class Player4{
    public abstract void play();
  }




  public static void main(String[] args) {


    Player p1 = () -> System.out.println("player");; 
    p1.play();
    System.out.println();


    Player2 p2 = () -> System.out.println("player2...");; 
    p2.play();



    }

  }
