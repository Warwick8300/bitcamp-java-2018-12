// 인스턴스 읽기
package ch22.e;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;



public class Test01_2 {

  public static void main(String[] args) {

    Score s1 = null;
    Score s2 = null;
    Score s3 = null;
    // score.data 파일에서 세 학생의 데이터를 읽어 Score 인스턴스로 생성하라.
    // => java.io.BufferedInputStream 클래스를 사용하라.
    // => java.io.DataInputStream 클래스를 사용하라.
    try ( FileInputStream in = new FileInputStream("score.data");
    BufferedInputStream in1 = new BufferedInputStream(in);
    DataInputStream in2 = new DataInputStream(in1)){
      
     s1 = new Score(in2.readUTF(),in2.readInt(),in2.readInt(),in2.readInt());
      System.out.println(s1.toString());
     /*
      System.out.println(s1.getSum());
      System.out.println(s1.getAver());
      */
    }catch (Exception e) {
      e.printStackTrace();

    }
    System.out.println("읽기완료");
  }



 


  // 그리고 세 학생의 정보를 다음과 같은 형식으로 출력하라.
  // =>   홍길동, 100, 100, 100, 300, 100 
  // 


}
