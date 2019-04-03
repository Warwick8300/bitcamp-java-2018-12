// 쿠키cookie
package bitcamp.ex10;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex10/s1")
@SuppressWarnings("serial")
public class Servlet01 extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    //쿠키
    // => 웹 서버가 웹 브라우저에게 응답할 때 
    // => 응답할 때 응답 헤더에 포하미켜 보낸다.
    // => 웹 브라우저는 응답헤더로 받은 쿠키 데이터를 보관하고 있다가
    //   지정된 URL을 요청할 때 요청 헤더에 포함시켜 웹 서버에게 쿠기를 보낸다.

    Cookie c1 =new Cookie("name", "hong");
    // 값은 반드시 문자열이어야하낟
    // 만약 문자열이 아닌값을 보내려면 Base64와 같은 인코딩 기법을 이용하여
    // 바이너리 데이터를 문자화 시켜서 보내야 한다.
    Cookie c2 =new Cookie("age", "20");
    Cookie c3 =new Cookie("working", "true");

    // => 또한 값은 반듸 ISO-8859-1 이어야 한다
    // 만약 UTF-8을 보내고 싶다면 URL인코딩 같은 기법을 사용하여
    // ASCII 코드화 시켜 보내야한다
    Cookie c4 =new Cookie("name2", "홍길동");
    Cookie c5 =new Cookie("name3", URLEncoder.encode("홍길동","UTF-8"));
    response.addCookie(c1);
    response.addCookie(c2);
    response.addCookie(c3);
    response.addCookie(c4);
    response.addCookie(c5);
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("쿠기 보냄 /ex10/s1");
  }
}
