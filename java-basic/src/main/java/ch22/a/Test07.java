package ch22.a;

import java.io.File;

//java .io.File클래스 : 폴더생성후 파일생성
public class Test07 {

  public static void main(String[] args) throws Exception {


    File file = new File("temp2/a/b/c/test.txt");
    
   // File dir = new File(file.getParent());
    System.out.println(file.getParent());
    File dir = file.getParentFile();
    
    if(dir.mkdirs()) {
      System.out.println("디렉토리 생성하였음");
    }else {
      System.out.println("디렉토리를 생성 하지 못함");
    }
    
    if(file.createNewFile()) {
      System.out.println("파일 생성");
    }else {
      System.out.println("파일 생성불가");
    }
    

  
  }

}
