package ch25.b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//게시물 조회
public class BoardDetailApp {

  // 다음과 같이 게시물 조회 하는 프로그램 작성하
  // ----------------------------------------
  // 번호? 1
  // 제목 : aaa
  // 내용 : aaaaa
  // 등록일 : 2019-1-1
  // 조회수 : 2

  //번호 ? 100
  // 해당번호의 게시물이 존재하지 않습니다.
  // ---------------------------------------
  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    int no;

    System.out.print("번호? ");
    no = keyboard.nextInt();
    
    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      try (Statement stmt = con.createStatement()) {



        try (ResultSet rs = stmt.executeQuery("select * from x_board where board_id = "+no)) {

          if (rs.next()) {
            System.out.printf("제목 : %s\n내용 : %s\n등록일 : %s\n조회수 : %d\n",
                rs.getString("title"),
                rs.getString("contents"), rs.getDate("created_date"),
                rs.getInt("view_count"));


          }else
            System.out.println("해당번호의 게시물이 존재하지 않습니다.");
        }


      }
    }
    keyboard.close();
  }



}
