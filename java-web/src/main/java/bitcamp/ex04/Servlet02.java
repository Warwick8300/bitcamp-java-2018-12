// 클라이언트가 보낸 데이터 읽기기 - post 요청 데이터 읽
package bitcamp.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex04/s2")
public class Servlet02 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    
    
    // GET 요청
    // - 웹 브라우저에 URL을 입력한 후 엔터를 치면 post 요청을 보낸다
    // - 웹 페이지에서 링크를 클릭하면 (자바 스크립트를 처리하지 않은 상태) GET 요청을 보낸다.
    // - 웹 페이지의 폼(method='post' 일 때)에서 전송 버튼을 클릭하면 GET 욫ㅇ을 보낸다
    
    
    

    req.setCharacterEncoding("utf-8");
    String name = req.getParameter("name");
    int age = Integer.parseInt(req.getParameter("age"));
    res.setContentType("text/plain;charset=utf-8");
    PrintWriter out = res.getWriter();

    out.printf("이름 : %s\n", name);
    out.printf("나이 : %d\n", age);

  }
}


