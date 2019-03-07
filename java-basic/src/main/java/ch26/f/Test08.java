// dynamic SQL 다루기 - <set>태그 사용법
package ch26.f;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test08 {

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
    System.out.println("번호?");
    int no = Integer.parseInt(keyboard.nextLine());
    params.put("no", no);


    System.out.println("제목?");
    String value = keyboard.nextLine();
    if (value.length() > 0) {
      params.put("title", value);
    }
    
    System.out.println("내용?");
    value = keyboard.nextLine();
    if (value.length() > 0) {
      params.put("contents", value);
    }


    keyboard.close();

    Board board = sqlSession.selectOne("board.select1", no);
    System.out.println("변경전");
 System.out.println(board); 
    
    
    board = sqlSession.selectOne("board.update1", params);
    sqlSession.commit();
    
    
    board = sqlSession.selectOne("board.select1", no);
    System.out.println("변경후");
 System.out.println(board);

    System.out.println("-------------------------------");


  }

}


