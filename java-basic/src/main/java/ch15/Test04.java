package ch15;

//object 클래스 - thString()을 오버라이딩할때
class My4 /*extends Object*/ {
  String name;
  int age;
  //

  /*
  @Override
  public String toString() {
    return name + "," + age;
  }
   */
}



public class Test04 {

  public static void main(String[] args) {
    My4 obj1 = new My4();
    obj1.name = "홍길동";
    obj1.age = 20;
    My4 obj2 = new My4();
    obj2.name = "홍길동";
    obj2.age = 20;
  
    System.out.println(obj1 == obj2);
  
    // Object에서 상속 받는 equals는 인스턴스가 같은지 비교한다.
    
    System.out.println(obj1.equals(obj2));
  
  }

}
