// 클라이언트로 출력하기 - 영어외 타국가어 깨짐 현상 처리
package bitcamp.ex03;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex03/s4")
public class Servlet04 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {

    ServletContext ctx = req.getServletContext();
    
    String path = ctx.getRealPath("/WEB-INF/photo.jpeg");

    FileInputStream in = new FileInputStream(path);
    // 바이너리를 출력 할 떄 MIME 타입을 지정하라
    res.setContentType("bi/oh");
    BufferedOutputStream out = new BufferedOutputStream(res.getOutputStream());
  
    int b;
    while((b = in.read()) != -1) {
      out.write(b);
    }
    out.flush();
    in.close();

  }
}


