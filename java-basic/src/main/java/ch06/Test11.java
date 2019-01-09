package ch06;

//매서드 - call by value 와 call by reference
public class Test11 {

  public static void main(String[] args) {

    int value = 100;
    m1(value);
    System.out.println(value);
    
    
    int[] arr = {100,200,300};
    System.out.println(arr[1]);
    m2(arr);
    System.out.println(arr[1]);
    
  }
  static void m1(int value) {
    value *= 2;
  }
  // m1() arr는 배열 주소를 받는 변수이다.
  static void m2(int[] arr) {
    arr[1] = 111;
  }
}

