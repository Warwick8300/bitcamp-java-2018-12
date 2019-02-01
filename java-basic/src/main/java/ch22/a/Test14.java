package ch22.a;

import java.io.File;

//java .io.File클래스 : 
public class Test14 {

  static void search(File dir, String packageName) {

    File[] files = dir.listFiles((File pathName)->
    pathName.isDirectory() ||
    (pathName.isFile() && pathName.getName().endsWith(".class")) 
    ? true:false); 

    for(File f : files) {
      if(f.isFile()) {
      System.out.printf("%s%s \n",packageName, f.getName().replace(".class", ""));
      }else {
        search(f,packageName+f.getName() + ".");
      }
      //
    }

  
  }

  public static void main(String[] args) throws Exception {


    File dir = new File("bin/main");

    search(dir,"");


  }

}
