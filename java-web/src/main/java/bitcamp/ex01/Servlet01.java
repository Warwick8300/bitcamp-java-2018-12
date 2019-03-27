// 서블릿 만들기 -javax.servlet.Servlet 인터페이스 구현

package bitcamp.ex01;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


// 서블릿 실행 방법 http://localhost:8080/java-web/ex01/s01
// 3.1) 서블릿 객체가 없다면
// => 서블릿 클래스에 대해 인스턴스를 생성한다.
// 3.2) 서블릿 객체가 있다면
// => service()를 호출한다.
// 결론
// 서블릿 인스턴스는 오직 한개만 생성된다.
// => init() destroy()은 오직 한번만 호출된다.
// => service()는 클라이언트가 요청할때마다 호출된다
// 주의 !
// 서블릿 인트턴스는

// 서블릿 클래스를 만든 후,
// 배치파일(web.xml; DD파일)에 서블릿 저보를 등록해야만 실핼 될수 있.
public class Servlet01 implements Servlet {

  private ServletConfig config;

  @Override
  public void init(ServletConfig config) throws ServletException {
    // 서블릿 객체를 생성한 후 생성자 당므에 이 메서드가 호출된다
    // 서블릿을 실행할 때 사용할 자원을 이 메서드에서 준비한다.
    // 파라미터로 받은 ServletConfig 객체는 인스턴스 변수에 보관해 두었다가 필요할떄 사용한다
    this.config = config;
    System.out.println("servlet01.init(ServletConfig)");
  }


  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {
// 클라이언트가 이 서블릿의 실행을 요청할 때마다 호출된다
    // 클라이언트가 요청한 작업을 수행한다.
    
    System.out.println("servlet01.service(ServletRequest, ServletResponse)");

  }
  @Override
  public void destroy() {
    
    // 웹 애플리케이션을 종료할 떄 (서버종료 포함) 이서블릿이 만든 자원을 해제할수 있도록
    // 서블릿 컨테이너가 이 메서드를 호출하낟.
    // init()에서 준비한 자원을 보통 이메서드에서 해제한다.
    System.out.println("servlet01.destroy()");
    
  }
  @Override
  public ServletConfig getServletConfig() {
    System.out.println("servlet01.getServletConfig()");

    return this.config;
  }

  @Override
  public String getServletInfo() {
    System.out.println("servlet01.getServletInfo()");

    return "Servler01";
  }

  
}
