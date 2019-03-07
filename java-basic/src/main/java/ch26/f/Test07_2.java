// dynamic SQL 다루기 - #{} ${} 사용
package ch26.f;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test07_2 {

  public static void main(String[] args) throws Exception {

    InputStream inputStream = Resources.getResourceAsStream("ch26/f/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession sqlSession = sqlSessionFactory.openSession();
    HashMap<String, Object> params = new HashMap<>();
    Scanner keyboard = new Scanner(System.in);
    System.out.println("정렬할 컴럼?");
    String column = keyboard.nextLine();
    if (column.length() > 0) {


      switch (column) {
        case "title":
        case "contents":
        case "created_date":
        case "view_count":
          params.put("title", "title");
          break;
        default:
          params.put("column", "board_id");

      }

      System.out.println("정렬방식?");
      String sort = "asc";

      if (keyboard.nextLine().equalsIgnoreCase("desc")) {
        sort = "desc";
      }
      params.put("sort", sort);

    }

    keyboard.close();
    
    // 잘못된 sql 코드가 들어가ㄴㄴd


    List<Board> boards = sqlSession.selectList("board.select7_ok", params);
    for (Board b : boards) {
      System.out.println(b);

    }


    System.out.println("-------------------------------");


  }

}


