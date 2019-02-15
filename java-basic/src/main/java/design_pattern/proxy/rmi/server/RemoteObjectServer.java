package design_pattern.proxy.rmi.server;
// RMI 기술 사용하기 - 원격 객체를 RMI 레지스트리 서버에 등록하기

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RemoteObjectServer {

  public static void main(String[] args) {
    // 1) 보안 관리자 등록
    // 2)
/*
    if (System.getSecurityManager() == null) { System.setSecurityManager(new SecurityManager());
    }
*/

    try {
      Calculator calcObj = new CalculatorImpl();
      // 원격 객체와

      Calculator stub = (Calculator) UnicastRemoteObject.exportObject(calcObj, 0);

      
     // Registry registry = LocateRegistry.createRegistry(8888);
     Registry registry = LocateRegistry.getRegistry("study.bitcamp.co.kr");
      // 5) Registry 도구를 사용하여 RMI Registry 서버에 sub 등록한다.



      registry.rebind("calc", stub);

      System.err.println("Server ready");
      System.out.println("Calculator 객체의 프록시(stub)가 RMIRegistry 서버 등록되었다.");
      System.out.println();
    } catch (Exception e) {
      System.err.println("Server exception: " + e.toString());
      e.printStackTrace();
    }
  }
}
