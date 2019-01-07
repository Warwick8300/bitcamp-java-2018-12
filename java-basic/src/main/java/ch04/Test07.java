// 부동소수점의 비교
package ch04;
// 실행 
public class Test07 {
    public static void main(String[] args) {
     float f1 = 0.1f;
     float f2 = 0.1f;
     
     System.out.println(f1 * f2 == 0.01f); // false
     
     //이유?
     System.out.println(f1 *f2 ); // 0.010000001결과 값 뒤에 0.000000001 오차발생 !
     
     // 해결책
     //=> 오차를 제거한 후 비교

     System.out.println(((f1*f2)-0.01f) <= Float.POSITIVE_INFINITY);
     
     float r = f1 *f2 -0.01f;
     System.out.println(Math.abs(r) <= Float.POSITIVE_INFINITY);
    }
    
}

