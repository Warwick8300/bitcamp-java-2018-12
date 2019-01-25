package ch19.d;

//static nested class응ㄹ 관리할떄 이점
//상수를 다른클래스로 분류 한 후
public final class Test01 {

  public static void main(String[] args) {
    //  
    Product p =  new Product();
    
    p.maker = "비트컴퓨터";
    p.title = "비트마우스";
    p.price = 9800;
    
    
    //OGNL 방식으로 표현 할 수 있다.
    
    //
    p.category = Category.computer.mouse.bluetooth;
    
    
  }

}
