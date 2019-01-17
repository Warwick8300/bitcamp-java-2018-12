package ch13;

public class Score {

  private String name;
  private int kor;
  private int eng;
  private int math;
  protected int sum;
  protected float aver;
//서브 클래스에서 사용할 필드는 protected로 접근을 풀어준다.

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
    if( kor >= 0&& kor <= 100) {
      this.kor = kor;
      this.compute();
    }
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    if( eng >= 0&& eng <= 100) {
      this.eng = eng;
      this.compute();
    }
  }

  public int getMath() {

    return math;
  }

  public void setMath(int math) {
    if( math >= 0 && math <= 100) {
      this.math = math;
      this.compute();
    }
  }




  public float getAver() {
    return aver;
  }

  public void setAver(float aver) {
    this.aver = aver;
  }

  public int getSum() {
    return sum;
  }

  public void setSum(int sum) {
    this.sum = sum;
  }
  protected void compute() {
    this.setSum(this.kor + this.eng + this.math);
    this.setAver(this.sum / 3f);
  }
}
