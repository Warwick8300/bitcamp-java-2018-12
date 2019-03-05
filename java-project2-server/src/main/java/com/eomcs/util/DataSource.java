package com.eomcs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

// 1) 커넥션을 빌려주고 리턴 받는 일을 한다.

public class DataSource {

  String driver;
  String jdbcUrl;
  String username;
  String password;

  public DataSource(String driver, String jdbcUrl, String username, String password) {
    this.driver = driver;
    this.jdbcUrl = jdbcUrl;
    this.username = username;
    this.password = password;


  }

  ArrayList<Connection> list = new ArrayList<Connection>();
  static ThreadLocal<Connection> conLocal = new ThreadLocal<>();


  public Connection getConnection() {
    try {
      Connection con = conLocal.get();



      // 스레드 주머닐에 들어 있는 커넥션 객체 꺼내기
      if (con == null) {
        if(list.size() == 0) {
          System.out.println("새로 DB 커넥션 생성함!");
        con = DriverManager
            .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111");
        con.setAutoCommit(false);
        }else {
          System.out.println("커넥션 풀에 보관된 것을 리턴!");
          con = list.remove(0);
        }
        conLocal.set(con);
        }else {
          System.out.println("스레드 주머니에 보관된 커넥션 객체 리턴함.");
        }
      return con;

    } catch (Exception e) {
      throw new RuntimeException();
    }
  }
  
  public void returnConnection(Connection con) {
    
    list.add(con);
  }



}
