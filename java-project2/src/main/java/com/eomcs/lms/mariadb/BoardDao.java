// 프록시 패턴 적용 - BoardDao 에서 인터페이스 추출
package com.eomcs.lms.mariadb;

import java.util.List;
import com.eomcs.lms.domain.Board;

public interface BoardDao {


  void insert(Board board);

  List<Board> findAll();


  Board findByNo(int no);

  int update(Board board);

  int delete(int no);

}


