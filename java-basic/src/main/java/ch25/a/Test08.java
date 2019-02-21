package ch25.a;

// java.sql.ResultSet
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test08 {

  public static void main(String[] args) {

    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      try (Statement stmt = con.createStatement()) {

        // executeQuey의 리턴값은 Result set구현체이다.
        // 단 한개씩 가져온다. 한번에 모두 가져오는 것이 아니다
        try (ResultSet rs = stmt.executeQuery("select * from x_board order by board_id desc")) {
          while (rs.next()) {
            System.out.printf("%d, %s, %" + "s, %s, %d\n", rs.getInt("board_id"),
                rs.getString("title"), rs.getString("contents"), rs.getDate("created_date"),
                rs.getInt("view_count"));

          }
        }



      }


    } catch (Exception e) {
      System.out.println("DBMS에 연결중오류");
      e.printStackTrace();
    }
  }


}
