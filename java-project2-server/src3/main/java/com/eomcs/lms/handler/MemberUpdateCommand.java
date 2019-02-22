package com.eomcs.lms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.mariadb.MemberDao;

public class MemberUpdateCommand implements Command {

  MemberDao memberDao;

  public MemberUpdateCommand(MemberDao memberDao) {

    this.memberDao = memberDao;
  }

  @Override
  public void execute(BufferedReader in, PrintWriter out) {
    try {


      out.println("번호? ");
      out.println("!{}!");
      out.flush();
      int no = Integer.parseInt(in.readLine());


      Member member = memberDao.findByNo(no);

      Member temp = member.clone();

      out.printf("이름(%s)? \n", member.getName());
      out.println("!{}!");
      out.flush();
      String input = in.readLine();
      if (input.length() > 0)
        temp.setName(input);

      out.printf("이메일(%s)? \n", member.getEmail());
      out.println("!{}!");
      out.flush();
      if ((input = in.readLine()).length() > 0)
        temp.setEmail(input);

      out.printf("암호(새로운암호입력하세요)? \n");
      out.println("!{}!");
      out.flush();
      System.out.println(temp.getPassword());
      if ((input = in.readLine()).length() > 0)
        temp.setPassword(input);

      out.printf("사진(%s)? \n", member.getPhoto());
      out.println("!{}!");
      out.flush();
      if ((input = in.readLine()).length() > 0)
        temp.setPhoto(input);

      out.printf("전화(%s)? \n", member.getTel());
      out.println("!{}!");
      out.flush();
      if ((input = in.readLine()).length() > 0)
        temp.setTel(input);

      if (memberDao.update(temp) == 0) {
        out.println("해당 게시물이 없습니다..");
      } else
        out.println("변경했습니다.");

    } catch (Exception e) {
      out.printf("실행 오류! : %s\n", e.getMessage());
    }
  }
}
