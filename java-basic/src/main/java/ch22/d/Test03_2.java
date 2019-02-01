package ch22.d;

import java.io.BufferedReader;
import java.io.FileReader;

//문자 배열 읽
public class Test03_2 {

  public static void main(String[] args) {

    try(FileReader in = new FileReader("data.txt");
        BufferedReader in2 =new BufferedReader(in)){
      
      System.out.println(in2.readLine());
    
    
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    System.out.println("읽기 완료");
    System.out.println();

  }

}
