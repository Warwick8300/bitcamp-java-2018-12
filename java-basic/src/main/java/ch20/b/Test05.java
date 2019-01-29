package ch20.b;

import java.util.Stack;

// Stack 클래스 사용법 - peek()
public class Test05 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    //push()
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");

    // peek()
    for(int i = 0 ; i <stack.size(); i++) {
      System.out.println(stack.get(i));
    }
  }

}
