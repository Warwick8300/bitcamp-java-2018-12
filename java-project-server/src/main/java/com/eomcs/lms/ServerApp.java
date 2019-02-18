// 15단계 : 여러 클라이언트 요청을 처리할 때의 문제점과 해결책(멀티스레드 적용)
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;
import com.eomcs.lms.dao.BoardDaoImpl;
import com.eomcs.lms.dao.LessonDaoImpl;
import com.eomcs.lms.dao.MemberDaoImpl;
import com.eomcs.lms.service.BoardDaoSkel;
import com.eomcs.lms.service.LessonDaoSkel;
import com.eomcs.lms.service.MemberDaoSkel;
import com.eomcs.lms.service.Service;


// DAO 프록시 패턴 적용
// => 클라이언트에서 서버쪽에 DAO를 마치 직접 사용하는 것처럼 만들기
// => 작업
// =>
public class ServerApp {

  static BoardDaoImpl boardDao;
  static MemberDaoImpl memberDao;
  static LessonDaoImpl lessonDao;
  static HashMap<String, Service> serviceMap;
  static Set<String> servicekeySet;


  public static void main(String[] args) {

    try {
      boardDao = new BoardDaoImpl("board.bin");
      boardDao.loadData();
    } catch (Exception e) {
      System.out.println("게시물 데이터 로딩 중 오류 발생!");
    }

    try {
      memberDao = new MemberDaoImpl("member.bin");
      memberDao.loadData();
    } catch (Exception e) {
      System.out.println("회원 데이터 로딩 중 오류 발생!");
    }

    try {
      lessonDao = new LessonDaoImpl("lesson.bin");
      lessonDao.loadData();
    } catch (Exception e) {
      System.out.println("수업 데이터 로딩 중 오류 발생!");
    }

    serviceMap = new HashMap<>();
    serviceMap.put("/board/", new BoardDaoSkel(boardDao));
    serviceMap.put("/member/", new MemberDaoSkel(memberDao));
    serviceMap.put("/lesson/", new LessonDaoSkel(lessonDao));

    servicekeySet = serviceMap.keySet();

    try (ServerSocket serverSocket = new ServerSocket(8888)) {
      System.out.println("서버 시작!");

      while (true) {
        new RequestProcessorThread(serverSocket.accept()).start();

      } // while

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static class RequestProcessorThread extends Thread {
    Socket socket;

    public RequestProcessorThread(Socket socket) {
      this.socket = socket;
    }

    @SuppressWarnings("unused")
    @Override
    public void run() {
      try (Socket socket = this.socket;
          ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
          ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {

        System.out.println("클라이언트와 연결되었음.");

        String request = in.readUTF();
        System.out.println(request);
        Service service = getService(request);
        String serviceName = null;


        if (serviceName == null) {
          out.writeUTF("FAIL");

        } else {

          service.execute(request, in, out);
        }
        out.flush();

      } catch (Exception e) {
        e.printStackTrace();
      }
      System.out.println("클라이언트와의 연결을 끊었음.");
    }
  }

  static Service getService(String request) {
    for (String key : servicekeySet) {
      if (request.startsWith(key)) {
        return serviceMap.get(key);
      }
    }
    return null;
  }
}


