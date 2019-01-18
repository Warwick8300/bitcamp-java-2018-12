package ch15;

//object 클래스 - thString()을 오버라이딩할때
class My6 /*extends Object*/ {
  String name;
  int age;
}



public class Test06 {

  public static void main(String[] args) {
    My5 obj1 = new My5();
    obj1.name = "홍길동";
    obj1.age = 20;
    My5 obj2 = new My5();
    obj2.name = "홍길동";
    obj2.age = 20;
    
    System.out.println(Integer.toHexString(obj1.hashCode()));
    System.out.println(obj1);
    System.out.println(obj2.hashCode());
    System.out.println(obj2);
  }

}
