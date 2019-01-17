package ch14.b;
//슈퍼 키워드
public class C extends A{

  @Override public void m1(int a) {
    super.m1(a);
  } 
  public void m4() {
    this.m1(100);
    this.m2("okok",100);
    super.m2("haha",100);
  }

  public static void main(String[] args) {
    C obj = new C();
    obj.m4();

  }
}
