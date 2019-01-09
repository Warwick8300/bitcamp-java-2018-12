//배열  - 인스턴스와 레퍼런
package ch03;

public class Test15 {
    public static void main(String[] args) {
      //변수는 선언된 블록에서만 유효하다.
      // 블록을 벗어나면 제거된다.
      int a = 100;
      
      {
        //블록 밖에 있는 변수와 같은 이름을 갖는 변수를 만들 수 없다.
        int b =200;//블록 안에 선언된 변수는 블록을 나가면 삭제된다.
        
      }
      
      System.out.println(a);
      
     // System.out.println(b);
    }
}
