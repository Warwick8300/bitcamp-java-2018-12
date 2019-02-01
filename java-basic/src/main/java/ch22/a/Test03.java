package ch22.a;

import java.io.File;

//java .io.File클래스 : 디렉토리 생성하기  
public class Test03 {

  public static void main(String[] args) throws Exception {


    File dir = new File("temp");

    if(dir.mkdir()) {
      System.out.println("디렉토리 생성됨");
    }else {
      System.out.println("디렉토리 생성불가");
    }

    dir = new File("temp2/ok");

    if(dir.mkdir()) {
      System.out.println("디렉토리 생성됨");
    }else {
      System.out.println("디렉토리 생성불가");
    }
  }

}
