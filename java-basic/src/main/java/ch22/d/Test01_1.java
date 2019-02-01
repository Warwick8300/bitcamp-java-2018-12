package ch22.d;

import java.io.FileWriter;

//문자 데이터 출력하기 
public class Test01_1 {

  public static void main(String[] args) {
    
    try(FileWriter out = new FileWriter("data.txt")){
      out.write('A');// => 0x41 
      out.write('B');
      out.write('C');
      out.write('가');
      out.write('각');
      out.write('간');
    } catch (Exception e) {
      e.printStackTrace();
      }
    System.out.println("출력 완료");
  }

}
