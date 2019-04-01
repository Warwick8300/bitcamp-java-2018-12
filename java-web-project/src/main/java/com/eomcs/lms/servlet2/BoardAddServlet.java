package com.eomcs.lms.servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.eomcs.lms.InitServlet;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.service.BoardService;

@SuppressWarnings("serial")
@WebServlet("/board2/add")
public class BoardAddServlet extends HttpServlet {



  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    Board board = new Board();
    board.setContents(request.getParameter("contents")+ ":" + request.getRemoteAddr());
    BoardService boardService = InitServlet.iocContainer.getBean(BoardService.class);
    response.setContentType("text/html;charset=UTF-8");

    boardService.add(board);
    PrintWriter out = response.getWriter();
    out.println("<h1>게시물 등록</h1>");
    out.println("<p>저장하였습니다.</p>");

    // 리플래시 정보를 <meta> 태그에 담아서 <head> 태그에 넣어야 하는데 
    // 현제 <head> 태그의 출력은 boardServlet에서 담당하고 있다.
   
  }



}


