package ch10;
//생성자 this()

class Monitor10{
  int bright ;
  int contrast =50;;
  int widthRes ;
  int heighRes = 1080;



  Monitor10() {//생성자를 통하여 
    this(50,50,1200,5022);
    System.out.println("기본 모니터 ()");
  }
  Monitor10(int bright, int contrast){
    this(bright,contrast,0,0);
    System.out.println("모니터 (int int)");

  }
  Monitor10(int bright, int contrast, int widthRes,int heightRes){
    this.bright = bright;
    this.contrast = contrast;
    this.widthRes = widthRes;
    this.heighRes = heightRes;
    System.out.println("모니터 (int int int int)");
  }
  
  public void on() {
    // LCD의 불을 밝힌다.
    System.out.println("화면을 출력한다.");
    
    
  }

}

public class Test12 {
  public static void main(String[] args) {
    
    new Monitor10(); // 기본생성자
    System.out.println("---------------------");
    new Monitor10(50,50); //int 값 2개 생성자를 지정한다..
    System.out.println("---------------------");
    new Monitor10(50, 50, 1920, 1080);
    
    
  }
}