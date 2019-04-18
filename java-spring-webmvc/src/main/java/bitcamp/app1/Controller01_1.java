// 페이지 컨트롤러 만드는 방법

package bitcamp.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 이 애노테이션을 붙인다.
@RequestMapping("/c01_1") // 컨트롤러에 URL을 매핑한다.
public class Controller01_1 {

  @RequestMapping 
  @ResponseBody 
  public String handler() {
    return "c01_1";
  }
  /* 중복은 안된다
  @RequestMapping 
  @ResponseBody 
  public String handler2() {
    return "c01_1";
  }
  */
}
