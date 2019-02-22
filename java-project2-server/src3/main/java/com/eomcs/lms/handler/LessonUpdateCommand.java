package com.eomcs.lms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.sql.Date;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.mariadb.LessonDao;

public class LessonUpdateCommand implements Command {


  LessonDao lessonDao;

  public LessonUpdateCommand(LessonDao lessonDao) {

    this.lessonDao = lessonDao;
  }


  @Override
  public void execute(BufferedReader in, PrintWriter out) {
    try {

      out.println("번호? ");
      out.println("!{}!");
      out.flush();
      int no = Integer.parseInt(in.readLine());


      Lesson lesson = lessonDao.findByNo(no);

      Lesson temp = lesson.clone();
      out.println(temp.getNo());
      out.printf("수업명(%s)? \n", lesson.getTitle());

      out.println("!{}!");
      out.flush();
      String input = in.readLine();
      if (input.length() > 0)
        temp.setTitle(input);

      out.printf("설명(%s)? \n", lesson.getContents());

      out.println("!{}!");
      out.flush();
      if ((input = in.readLine()).length() > 0)
        temp.setContents(input);

      out.printf("시작일(%s)? \n", lesson.getStartDate());

      out.println("!{}!");
      out.flush();
      if ((input = in.readLine()).length() > 0)
        temp.setStartDate(Date.valueOf(input));

      out.printf("종료일(%s)? \n", lesson.getEndDate());

      out.println("!{}!");
      out.flush();
      if ((input = in.readLine()).length() > 0)
        temp.setEndDate(Date.valueOf(input));

      out.printf("총수업시간(%d)? \n", lesson.getTotalHours());

      out.println("!{}!");
      out.flush();
      if ((input = in.readLine()).length() > 0)
        temp.setTotalHours(Integer.parseInt(input));

      out.printf("일수업시간(%d)? \n", lesson.getDayHours());

      out.println("!{}!");
      out.flush();
      if ((input = in.readLine()).length() > 0)
        temp.setDayHours(Integer.parseInt(input));

      if (lessonDao.update(temp) == 0) {
        out.println("해당 게시물이 없습니다..");
      } else
        out.println("변경했습니다.");

    } catch (Exception e) {
      out.printf("실행 오류! : %s\n", e.getMessage());
    }
  }
}
