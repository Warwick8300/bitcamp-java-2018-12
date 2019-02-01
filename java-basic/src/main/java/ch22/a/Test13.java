package ch22.a;

import java.io.File;

//java .io.File클래스 : 필터와 람다 사용하여 디렉토리 이름만 추출
public class Test13 {
  
  static void delete(File dir) {
    File[] files = dir.listFiles();
    for(File file : files) {
    if(file.isFile()) {
      file.delete();
    }else
      delete(file);
      
    }
    dir.delete();
    
  }

  public static void main(String[] args) throws Exception {

    //파일은 디렉토리와 
        
  
     File dir = new File("bin");
   
     delete(dir);
    System.out.println("삭제완료");
     
     
     /*
     if(dir.delete()) {
       System.out.println("삭제 ");
     }else {
       System.out.println("삭제 못함");
     }
     */
   
     
  }

}
