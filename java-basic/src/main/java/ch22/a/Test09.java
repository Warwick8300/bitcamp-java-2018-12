package ch22.a;

import java.io.File;

//java .io.File클래스 : 상세정보알아내기
public class Test09 {

  public static void main(String[] args) throws Exception {

    //파일은 디렉토리와 
    File file = new File(".");
    File[] files = file.listFiles();
    for(File f : files) {
      System.out.printf("%s %12d %s\n",
          f.isDirectory() ? "d" : "-",
              f.length(),
              f.getName());
    }
    
  
  }

}
