package ch23.h;

import java.net.URL;

// URL 다루
public class Test01 {

  public static void main(String[] args) throws Exception {
    // TODO URL 다루기 파일 시스템
    
    URL url = new URL("file///c:/User/Bitcamp/a.html");
    
    System.out.printf("프로토콜 : %s\n",url.getProtocol());
    System.out.printf("서버주소 : %s\n",url.getHost());
    System.out.printf("포트번호 : %s\n",url.getPort());
    System.out.printf("자원경로 : %s\n",url.getPath());

    System.out.println("==========================================");
    URL url2 = new URL("file///home/bitcamp/a.html");
    
    System.out.printf("프로토콜 : %s\n",url.getProtocol());
    System.out.printf("서버주소 : %s\n",url.getHost());
    System.out.printf("포트번호 : %s\n",url.getPort());
    System.out.printf("자원경로 : %s\n",url.getPath());

  }

}
