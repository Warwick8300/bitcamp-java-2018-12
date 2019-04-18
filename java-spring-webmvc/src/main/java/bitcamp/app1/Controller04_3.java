// 요청 핸들러의 파라미터 -프로느 컨트롤러부터 받을 수 있는 파라미터 값
package bitcamp.app1;

import java.io.PrintWriter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/c04_3")

public class Controller04_3 {

  @GetMapping("h1")
  @ResponseBody
  public void handler1(
      PrintWriter out,
      String model,
      String maker,
      int capacity, // 프론트 컨트롤러가 String 값을 int로 변환해 준다.
                    // 단 변환할 수 없을 경우 예외가 발생한다.
      boolean auto, // 1과 0 만가능
      Car car       // 아규먼트가 값객체이면 요청 파라미터 중에 값 
                     // 객체의 프로퍼티 이름과 일치한 항목의 값을 넣어준다
      )  {
    
    out.printf("model=%s\n", model);
    out.printf("maker=%s\n", maker);
    out.printf("capacity=%s\n", capacity);
    out.printf("auto=%b\n", auto);
    out.printf("Car=%s\n", car);

  }

}


