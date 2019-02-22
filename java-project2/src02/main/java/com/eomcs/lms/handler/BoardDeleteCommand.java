package com.eomcs.lms.handler;
import java.util.Scanner;
import com.eomcs.lms.mariadb.BoardDao;

public class BoardDeleteCommand implements Command {
  
  Scanner keyboard;
  BoardDao boardDao;
  
  public BoardDeleteCommand(Scanner keyboard, BoardDao boardDao) {
    this.keyboard = keyboard;
    this.boardDao = boardDao;
  }

  @Override
  public void execute() {
    System.out.print("번호? ");
    int no = Integer.parseInt(keyboard.nextLine());

    try {
     if( boardDao.delete(no) ==0) {
       System.out.println("해당 게시물이 없습니다..");
     }else
       System.out.println("삭제했습니다.");
    } catch (Exception e) {
      System.out.printf("실행 오류! : %s\n", e.getMessage());
    }
  }
}
