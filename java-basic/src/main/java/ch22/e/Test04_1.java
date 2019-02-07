// 인스턴스 출력하기 // object
package ch22.e;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import ch22.c.BufferdOutputStream;

public class Test04_1 {

  public static void main(String[] args) {

    // 다음 세 학생의 성적 정보를 score.data 파일에 바이너리 형식으로 저장하라!
    // => java.io.BufferedOutputStream 클래스를 사용하라.
    // => java.io.DataOutputStream 클래스를 사용하라.
    //
    
    ArrayList<Score> students = new ArrayList<Score>();
    students.add(new Score("홍길동", 60, 60, 60));
    students.add(new Score("임꺽정", 90, 90, 90));
    students.add(new Score("유관순", 80, 80, 80));


//ObjectOutputStream는 dataoutputStream의 기능을 포함
    //인스턴스를 바이트 배열로 만들어 출력ㅎ는 기능이 있다.
    //단 java.io.serializable 
    try(FileOutputStream out = new FileOutputStream("score.data");
        BufferdOutputStream out1 = new BufferdOutputStream(out);
           ObjectOutputStream out2 = new ObjectOutputStream(out1)){{
          
         out2.writeInt(students.size());
         for(Score s : students) {
           out2.writeObject(s);
         }
             
          out2.flush();
       

        }

    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("score.data 작성완료 ");

  }
}