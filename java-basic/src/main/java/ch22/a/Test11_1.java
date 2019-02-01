package ch22.a;

import java.io.File;
import java.io.FileFilter;


//java .io.File클래스 : 파일 필터 사용하기
public class Test11_1 {

  static class TextFileFiler implements FileFilter{

    @Override
    public boolean accept(File pathName) {
      if(pathName.isFile() && pathName.getName().endsWith(".txt"))
        return true;
      else
        return false;
    }


  }

  public static void main(String[] args) throws Exception {

    //파일은 디렉토리와 
    File file = new File(".");
    File[] files = file.listFiles(new TextFileFiler());
    for(File f : files) {
      System.out.printf("%s %12d %s\n",
          f.isDirectory() ? "d" : "-",
              f.length(),
              f.getName());
    }


  }

}
