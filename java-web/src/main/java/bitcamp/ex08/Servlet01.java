// 리프래시 - 클라이언트에게 다른 URL을 요청하라는 명령
package bitcamp.ex08;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex08/s1")
@SuppressWarnings("serial")
public class Servlet01 extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // 테스트 방법:
    // => http://localhost:8080/java-web/ex08/s1
    //
    // 리프래시
    // => 서버로 부터 응답을 받은 후 특정 URL을 요청하도록


    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("안녕하세요 - /ex08/s1");
    for(int i =0; i< 142 ; i++) {
      out.println(i + " ====> 가나다라마바사아자차카타파오호랑");
    }
    // 응답 헤더에 Refresh 정보를 추가한다.
    response.setHeader("Refresh", "3;url=s100");
  }
}
