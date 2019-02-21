package ch25.b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//게시물 조회
public class BoardDeleteApp {

  // 다음과 같이 게시물 조회 하는 프로그램 작성하
  // ----------------------------------------
  // 번호? 1
  // 삭제하였습니다.
  //(또는)
  // 해당번호의 게시물이 존재하지 않습니다.
  // ---------------------------------------
  public static void main(String[] args) throws Exception {
      Scanner keyboard = new Scanner(System.in);
      int no;
 

      System.out.print("번호? ");
      no = Integer.parseInt(keyboard.nextLine());


      try (Connection con = DriverManager
          .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
        System.out.println("DBMS 연결 성공");

        try (Statement stmt = con.createStatement()) {
          
          // executeQuey의 리턴값은 Result set구현체이다.
          // 단 한개씩 가져온다. 한번에 모두 가져오는 것이 아니다
          int count = stmt.executeUpdate("delete from x_board where" + 
              " board_id="+no); 

               if(count ==0) {
                 System.out.println("해당번호의 게시물이 존재하지 않습니다.");
               }
               else
                 System.out.println("삭제하였습니다.");
          
          
        }
      }
      
      keyboard.close();

    }

}
