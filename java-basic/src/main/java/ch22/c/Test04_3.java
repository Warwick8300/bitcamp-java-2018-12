package ch22.c;

import java.io.FileInputStream;

//데코레이터 여러개 연결하기
public class Test04_3 {

  public static void main(String[] args) {
    try ( FileInputStream in = new FileInputStream("data.bin");
        BufferedInputStream in1 = new BufferedInputStream(in);
        DataInputStream in2 = new DataInputStream(in1)){
      int value = in2.readInt();
      String name = in2.readUTF();
      int age = in2.readShort();
    
      System.out.printf("%d %s %d ",value,name,age);

    }catch (Exception e) {
      e.printStackTrace();
      
    }
    System.out.println("읽기완료");
  }




}
