package bitcamp.app1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;

@Controller
@RequestMapping("/c05_2")
public class Controller05_2 {
  @GetMapping("h1")
  public String handler1() {

    return "/jsp/c05_2.jsp";
  }

  @GetMapping("h2")
  public String handler2() {
    // MVC 패턴에서는 항상 Controller에 의해 view가 통제되어야 한다.
    // Controller를 경유하지 않고 view 를 실행하게 해서는 안된다.
    // 그래야 View에 대해 일관성 있는 제어가 가능하다.

    return "/WEB-INF/jsp/c05_2.jsp";
  }

  @GetMapping("h3")
  public View handler3() {

    return new JstlView("/WEB-INF/jsp/c05_2.jsp");
  }

  @GetMapping("h4")
  public ModelAndView handler4() {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("/WEB-INF/jsp/c05_2.jsp");
    return mv;
  }
  
  @GetMapping("h5")
  public String handler5() {
    return "redirect:h4";
  }
  
  @GetMapping("h6")
  public String handler6() {
    return "forward:h4";
  }
  
 
}


