package ch22.c;

import java.io.FileOutputStream;
import java.io.IOException;

//primitive date type의 값을 출력하는 것을 도와주는 데코레이터 사용하기 
public class Test03_3 {

  public static void main(String[] args) {
    try ( FileOutputStream out = new FileOutputStream("data.bin") ;
        BufferdOutputStream out1 = new BufferdOutputStream(out);
    DataOutputStream out2 = new DataOutputStream(out1)){
      int no = 200;
      String name = "ABC가각간갇갈";
      int age = 30;
      out2.writeInt(no);
      out2.writeUTF(name);
      out2.writeShort(age);
     
      out2.flush();

      System.out.println("데이터쓰중");
     
    
        
      System.out.println();
    }catch (Exception e) {
      e.printStackTrace();
      
    }
    System.out.println("쓰기완료");
  }




}
