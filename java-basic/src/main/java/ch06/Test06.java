package ch06;

//매서드 - 가변 파라미터
public class Test06 {

  public static void main(String[] args) {
    int result = plus();
    System.out.println(result);


    result = plus(1);
    System.out.println(result);
    result = plus(1,2);
    System.out.println(result);
    result = plus(1,3,5,6);
    System.out.println(result);


    //가변 파라미터인 경우 값을 배열에 담아서 넘겨도 된다.

    int [] arr1 = new int [3];
    arr1[0] = 10;
    arr1[1] = 20;
    arr1[2] = 30;
    result = plus(arr1);
    int [] arr2 = new int[] {10,20,30};
    result = plus(arr2);
    int [] arr3 = {10, 20, 30, 40};
     result = plus(arr3);
     
     //result = plus({100,200. 300}); 컴알 오류
     // 
    
    result = plus(new int[] {10,20,30});

  }

  //매소드 정의(definition)
  static int plus(int... value) {
    int sum = 0;// <<==매서드 안에 선언된 변수를 로컬변수
    for (int i = 0; i < value.length; i++)
      sum += value[i];
    return sum;
  }
}















