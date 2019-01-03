package bitcamp.lms;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class App3 {

    public static void main(String[] args) {
      SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
      Calendar c =Calendar.getInstance();
      c.set(2019,00,01);
      System.out.println("번호: "+ 1 +
          "\n내용: 게시글입니다.\n" + 
            "작성일: " +df1.format(c.getTime())+ 
           "\n조회수: "+0);
    }
}
