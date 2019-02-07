package ch22.f;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//Serialize - ObjectOutputStream을 사용하여 인스턴스 필드의 값을 출력하
public class Test3_2 {

  public static void main(String[] args) {
    try(ObjectInputStream in = new ObjectInputStream(
        new FileInputStream("score3.data"))) {
      
      //인스턴스 출력ㅎ기
     

      Score3  score = (Score3) in.readObject();
  //    score.compute();
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
