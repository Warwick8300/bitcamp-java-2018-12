package com.eomcs.util;

import com.eomcs.lms.domain.Board;

public class tt {

  public static void main(String[] args) {
    // TODO 자동 생성된 메소드 스텁
    LinkedList<Board> list = new LinkedList();
    
    Board t = new Board();
    list.add(t);
    list.add(t);
    list.add(t);
    System.out.println(list.toArray(new Board[list.size()]));
  }

}
