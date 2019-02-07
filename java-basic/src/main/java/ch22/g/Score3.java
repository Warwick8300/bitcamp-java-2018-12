package ch22.g;

import java.io.Serializable;

//ObjectInputStream ObjectOutputStream 을 통해 인ㅅ턴스의 
//바이트 배열로 자동으로 변환하여 출력하려면 
//Serailziable 인터페이스는 메서드가 선언되어 있지 않다 .
// 단지 해당 클래스의 인스턴스가 바이트 배열로 자동으로 출력될수 잇는지 


public class Score3 implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String name;
  private int kor;
  private int eng;
  private  int math;
  transient private  int sum;
  transient protected float aver;
  public String getName() {
    return name;
  }

  public void setName(String name) {
    System.out.println("setter 실행");
    this.name = name;
    
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    System.out.println("setter 실행");
    this.kor = kor;
    this.compute();
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    System.out.println("setter 실행");
    this.eng = eng;
    this.compute();
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    System.out.println("setter 실행");
    this.math = math;
    this.compute();
  }

  public int getSum() {
    return sum;
  }


  public float getAver() {
    return aver;
  }



  
  public Score3() {
    System.out.println("Score1");
  }
  
  @Override
  public String toString() {
    return "Score3 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
        + sum + ", aver=" + aver + "]";
  }

  public Score3(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
  }
  
  public void compute() {
    this.sum = this.kor+ this.eng +this.math;
    this.aver = this.sum /3;
  }

}




