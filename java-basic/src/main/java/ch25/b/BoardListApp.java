package ch25.b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 게시물 리스트 출력
public class BoardListApp {

  // 다음과 같이 게시물 목록을 출력하라
  // 게시물 번호를 내림 차순으로 정렬하
  // ----------------------------------------
  // 번호, 제목, 등록일, 조횟
  // 2, aaa,2019-1-1,2라
  // 1, bbb,2019-1-1,2라
  // ---------------------------------------
  public static void main(String[] args) throws Exception {
    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      try (Statement stmt = con.createStatement()) {

        // executeQuey의 리턴값은 Result set구현체이다.
        // 단 한개씩 가져온다. 한번에 모두 가져오는 것이 아니다
        System.out.println("번호,   제목,    등록일,    조회수");
        try (ResultSet rs = stmt.executeQuery("select * from x_board order by board_id desc")) {
          while (rs.next()) {
            System.out.printf("%4d, %4s, %4s, %4d\n", rs.getInt("board_id"),
                rs.getString("title"), rs.getDate("created_date"),
                rs.getInt("view_count"));

          }
        }



      }
    }
  }

}
