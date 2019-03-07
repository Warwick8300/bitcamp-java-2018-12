// dynamic SQL 다루기 - 조인사용후
package ch26.h;

import java.io.InputStream;
import java.util.Scanner;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test02 {

  public static void main(String[] args) throws Exception {

    InputStream inputStream = Resources.getResourceAsStream("ch26/h/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    SqlSession sqlSession = sqlSessionFactory.openSession();


    Scanner keyboard = new Scanner(System.in);
    System.out.println("게시물 번호?");
    int no = Integer.parseInt(keyboard.nextLine());
    keyboard.close();

    // 조인을 사용할 경우 부모 객체 안에 자식 테이블의 정보를
    
    

    Board board = sqlSession.selectOne("board.selectBoardWithAttachFile",no);
    System.out.println(board);

    System.out.println("첨부파일");
    for(AttachFile f : board.getAttachFiles()) {
      System.out.println(" ==> " + f);
    }
    
    System.out.println("-------------------------------");


  }

}


