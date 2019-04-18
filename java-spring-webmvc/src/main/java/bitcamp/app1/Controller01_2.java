// 페이지 컨트롤러 만드는 방법 - 한개의 페이지 컨트롤러에 여러개 요청 핸들러 두기

package bitcamp.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller01_2 {

  @RequestMapping("/c01_2_h1") // 컨트롤러에 URL을 매핑한다.
  @ResponseBody 
  public String handler() {
    return "/c01_2_h1";
  }
 
  @RequestMapping("/c01_2_h2") 
  @ResponseBody 
  public String handler2() {
    return "/c01_2_h2";
  }
  @RequestMapping("/c01_2/h3") 
  @ResponseBody 
  public String handler3() {
    return "/c01_2/h3";
  }
  @RequestMapping("/c01_2/h4") 
  @ResponseBody 
  public String handler4() {
    return "/c01_2/h4";
  }
}
