package com.eomcs.lms.handler;

public interface Command {
  //명령어를 처리하는 객체의 사용 규칙을 정의한다.

  //명령어를 처리하고 싶을 떄 
  void execute();
}
