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
 
  Board [] arr = new Board[boardIdx];
  for(int i =0;i< boardIdx; i++)
    arr[i]= boards[i];
  return arr;
 //return Arrays.copyOf(boards,boardIdx);
  /*
  if (size == arr.length) {
    arr = Arrays.copyOf(arr, arr.length + (arr.length >> 1));
    
    Board[] a = new Board[arr.length + (arr.length >> 1)];
    for (int i = 0; i < arr.length; i++) {
      a[i] = arr[i];
    }
    arr = a;
    
    System.out.printf("배열 증가 함: %d\n", arr.length);
  */
  }
  public void add(Board board) {
    boards[boardIdx++] = board;
    
   
  }
}