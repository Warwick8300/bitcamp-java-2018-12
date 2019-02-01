package ch19.h;
//Lambda 문법 - 람다 문법 파라미터2
public class Test04 {
  
  //functional interface
  static interface Player{
    void play(String name,int age);
  }

  public static void main(String[] args) {
      

    Player p1 = (String name, int age) 
        -> System.out.printf("%s(%d)님 환영",name,age);
    p1.play("홍길",11);
    
    
    Player p2 = ( name, age) 
        -> System.out.printf("%s(%d)님 환영",name,age);
    p2.play("꺽억",22);
    /*
    Player p23 =  name, age
        -> System.out.printf("%s(%d)님 환영",name,age);
    p3.play("꺽억",22);
    */
  }
  
}
