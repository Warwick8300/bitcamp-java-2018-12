package ch12.b;

public class Score {
  String name;
  int kor;
  int eng;
  int math;
  private int sum;
  private float aver;
  
  void compute() {
    this.setSum(this.kor + this.eng + this.math);
    this.setAver(this.getSum() / 3f);
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

}
