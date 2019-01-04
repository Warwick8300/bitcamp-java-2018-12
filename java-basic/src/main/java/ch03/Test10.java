// 키보드로 입력한 값 받기 문자열 int 섞어 읽기
package ch03;

public class Test10 {
    public static void main(String[] args) {
    
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        System.out.println("나이? ");
       int age = keyboard.nextInt(); 
       System.out.println("이름? ");
           String name = keyboard.next(); //토큰 단위로 문자열을 읽는다 
           System.out.printf("%d %s\n",age,name);
    }
}
