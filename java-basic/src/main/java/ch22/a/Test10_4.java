package ch22.a;

import java.io.File;
import java.io.FilenameFilter;

//java .io.File클래스 : 필터사용하기 
public class Test10_4 {


  public static void main(String[] args) throws Exception {
    

        
    //파일은 디렉토리와 
    File file = new File(".");
    
    //lambda class
    String[] names = file.list((File dir, String name) -> {
        if (name.endsWith(".txt"))
          return true;
        else 
          return false;
      });
    
    for(String name: names) {
      System.out.println(name);
    }



    
  }

}
