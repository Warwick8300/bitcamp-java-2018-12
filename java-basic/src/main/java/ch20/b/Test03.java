package ch20.b;

import java.util.Stack;

// Stack 클래스 사용법 - search()
public class Test03 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();

    //push()
    stack.push("aaa");
    stack.push("bbb");
    stack.push("ccc");
    stack.push("ccc");
    // search()
    System.out.println(stack.search(new String("ccc")));
    System.out.println(stack.search(new String("bbb")));
    System.out.println(stack.search(new String("aaa")));
    System.out.println(stack.search(new String("xxx")));
  }

}
