package ch19.g;
//파일 필터 적용 후
import java.io.File;

// 익명 클래스를 사용하기 전
public class Test02 {

  public static void main(String[] args) {

    File dir = new File("./");     // 이클릭스 ./ 는 프로젝트 디렉토리 
    // 
    
    
    String[] names = dir.list(new MyFileNameFilter()); 
      

    
    for(String name :names) {
      System.out.println(name);
    }
  }

}
