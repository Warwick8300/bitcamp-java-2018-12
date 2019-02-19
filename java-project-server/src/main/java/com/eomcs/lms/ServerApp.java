// 15단계 : 여러 클라이언트 요청을 처리할 때의 문제점과 해결책(멀티스레드 적용)
package com.eomcs.lms;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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

  static ExecutorService executorService= Executors.newCachedThreadPool();


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

      while (true) { // 독립적으로 해야할 일을 스레드 풀에 맡긴다.
        executorService.submit( new RequestHandler(serverSocket.accept()));


      } // while

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  static class RequestHandler implements Runnable {

    static int count = 0;
    Socket socket;
    String name;
    public String getName() {
      return this.name;
    }

    public RequestHandler(Socket socket) {
      this.socket = socket;
      this.name = "RequestHandler-"+count++;
      System.out.printf("[%s : %s]핸들러 생성됨\n",Thread.currentThread().getName(),this.getName());
    }

    @SuppressWarnings("unused")
    @Override
    public void run() {
      try (Socket socket = this.socket;
          ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
          ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {

        System.out.printf("[%s : %s] 클라이언트와 연결되었음.\n",Thread.currentThread().getName(),this.getName());

        String request = in.readUTF();
        System.out.printf("[%s : %s] %s\n",Thread.currentThread().getName(),this.getName(),request);
        Service service = getService(request);
     


        if (service == null) {
          out.writeUTF("FAIL");

        } else {

          service.execute(request, in, out);
        }
        out.flush();

      } catch (Exception e) {
        e.printStackTrace();
      }
      try {
        //Thread.currentThread().sleep(8000);
      } catch (Exception e) {
      }
      System.out.printf("[%s : %s]클라이언트와의 연결을 끊었음.\n",Thread.currentThread().getName(),this.getName());
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


