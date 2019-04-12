package bitcamp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;


// 서블릿 컨테인이너가 시작될떄 보고 받는 객체
public class WebApplicationInitializerImpl3
    extends AbstractDispatcherServletInitializer {


  @Override
  protected String[] getServletMappings() {

    return new String[] {"/app8/*"};
  }
  
  @Override
  protected String getServletName() {
    //
    return "app8";
  }
  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    
    //
    System.out.println("WebApplicationInitializerImpl3.onStartup()");
    super.onStartup(servletContext);
  }

  @Override
  protected WebApplicationContext createServletApplicationContext() {
   XmlWebApplicationContext iocContaioner = new XmlWebApplicationContext();
   iocContaioner.setConfigLocation("WEB-INF/app8-servlet.xml");
    
    return iocContaioner;
  }

  @Override
  protected WebApplicationContext createRootApplicationContext() {
    return null;
  }



}
