package ch22.a;

import java.io.File;

//java .io.File클래스 : 파일삭제
public class Test06 {

  public static void main(String[] args) throws Exception {


    File file = new File("temp2/test.txt");
    if(file.delete()) {
      System.out.println("파일 삭제");
    }else {
      System.out.println("파일 삭제불가");
    }
    

  
  }

}
