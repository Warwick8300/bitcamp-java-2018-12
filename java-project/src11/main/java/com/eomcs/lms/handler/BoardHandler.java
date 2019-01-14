package com.eomcs.lms.handler;
import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
public class BoardHandler {
  
  public static Scanner keyboard;
  static final int LENGTH = 100;
  public static Board[] boards = new Board[LENGTH];
  public static int boardsSize = 0;
  
  public static void addBoard() {
    Board board = new Board();
    System.out.print("번호? ");
    board.no = Integer.parseInt(keyboard.nextLine());
    System.out.print("내용? ");
    board.contents = keyboard.nextLine();
    board.createdDate = new Date(System.currentTimeMillis()); 
    board.viewCount = 0;
    boards[boardsSize++] = board;
    System.out.println("저장하였습니다.");
  }

  public static void listBoard() {
    for (int j = 0; j < boardsSize; j++) {
      System.out.printf("%3d, %-20s, %s, %d\n", 
          boards[j].no, boards[j].contents, boards[j].createdDate, boards[j].viewCount);
    }
  }
}
