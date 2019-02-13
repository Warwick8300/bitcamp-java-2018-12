// 8단계: 클라이언트에서 요청한 처리하는 클래스에 대해 리팩토링 .
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.eomcs.lms.domain.Board;
// 
public class BoardService {
public BoardService(ObjectInputStream in, ObjectOutputStream out) {
  this.in = in;
  this.out = out;
  
}

   ArrayList<Board> boards = new ArrayList<>();

   ObjectInputStream in; 
   ObjectOutputStream out;

  public  void execute(String request) throws Exception {

    switch (request) {
      case "/board/add":
        add();
        break;
      case "/board/list":
        list();
        break;
      case "/board/detail":
        detail();
        break;
      case "/board/update":
        update();
        break;
      case "/board/delete":
        delete();
        break;  
      default:
        out.writeUTF("FAIL");

    }
    out.flush();

  }


   private void add() throws Exception {
    out.writeUTF("ok");
    out.flush();
    boards.add((Board)in.readObject());
    out.writeUTF("OK");
  }

   private void list() throws Exception {
    out.writeUTF("ok");
    out.flush();
    out.writeUTF("OK");
    out.writeObject(boards);
  }

   private void detail() throws Exception {
    out.writeUTF("ok");
    out.flush();
    int no = in.readInt();

    for (Board m : boards) {
      if (m.getNo() == no) {
        out.writeUTF("OK");
        out.writeObject(m);
        return;
      }
    }

    out.writeUTF("FAIL");
  }

  private void update() throws Exception {
    out.writeUTF("ok");
    out.flush();
    Board board = (Board) in.readObject();

    int index = 0;
    for (Board m : boards) {
      if (m.getNo() == board.getNo()) {
        boards.set(index, board);
        out.writeUTF("OK");
        return;
      }
      index++;
    }

    out.writeUTF("FAIL");
  }

  private void delete() throws Exception {
    out.writeUTF("ok");
    out.flush();
    int no = in.readInt();

    int index = 0;
    for (Board b : boards) {
      if (b.getNo() == no) {
        boards.remove(index);
        out.writeUTF("OK");
        return;
      }
      index++;
    }

    out.writeUTF("FAIL");    
  }

}






