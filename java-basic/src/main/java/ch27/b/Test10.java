// reflection API - 배열 항목의 타입 알아내기
package ch27.b;

public class Test10 {

  public static void main(String[] args) throws Exception {
    
    System.out.println(byte.class.getName());
    System.out.println(new byte[] {}.getClass().getName());
    System.out.println(new byte[] {}.getClass().getComponentType().getName());

    
    System.out.println(short.class.getName());
    System.out.println(new short[] {}.getClass().getName());
    System.out.println(new short[] {}.getClass().getComponentType().getName());

    System.out.println(long.class.getName());
    System.out.println(new long[] {}.getClass().getName());
    System.out.println(new long[] {}.getClass().getComponentType().getName());



  }

}





