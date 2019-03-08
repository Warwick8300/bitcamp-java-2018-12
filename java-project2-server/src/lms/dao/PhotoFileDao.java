// 프록시 패턴 적용 - BoardDao 에서 인터페이스 추출
package com.eomcs.lms.dao;

import java.util.List;
import com.eomcs.lms.domain.PhotoFile;

public interface PhotoFileDao {


  void insert(PhotoFile photoFile);

  List<PhotoFile> findByPhotoBoardNo(int photoBoardNo);


 // PhotoBoard findByNo(int no);

 // int update(PhotoBoard board);

  int deleteByPhotoBoardNo(int photoBoardNo);

}


