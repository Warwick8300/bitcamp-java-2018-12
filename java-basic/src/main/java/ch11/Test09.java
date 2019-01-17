package ch11;

import java.util.Date;

// Wrapper 클래스

public class Test09 {
  public static void main(String[] args) {
    StringBuffer b1 = new StringBuffer("Hello");


    Integer i1 = new Integer(100); // 가능한 사용하지 말자
    Integer i2 = Integer.valueOf(100);
    Character c1 = new Character('가');
    Character c2 = Character.valueOf('가');


    //Wrapper클래스

    byte b = i2.byteValue();
    String s = i2.toString();
    String str =Integer.toHexString(200);

    printInt(100);
    printFloat(3.14f);
    //printInt("hello");
    
    Integer x = Integer.valueOf(1000);
    float y = Float.valueOf(3.14f);
    String z = "Hello";
    Date today = new Date();
    
    printFloat(y);
    printObject(x);
    printObject(y);
    printObject(z);
    printObject(today);

  }
  static void printInt(int i) {
    System.out.printf("값 = > %d\n",i);

  }

  static void printFloat(float f) {
    System.out.println("값 => " + f);
  }
  static void printObject(Object obj) {
    System.out.println("값 = > "+ obj.toString());
  }
}