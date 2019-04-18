// GET, POST 구분하기

package bitcamp.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 이 애노테이션을 붙인다.
@RequestMapping("/c03_1") // 컨트롤러에 URL을 매핑한다.
public class Controller03_1 {

  @GetMapping(params = "name")
  @ResponseBody 
  public String handler1() {
    return "handler1";
  }
  @GetMapping(params = "age")
  @ResponseBody 
  public String handler2() {
    return "handler2";
  }
  
  @GetMapping(params = {"age", "name"})
  @ResponseBody 
  public String handler3() {
    return "handler3";
  }
 
}
