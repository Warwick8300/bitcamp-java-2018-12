package ch10;
//인스턴스 필드의 초기화 - 초기화 문자을 통해 필드에 기본 값을미리 저장한다.

class Monitor2{
  int bright = 50; // 밝기 (0% ~ 100%)
  int contrast = 50;// 명암(0% - 100%) 
  int widthRes = 1920; // 해상도 너비
  int heighRes = 1080;// 해상도 높이
  void dispaly() {
    System.out.printf("밝기(%d)\n",this.bright);
    System.out.printf("명암(%d)\n",this.contrast);
    System.out.printf("해상도(%d)*(%d)\n",this.widthRes,this.heighRes);
  }

}

public class Test04 {
  public static void main(String[] args) {
    Monitor2 m1 = new Monitor2();
    // 모니터 인스턴스 값 초기화 시키기
    m1.dispaly(); 


    m1.bright = 40;
   

    m1.dispaly();

    //  }
  }
}