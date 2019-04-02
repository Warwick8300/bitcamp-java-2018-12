package com.eomcs.lms.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.eomcs.lms.AppConfig;

@WebListener
public class ContextLoaderListener implements ServletContextListener {

  // 보통 클래스에서 사용할 로그 출력 객체는 클래스의 스태틱 멤버로 선언한다.
  final static Logger logger = LogManager.getLogger(ContextLoaderListener.class);


  // 클라이언트 요청을 처리할 메서드 정보가 들어 있는 객체

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    // 이 클래스의 인스턴스가 생성된 후 톰캣이 제일 처음으로 호출하는 메서드
    // => 보통 이 클래스가 작업하는데 필요한 객체를 준비한다.

    logger.info("Spring IoC 컨테이너 준비");
    ApplicationContext iocContainer = new AnnotationConfigApplicationContext(AppConfig.class);
    printBeans(iocContainer);

    ServletContext sc = sce.getServletContext();
    sc.setAttribute("iocContainer", iocContainer);
  }

  private void printBeans(ApplicationContext iocContainer) {
    // 개발하는 동안 참고할 로그는 보통 debug 등급으로 출력한다.
    logger.debug("---------------------------------------------------");
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      logger.debug(String.format("빈 생성 됨 (객체명=%s, 클래스명=%s)", name,
          iocContainer.getBean(name).getClass().getName()));
    }
    logger.debug("---------------------------------------------------");

  }
}
