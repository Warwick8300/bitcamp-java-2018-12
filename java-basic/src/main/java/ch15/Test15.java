package ch15;
//Object 클래스 clone() 인스턴슬르 자동 복제 할때 호출하는 메서드
              //clone 사용법


public class Test15 {
  static class Score{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
 
    public void String() {
 
    }
    @Override
    public String toString() {
      return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
          + sum + ", aver=" + aver + "]";
    }
    public Score(String name, int kor, int eng, int math) {
      this.name= name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = this.kor+this.eng+this.math;
      this.aver =this.sum /3f;
    }

    
  }
  public static void main(String[] args) {
      Score s1= new Score("홍길동",4,5,6);
      System.out.println(s1);
      
     // Score s2 = s1.clone() // 컴파일 오류
      Score s2 = new Score(s1.name,s1.kor,s1.eng,s1.math);
      s2.name = "임꺽정";
      System.out.println(s1);
      System.out.println(s2);
      
      //해결책 2
      // object에서 상속받은 clone을 오버라이딩하라.
      
  }


}
