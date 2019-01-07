//배열  - 선언하는 방법고 사용하는 방법
package ch03;

public class Test11 {
    public static void main(String[] args) {
    // 배열 문법을 사용하지 않고 같은 종류의 값을 여러개 저장하는 방법.
      //배열을 가리킬 레퍼런스 선언
      //배열을 가리킬 레퍼런스 선언
      int[] arr1;  // 자바는 이형식으로 선호한다.
       int arr2[]; //c언어 스타일
      
      arr1 = new int[5] ;
      arr2= new int[5];
      
      arr1[0]= 100;
      arr1[1] =100;
      arr1[2] =100;
      arr1[3] =100;
      arr1[4] =100;
      
      
    }
}
