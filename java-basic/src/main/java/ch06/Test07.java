


package ch06;

//매서드 - 가변 파라미터
public class Test07 {

public static void main(String[] args) {
  plus1();
  plus1(10);
  plus1(10,20);
  
  plus2(new int[] {});
  plus2(new int[] {10});
  plus2(new int[] {10,20});
}

//매소드 정의(definition)
static int plus1(int... value) {
  int sum = 0;// <<==매서드 안에 선언된 변수를 로컬변수
  for (int i = 0; i < value.length; i++)
    sum += value[i];
  return sum;
}
static int plus2(int[] value) {
  int sum = 0;// <<==매서드 안에 선언된 변수를 로컬변수
  for (int i = 0; i < value.length; i++)
    sum += value[i];
  return sum;
}
}



























