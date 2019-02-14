// 10단계: 데이터를 파일로 관리한다.
package com.eomcs.lms.service;

import com.eomcs.lms.dao.LessonDao;
import com.eomcs.lms.domain.Lesson;

public class LessonService extends AbstractService<Lesson> {


  //lessonService가 작업을 수행할떄 사용할 객체 (의존객체 dependuny
  LessonDao lessonDao;
  public LessonService(LessonDao lessonDao) {
    this.lessonDao = lessonDao;
  }
  public void execute(String request) throws Exception {

    switch (request) {
      case "/lesson/add":
        add();
        break;
      case "/lesson/list":
        list();
        break;
      case "/lesson/detail":
        detail();
        break;
      case "/lesson/update":
        update();
        break;
      case "/lesson/delete":
        delete();
        break;  
      default:
        out.writeUTF("FAIL");
    }
    out.flush();
  }

  private void add() throws Exception {
    out.writeUTF("OK");
    out.flush();
    lessonDao.insert((Lesson)in.readObject());
    out.writeUTF("OK");
  }

  private void list() throws Exception {
    out.writeUTF("OK");
    out.flush();
    out.writeUTF("OK");
    out.writeUnshared(lessonDao.findAll());
  }

  private void detail() throws Exception {
    out.writeUTF("OK");
    out.flush();
    int no = in.readInt();
    Lesson b = lessonDao.findBy(no);
    if(b== null) {
      out.writeUTF("FAIL");
      return;
    }
    out.writeUTF("OK");
    out.writeObject(b);
  }


  private void update() throws Exception {
    out.writeUTF("OK");
    out.flush();
    Lesson lesson = (Lesson) in.readObject();
    if(lessonDao.update(lesson)==0) {
      out.writeUTF("FAIL");
      return;
      }

      out.writeUTF("OK");

    }



    private void delete() throws Exception {
      out.writeUTF("OK");
      out.flush();
      int no = in.readInt();
      if(lessonDao.delete(no)==0) {
          out.writeUTF("FAIL");
          return;
        }
     

      out.writeUTF("OK");    
    }

  }







