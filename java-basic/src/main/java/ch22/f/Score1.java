package ch22.f;

//ObjectInputStream ObjectOutputStream 을 통해 인ㅅ턴스의 
//바이트 배열로 자동으로 변환하여 출력하려면 
//Serailziable 인터페이스는 메서드가 선언되어 있지 않다 .
// 단지 해당 클래스의 인스턴스가 바이트 배열로 자동으로 출력될수 잇는지 


public class Score1{
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sum;
  private float aver;
  
  public Score1() {
  }
  
  public Score1(String name, int kor, int eng, int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
  }

  @Override
  public String toString() {
    return "Score1 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
        + sum + ", aver=" + aver + "]";
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




