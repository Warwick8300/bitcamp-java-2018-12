package bitcamp.lms;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class App3 {

    public static void main(String[] args) {
      java.util.Scanner keyboard = new java.util.Scanner(System.in);
      System.out.print("번호 : ");
      int postNo = keyboard.nextInt();
      System.out.print("내용 : ");
      String postContent = keyboard.next();
      System.out.print("작성일 : ");
      String postDate = keyboard.next();
      System.out.print("조회 : ");
      int postView = keyboard.nextInt();

        System.out.printf("번호 : %d\n",postNo);
        System.out.printf("내용: %s\n",postContent);
        System.out.printf("작성일 : %s\n",postDate);
        System.out.printf("조회수 : %d\n",postView);
  
        /*
      SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
      Calendar c =Calendar.getInstance();
      c.set(2019,00,01);
      System.out.println("번호: "+ 1 +
          "\n내용: 게시글입니다.\n" + 
            "작성일: " +df1.format(c.getTime())+ 
           "\n조회수: "+0);
           */
    }
}
