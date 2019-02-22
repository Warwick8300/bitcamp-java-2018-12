package com.eomcs.lms.context;
// 애플리케이션의 상태 변경을 보고 받는 옵저버가 구현해야 할 규칙
import java.util.Map;

public interface ApplicationContextListener {
  //애플리 케이션이 시작될 때 호출된다.
  
 void contextInitialized(Map<String,Object> context) throws ApplicationContextException;
 // 종료될 때 호출
 void contextDestroyed(Map<String,Object> context) throws ApplicationContextException;

}
