// 10단계: 데이터를 파일로 관리한다.
package com.eomcs.lms.service;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.dao.BoardDao;
import com.eomcs.lms.domain.Board;

public class BoardService implements Service {


  //boardService가 작업을 수행할떄 사용할 객체 (의존객체 dependuny
  BoardDao boardDao;
  public BoardService(BoardDao boardDao) {
    this.boardDao = boardDao;
  }
  public void execute(String request,ObjectInputStream in, ObjectOutputStream out) throws Exception {

    switch (request) {
      case "/board/add":
        add(in,out);
        break;
      case "/board/list":
        list(in,out);
        break;
      case "/board/detail":
        detail(in,out);
        break;
      case "/board/update":
        update(in,out);
        break;
      case "/board/delete":
        delete(in,out);
        break;  
      default:
        out.writeUTF("FAIL");
    }
    out.flush();
  }

  private void add(ObjectInputStream in, ObjectOutputStream out) throws Exception {
    out.writeUTF("OK");
    out.flush();
    boardDao.insert((Board)in.readObject());
    out.writeUTF("OK");
  }

  private void list(ObjectInputStream in, ObjectOutputStream out) throws Exception {
    out.writeUTF("OK");
    out.flush();
    out.writeUTF("OK");
    out.writeUnshared(boardDao.findAll());
  }

  private void detail(ObjectInputStream in, ObjectOutputStream out) throws Exception {
    out.writeUTF("OK");
    out.flush();
    int no = in.readInt();
    Board b = boardDao.findByNo(no);
    if(b== null) {
      out.writeUTF("FAIL");
      return;
    }
    out.writeUTF("OK");
    out.writeObject(b);
  }


  private void update(ObjectInputStream in, ObjectOutputStream out) throws Exception {
    out.writeUTF("OK");
    out.flush();
    Board board = (Board) in.readObject();
    if(boardDao.update(board)==0) {
      out.writeUTF("FAIL");
      return;
      }

      out.writeUTF("OK");

    }



    private void delete(ObjectInputStream in, ObjectOutputStream out) throws Exception {
      out.writeUTF("OK");
      out.flush();
      int no = in.readInt();
      if(boardDao.delete(no)==0) {
          out.writeUTF("FAIL");
          return;
        }
     

      out.writeUTF("OK");    
    }

  }







