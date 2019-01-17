package ch14.c;
//오버 로딩 테스트
public class Test01 {
  public static void main(String[] args) {
    Calculator obj = new Calculator();
    
    obj.plus(100);
    obj.plus(20,30);
    obj.plus(new int[] { 30, 30 , 20});
    System.out.println(obj.result);
    
    Calculator2 obj2 = new Calculator2();
    obj2.plus(100);
    obj2.minus(50);
    obj2.minus(30,10);
    System.out.println(obj2.result);
  }
}
