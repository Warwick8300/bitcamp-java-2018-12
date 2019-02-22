package com.eomcs.lms.handler;
import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.lms.mariadb.BoardDao;

public class BoardDeleteCommand implements Command {
  

  BoardDao boardDao;
  
  public BoardDeleteCommand(BoardDao boardDao) {

    this.boardDao = boardDao;
  }

  @Override
  public void execute(BufferedReader in, PrintWriter out) {
    try {
    out.println("번호? ");
    out.println("!{}!");
    out.flush();
    int no = Integer.parseInt(in.readLine());

     if( boardDao.delete(no) ==0) {
       System.out.println("해당 게시물이 없습니다..");
     }else
       out.println("삭제했습니다.");
    } catch (Exception e) {
     out.printf("실행 오류! : %s\n", e.getMessage());
    }
  }
}
