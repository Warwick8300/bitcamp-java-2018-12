package ch19.c;


//상수를 다른클래스로 분류 한 후
public class Test01 {

  public static void main(String[] args) {
    //  
    Product p =  new Product();
    
    p.maker = "비트컴퓨터";
    p.title = "비트마우스";
    p.price = 9800;
    p.category = Category.COMPUTER_MOUSE;
    
    
  }

}
