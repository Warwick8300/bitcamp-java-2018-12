package design_pattern.command.after;

public class MemberUpdateCommand implements Command {

  @Override
  public void execute() {
    System.out.println("회원 입력 처리!");
  }

}
