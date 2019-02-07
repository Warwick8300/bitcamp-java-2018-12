package ch22.g;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//Serialize - 인스턴스 필드값의 출
public class Test1_1 {

  public static void main(String[] args) {
    try(ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream("score1.data"))) {
      Score1 score = new Score1();
      score.name = "홍길동";
      score.eng = 90;
      score.math= 90;
      score.kor= 90;
      score.sum = score.kor + score.eng+ score.math;
      score.aver = score.sum /3;
      
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
