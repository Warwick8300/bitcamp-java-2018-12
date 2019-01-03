// 리터럴
package ch02;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("Hello!");
        // 1) 정수 78을 출력하라
        // = 10진수
        System.out.println(78);
        // = 2진수
        System.out.println(Integer.toBinaryString(78));
        System.out.println(10011);
        // = 16진수
        System.out.println(Integer.toHexString(78));
        System.out.println("4e");
        // = 8진수
        System.out.println(Integer.toOctalString(78));
        System.out.println(116);
        // 2) 부동소수점을 출력하라.
        // => 12.345
        System.out.println(12.345);
        // 1.2345를 출력할때 12.345 가 나오게 하라
        System.out.println(1.2345e1);
        
        // 참거짓
        System.out.println(true);
        System.out.println(false);
        // 4.문자를 출려가라
       // => 0x61 값을 출력했을 때 a가 나오게 하라
        System.out.println((char)0x61);

        // 97 값을 출력했을때 a가 나오게 
        System.out.println((char)97);
        // =>작은 따옴 표를 
        System.out.println('a');
        
    }
}

