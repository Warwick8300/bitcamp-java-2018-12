package ch25.d;

// insert한 후 auto increment pk 값 리턴받기
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Test01 {


  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);
   
    String title;
    String contents;



    System.out.print("제목? ");
    title = keyboard.nextLine();

    System.out.print("내용? ");
    contents = keyboard.nextLine();


    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      //
      try (PreparedStatement stmt =
          con.prepareStatement("insert into x_board(title, contents) values(?,?)",Statement.RETURN_GENERATED_KEYS)) {

        stmt.setString(1, title);
        stmt.setString(2, contents);
        stmt.executeUpdate();

        int no =0;
        try (ResultSet rs = stmt.getGeneratedKeys()){
          rs.next();
          no = rs.getInt(1);
          
        }
        System.out.println("입력 성공!");
        System.out.println("입력된 게시물 번호 : " + no);

      }
    }

    keyboard.close();

  }
  // Statement vs PreparedStatement

  // 1)sql 문장의 간결함


}
