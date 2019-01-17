package com.eomcs.lms.handler;


import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class BoardList {
  
  static final int LENGTH = 10;
  
  Board[] boards;
 int boardIdx = 0; 
 public int getBoardIdx() {
  return boardIdx;
}

public void setBoardIdx(int boardIdx) {
  this.boardIdx = boardIdx;
}

public BoardList() {
   boards = new Board[LENGTH];
 }
 
  public Board[] toArray(){
  return boards;
 //return Arrays.copyOf(boards,boardIdx);
  }
  public void add(Board board) {
    boards[boardIdx++] = board;
    
   
  }
}