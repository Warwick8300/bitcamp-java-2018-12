package ch10;
//생성자 정의 하는 방법  .

class Monitor7{
  int bright ;
  int contrast =50;;
  int widthRes ;
  int heighRes = 1080;



  Monitor7() {//생성자를 통하여 
    this.bright = 50;
    this.contrast = 50;// 명암(0% - 100%) 
    this.widthRes = 2580; // 해상도 너비
    this.heighRes = 1200;// 해상도 높이
  }
  
  public void on() {
    // LCD의 불을 밝힌다.
    System.out.println("화면을 출력한다.");
    
    
  }

}

public class Test09 {
  public static void main(String[] args) {
    
    
    // new Monitor7; // 컴파일오류 
      new Monitor7();
    
  }
}