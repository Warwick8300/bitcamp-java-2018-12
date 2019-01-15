package ch11;
// Wrapper 클래스와 오토 박싱(auto-boxing)

public class Test09 {
  public static void main(String[] args) {
    StringBuffer b1 = new StringBuffer("Hello");
    
    StringBuffer b2 = new StringBuffer("Hello");
    System.out.println(b1==b2);
    
    
    System.out.println(b1.equals(b2));
    
  }
}