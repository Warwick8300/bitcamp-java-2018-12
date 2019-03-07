// dynamic SQL 다루기 - <trim> 태그의 사용
package ch26.f;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test06 {

  public static void main(String[] args) throws Exception {
    
    InputStream inputStream = Resources.getResourceAsStream(
        "ch26/f/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory =
      new SqlSessionFactoryBuilder().build(inputStream);
    
    
    // SQL 문장 앞에 오는 키워드 제거 하기
    // 동적 SQL을 다루다 보면 조건에 따라 다음과 같은 문장이 생성될 수 있다.
    // where
     // or title = #{title}
    // 이때 or 앞에 다른 조건이 업식 떄문에 or를 제거해야한다.
    SqlSession sqlSession = sqlSessionFactory.openSession();
    HashMap<String, Object> params = new HashMap<>();
    // 여러개의 조건중 한 개에 대해 처리하기
    Scanner keyboard = new Scanner(System.in);
    System.out.println("게시물 번호?");
    String value = keyboard.nextLine();

    try {
      params.put("no",Integer.parseInt(value));
    }catch (Exception e) {
    }
    
  
    System.out.println("제목?");
    value = keyboard.nextLine();
    if (value.length() > 0) {
      params.put("title", value);
    }
    
    System.out.println("내용?");
    value = keyboard.nextLine();
    if (value.length() > 0) {
      params.put("contents", value);
    }
   
    
    keyboard.close();
   
    List<Board> boards = sqlSession.selectList("board.select6",params);
 
    for (Board b : boards) {
      System.out.println(b);
      
    }
    
       
    System.out.println("-------------------------------");
    

  }

}






