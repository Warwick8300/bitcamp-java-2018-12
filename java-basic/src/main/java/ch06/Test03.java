package ch06;

//매서드 - 매서드의 리턴값
public class Test03 {

  public static void main(String[] args) {
    int i = m2();
    String  s = m1();
    
    System.out.println(i + s);
    System.out.println(m1() + m2());
    
    //리턴값을 사용할 일이 없다면 메서드 호출할때 받지 않아도된다.
    m1();
    m2();
  }
  
  //매소드 정의(definition)
  static String m1()
  {
    return "구구";
  }
  static int m2()
  {
    return 4;
  }
}















