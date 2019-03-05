package com.eomcs.util;

import java.sql.Connection;
import java.sql.DriverManager;

//1) 커넥션을 빌려주고 리턴 받는 일을 한다.

public class ConnectionFactory {
  
  static ThreadLocal<Connection> conLocal = new ThreadLocal<>();
  
  
  public static Connection create() {
    try {
      Connection con = conLocal.get();
      
      
      
      //스레드 주머닐에 들어 있는 커넥션 객체 꺼내기
      if(con == null) {
        con =  DriverManager.getConnection(
            "jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111");
        con.setAutoCommit(false);
        conLocal.set(con);
        return con;
      }
      return con;

    }catch(Exception e) {
      throw new RuntimeException();
    }
  }
  

  
}
