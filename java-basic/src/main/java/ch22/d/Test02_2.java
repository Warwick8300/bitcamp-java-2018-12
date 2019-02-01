package ch22.d;

import java.io.FileReader;

//문자 배열 읽
public class Test02_2 {

  public static void main(String[] args) {

    try(FileReader in = new FileReader("data.txt")){

      char[] cbuf = new char[1024];
      int len = in.read(cbuf);
      int cut = 0 ;
      System.out.println(len);
      for (char c :cbuf) {
        if(len==cut)
          break;
          
        System.out.print(c+",");
        cut++;
      }
    
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    System.out.println("읽기 완료");
    System.out.println();

  }

}
