package com.eomcs.lms.handler;

import com.eomcs.lms.domain.Member;
import com.eomcs.lms.mariadb.MemberDao;

public class MemberUpdateCommand extends AbstractCommand {

  MemberDao memberDao;

  public MemberUpdateCommand(MemberDao memberDao) {

    this.memberDao = memberDao;
  }

  @Override
  public void execute(Response response)throws Exception {
    
      int no = response.requestInt("번호?");

      Member member = memberDao.findByNo(no);

      Member temp = member.clone();

 
      String input = response.requestString(String.format("이름(%s)?", member.getName()));
      if (input.length() > 0)
        temp.setName(input);


      input = response.requestString(String.format("이메일(%s)?", member.getEmail()));
      if (input.length() > 0)
        temp.setEmail(input);


      input = response.requestString("암호(새로운암호입력하세요)?");
    
      if (input.length() > 0)
        temp.setPassword(input);


      input = response.requestString(String.format("사진(%s)?", member.getPhoto()));
      if (input.length() > 0)
        temp.setPhoto(input);


      input = response.requestString(String.format("전화(%s)?", member.getTel()));
      if (input.length() > 0)
        temp.setTel(input);

      if (memberDao.update(temp) == 0) {
        response.println("해당 게시물이 없습니다..");
      } else
        response.println("변경했습니다.");

   
  }
}
