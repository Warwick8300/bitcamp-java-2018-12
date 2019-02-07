package ch22.d;

import java.io.FileWriter;

//문자 배열 출
public class Test02_1 {

  public static void main(String[] args) {
    
    try(FileWriter out = new FileWriter("data.txt")){
      
      char[] chars = {'A','b','C','홍','길','동','0','1','2'};
      out.write(chars);// => 0x41 
      
    } catch (Exception e) {
      e.printStackTrace();
      }
    System.out.println("출력 완료");
  }

}