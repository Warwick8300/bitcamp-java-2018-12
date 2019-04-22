// 스프링 인터셉터 다루기
package bitcamp.app2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Controller04_1_Interceptor2 implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {// 시작하기전
System.out.println("Controller04_1_Interceptor2.preHandle()");
    

// 다음 인서텝터나 페이지 컨트롤러를 계속 실행하고 싶다면 true를 리턴한다 ,

    return true;
  }
  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {//리턴한후 이서드
    System.out.println("Controller04_1_Interceptor2.postHandle()");

  }
  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
      Object handler, Exception ex) throws Exception {
    System.out.println("Controller04_1_Interceptor2.afterCompletion()");

  }
  
}
