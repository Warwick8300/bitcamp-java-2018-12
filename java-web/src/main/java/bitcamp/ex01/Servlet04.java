// 서블릿 만들기 -@WebServlet 애노테이션
package bitcamp.ex01;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex01/s04")
public class Servlet04 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  //


  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    // 클라이언트가 이 서블릿의 실행을 요청할 때마다 호출된다
    // 클라이언트가 요청한 작업을 수행한다.

    System.out.println("Servlet2.service(ServletRequest, ServletResponse)");

  }


}
