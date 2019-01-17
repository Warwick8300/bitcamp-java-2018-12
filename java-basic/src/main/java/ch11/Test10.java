package ch11;
// Wrapper 클래스와 오토 박싱(auto-boxing)/오토 언박싱 (auto-unboxiing)

public class Test10 {
  public static void main(String[] args) {
  
    Integer obj1 = Integer.valueOf(100); // boxing
    int i1 = obj1.intValue(); //unboxing
    
    int i2 = obj1; // auto-unboxing
    Integer obj2 = 200;// auto-boxing

  }
 }