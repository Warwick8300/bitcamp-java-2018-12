package ch15;

//object 클래스 -hashcode() 오버 라이딩
class My7 /*extends Object*/ {
  String name;
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + age;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }
  int age;
  
  //map에 값을 저장한는 key로 사용할 때 
}



public class Test07 {

  public static void main(String[] args) {
    My7 obj1 = new My7();
    obj1.name = "홍길동";
    obj1.age = 20;
    My7 obj2 = new My7();
    obj2.name = "홍길동";
    obj2.age = 20;
    
    System.out.println(obj1==obj2);
    
    System.out.println(Integer.toHexString(obj1.hashCode()));
    System.out.println(obj1);
    System.out.println(obj2.hashCode());
    System.out.println(obj2);
  }

}
