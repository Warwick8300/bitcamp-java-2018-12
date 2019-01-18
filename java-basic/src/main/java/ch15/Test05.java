package ch15;

//object 클래스 - thString()을 오버라이딩할때
class My5 /*extends Object*/ {
  String name;
  int age;
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    My5 other = (My5) obj;
    if (age != other.age)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }




}



public class Test05 {

  public static void main(String[] args) {
    My5 obj1 = new My5();
    obj1.name = "홍길동";
    obj1.age = 20;
    My5 obj2 = new My5();
    obj2.name = "홍길동";
    obj2.age = 20;

    System.out.println(obj1 == obj2);

    // Object에서 상속 받는 equals는 인스턴스가 같은지 비교한다.

    System.out.println(obj1.equals(obj2));

  }

}
