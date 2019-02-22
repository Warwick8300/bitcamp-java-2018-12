package com.eomcs.lms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.mariadb.BoardDao;

public class BoardAddCommand implements Command {

  BoardDao boardDao;

  public BoardAddCommand(BoardDao boardDao) {

    this.boardDao = boardDao;
  }

  @Override
  public void execute(BufferedReader in, PrintWriter out) {
    Board board = new Board();
    try {
      out.println("내용? ");
      out.println("!{}!");
      out.flush();
      board.setContents(in.readLine());
      boardDao.insert(board);
      out.println("저장하였습니다.");

    } catch (Exception e) {
      out.printf("실행 오류! : %s\n", e.getMessage());
    }
  }
}
