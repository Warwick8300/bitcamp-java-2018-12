// 클라이언트로 출력하기 - 영어외 타국가어 깨짐 현상 처리
package bitcamp.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ex03/s3")
public class Servlet03 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {

    // HTML 출력할 떄 MIME 타입에 HTML을 지정해야한다.
    res.setContentType("text/html;charset=utf-8");
    PrintWriter out = res.getWriter();

    out.println("<html>");
    out.println("<head><title>servlet03</title></head>");
    out.println("hello");
    out.println("<body><h1>안녕하세요</h1><body>");
    out.println("こんにちは");
    out.println("спокойный");
    out.println("你好");
    out.println("بلقائك");

  }
}


