package design_pattern.proxy.rmi.server;
// RMI 기술 사용하기 - 원격 객체를 RMI 레지스트리 서버에 등록하기

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RemoteObjectClient {

  public static void main(String[] args) throws Exception {
    try {  
      // Getting the registry 
      Registry registry = LocateRegistry.getRegistry(); 

      // Looking up the registry for the remote object 
      
      Calculator stub = (Calculator) registry.lookup("calc");
      // Calling the remote method using the obtained object 
      System.out.println(stub.plus(5, 5));

      // System.out.println("Remote method invoked"); 
    } catch (Exception e) {
      System.err.println("Client exception: " + e.toString()); 
      e.printStackTrace(); 
    } 



  }
}
