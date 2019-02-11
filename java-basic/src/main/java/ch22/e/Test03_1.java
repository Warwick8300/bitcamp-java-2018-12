// 인스턴스 출력하기 // 컬렉션 API 
package ch22.e;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import ch22.c.BufferedOutputStream;

public class Test03_1 {

  public static void main(String[] args) {

    // 다음 세 학생의 성적 정보를 score.data 파일에 바이너리 형식으로 저장하라!
    // => java.io.BufferedOutputStream 클래스를 사용하라.
    // => java.io.DataOutputStream 클래스를 사용하라.
    //
    
    ArrayList<Score> students = new ArrayList<Score>();
    students.add(new Score("홍길동", 100, 100, 100));
    students.add(new Score("임꺽정", 90, 90, 90));
    students.add(new Score("유관순", 80, 80, 80));



    try(FileOutputStream out = new FileOutputStream("score.data");
        BufferedOutputStream out1 = new BufferedOutputStream(out);
           DataOutputStream out2 = new DataOutputStream(out1)){{
          
         out2.writeInt(students.size());
         for(Score s : students) {
           out2.writeUTF(s.getName());
           out2.writeInt(s.getKor());
           out2.writeInt(s.getEng());
           out2.writeInt(s.getMath());
         }
             
          out2.flush();
       

        }

    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("score.data 작성완료 ");

  }
}