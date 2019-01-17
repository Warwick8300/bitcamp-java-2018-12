package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardHandler {
  
  Scanner keyboard;
  BoardList list = new BoardList();

  public BoardHandler(Scanner key) {
    this.keyboard = key;
  }

  public void listBoard() {
    
    Board[] board = new Board[list.getBoardIdx()];
    board = list.toArray();
    
    for (int j = 0; j < this.list.getBoardIdx(); j++) {
      System.out.printf("%3d, %-20s, %s, %d\n",  
          board[j].getNo(), board[j].getContents(), board[j].getCreatedDate(), board[j].getViewCount());
    
    
    /*
    for (Board board :boards ) {
      System.out.printf("%3d, %-20s, %s, %d\n", 
          board.getNo(), board.getContents(), board.getCreatedDate(), board.getViewCount());
    */
    }
  }

  public void addBoard() {
    Board board = new Board();
    System.out.print("번호? ");
    board.setNo(Integer.parseInt(keyboard.nextLine()));

    System.out.print("내용? ");
    board.setContents(keyboard.nextLine());

    board.setCreatedDate(new Date(System.currentTimeMillis())); 

    board.setViewCount(0);

    list.add(board);

    System.out.println("저장하였습니다.");
  }
}
