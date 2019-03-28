// 클라이언트가 
package bitcamp.ex04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex04/s4")
public class Servlet04 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
    
    // 멀티파트 형시으로 보낸 첨부파일 데이터를 읽는 방법

    req.setCharacterEncoding("utf-8");
    res.setContentType("text/plain;charset=utf-8");
    String name = req.getParameter("name");
    String age = req.getParameter("age");
        String photo = req.getParameter("photo");
    PrintWriter out = res.getWriter();

    out.printf("이름 : %s\n", name);
    out.printf("나이 : %s\n", age);
    out.printf("사진 : %s\n", photo);

  }
}


//<form> 태그의 enctype을 "multipart"


