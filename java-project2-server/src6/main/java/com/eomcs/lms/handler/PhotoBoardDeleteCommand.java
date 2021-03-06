package com.eomcs.lms.handler;
import com.eomcs.lms.dao.PhotoBoardDao;

public class PhotoBoardDeleteCommand extends AbstractCommand{
  

  PhotoBoardDao photoBoardDao;
  
  public PhotoBoardDeleteCommand(PhotoBoardDao photoBoardDao) {

    this.photoBoardDao = photoBoardDao;
  }

  @Override
  public void execute(Response response) throws Exception {
   
    int no = response.requestInt("번호?");

     if( photoBoardDao.delete(no) ==0) {
       System.out.println("해당 게시물이 없습니다..");
     }else
       response.println("삭제했습니다.");
    
  }
}
