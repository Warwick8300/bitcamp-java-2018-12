package ch22.g;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//Serialize - 인스필드의 값 읽기
public class Test2_2 {

  public static void main(String[] args) {
    try(ObjectInputStream in = new ObjectInputStream(
        new FileInputStream("score2.data"))) {
      
      //인스턴스 출력ㅎ기
     

      Score2  score = (Score2) in.readObject();
      System.out.println(score);
      
      
      System.out.println("출력완료");
      // Score1클래스는 serialize을 구현하지 않았기 때무에 
    //  writeObject를 사용불가
    } catch (Exception e) {
    e.printStackTrace();
    
    }
    
    System.out.println("끝");
    
    
    
  }

}
