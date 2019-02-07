package com.eomcs.lms.context;

import java.util.Map;

// Application의 상태가 변경될떄마다 호출할 메서드를 정의
public interface ApplicationListener {
  //애플리 케이션이  시작될때 호출된다 
  void starApplication(Map<String, Object> context);
  void endApplication(Map<String, Object> context);
  
}
