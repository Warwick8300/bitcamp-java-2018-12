// 데이터 처리 관련 코드를 별도의 클래스로 분리
package com.eomcs.lms.dao;

import java.util.List;
import com.eomcs.lms.domain.Lesson;

public class LessonDao extends AbstractDao<Lesson> {
  public LessonDao(String filepath) {
    this.filepath = filepath;
    this.loadData();
  }

  public void insert(Lesson lesson){
    list.add(lesson);
  }


  public List<Lesson> findAll(){
    return list;
  }

  public Lesson findBy(int no){

    for (Lesson m : list) {
      if (m.getNo() == no) {

        return m;
      }
    }

    return null;
  }

  public int update(Lesson lesson){
    int index = 0;
    for (Lesson m : list) {
      if (m.getNo() == lesson.getNo()) {
        list.set(index, lesson);
        return 1;
      }
      index++;
    }

    return 0;
  }

  public int delete(int no) {

    int index = 0;
    for (Lesson m : list) {
      if (m.getNo() == no) {
        list.remove(index);

        return 1;
      }
      index++;
    }

    return 0; 
  }

}







