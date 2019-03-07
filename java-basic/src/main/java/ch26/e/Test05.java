// SQL을 실행할 때 파라미터 값 넘기기 II - 도메인 객체 넘기기
package ch26.e;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test05 {

  public static void main(String[] args) throws Exception {
    
    InputStream inputStream = Resources.getResourceAsStream(
        "ch26/e/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory =
      new SqlSessionFactoryBuilder().build(inputStream);
    
    SqlSession sqlSession = sqlSessionFactory.openSession();
 
 
 
    Board board = new Board();
    board.setTitle("오호라...제목이오!");
    board.setContents("내용이라네요...");
    
    System.out.println(board);
    sqlSession.insert("board.insert1", board);

    
    System.out.println("----------------------------");
   sqlSession.insert("board.insert3", board);
   System.out.println(board);
   System.out.println("----------------------------");
    
    
    
    
    sqlSession.commit();
    
    List<Board> boards = sqlSession.selectList("board.select1");
    for (Board b : boards) {
      System.out.println(b);
    }
    System.out.println("-------------------------------");
  }

}






