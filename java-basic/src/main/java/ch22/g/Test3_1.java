package ch22.g;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//Serialize - transient
public class Test3_1 {

  public static void main(String[] args) {
    try(ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream("score3.data"))) {
      Score3 score = new Score3();
      score.setName("홍길동");
      score.setEng(90);
      score.setMath(90);
      score.setKor(90);
  
      
      //인스턴스 출력ㅎ기
      out.writeObject(score);
      
      System.out.println("출력완료");
      // Score1클래스는 serialize을 구현하지 않았기 때무에 
    //  writeObject를 사용불가
    } catch (Exception e) {
    e.printStackTrace();
    
    }
    
    System.out.println("끝");
    
    
    
  }

}
