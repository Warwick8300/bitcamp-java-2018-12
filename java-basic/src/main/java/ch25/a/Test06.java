package ch25.a;

import java.sql.Connection;
import java.sql.DriverManager;
//java.sql.Statement 객체 sql을 DBMS 서버에 전달한다.
import java.sql.Statement;

public class Test06 {

  public static void main(String[] args) {
 
    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")){
      System.out.println("DBMS 연결 성공");
      
      try(Statement stmt = con.createStatement()){
        
        
//        execute(sql)
//        executeUpdate(sql)
//        executeQuey
//        executeBatch
        
//          executeUpdate()의 리턴값은 sql 실행한 후 입력 변경삭제된 row(=record)의 개수이다
        int count = stmt.executeUpdate("insert into x_board(title,contents)"
            +" values('제목10','내용')");
        System.out.println(count);
        System.out.println("입력성공");
      }
      
      
    }catch (Exception e) {
      System.out.println("DBMS에 연결중오류");
      e.printStackTrace();
    }
  }
  

}
