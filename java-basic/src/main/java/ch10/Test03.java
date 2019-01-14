package ch10;
// // 인스턴스 필드의 초기화 - 인스턴스를 만들어 쓰는 개발자가 직접 초기화를 수행하기

class Monitor1{
  int bright; // 밝기 (0% ~ 100%)
  int contrast;// 명암(0% - 100%) 
  int widthRes; // 해상도 너비
  int heighRes;// 해상도 높이
  void dispaly() {
    System.out.printf("밝기(%d)\n",this.bright);
    System.out.printf("명암(%d)\n",this.contrast);
    System.out.printf("해상도(%d)*(%d)\n",this.widthRes,this.heighRes);
  }

}

public class Test03 {
  public static void main(String[] args) {
    Monitor1 m1 = new Monitor1();
    // 모니터 인스턴스 값 초기화 시키기
    m1.dispaly(); 


    m1.bright = 50;
    m1.contrast = 50;
    m1.widthRes  =1920;
    m1.heighRes = 1080;

    m1.dispaly();

    //  }
  }
}