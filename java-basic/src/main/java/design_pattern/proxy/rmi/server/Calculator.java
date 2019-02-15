// RMI 기술 사용하기 - 원격 인터페이스 정의하기
package design_pattern.proxy.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

// 원격 인터페이스 (Remote interface)
// Remote 객체의 사용 규칙을 정의한 이터페이스
// RMI 기술을 적용하려면 java.


public interface Calculator extends Remote {


  // 메서드는 java.rmi.RemoteException 이발생할 수 있다.
  public int plus(int a, int b) throws RemoteException;

  public int minus(int a, int b) throws RemoteException;

}
