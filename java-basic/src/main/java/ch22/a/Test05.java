package ch22.a;

import java.io.File;

//java .io.File클래스 : 파일생성
public class Test05 {

  public static void main(String[] args) throws Exception {


    File file = new File("temp3/test.txt");
    if(file.createNewFile()) {
      System.out.println("파일 생성됨");
    }else {
      System.out.println("파일 생성불가");
    }
    

  
  }

}
