//보관소에 값 넣기 - forward/include 
package bitcamp.ex09;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ex09/s11")
@SuppressWarnings("serial")
public class Servlet11 extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // 테스트 방법:
    // => http://localhost:8080/java-web/ex09/s1
    //
    // 리프래시
    // => 서버로 부터 응답을 받은 후 특정 URL을 요청하도록

    ServletContext sc =this.getServletContext();
    sc.setAttribute("v1","xx");
    
    HttpSession session = request.getSession();
    session.setAttribute("v2","yy");
    
    request.setAttribute("v3","zz");
    

    response.setContentType("text/plain;charset=UTF-8");

    request.getRequestDispatcher("s12").forward(request, response);
  }
}
