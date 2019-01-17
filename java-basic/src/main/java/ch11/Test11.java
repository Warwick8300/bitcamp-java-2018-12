package ch11;
// Wrapper 클래스의 생성자에 대한 고

public class Test11 {
  public static void main(String[] args) {
    Integer obj1 = new Integer (100);
    Integer obj2 = new Integer (100);
    
    if(obj1 == obj2)
      System.out.println("obj1 == obj2");
    else 
      System.out.println("다르다");
    
    System.out.println(obj1.equals(obj2)); // 값 비교
    System.out.println(obj1 == obj2); // 인스턴스 주소값 비교
  
    System.out.println("=-------------------------------");
    Integer obj3 = 100;
    Integer obj4 = Integer.valueOf(100);
    
    System.out.println(obj3.equals(obj4));
    System.out.println(obj3 == obj4);
  }
 }