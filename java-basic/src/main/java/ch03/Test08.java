// 키보드로 입력한 값 받기 int 값 일
package ch03;

public class Test08 {
    public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);
     System.out.println("a");
    int a = keyboard.nextInt(); // 한개의 토큰(
        
    System.out.println("b");
        int b = keyboard.nextInt();
        System.out.printf("%d *%d = %d\n",a,b,a*b);
    }
}
