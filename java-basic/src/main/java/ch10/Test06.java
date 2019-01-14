package ch10;
//인스턴스 필드의 초기화 - 블럭을을 통해서 초기화하.

class Monitor4{
  int bright ;
  int contrast ;
  int widthRes ;
  int heighRes;
  Monitor4() {//생성자를 통하여 
    this.bright = 50; // 밝기 (0% ~ 100%)
    this.contrast = 50;// 명암(0% - 100%) 
    this.widthRes = 1920; // 해상도 너비
    this.heighRes = 1080;// 해상도 높이
  }
  
  
  void dispaly() {
    System.out.printf("밝기(%d)\n",this.bright);
    System.out.printf("명암(%d)\n",this.contrast);
    System.out.printf("해상도(%d)*(%d)\n",this.widthRes,this.heighRes);
  }

}

public class Test06 {
  public static void main(String[] args) {
    Monitor4 m1 = new Monitor4();
    // 모니터 인스턴스 값 초기화 시키기
    m1.dispaly(); 


    m1.bright = 40;
   

    m1.dispaly();

    //  }
  }
}