package ch22.a;

import java.io.File;

//java .io.File클래스 : 파일 다루ㄱ;
public class Test02 {

  public static void main(String[] args) throws Exception {
   
    
    File file = new File("build.gradle");
    System.out.println(file .getName());
    System.out.println(file .getPath());
    System.out.println(file .getAbsolutePath());
    System.out.println(file .getCanonicalPath());
    
    System.out.println(file .getTotalSpace());
    System.out.println(file .getFreeSpace());
    System.out.println(file .getUsableSpace());
    System.out.println(file.length());
    
    System.out.println(file .isDirectory());
    System.out.println(file .isFile());
    System.out.println(file .isHidden());
    System.out.println(file .exists());
    System.out.println(file .canExecute());
    
    
    System.out.println("-------------------------");
    
    file = new File("build.gradle2");
    System.out.println(file .getName());
    System.out.println(file .getPath());
    System.out.println(file .getAbsolutePath());
    System.out.println(file .getCanonicalPath());
    
    System.out.println(file .getTotalSpace());
    System.out.println(file .getFreeSpace());
    System.out.println(file .getUsableSpace());
    System.out.println(file.length());
    
    System.out.println(file .isDirectory());
    System.out.println(file .isFile());
    System.out.println(file .isHidden());
    System.out.println(file .exists());
    System.out.println(file .canExecute());
  }

}
