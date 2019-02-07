package ch22.g;

import java.io.Serializable;


public class Score2 implements Serializable{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
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
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    System.out.println("setter 실행");
    this.eng = eng;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    System.out.println("setter 실행");
    this.math = math;
  }

  public int getSum() {
    return sum;
  }

  public void setSum(int sum) {
    System.out.println("setter 실행");
    this.sum = sum;
  }

  public float getAver() {
    return aver;
  }

  public void setAver(float aver) {
    System.out.println("setter 실행");
    this.aver = aver;
  }

  protected float aver;
  
  public Score2() {
    System.out.println("Score1");
  }
  
  @Override
  public String toString() {
    return "Score2 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
        + sum + ", aver=" + aver + "]";
  }

  public Score2(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    //this.compute();
  }

}




