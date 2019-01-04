//문자열 제어코드

package ch02;

public class Test10 {
  public static void main(String[] args) {
    System.out.println("hello, \n world!"); //줄바꿈
    System.out.println("hello, \r world!"); //줄바꿈
    System.out.println("hello,\b\bworld!"); //백스페이스 터미널은가능 이클립스는 잘안됨
    System.out.println("hello,\t\tworld!"); //텝
    System.out.println("hello,\fworld!"); 
    System.out.println("hello,\"w\"world!"); 
    System.out.println("hello,'w'world!");
    System.out.println('\'');
    System.out.println('"');
    System.out.println("hello,\\world!");
    


  }
}

