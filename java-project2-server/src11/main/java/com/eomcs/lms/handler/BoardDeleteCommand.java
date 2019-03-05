package com.eomcs.lms.handler;
import com.eomcs.lms.dao.BoardDao;

public class BoardDeleteCommand extends AbstractCommand{
  

  BoardDao boardDao;
  
  public BoardDeleteCommand(BoardDao boardDao) {

    this.boardDao = boardDao;
  }

  @Override
  public void execute(Response response) throws Exception {
   
    int no = response.requestInt("번호?");

     if( boardDao.delete(no) ==0) {
       System.out.println("해당 게시물이 없습니다..");
     }else
       response.println("삭제했습니다.");
    
  }
}
