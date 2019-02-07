// 인스턴스 읽기 컬렉션 API 
package ch22.e;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;



public class Test04_2 {

  public static void main(String[] args) {
    
    
// ObjectInputStream
    //dataInputStream의 기능을 포함한다.
    //objectOutputStream.writeObject 로 출력한 바이트 배열을 읽어
    
    //단 java.io.serializeable 인터페이스를 구현한 클래스 여야한다.
    // 출력할때 클래스 버전과 읽을때 버전이 같아야하낟.
    
    ArrayList<Score> students = new ArrayList<Score>();
    try ( FileInputStream in = new FileInputStream("score.data");
    BufferedInputStream in1 = new BufferedInputStream(in);
    ObjectInputStream in2 = new ObjectInputStream(in1)){
      
      
      int len = in2.readInt();
     
      
      for(int i = 0 ; i < len ; i ++) {
       
        students.add((Score) in2.readObject());
      }
     
        System.out.println(students.toString());
        
   
    
    }catch (Exception e) {
      e.printStackTrace();

    }
    System.out.println("읽기완료");
  }



 


  // 그리고 세 학생의 정보를 다음과 같은 형식으로 출력하라.
  // =>   홍길동, 100, 100, 100, 300, 100 
  // 


}

