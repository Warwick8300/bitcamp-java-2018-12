package ch06;

//매서드 - 로컬 변수의 스택 메모리 
public class Test10 {

  public static void main(String[] args) {
    int value = 0;
    m1(++value);
    System.out.println(value);
  }

  static void m1(int value)
  {
    m2(++value);
    System.out.println(value);
  }
  static void m2(int value)
  {
    m3(++value);
    System.out.println(value);
  }   
  static void m3(int value)
  {
    System.out.println(++value);
}

}
