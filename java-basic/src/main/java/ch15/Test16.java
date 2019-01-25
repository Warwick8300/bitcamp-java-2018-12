package ch15;
//Object 클래스 clone() 인스턴슬르 자동 복제 할때 호출하는 메서드
              //clone 사용법2
// 인스 복제 기능을 활성화 하려면 cloneable 인터페이스 구현
// 이 인터페이스 메서드가 선언되어있지않다


// 이클래스 인스턴스를 복제할 수 있음을 표기하기 위함이다.
//없으면 복제 불가하다 .
//같은 패키지의 맴버이거나 서브 클래스만이 호출할 수 있다.
// 다른 패키지의 맴버가 호출하려면 public 으로 접근 범위를 넓혀야 한다.
//오버라이

public class Test16 { 
  static class Score implements Cloneable{
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


    @Override
    public Score clone() throws CloneNotSupportedException {
      // TODO 자동 생성된 메소드 스텁
      return (Score)super.clone();
      
    }

    
  }
  public static void main(String[] args) throws Exception{
      Score s1= new Score("홍길동",4,5,6);
       Score s2 = s1.clone();
     s2.name = "임꺽정";
      System.out.println(s1);
      System.out.println(s2);
      
      //해결책 2
      // object에서 상속받은 clone을 오버라이딩하라.
      
  }


}
