package ch25.c;
// PreparedStatement 이용하여 sql 공격 차단하기
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

//게시물 업데이트
public class Test02 {


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

      //PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt = con.prepareStatement(
          "update x_board set title = ?, contents = ? where board_id = ?")) {

        stmt.setString(2, contents);
        stmt.setInt(3, no);
        stmt.setString(1,title);
        
        // PreparedStatement.setXxx(in - parameter 인덱스, 값);
        int count = stmt.executeUpdate(); 

             if(count ==0) {
               System.out.println("해당번호의 게시물이 존재하지 않습니다.");
             }
             else
               System.out.println("변경하였습니다.");
        
        
      }
    }
    
    keyboard.close();

  }
  // Statement  vs  PreparedStatement
  
  // 1)sql 문장의 간결함
  

}
