package ch23.i;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

// Base64 인코딩
public class Test01 {
  public static void main(String[] args) throws UnsupportedEncodingException {
    String str ="ABC012가각간";
    byte[] bytes = str.getBytes("UTF-8");
    
    //Base 64 
    // => 바이너리 데이터를 문자화 시킨다.
    //
    
    Encoder encoder = Base64.getEncoder();
    byte[] base64Bytes =encoder.encode(bytes);
    System.out.println(new String(base64Bytes));
    
    //Base64 디코딩
    // => Base64 코드를 원래의 바이너리 값으로 변환한다.
    Decoder decoder = Base64.getDecoder();
    byte[] bytes2 = decoder.decode(base64Bytes);
    
    System.out.println(new String(bytes2, "UTF-8"));
    
  }
}
