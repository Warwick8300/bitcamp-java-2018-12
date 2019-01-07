// 데이터 타입과 연산
package ch04;
// 실행 
public class Test02 {
    public static void main(String[] args) {
       // 데이터 타입에 따라 제공되는 연산자가 다르다.
      System.out.println(5.75 % 0.24);
      //System.out.println(true % false); //boolean 타입은 산술연산자 불가능
      System.out.println("hello."+"wordl");// 문자열 연결용도로 사용
      //System.out.println("hello"-"o"); 오류
      //System.out.println("hello"*5); //자바에서는 안되는데 가능한 타언어는 된다.
      
      System.out.println(true && true);
      //System.out.println(10&&10);//  오류
    }
}

