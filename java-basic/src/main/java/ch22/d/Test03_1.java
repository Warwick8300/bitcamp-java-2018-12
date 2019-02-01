package ch22.d;

import java.io.FileWriter;

//String 배열 출
public class Test03_1 {

  public static void main(String[] args) {
    
    try(FileWriter out = new FileWriter("data.txt")){
      
     
      out.write("abc가가각간123#!?");
      
    } catch (Exception e) {
      e.printStackTrace();
      }
    System.out.println("출력 완료");
  }

}
