// 변수 선언
package ch03;
public class Test01 {
    public static void main(String[] args) {
      
      // 바이트 정수 변수
      
      byte b1;
      byte b2;
      byte b3;
      b1 = -128; //리터럴 값이 비록 4바이트 크기이지만 메모리에 넣을 수 있다면 허락한다
      b2 = 127; 
      //b2 = 127L; // 단 8바이트 값은 담을 수 있더라도 허락하지 않는다 컴파일 오류
     // b3 = 128; // 128은 1바이트 메모리에 담을 수없기때문에 오류
      // 2바이트 정수 변수
      short s1;
      short s2;
      short s3;
      s1=-32768;
      s2=32767;
      //s2 =300L; 컴파일 오류
      //s3 32768; 컴파일 오류
      
      // 4바이트 정수 값을 담을 메모리 준비
      int i1;
      int i2;
      int i3;
      
      i1= -210000000;
      i2= 2100000000;
      //i2 = 2100000000L; 컴파일 오류 8바이트 값을 4바이트에 넣을 수 없다
      //i3 = 2200000000; 리터럴 표현 오류 4바이트 초과 불가능
      
      
      // 8바이트 정수 변수
      long l1;
      long l2;
      long l3;
      l1 = 9000000000000000000L;
      // l1 = 90000000000000000000L;8바이트 리터럴 표현오류
      // 4바이트 부동소수점변수
      float f1;
      float f2;
      float f3;
      f1 = 98765.43f;
      f2 = 98765.43456789f; // 유효 자릿수를 넘어가는 경우 짤려서 저장
                                // 정수 메모리와 달리 컴파일 오류가 안난다 
                                // 그래서 더더욱 주의해서 사용해야한다.
      
      
      
      // 8바이트 부동소수점 변수
      double d1;
      double d2;
      double d3;
      d1 = 98765.43d; // 8바이트 부동소수점을 표현할때는 f 접미사를 뺀다
      d2 = 98765.43456789;
      // 논리 변수 
      boolean bool1;
      boolean bool2;
      boolean bool3;
      
      bool1=true;
      bool2=false;
      //bool3=1; 트루 펄스 외의 값은 저장 불가능
      char c1;
      char c2;
      char c3;
      c1 = 44032; // 4바이트 정수 리터럴 이더라도 0~65535까지의 값이라면
                     // char 메모리에 저장하는 것을 허락하낟.
      c2 = 0xac00;
      c3 = '가'; // ''의 리턴값은 2바이트 (0~65535)유니코드 정수 값이다 utf-16.
      //변수 자체가 char 이기때문에 (char)을 안붙여도 된다.
     
    }
}