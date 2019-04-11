package com.eomcs.lms.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.eomcs.lms.context.RequestMapping;
import com.eomcs.lms.context.RequestParam;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.service.MemberService;

@Controller
public class AuthController {
  static final String REFERER_URL = "refererUrl";

  @Autowired
  MemberService memberService;
  @Autowired
  ServletContext servletContext;
  
  @RequestMapping("/auth/form")
  public String form(HttpServletRequest request,HttpSession session) {
    
    session.setAttribute(REFERER_URL, request.getHeader("Referer"));
    return "/auth/form.jsp";
  }

  @RequestMapping("/auth/login")
  public String login(@RequestParam("email")String email,
      @RequestParam("saveEmail")String saveEmail,
      @RequestParam("password")String password,
      @RequestParam("session")HttpSession session,
      HttpServletResponse response) throws Exception {

    Cookie cookie;
    if (saveEmail != null) {
      cookie = new Cookie("email",email);
      cookie.setMaxAge(60 * 60 * 24 * 15); // 15일간 쿠키를 보관한다.
    } else {
      cookie = new Cookie("email", "");
      cookie.setMaxAge(0); // 기존의 쿠키를 제거한다.
    }
    response.addCookie(cookie);
    Member member =
        memberService.get(email, password);

    if (member == null) {
      // 뷰 컴포넌트의 URL을 ServletRequest 보관소에 저장한다.
      return "/auth/fail.jsp";
    }
    session.setAttribute("loginUser", member);
    String refererUrl = (String) session.getAttribute(REFERER_URL);
    if (refererUrl == null) { // 뷰 컴포넌트의 URL을 ServletRequest 보관소에 저장한다.
      return "redirect:" + servletContext.getContextPath();
    } else {
      // 뷰 컴포넌트의 URL을 ServletRequest 보관소에 저장한다.
      return "redirect:" + refererUrl;
    }
  }

  @RequestMapping("/auth/logout")
  public String logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
    // TODO Auto-generated method stub
    request.getSession().invalidate();
    return "redirect:" + request.getServletContext().getContextPath();
  }
}


