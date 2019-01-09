package ch06;

//매서드 - 매서드 중첩 호출
public class Test05 {

  public static void main(String[] args) {
    
    int result = plus(2,3);
    result = plus(result, 4);
    result = plus(result, 5);
    System.out.println(result);
    System.out.println(plus(plus(plus(2,3),4),5));
    
    System.out.printf("100 + 200 = %d\n",plus(100,200));
  }
  
  //매소드 정의(definition)
 static int plus(int a, int b)
  {
    return a + b;
  }
}















