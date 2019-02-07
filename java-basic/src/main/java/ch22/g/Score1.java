package ch22.g;

import java.io.Serializable;

//ObjectInputStream ObjectOutputStream 을 통해 인ㅅ턴스의 
//바이트 배열로 자동으로 변환하여 출력하려면 
//Serailziable 인터페이스는 메서드가 선언되어 있지 않다 .
// 단지 해당 클래스의 인스턴스가 바이트 배열로 자동으로 출력될수 잇는지 


public class Score1 implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  protected String name;
  protected int kor;
  protected int eng;
  protected int math;
  protected int sum;
  protected float aver;
  
  public Score1() {
    System.out.println("Score1");
  }
  
  @Override
  public String toString() {
    return "Score1 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
        + sum + ", aver=" + aver + "]";
  }

  public Score1(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    //this.compute();
  }

}




