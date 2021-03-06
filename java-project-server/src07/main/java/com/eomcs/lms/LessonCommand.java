// 7단계: 클라이언트에서 요청한 /lesson/* 이명령을 처리 한다 .
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Lesson;

public class LessonCommand {


  static ArrayList<Lesson> lessons = new ArrayList<>();

  static ObjectInputStream in;
  static ObjectOutputStream out;

  public static void service(String request) throws Exception {

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

  static void quit() throws Exception {
    out.writeUTF("ok");
    out.flush();
    out.writeUTF("종료함!");
    out.flush();
  }

  static void add() throws Exception {
    out.writeUTF("ok");
    out.flush();
    lessons.add((Lesson)in.readObject());
    out.writeUTF("OK");
  }

  static void list() throws Exception {
    out.writeUTF("ok");
    out.flush();
    out.writeUTF("OK");
    out.writeObject(lessons);
  }

  static void detail() throws Exception {
    out.writeUTF("ok");
    out.flush();
    int no = in.readInt();

    for (Lesson m : lessons) {
      if (m.getNo() == no) {
        out.writeUTF("OK");
        out.writeObject(m);
        return;
      }
    }

    out.writeUTF("FAIL");
  }

  static void update() throws Exception {
    out.writeUTF("ok");
    out.flush();
    Lesson lesson = (Lesson) in.readObject();

    int index = 0;
    for (Lesson m : lessons) {
      if (m.getNo() == lesson.getNo()) {
        lessons.set(index, lesson);
        out.writeUTF("OK");
        return;
      }
      index++;
    }

    out.writeUTF("FAIL");
  }

  static void delete() throws Exception {
    out.writeUTF("ok");
    out.flush();
    int no = in.readInt();

    int index = 0;
    for (Lesson l : lessons) {
      if (l.getNo() == no) {
        lessons.remove(index);
        out.writeUTF("OK");
        return;
      }
      index++;
    }

    out.writeUTF("FAIL");    
  }

}






