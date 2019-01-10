package ch06;

//매서드 - 재귀호출
public class Test12test2 {

  public static void main(String[] args) {

    for (int i = 1; i <= 5 ; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.print(" : ");
      System.out.print(factorial(i));
      System.out.println();
    }
    System.out.print(factorial2(5));
  }

  static int sum1(int a,int b) {
    return a + b;
  }
  //sum(n) = n + sum(n-1)
  // 1부터 n 까지의 합
  static int sum2(int n) {
    if ( n == 1)
      return n;
    return n + sum2(n-1);
  }

  static int factorial(int n) {
    if (n == 0)
      return 1;
    else
      return n*factorial(n - 1);
  }
  
  static int factorial2(int n) {
    int f = 1;
    while (n > 0){
      f = f*n--;
    }
    return f;
  }
  int fibonacci(int n)
  {
      // F(0) = 0 and F(1) = 1
      // 재귀 함수가 끝나는 종료조건
      if(n == 0 || n == 1)
          return n;
      // F(n) = F(n-1) + F(n-2)
      // 재귀 함수에서 재귀되는 부분
      else
          return fibonacci(n-1) + fibonacci(n-2);
      /* one line */
      // return (n == 0 || n == 1) ? n : fibonacci(n-1) + fibonacci(n-2);
  }
}