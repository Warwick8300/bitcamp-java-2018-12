package ch22.f;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//Serialize - ObjectOutputStream을 사용하여 인스턴스 필드의 값을 출력하
public class Test1_1 {

  public static void main(String[] args) {
    try(ObjectOutputStream out = new ObjectOutputStream(
        new FileOutputStream("score1.data"))) {
      
      //인스턴스 출력ㅎ기
      out.writeObject(new Score1("홍길동",100,100,100));
      
      
      // Score1클래스는 serialize을 구현하지 않았기 때무에 
    //  writeObject를 사용불가
    } catch (Exception e) {
    e.printStackTrace();
    
    }
    
    System.out.println("끝");
    
    
    
  }

}
