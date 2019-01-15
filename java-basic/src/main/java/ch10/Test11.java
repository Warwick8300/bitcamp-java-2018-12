package ch10;
//생성자 여러개의 생성자
class Monitor9{
  int bright ;
  int contrast =50;;
  int widthRes ;
  int heighRes = 1080;



  Monitor9() {//생성자를 통하여 
    this.bright = 50;
    this.contrast = 50;// 명암(0% - 100%) 
    this.widthRes = 2580; // 해상도 너비
    this.heighRes = 1200;// 해상도 높이
    System.out.println("기본 모니터 ()");
  }
  Monitor9(int bright, int contrast){
    this.bright = bright;
    this.contrast = contrast;
    System.out.println("모니터 (int int)");

  }
  Monitor9(int bright, int contrast, int widthRes,int heightRes){
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

public class Test11 {
  public static void main(String[] args) {
    
    new Monitor9(); // 기본생성자
    new Monitor9(50,50); //int 값 2개 생성자를 지정한다..
    new Monitor9(50, 50, 1920, 1080);
    
  }
}