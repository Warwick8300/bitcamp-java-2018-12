// 멀티파트 파일 업로드 처리하기 - Servlet 3.0의 기본 라이브러리 사용
package bitcamp.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

// 멀티파트형식 데이터 처리 서블릿
//@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
//@WebServlet("/ex04/s5")
public class Servlet05 extends GenericServlet {

  private static final long serialVersionUID = 1L;
  private String uploadDir;

  @Override
  public void init() throws ServletException {
    // init(ServletCondig)가 호출될 때 이 메서드를 호출한다.
    // 파일을 저장할 디렉토리 경로를 준비한다.
    this.uploadDir = this.getServletContext().getRealPath("/upload");
  }

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    req.setCharacterEncoding("UTF-8");
    HttpServletRequest httpReq = (HttpServletRequest) req;


    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.println("<html>");
    out.println("<head><title>servlet04</title></head>");
    out.println("<body><h1>파일 업로드 결과1</h1>");
    out.printf("이름=%s<br>\n", httpReq.getParameter("name"));
    out.printf("나이=%s<br>\n",httpReq.getParameter("age"));
    
    Part photoPart =httpReq.getPart("photo");
    String filename = "";
    if (photoPart.getSize() > 0) {
      filename = UUID.randomUUID().toString();
      photoPart.write(this.uploadDir + "/" +filename);
    }
    out.printf("사진=%s<br>\n", filename);
    out.printf("<img src='../upload/%s'><br>\n", filename);
    out.println("</body></html>");

  }
}

// <form> 태그의 enctype을 "multipart/form-data" 로 설정하면,
// 웹 브라우저가 데이터를 전송할 때 다음과 같은 형식으로 보낸다.
// 요청 프로토콜에서 Content-Type을 확인하라.
//
/*
 * POST /java-web/ex04/s4 HTTP/1.1 Host: 192.168.0.4:8080 Content-Length: 7222 Pragma: no-cache
 * Cache-Control: no-cache Origin: http://192.168.0.4:8080 Upgrade-Insecure-Requests: 1
 * Content-Type: multipart/form-data; boundary=----WebKitFormBoundaryzVY11GiqDpSP3H8f User-Agent:
 * Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko)
 * Chrome/73.0.3683.86 Safari/537.36 Accept:
 * text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng, Referer:
 * http://192.168.0.4:8080/java-web/ex04/test04.html Accept-Encoding: gzip, deflate Accept-Language:
 * ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7,la;q=0.6 Connection: keep-alive 빈 줄
 * ------WebKitFormBoundaryzVY11GiqDpSP3H8f Content-Disposition: form-data; name="name"
 * 
 * 홍길동 ------WebKitFormBoundaryzVY11GiqDpSP3H8f Content-Disposition: form-data; name="age"
 * 
 * 20 ------WebKitFormBoundaryzVY11GiqDpSP3H8f Content-Disposition: form-data; name="photo";
 * filename="images.jpeg" Content-Type: image/jpeg
 * 
 * 바이너리 데이터.... ------WebKitFormBoundaryzVY11GiqDpSP3H8f--
 */


