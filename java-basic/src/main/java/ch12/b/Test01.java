package ch12.b;
// 캡슐화 (encapsulation) 필요성 - 사례 1
public class Test01 {

  public static void main(String[] args) {
   Calculator c = new Calculator();
   c.plus(100);
   c.plus(15);
   c.minus(27);
   System.out.println(c.getResult());
  
   Calculator c2 = new Calculator();
   c2.plus(100);
   c2.plus(15);
   c2.setResult(100);
   c2.minus(27);
   System.out.println(c2.getResult());
  }

  

}
