package ch22.a;

import java.io.File;

//java .io.File클래스 : 디렉토리 삭제  
public class Test04 {

  public static void main(String[] args) throws Exception {


    File dir = new File("temp");
/*
    if(dir.mkdir()) {
      System.out.println("디렉토리 생성됨");
    }else {
      System.out.println("디렉토리 생성불가");
    }

    dir = new File("temp2/ok");

    if(dir.mkdirs()) {
      System.out.println("디렉토리 생성됨");
    }else {
      System.out.println("디렉토리 생성불가");
    }
    */
    
    dir = new File("temp");

    if(dir.delete()) {
      System.out.println("디렉토리 삭제");
    }else {
      System.out.println("디렉토리 삭제불가");
    }
    dir = new File("temp2");

    if(dir.delete()) {
      System.out.println("디렉토리 삭제");
    }else {
      System.out.println("디렉토리 삭제불가");
    }
    
  }

}
