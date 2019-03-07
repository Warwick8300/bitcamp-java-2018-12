// dynamic SQL 다루기 - 조건문
package ch26.f;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test02 {

  public static void main(String[] args) throws Exception {
    
    InputStream inputStream = Resources.getResourceAsStream(
        "ch26/f/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory =
      new SqlSessionFactoryBuilder().build(inputStream);
    
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("게시물 번호?");
    String values = keyboard.nextLine();
    keyboard.close();
    
    
    HashMap<String, Object> params = new HashMap<>();
    
    
    
    try {
      params.put("no",Integer.parseInt(values));
    }catch (Exception e) {
    }
    
    
   
    List<Board> boards = sqlSession.selectList("board.select2",params);
 
    for (Board b : boards) {
      System.out.println(b);
      
    }
    
       
    System.out.println("-------------------------------");
    

  }

}






