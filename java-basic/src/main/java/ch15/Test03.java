package ch15;

//object 클래스 - thString()을 오버라이딩할때
class My3 /*extends Object*/ {
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



public class Test03 {

  public static void main(String[] args) {
    My3 obj1 = new My3();
    obj1.name = "홍길동";
    obj1.age = 20;
    System.out.println(obj1.toString()
       );
  }

}
