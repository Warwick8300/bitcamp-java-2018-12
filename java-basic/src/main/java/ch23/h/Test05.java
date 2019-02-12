package ch23.h;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// URL 다루
public class Test05 {

  public static void main(String[] args) throws Exception {
 
    
     
    URL url = new URL("https://www.naver.com/");
    URLConnection con = url.openConnection();
    
    con.connect();

    // 서버와 연결하고 데이터를 읽어들일 도구를 리턴한다.
    
    InputStream in = con.getInputStream();
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
