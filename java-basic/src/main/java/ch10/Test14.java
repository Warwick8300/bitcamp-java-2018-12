package ch10;
//생성자 활용 -String 클래스의 생성자 활


public class Test14 {
  public static void main(String[] args) throws Exception {
    String s1 = new String();
    // ==>내부저으로 문자의 코드 값을 저장할 char 배열(1.8버전까지) 또는 byte 배열(1.9부터)
    System.out.println(s1);//빈문자열출력

    String s2 = new String("hello");

    char[] chars = {'H','e','l',','};
    String s3 = new String(chars);

    byte[] bytes = {(byte)0xb0,(byte)0xa1,(byte)0xb0,(byte)0xa2,0x30,0x31,0x32};
    String s4 = new String(bytes);
    //한글이 깨진다. 이유?
    // String 생성자는 
    String s5 = new String(bytes,"euc-kr");
    byte[] bytes2 = {(byte)0xac, (byte)0x00, (byte)0xac, (byte)0x01,0x00, 0x61,0x00,0x62,0x00,0x63};
    String s6 = new String(bytes2,"utf-16");
    byte[] bytes3 = {(byte)0xea, (byte)0xb0, (byte)0x80, (byte)0xea,(byte)0xb0, (byte)0x81,0x61,0x62,0x63};
    String s7 = new String(bytes3,"utf-8");
    
    
    
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s6);
    System.out.println(s7);

  }
}