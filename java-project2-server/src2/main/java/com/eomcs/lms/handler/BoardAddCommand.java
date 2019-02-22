package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.mariadb.BoardDao;

public class BoardAddCommand implements Command {

  Scanner keyboard;
  BoardDao boardDao;

  public BoardAddCommand(Scanner keyboard, BoardDao boardDao) {
    this.keyboard = keyboard;
    this.boardDao = boardDao;
  }

  @Override
  public void execute() {
    Board board = new Board();
  
    System.out.print("내용? ");
    board.setContents(keyboard.nextLine());
 

    try {
      boardDao.insert(board);
      System.out.println("저장하였습니다.");

    } catch (Exception e) {
      System.out.printf("실행 오류! : %s\n", e.getMessage());
    }
  }
}
