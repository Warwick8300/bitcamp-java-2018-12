package ch16;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Test05 {
  public static void main(String[] args) {
    
    //제네릭을 사용하는 메서드
    String [] strs = create2(new String[0]);
    System.out.println(strs.length);

    String[] temp = new String[100];
    String[] strs2 = create2(temp);
    
    System.out.println(strs2.length);
    System.out.println(strs==temp);
    
    String[] strs3 = create3(String.class);
    System.out.println(strs3.length);

  }
    
    //제네릭으로 배열 생성하기
    
    
    static <T> T[] create1() {
      //T[] arr = new T[10]; // 컴파일 오류
      return null;
    
    }
    
    static <T> T[] create2(T[] arr) {  
      return Arrays.copyOf(arr,10);  
      }
    
    @SuppressWarnings("unchecked")
    static <T> T[] create3(Class<?>type) {
      return (T[]) Array.newInstance(type, 10);
    }
    
    static <T> T[] create4(T[] arr) {  
      return (T[]) Array.newInstance(arr.getClass(), 10);
      }
}
