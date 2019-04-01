// 클라이언트가 보낸 데이터 읽기기 - 여러개의 데이터를 같은 이름으로 보낸경우
package bitcamp.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex04/s7")
public class Servlet07 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {


    // GET 요청
    // - 웹 브라우저에 URL을 입력한 후 엔터를 치면 post 요청을 보낸다
    // - 웹 페이지에서 링크를 클릭하면 (자바 스크립트를 처리하지 않은 상태) GET 요청을 보낸다.
    // - 웹 페이지의 폼(method='post' 일 때)에서 전송 버튼을 클릭하면 GET 욫ㅇ을 보낸다
    req.setCharacterEncoding("UTF-8");


    res.setContentType("text/plain;charset=utf-8");
    PrintWriter out = res.getWriter();

    out.printf("a = %s\n", req.getParameter("a"));
    out.printf("b = %s\n", req.getParameter("b"));
    out.printf("c = %s\n", req.getParameter("c"));

  }

}


