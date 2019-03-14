package com.eomcs.lms.context;
// IoC 컨테이너가 관리할 객체에 붙이는 애노테이션이다
// IoC 컨테이너는 이 애노테이션이 붙은 클래스에 대해 인스턴스를 자동으로 생성할 것이다.

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Component {
  String value() default "";
}
