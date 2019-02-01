package ch22.c;

import java.io.FileInputStream;

//바이트 데이터를 읽어 primitive date type의 값으로 바꿔 데코레이터 
public class Test04_2 {

  public static void main(String[] args) {
    try ( FileInputStream in = new FileInputStream("data.bin");
        DataInputStream in2 = new DataInputStream(in)){
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
