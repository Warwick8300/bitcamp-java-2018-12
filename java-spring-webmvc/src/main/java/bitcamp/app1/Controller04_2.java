package bitcamp.app1;

import java.io.PrintWriter;
import javax.servlet.ServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/c04_2")

public class Controller04_2 {

  @GetMapping("h1")
  @ResponseBody
  public void handler1(
      ServletRequest request,
      PrintWriter out, @RequestParam(value = "name") String name1,
      @RequestParam(name = "name") String name2,
      @RequestParam("name") String name3,
      String name) throws Exception {
    
    out.printf("name1=%s\n", name1);
    out.printf("name2=%s\n", name2);
    out.printf("name3=%s\n", name3);
    out.printf("name=%s\n", name);
    out.printf("name=%s\n", request.getParameter("name"));
  }
    @GetMapping("h2")
    @ResponseBody
    public void handler2(PrintWriter out, 
        @RequestParam("name1") String name1,
        String name2,
        @RequestParam(value ="name3",required = false) String name3,
        @RequestParam(value ="name4",defaultValue = "ohoho") String name4) throws Exception {
      
      out.printf("name1=%s\n", name1);
      out.printf("name2=%s\n", name2);
      out.printf("name2=%s\n", name3);
      out.printf("name2=%s\n", name4);
  }

}


