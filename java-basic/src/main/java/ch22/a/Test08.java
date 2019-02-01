package ch22.a;

import java.io.File;

//java .io.File클래스 : 폴더안에 있는 파일이나 하위 폴더를 알아내기
public class Test08 {

  public static void main(String[] args) throws Exception {

    //파일은 디렉토리와 
    File file = new File(".");
    String [] names = file.list();
    for(String name : names) {
      System.out.println(name);
    }
    
  
  }

}
