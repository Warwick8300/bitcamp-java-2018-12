//콘솔로 출력하기 - 형식을 갖춰서 날짜 값 출력하
package ch02;



public class Test13 {
  public static void main(String[] args) {
    // 현재 날짜 및 시각 정보를 생성한다
    java.util.Date today = new java.util.Date();
   // %t[날짜 및 시간 옵션]
    // Y : 4자리 년도
    // y : 2자리 년도
    System.out.printf("%1$tY %1$ty \n",today);
    //B : 월을 전체이름 으로 표현
    //b : 월을 단축이름 으로 표현
    System.out.printf("%1$tB %1$tb \n",today);
    //m : 월을 추출하여 2자리 숫자표현
    System.out.printf("%1$tm \n",today);
    //d : 일을 추출하여 2자리 숫자로 표현
    //e : 일을 추출하여 1자리 숫자로 표현
    System.out.printf("%1$td %1$te \n",today);
    // A:추출하여 긴 이름으로 표현
    // a:추출하여 짧은 이름으로 표현
    System.out.printf("%1$tA %1$ta \n",today);
    // H: 시각을 추출하여  24시간 기준으로 표현
    // I: 시각을 추출하여  12시간 기준으로 표현
    System.out.printf("%1$tH %1$tI \n",today);
    // M: 시각을추출하여 분을 표현
    System.out.printf("%1$tM \n",today);
    // S: 시각을 추출하여 초를 표현
    // L: 시각을 추출하여 밀리초까지 표
    // N: 시각을 추추하여 나노초를 표현
    System.out.printf("%1$tS %1$tL %1$tN \n",today);
    //p:  오전 오후를 표현
    // tp를 사용하면 am 또는 pm 으로 출력하고
    // Tp를 사용하면 AM 또는 PM 으로 출력하는데
    // 한글은 대소문자가 없기 때문에 의미없다.
    System.out.printf("%1$tp \n",today);
    //년-월-일 시:분:초를 출력하라!
    System.out.printf("%1$tY-%1$tM-%1$td %1$tH:%1$tM:%1$tS\n",today);
  
  }
  
}

