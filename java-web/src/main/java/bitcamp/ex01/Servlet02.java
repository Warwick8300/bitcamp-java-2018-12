// 서블릿 만들기 -javax.servlet.Servlet 인터페이스 구현

package bitcamp.ex01;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Servlet02 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  //


  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    // 클라이언트가 이 서블릿의 실행을 요청할 때마다 호출된다
    // 클라이언트가 요청한 작업을 수행한다.

    System.out.println("Servlet02.service(ServletRequest, ServletResponse)");

  }


}
