package ch25.d;

// 트랜 젝션 다루기 commit
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Test02 {


  public static void main(String[] args) throws Exception {


    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      // 1)트렌 잭션 시작 -
      con.setAutoCommit(false);
      // 2)데이터 변경 작업을 수행 - insert, update, delete 작업 수행


      for (int i = 0; i < 3; i++) {
        try (PreparedStatement stmt =
            con.prepareStatement("insert into x_board(title, contents) values(?,?)")) {

          stmt.setString(1, "ccc");
          stmt.setString(2, "eee");
          stmt.executeUpdate();
          System.out.println("입력 성공!");

        }

      }

      // 3) 트랜젝션을 종료 - 서버의 요청한 작업을 처리할 것을 명령 한다.
      // 
      con.commit();

    }


  }
  // Statement vs PreparedStatement

  // 1)sql 문장의 간결함


}
