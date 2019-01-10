package ch06;

//매서드 - JVM 아규먼
public class Test16 {

  public static void main(String[] args) {
    //                                위 args 파라미터


    String value1 = System.getProperty("a");
    String value2 = System.getProperty("b");
    String value3 = System.getProperty("c");
    System.out.println(value1);
    System.out.println(value2);
    System.out.println(value3);
    
    
  }
}
