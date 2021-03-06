package com.eomcs.lms.handler;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.domain.PhotoBoard;

public class PhotoBoardUpdateCommand extends AbstractCommand{

 
  PhotoBoardDao photoBoardDao;

  public PhotoBoardUpdateCommand( PhotoBoardDao photoBoardDao) {
 
    this.photoBoardDao = photoBoardDao;
  }

  @Override
  public void execute(Response response)throws Exception {

      PhotoBoard photoBoard = new PhotoBoard();
      photoBoard.setNo(response.requestInt("번호?"));
      photoBoard.setTitle(response.requestString("내용?"));
      photoBoard.setLessonNo(response.requestInt("수업번호?"));
      if (photoBoardDao.update(photoBoard) == 0) {
        response.println("해당 게시물이 없습니다..");
      } else
        response.println("변경했습니다.");

  }


}
