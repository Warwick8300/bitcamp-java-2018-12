package ch25.a;

// java.sql.Statement update 실행하기
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test09 {

  public static void main(String[] args) {

    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      try (Statement stmt = con.createStatement()) {

        // executeQuey의 리턴값은 Result set구현체이다.
        // 단 한개씩 가져온다. 한번에 모두 가져오는 것이 아니다
        try (ResultSet rs = stmt.executeQuery("select * from x_board order by board_id desc")) {
          while (rs.next()) {
          System.out.printf("%s, %s, %s, %s, %s\n", rs.getString("board_id"),
              rs.getString("title"), rs.getString("contents"), rs.getString("created_date"),
              rs.getString("view_count"));

        }
        }
      }






    }catch(Exception e)  {
      System.out.println("DBMS에 연결중오류");
      e.printStackTrace();
    }
  }


}
