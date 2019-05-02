// 스프링 인터셉터 다루기
package bitcamp.app2;

import java.sql.Date;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;

@Controller
@RequestMapping("/c05_1")
public class Controller05_1 {

  ArrayList<Board> list = new ArrayList<>();
  
  public Controller05_1() {
    list.add(new Board(1,"제목입니다1","내용","홍길동1",101,Date.valueOf("2019-04-01")));
    list.add(new Board(2,"제목입니다2","내용","홍길동2",102,Date.valueOf("2019-04-02")));
    list.add(new Board(3,"제목입니다3","내용","홍길동3",103,Date.valueOf("2019-04-03")));
    list.add(new Board(4,"제목입니다4","내용","홍길동4",104,Date.valueOf("2019-04-04")));
    list.add(new Board(5,"제목입니다5","내용","홍길동5",105,Date.valueOf("2019-04-05")));
    list.add(new Board(6,"제목입니다6","내용","홍길동6",106,Date.valueOf("2019-04-06")));
    list.add(new Board(7,"제목입니다7","내용","홍길동7",107,Date.valueOf("2019-04-07")));
    list.add(new Board(8,"제목입니다8","내용","홍길동8",108,Date.valueOf("2019-04-08")));
    list.add(new Board(9,"제목입니다9","내용","홍길동9",109,Date.valueOf("2019-04-09")));
    list.add(new Board(10,"제목입니다10","내용","홍길동10",110,Date.valueOf("2019-04-10")));
    list.add(new Board(11,"제목입니다11","내용","홍길동11",111,Date.valueOf("2019-04-11")));
    list.add(new Board(12,"제목입니다12","내용","홍길동12",112,Date.valueOf("2019-04-12")));
    list.add(new Board(13,"제목입니다13","내용","홍길동13",113,Date.valueOf("2019-04-13")));
    
  }
  
  
  
  // 1) JSP 에서 jSON 형식의 콘텐트 출력하기
  
  
  // http://.../app2/c05_1/h1
  @GetMapping("h1")
  public void handler1(Model model) {
   model.addAttribute("list",this.list);
  }
  @ResponseBody
  @GetMapping(value = "h2",produces = "text/plain;charset=UTF-8")
  public String handler2(Model model) {
   return new Gson().toJson(this.list);
  }
  
  @ResponseBody//jackson
  @GetMapping(value = "h3")
  public Object handler3(Model model) {
   return this.list;
  }

}
