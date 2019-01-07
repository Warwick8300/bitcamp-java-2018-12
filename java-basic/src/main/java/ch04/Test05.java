// 연산자 우선 순위
package ch04;
// 실행 
public class Test05 {
    public static void main(String[] args) {
      float r= 3.2f+5/2;
      // 연산자 우선 순위에 따라  *, / , % 연산자 +, - 연산자 보다 먼저 계산된다.
      System.out.println(r);
      
      
      float r2 = (3.2f+5) /2;
      System.out.println(r2);
      //연산자 우선 순위에서 괄호가 모든  연산자 보다 우선 취급한다.
      
      int a = 2;
      int r3 = a++ + a++ * a++;
      System.out.printf("%d %d ",a,r3);
    }
    
}