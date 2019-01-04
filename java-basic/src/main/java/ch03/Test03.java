// 계산 결과는 변수의 타입과 같다.
package ch03;
public class Test03 {
    public static void main(String[] args) {
      int a = 5;
      int b = 2;
      System.out.println(a/b); // int 와 int의 계산결과는 int 이다.
      System.out.println((float)a/b);
      int c = a / b; 
      System.out.println(c);
      
      float f1 = 9876.534f;
      float f2 = 12.34567f;
      System.out.println(f1+f2); //float+ float의 계산결과는 float이다.
      //따라서 계산 결과가 4 바이트 float의 크기를 넘어가면 적절히 반올림 하여 나머지 값을 버린다.
      
      double d1 = 9876.534;
      double d2 = 12.34567;
      System.out.println(d1+d2); //float+ float의 계산결과는 float이다.
      //따라서 계산 결과가 4 바이트 float의 크기를 넘어가면 적절히 반올림 하여 나머지 값을 버린다.
     
    }
}
