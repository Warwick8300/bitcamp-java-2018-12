package ch15;
//Object 클래스 - getClass() : 와 배열 의 항목 이


public class Test14 {
  public static void main(String[] args) {
  
    String obj1 = new String();
    
  //레퍼런스를 통해서 인스턴스의 클래스 정보를 알아낼 수 있다.
  Class classInfo = obj1.getClass();
  System.out.println(classInfo.getName());


  String[] obj2 = new String[10];

  System.out.println(obj2.getClass().getComponentType().getName());
  

  }


}
