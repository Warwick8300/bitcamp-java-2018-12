package ch10;
//인스턴스 필드의 초기화 - 블럭을을 통해서 초기화하.

class Monitor5{
  int bright ;
  int contrast =50;;
  int widthRes ;
  int heighRes = 1080;

  {
    this.bright = 50;
    this.contrast = 60;
    this.widthRes = 1920;

  }

  Monitor5() {//생성자를 통하여 
    
    this.contrast = 70;// 명암(0% - 100%) 
    this.widthRes = 2580; // 해상도 너비
    this.heighRes = 1200;// 해상도 높이
  }


  void dispaly() {
    System.out.printf("밝기(%d)\n",this.bright);
    System.out.printf("명암(%d)\n",this.contrast);
    System.out.printf("해상도(%d)*(%d)\n",this.widthRes,this.heighRes);
  }

}

public class Test07 {
  public static void main(String[] args) {
    Monitor5 m1 = new Monitor5();
    m1.dispaly();

    //  }
  }
}