// 인스턴스 출력하기
package ch22.e;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import ch22.c.BufferdOutputStream;

public class Test01_1 {

  public static void main(String[] args) {

    // 다음 세 학생의 성적 정보를 score.data 파일에 바이너리 형식으로 저장하라!
    // => java.io.BufferedOutputStream 클래스를 사용하라.
    // => java.io.DataOutputStream 클래스를 사용하라.
    //
    Score s1 = new Score("홍길동", 100, 100, 100);
    Score s2 = new Score("임꺽정", 90, 90, 90);
    Score s3 = new Score("유관순", 80, 80, 80);


    try(FileOutputStream out = new FileOutputStream("score.data") ;
        BufferdOutputStream out1 = new BufferdOutputStream(out);
        DataOutputStream out2 = new DataOutputStream(out1)){{
          
          
          out2.writeUTF(s1.toString());
          out2.writeUTF(s2.toString());
          out2.writeUTF(s3.toString());

        }

    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("score.data 작성완료 ");

  }
}