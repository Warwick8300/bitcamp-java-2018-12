// 인스턴스 읽기 배열활용
package ch22.e;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;



public class Test02_2 {

  public static void main(String[] args) {

    Score[] students = null;
 
    try ( FileInputStream in = new FileInputStream("score.data");
    BufferedInputStream in1 = new BufferedInputStream(in);
    DataInputStream in2 = new DataInputStream(in1)){
      
      
      int len = in2.readInt();
      students = new Score[len];
      
      for(int i = 0 ; i < students.length ; i ++) {
        Score s = new Score();
        s.setName(in2.readUTF());
        s.setKor(in2.readInt());
        s.setEng(in2.readInt());
        s.setMath(in2.readInt());
        students[i] = s;
      }
        
        System.out.println(students[0].toString());
        
   
    
    }catch (Exception e) {
      e.printStackTrace();

    }
    System.out.println("읽기완료");
  }



 


  // 그리고 세 학생의 정보를 다음과 같은 형식으로 출력하라.
  // =>   홍길동, 100, 100, 100, 300, 100 
  // 


}

