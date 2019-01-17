package ch14.b;
// this 키워드와 super 키워드
public class D2 extends D1 {
 
  @Override
  void m1() {
    System.out.println("D2.m1()");
  }
  @Override
   void m2() {
    System.out.println("D2.m2()");
  }
  void test() {
    this.m4();
    super.m4();
    this. m3();
    super.m3();
    this.m1();
    super.m1();
  
    this.m2();
    super.m2();
    
  }
  public static void main(String[] args) {
    D3 obj = new D3();

    obj.test();
  }
}
