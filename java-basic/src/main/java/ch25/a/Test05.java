package ch25.a;
import java.sql.Connection;
import java.sql.DriverManager;
//java.sql.Connerction 객체

public class Test05 {

  public static void main(String[] args) {
 
    try (Connection con = DriverManager.getConnection(
        "jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")){
      System.out.println("DBMS 연결 성공");
      
      
    }catch (Exception e) {
      System.out.println("DBMS에 연결중오류");
      e.printStackTrace();
    }
  }
  

}
