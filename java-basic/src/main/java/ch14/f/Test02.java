package ch14.f;
//다형적 변수의 규칙 2 형변환
public class Test02 {


  public static void main(String[] args) {

    A obj = new B();
    obj.m1();

    //obj.m2(); 
    B obj2 = (B) obj;
    obj2.m2();

    if(obj ==obj2) {
      System.out.println("같다");
    }
    A obj3 = new A();
    B obj4 = (B) obj3;//런타임 예외발생
    
    obj3.m1();
    obj4.m2();
    
    
  }
}
