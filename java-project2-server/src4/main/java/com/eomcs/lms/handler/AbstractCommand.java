package com.eomcs.lms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;


//서브 클래스에게 필드나 메서드를 상속해주는 여
public abstract class AbstractCommand implements Command {

  @Override
  public void execute(BufferedReader in, PrintWriter out) {
    try {
    execute(new Response(in, out));
    }
    catch (Exception e) {
      out.printf("실행 오류! : %s\n", e.getMessage());
    }
  }
  
  public void execute(Response response) throws Exception {
    // 서브 클래스에서 오버라이딩 해야할 메서드 이다.
    
    //
    
    //
    
  }

}
