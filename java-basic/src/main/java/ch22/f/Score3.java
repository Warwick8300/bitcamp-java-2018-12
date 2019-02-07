package ch22.f;

import java.io.Serializable;

//serialize
//개발자가 serizlbersionUID값을 직접 설정가능

public class Score3 implements Serializable{
  /**
   * ㅎ
   */
  private static final long serialVersionUID = 100L;
  private String name;
  private String tel;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float aver;
  
  public Score3() {
  }
  
  public Score3(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
  }

  @Override
  public String toString() {
    return "Score3 [name=" + name + ", tel=" + tel + ", kor=" + kor + ", eng=" + eng + ", math="
        + math + ", sum=" + sum + ", aver=" + aver + "]";
  }



  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
    this.compute();
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
    this.compute();
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
    this.compute();
  }

  public int getSum() {
    return sum;
  }

  public float getAver() {
    return aver;
  }
  
  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}




