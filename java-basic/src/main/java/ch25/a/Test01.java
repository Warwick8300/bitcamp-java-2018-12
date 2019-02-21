package ch25.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test01 {

  public static void main(String[] args) {
    //DBMS에 연결하기
    
    //=> mariaDB에 연결을 대행하는 클래스를 사용한다.
    // => 이클래스는 JDBC API 규칙에 따라 작성되어있다.
    
    //1) java.sql.Driver 구현체를 생성하여JDBC 드리이버 관리자에 등록한다.
    //=>DBMS에 연결을 수행하는 객체이다.
    //mariaDB의 jdbc드라이버에서는 
    
    try {
      DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
    } catch (SQLException e) {
      System.out.println("MariaDB JDBC의 java.sql.Driver 구현체를 등록하는중에 오류 발생!");
      
      e.printStackTrace();
    }
    
    // 2) Driver 구현체를 이용하여 DBMS에 연결한다.
    // ==>DBMS에 연결되면 소켓정보를 갖고 있는 java.sql.connection 구현체를 리턴
    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost/bitcampdb","bitcamp","1111")){
      System.out.println("DBMS 연결 성공");
    }catch (Exception e) {
      System.out.println("DBMS에 연결중오류");
      e.printStackTrace();
    }
    
    
  }

}
