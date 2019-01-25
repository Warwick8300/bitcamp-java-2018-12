package ch19.g;

import java.io.File;
import java.io.FilenameFilter;

// 익명 클래스를 사용하기 전
public class Test04 {
  
  
 
  public static void main(String[] args) {
    class MyFileNameFilter implements FilenameFilter {

      @Override
      public boolean accept(File dir, String name) {
      if(name.endsWith(".txt"))
        return true;
        return false;
      }
    }

    File dir = new File("./");     // 이클릭스 ./ 는 프로젝트 디렉토리 
    String[] names = dir.list(new MyFileNameFilter()); 
    for(String name :names) {
      System.out.println(name);
    }
  }

}
