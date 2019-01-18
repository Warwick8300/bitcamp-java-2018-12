package com.eomcs.lms.handler;
import java.sql.Date;
import java.util.Arrays;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Member;

public class BoardHandler {

  Scanner keyboard;
  ArrayList<Board> list;

  public BoardHandler(Scanner keyboard) {
    this.keyboard = keyboard;
    this.list = new ArrayList<>();
  }

  public void listBoard() {
    Board[] boards = list.toArray(new Board[0]);

    for (Board board : boards) {

      System.out.printf("%3d, %-20s, %s, %d\n", 
          board.getNo(), board.getContents(), 
          board.getCreatedDate(), board.getViewCount());
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
  public void detailBoard() {
    System.out.print("번호? ");
    Board board = list.get(Integer.parseInt(keyboard.nextLine()));
    if(board == null) {
      System.out.println("해당 게시글을 찾을 수 없습니다.");
    } else {
      System.out.printf("%3d, %-20s, %s, %d\n", 
          board.getNo(), board.getContents(), 
          board.getCreatedDate(), board.getViewCount());
    }
  }

  public void updateBoard() {
    System.out.print("번호? ");
    int idx= Integer.parseInt(keyboard.nextLine());
    Board board = list.get(idx);
    
    Board temp = new Board();
   temp = board;

    if(temp == null) {
      System.out.println("해당 게시글을 찾을 수 없습니다.");
    } else {
      System.out.printf("내용? :");
      temp.setContents(keyboard.nextLine());
      if(temp.getContents()=="")
      {
        temp.setContents(board.getContents());
      }
      list.set(idx, temp);
    }

  }






  public void deleteBoard() {

  }


}
