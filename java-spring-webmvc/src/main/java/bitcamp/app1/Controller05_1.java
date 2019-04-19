package bitcamp.app1;

import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/c05_1")
public class Controller05_1 {
  @GetMapping("h1")
  @ResponseBody
  public String handler1() {

    // 리턴 값이 클라이언트에게 보내는 콘텐트라면
    // 메서드 선언부에 @ResponseBody를 붙인다.
    // 출력 콘텐트는 기본이 text/plain;charset=ISO-8859-1 이다.
    return "<html><body><h1>abc가각간</h1></body><html>";
  }
  @GetMapping(value = "h2",produces="text/html;charset=UTF-8")
  @ResponseBody
  public String handler2() {

    // 리턴 값이 클라이언트에게 보내는 콘텐트라면
    // 메서드 선언부에 @ResponseBody를 붙인다.
    // 출력 콘텐트는 기본이 text/plain;charset=ISO-8859-1 이다.
    return "<html><body><h1>abc가각간</h1></body><html>";
  }
  
  @GetMapping("h3")
  @ResponseBody
  public String handler3(HttpServletResponse response) throws Exception {

    response.setContentType("text/html;charset=UTF-8");
    return "<html><body><h1>abc가각간</h1></body><html>";
  }
  
  @GetMapping("h4")
  public HttpEntity<String> handler4(HttpServletResponse response) throws Exception {

    HttpEntity<String> entity = new HttpEntity<>(
     "<html><body><h1>abc가각간</h1></body><html>");
    
    
    return entity;
  }
  
  @GetMapping(value = "h5",produces="text/html;charset=UTF-8")
  public HttpEntity<String> handler5(HttpServletResponse response) throws Exception {
// 한글을 제대로 출력하고 싶으면 위 애노테이션의 produces 속성에 콘텐트 타입을 지정한다.
    HttpEntity<String> entity = new HttpEntity<>(
     "<html><body><h1>abc가각간</h1></body><html>");
    
    
    return entity;
  }
  
  @GetMapping(value = "h6",produces="text/html;charset=UTF-8")
  public HttpEntity<String> handler6(HttpServletResponse response) throws Exception {
// 한글을 제대로 출력하고 싶으면 위 애노테이션의 produces 속성에 콘텐트 타입을 지정한다.
    HttpHeaders headers = new HttpHeaders();
    headers.add("Content-Type", "text/html;charset=UTF-8");
    HttpEntity<String> entity = new HttpEntity<>(
     "<html><body><h1>abc가각간</h1></body><html>");
    return entity;
  }
  
  @GetMapping(value = "h7",produces="text/html;charset=UTF-8")
  public ResponseEntity<String> handler7(HttpServletResponse response) throws Exception {
// 한글을 제대로 출력하고 싶으면 위 애노테이션의 produces 속성에 콘텐트 타입을 지정한다.
  
    HttpHeaders headers = new HttpHeaders();
    headers.add("Content-Type", "text/html;charset=UTF-8");
    headers.add("BIT-CAMP","ohora");
    ResponseEntity<String> entity = new ResponseEntity<>(
     "<html><body><h1>abc가각간</h1></body><html>",headers,HttpStatus.OK);
    
    
    return entity;
  }
}


