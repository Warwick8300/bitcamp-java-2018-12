package design_pattern.proxy.before2.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class CalculatorClient {
  public int compute(int a, int b,String op) throws Exception {
    try (Socket s = new Socket("localhost", 8888);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        DataInputStream in = new DataInputStream(s.getInputStream())) {

      out.writeInt(a);
      out.writeInt(b);
      out.writeUTF(op);
      if (in.readUTF().equalsIgnoreCase("ok")) {
        return in.readInt();
      } else
        throw new RuntimeException(in.readUTF());
    }
  }

 



}
