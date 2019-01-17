package ch12.b;
// getter setter 을 적용 해야하는 이유 

public class Test04 {

  public static void main(String[] args) {

    Score2 s1 =new  Score2();
    s1.setName("홍길동");
    s1.setKor(100);
    s1.setMath(90);
    s1.setEng(80);
    
    
    
   System.out.printf("%s %d %.1f\n",s1.getName(),s1.getSum(),s1.getAver());
  
   System.out.println("+======================");
   s1.setKor(70);
   System.out.printf("%d %.1f\n",s1.getSum(),s1.getAver());

   s1.setEng(-200);
   
   System.out.printf("%d %.1f\n",s1.getSum(),s1.getAver());

   
   
  }

  

}
