package ch22.g;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//Serialize - 인스턴스 필드값의 출
public class Test2_1 {

  public static void main(String[] args) {
    try(ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream("score2.data"))) {
      Score2 score = new Score2();
      score.setName("홍길동");
      score.setEng(90);
      score.setMath(90);
      score.setKor(90);
      score.setSum(score.getKor() + score.getEng()+ score.getMath());
      score.setAver(score.getSum()/3);
      
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
