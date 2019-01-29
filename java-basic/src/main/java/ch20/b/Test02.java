package ch20.b;

import java.util.Stack;

// Stack 클래스 사용법 - empty()
public class Test02 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    //push()
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    //pop

    while(!stack.empty()) {
      System.out.println(stack.pop());
    }
  }

}
