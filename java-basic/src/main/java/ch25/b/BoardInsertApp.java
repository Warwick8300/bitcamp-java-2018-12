package ch25.b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

// 게시물 등록
public class BoardInsertApp {

  // 다음과 같이 게시물 등록하는 프로그램 작성하
  // ----------------------------------------
  // 제목? aaa
  // 내용? bbb
  // 등록하시겠습니까?(Y/n)
  // 등록하였습니다.
  // ---------------------------------------
  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

    String title;
    String contents;
    String answer;

    System.out.print("제목? ");
    title = keyboard.nextLine();

    System.out.print("내용? ");
    contents = keyboard.nextLine();

    System.out.print("등록하시겠습니까?(Y/n) ");
    answer = keyboard.nextLine();
    if(answer.equalsIgnoreCase("y")|| answer.length() ==0) {

      try (Connection con = DriverManager
          .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
        System.out.println("DBMS 연결 성공");

        try (Statement stmt = con.createStatement()) {

          // executeQuey의 리턴값은 Result set구현체이다.
          // 단 한개씩 가져온다. 한번에 모두 가져오는 것이 아니다
          int count = stmt.executeUpdate("insert into x_board(title,contents)"
              +" values('"+ title +"','"+ contents +"')");
          System.out.println(count);
          System.out.println("등록하였습니다.");
        }
      }



    }else
      System.out.println("등록을 취소하였습니다.");
    
    keyboard.close();
  }

  


}


