package ch22.a;

import java.io.File;
import java.io.FilenameFilter;

//java .io.File클래스 : 필터사용하기 
public class Test10_2 {


  public static void main(String[] args) throws Exception {
    
  //local class

    class TextFileFilter implements FilenameFilter{
      @Override
      public boolean accept(File dir, String name) {
        if (name.endsWith(".txt"))
          return true;
        else 
          return false;
      }
    }
    
    //파일은 디렉토리와 
    File file = new File(".");
    String[] names = file.list(new TextFileFilter());
    for(String name: names) {
      System.out.println(name);
    }



    
  }

}
