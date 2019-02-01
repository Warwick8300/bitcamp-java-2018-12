package ch19.h;
//Lambda 문법 - 람다 문법 파라미터1
public class Test03 {
  
  //functional interface
  static interface Player{
    void play(String name);
  }

  public static void main(String[] args) {
      

    Player p1 = (String name) -> System.out.println(name +"님환영합");
      
    p1.play("홍길");
    
    
    Player p2 = (name) -> System.out.println(name +"님환영합");
    p1.play("꺽정");
    
    
    Player p3 = name -> System.out.println(name +"님환영합");
    p1.play("관순");
    
  }
  
}
