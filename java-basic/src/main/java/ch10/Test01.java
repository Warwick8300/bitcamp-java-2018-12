package ch10;
// 클래스 필드와 인스턴스 필

class My1{
  //
  static int a;
  int b;
  
}

public class Test01 {
  public static void main(String[] args) {
    My1 obj1 = new My1();
    My1 obj2 = new My1();
    My1 obj3 = new My1();

    //스태틱 필드는 모든 인스턴스가 공유하는 변수
    My1.a = 100;//My1.a
    obj1.a = 200;//My1.a
    obj2.a = 300;//My1.a
    obj3.a = 400;  //My1.a
    
    System.out.println(My1.a);
    
    obj1.b = 200;//My1.a
    obj2.b = 300;//My1.a
    obj3.b = 400;  //My1.a
    
    //
    System.out.println(obj1.b);
    System.out.println(obj2.b);
    System.out.println(obj3.b);
    
    
  }
}
