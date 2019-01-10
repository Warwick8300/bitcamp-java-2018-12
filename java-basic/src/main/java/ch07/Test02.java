package ch07;
// 클래스 사용전
public class Test02 {
  public static void main(String[] args) {
   //학생 정보를 출력하는 명령어로 별도의 블록으로 뺐다.
    String name  = "홍길동";
    int kor = 100;
    int eng = 100;
    int math = 100;
    printScore(name, kor, eng, math);

  }
  //유지 보수 
  static void printScore(String name, int kor, int eng, int math) {
    int sum = kor + eng + math;
    float aver = sum /3f;
    System.out.printf("%s : %d %d %d %d %f\n",name,kor,eng,math,sum,aver);    
  }
}
