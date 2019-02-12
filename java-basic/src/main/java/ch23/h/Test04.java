package ch23.h;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

// URL 다루
public class Test04 {

  public static void main(String[] args) throws Exception {
 
    
 // TODO URL 다루기 파일 시스템
    
    URL url = new URL("https://www.naver.com/");

    // 서버와 연결하고 데이터를 읽어들일 도구를 리턴한다.
    
    InputStream in = url.openStream();
    BufferedReader in2 = new BufferedReader(new InputStreamReader(in));
        while(true) {
          String str =in2.readLine();
          System.out.println(str);
          if(str == null)
            break;
        }
        in2.close();
        in.close();

  }

}
