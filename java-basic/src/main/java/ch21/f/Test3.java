// try-with-resources 문법 확인
package ch21.f;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

public class Test3 {
  
  

  static class MyResource1{
    
    public int divide(int a, int b) {
      return a/b;
    }
    public void close() {
      System.out.println("MyResourec1.close()");
    }
  }
  static class MyResource2 implements AutoCloseable{
    
    public int divide(int a, int b) {
      return a/b;
    }
    @Override
    public void close() {
      System.out.println("MyResourec2.close()");
    }
  }

  public static void main(String[] args){
    
    try( /*MyResource1 r1 = new MyResource1();*/
        MyResource2 r2 = new MyResource2();){
      System.out.println(r2.divide(10,2));
      System.out.println(r2.divide(10,0));
    }catch (Exception e) {
      System.out.println("에외");
      }
    
    
    
    
    
    System.out.println("프로그램종료");
    
  }
  

}



