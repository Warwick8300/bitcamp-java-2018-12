package com.eomcs.lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;
import java.util.Scanner;
import com.eomcs.lms.context.ApplicationContextException;
import com.eomcs.lms.context.ApplicationContextListener;
import com.eomcs.lms.handler.BoardAddCommand;
import com.eomcs.lms.handler.BoardDeleteCommand;
import com.eomcs.lms.handler.BoardDetailCommand;
import com.eomcs.lms.handler.BoardListCommand;
import com.eomcs.lms.handler.BoardUpdateCommand;
import com.eomcs.lms.handler.LessonAddCommand;
import com.eomcs.lms.handler.LessonDeleteCommand;
import com.eomcs.lms.handler.LessonDetailCommand;
import com.eomcs.lms.handler.LessonListCommand;
import com.eomcs.lms.handler.LessonUpdateCommand;
import com.eomcs.lms.handler.MemberAddCommand;
import com.eomcs.lms.handler.MemberDeleteCommand;
import com.eomcs.lms.handler.MemberDetailCommand;
import com.eomcs.lms.handler.MemberListCommand;
import com.eomcs.lms.handler.MemberUpdateCommand;
import com.eomcs.lms.mariadb.BoardDaoImpl;
import com.eomcs.lms.mariadb.LessonDaoImpl;
import com.eomcs.lms.mariadb.MemberDaoImpl;

// App 객체의 상태가 변경 될때 마다 보고 받는 옵저버가 되려면
// ApplicationContextListener
public class ApplicationInitializer implements ApplicationContextListener {

  Connection con;
  
  
  @Override
  public void contextInitialized(Map<String, Object> context) {
    try {   
      
      con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111");
     
      
      LessonDaoImpl lessonDaoImpl = new LessonDaoImpl(con);
      MemberDaoImpl memberDaoImpl = new MemberDaoImpl(con);
      BoardDaoImpl boardDaoImpl = new BoardDaoImpl(con);

      @SuppressWarnings("unused")
      Scanner keyboard = (Scanner)context.get("keyboard");
      context.put("/lesson/add", new LessonAddCommand( lessonDaoImpl));
      context.put("/lesson/list", new LessonListCommand( lessonDaoImpl));
      context.put("/lesson/detail", new LessonDetailCommand( lessonDaoImpl));
      context.put("/lesson/update", new LessonUpdateCommand( lessonDaoImpl));
      context.put("/lesson/delete", new LessonDeleteCommand( lessonDaoImpl));


      context.put("/member/add", new MemberAddCommand( memberDaoImpl));
      context.put("/member/list", new MemberListCommand( memberDaoImpl));
      context.put("/member/detail", new MemberDetailCommand( memberDaoImpl));
      context.put("/member/update", new MemberUpdateCommand( memberDaoImpl));
      context.put("/member/delete", new MemberDeleteCommand( memberDaoImpl));

    
      context.put("/board/add", new BoardAddCommand( boardDaoImpl));
      context.put("/board/list", new BoardListCommand( boardDaoImpl));
      context.put("/board/detail", new BoardDetailCommand( boardDaoImpl));
      context.put("/board/update", new BoardUpdateCommand( boardDaoImpl));
      context.put("/board/delete", new BoardDeleteCommand( boardDaoImpl));
    
    } catch (Exception e) {
      throw new ApplicationContextException(e);
    }
    

  }

  @Override
  public void contextDestroyed(Map<String, Object> context) {
    try {
      con.close();
    } catch (Exception e) {
      throw new ApplicationContextException(e);
    }

  }


}
