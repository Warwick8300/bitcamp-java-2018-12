package bitcamp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


// 서블릿 컨테인이너가 시작될떄 보고 받는 객체
public class WebApplicationInitializerImpl1 implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    System.out.println("WebApplicationInitializerImpl1.onStartup()");

    AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
    ac.register(AppConfig.class);
    ac.refresh();
    DispatcherServlet servlet = new DispatcherServlet(ac);
    Dynamic registration = servletContext.addServlet("app6",servlet);
    
    registration.setLoadOnStartup(1);
    
    registration.addMapping("/app6/*");

  }
}
