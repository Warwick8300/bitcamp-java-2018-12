package ch13.a;

public class Score2 {

  private String name;
  private int kor;
  private int eng;
  private int math;
  private int music;
  private int art;


  public int getMusic() {
    return music;
  }

  public void setMusic(int music) {
    this.music = music;
  }

  public int getArt() {
    return art;
  }

  public void setArt(int art) {
    this.art = art;
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

  private int sum;
  private float aver;



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
  private void compute() {
    this.setSum(this.kor + this.eng + this.math + this.art + this.music);
    this.setAver(this.getSum() / 5f);
  }
}
