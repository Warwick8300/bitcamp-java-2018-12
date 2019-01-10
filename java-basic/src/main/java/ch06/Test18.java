package ch06;

import java.util.Properties;
import java.util.Set;

//매서드 - jvm 아규먼트 응용2
public class Test18 {

  public static void main(String[] args) {
    //                                위 args 파라미터
    // jvm에 기본으로 설정 되어 있는 프로퍼티를 모두 출력하라
    
    // jvm의 전체 프로퍼티 목록에 가져오기
    Properties props = System.getProperties();
    
    Set keySet = props.keySet();

    for (Object key :keySet) {
      String value = System.getProperty((String)key);
    
      System.out.printf("%s = %s\n",key, value);
    }

  }
}
