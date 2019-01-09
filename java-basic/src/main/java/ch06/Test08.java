package ch06;

//매서드 - 가변 파라미터
public class Test08 {

  public static void main(String[] args) {
    compute("홍길동", 1,2,3,4,5);
    compute("홍길동" );
    compute("홍길동", 3,4);

    compute3(new int[] {100, 100, 90}, "홍길동");
    compute4(new int[] {100, 100, 90}, new String[] {"홍길동","유관순","하하"});
  

  }

  //매소드 정의(definition)
  static void compute(String name, int... value) {
    int sum = 0;// <<==매서드 안에 선언된 변수를 로컬변수
    for (int i = 0; i < value.length; i++)
      sum += value[i];
    System.out.printf("%s님의 총점은 %d입니다\n",name,sum);
  }
  /*
  //static int compute2(int...value,String... name) {
    int sum = 0;// <<==매서드 안에 선언된 변수를 로컬변수
    for (int i = 0; i < value.length; i++)
      sum += value[i];
    return sum;
  }
   */
  static void compute3(int [] vlaue, String name) {
    int sum = 0;// <<==매서드 안에 선언된 변수를 로컬변수
    for (int i = 0; i < vlaue.length; i++)
      sum += vlaue[i];
    System.out.printf("%s님의 총점은 %d입니다\n",name,sum);
  }

  static void compute4(int[] value, String[] name) {  
    for (int i = 0; i < value.length; i++) {
      System.out.printf("%s 님의 점수는 %d입니다.\n", name[i], value[i]);
    }
  }
}
