package ch13.b;


//기능확장하기 - Score 클래스에 음악과 미술 과목을 추가하기
public class Test03 {

  public static void main(String[] args) {
    Score3 s = new Score3();
    s.setKor(100);
    s.setEng(100);
    s.setMath(100);
    s.setMusic(100);
    s.setArt(100);

    System.out.printf("%s : %d %f ",s.getName(),s.getSum(),s.getAver() );
  }

}
