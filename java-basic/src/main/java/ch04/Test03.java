// 연산의 결과는 피연산자의 데이터 타입과 같다.
package ch04;
// 실행 
public class Test03 {
    public static void main(String[] args) {
      float r = 5/ 2;//변수에 값을저장하기 전에 이미 결과는 2다
      float s = 5f/ 2f;//이건 플롯형이라고 선언한거임
      System.out.println(r);
      System.out.println(s);
      float t = (float)5/ (float)2;// 형변환 임시 로 변환
      System.out.println(t);
      float e = (float)5 / 2;
      System.out.println(e); //암시적 형변환 Implicit Type Casting
      
      byte b1 = 20;
      byte b2= 30;
      //byte b3 = b1+ b2;
      int x1 = b1+b2;
      // 자바의 최소 연산자는 int 이다 
      // 그러므로 암시적 형변환에 의해 b1, b2 의 값은 int타입의 임시메모리에 저장.
      // 그후 계산된다. 결과는 당연히 int+int dlek\\
      
      short s1  = 20;
      short s2 =30;
      //short s3 = s1 + s2
      int x2 = b1+b2;
      char c1 = 20;
      char c2 = 30;
      //char c3 = c1+c2;
      int x3 = b1+b2;
      
      int i1 = 100;
      float f1 = 200.5f;
      //int i2= i1 + f1; //컴파일오류
      float f2 = i1+ f1;
      
      float f3 = 9876.5432f;
      float f4 = 12.34567f;
      double d1 = f3 + f4 ; //d1에 저장되기 전에 자릿수 (7자리를 초과한 값은 오차값으로 저장된다.
      //그래서 d1을 출력하면 오차가 있는 값이 출력 되는 것이다.
      
      //해결책
      //= 계산하기 전에 더큰 타입으로 형변환하라
      double d2 = (double)f3+(double)f4;
      // 그런데 출력 결과를 예상 결과와 다르게 나온다
      // 이유 float double로 형변환할때 오차가 이미 생긴다.
      // 부동 소수점을 다룰때 생기는 오차
      System.out.println(d2); // 그러므로 이방법은안됨
      double b7 =9876.534;
      double b8 =12.34567;
      double b9 =b7 + b8;
      System.out.println(b9);
    }
    
}

