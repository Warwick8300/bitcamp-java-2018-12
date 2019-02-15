package design_pattern.proxy.after.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;


// 스텁은 실제 일을 하는 객체를 대행하기 때문에 같은 규칙에 따라 구현되어야 한다.

// => 클라이언트는 이 스텁 클래스가 실제 일을 하는 객체 인양 그대로 사용한다.
// => 이렇게 실제 일을 하는 객체와 같은 규칙을 따르지만 메서드가 호출될 때
// 자신이 직접 일을 하지 않고, 실제 일을 하는 객체에게 위임한다.
// 이런식으로 설계하는것을 "프록(proxy)"라 한다.
public class CalculatorStub implements Calculator {
  private int compute(int a, int b, String op) throws Exception {
    try (Socket s = new Socket("localhost", 8888);
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        DataInputStream in = new DataInputStream(s.getInputStream())) {

      out.writeInt(a);
      out.writeInt(b);
      out.writeUTF(op);
      if (in.readUTF().equalsIgnoreCase("OK")) {
        return in.readInt();
      } else
        throw new RuntimeException(in.readUTF());
    }
  }

  @Override
  public int plus(int a, int b) {
    try {
      return compute(a, b, "+");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public int minus(int a, int b) {
    try {
      return compute(a, b, "-");
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }



}
