package ch22.a;

import java.io.File;

//java .io.File클래스 : 필터와 람다 사용하여 디렉토리 이름만 추출
public class Test12 {

  public static void main(String[] args) throws Exception {

    //파일은 디렉토리와 
    File file = new File(".");
    
    File[] files = file.listFiles((File pathName)-> pathName.isDirectory() ? true :false); 
    /*
    File[] files = file.listFiles((File pathName)-> {
      if(pathName.isDirectory())
        return true;
      else
        return false;
   
    });   */
    for(File f : files) {
      System.out.printf("%s %12d %s\n",
          f.isDirectory() ? "d" : "-",
              f.length(),
              f.getName());
    }
    
  
  }

}
