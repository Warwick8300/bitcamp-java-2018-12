// 리다이렉트 응답할때 콘텐트를 보내지 않는다
package bitcamp.ex08;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex08/s3")
@SuppressWarnings("serial")
public class Servlet03 extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {



    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<html><head>");
    out.println("<title>리다이텍트</title>");
    out.println("</head><body>");
   
      out.println("안녕하세요 - /ex08/s3");

   
    out.println("<body></html>");
    response.sendRedirect("s100");
    // 리다이렉트를 하는 순간 이전까지 버퍼로 출력된내용을 모두 버려진다.
    // 왜? 리다이렉트를 클라이언트로 콘텐트를 보내지 않는다.

    // 만약 출력한 내용이 버러
  }
}
