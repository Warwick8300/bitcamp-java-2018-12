package ch25.c;
//Statement 와 sql 삽입공격
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//게시물 업데이트
public class Test01 {


  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
    int no;
    String title;
    String contents;
  
    System.out.print("번호? ");
    no = Integer.parseInt(keyboard.nextLine());
    
  

    System.out.print("제목? ");
    title = keyboard.nextLine();

    System.out.print("내용? ");
    contents = keyboard.nextLine();
    

    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      try (Statement stmt = con.createStatement()) {

        // SQL 삽입 공격 
        int count = stmt.executeUpdate("update x_board set title = '"+title
            + "', contents = '"+contents+"' where board_id = "+no); 

             if(count ==0) {
               System.out.println("해당번호의 게시물이 존재하지 않습니다.");
             }
             else
               System.out.println("변경하였습니다.");
        
        
      }
    }
    
    keyboard.close();

  }

}
