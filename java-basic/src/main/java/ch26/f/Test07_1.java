// dynamic SQL 다루기 - ${}를 안전하게  사용하는 방법
package ch26.f;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test07_1 {

  public static void main(String[] args) throws Exception {

    InputStream inputStream = Resources.getResourceAsStream("ch26/f/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


    // SQL 문장 앞에 오는 키워드 제거 하기
    // 동적 SQL을 다루다 보면 조건에 따라 다음과 같은 문장이 생성될 수 있다.
    // where
    // or title = #{title}
    // 이때 or 앞에 다른 조건이 업식 떄문에 or를 제거해야한다.
    SqlSession sqlSession = sqlSessionFactory.openSession();
    HashMap<String, Object> params = new HashMap<>();
    // 여러개의 조건중 한 개에 대해 처리하기
    Scanner keyboard = new Scanner(System.in);
    System.out.println("정렬할 컴럼?");
    String column = keyboard.nextLine();
    if (column.length() > 0) {
      params.put("column", column);
    }


    System.out.println("정렬?");
    String sort = keyboard.nextLine();
    if (column.length() > 0) {
      params.put("sort", sort);
    }


    keyboard.close();

    
    // 정렬할 컬럼 이름가 정렬방식 (asc, desc)값을 전달할 수 없다.
   /// List<Board> boards = sqlSession.selectList("board.select7_error", params);
    
    
    //컬럼 이름과 정렬 방식가 같은 sql 키워드 값으로 전달하려면
    // 
    //문제는 사용자가 입력한 갑승ㄹ 직접 전달하게 되면 sql 삽입공격에 노출된다.
    //덜대 직접 전달해서는 안된다.
    
    
    
    List<Board> boards = sqlSession.selectList("board.select7_ok", params);
    for (Board b : boards) {
      System.out.println(b);

    }


    System.out.println("-------------------------------");


  }

}


