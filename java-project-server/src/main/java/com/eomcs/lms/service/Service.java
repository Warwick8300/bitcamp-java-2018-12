// 추상클래스로 인터페이스로 바꾼
package com.eomcs.lms.service;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public interface Service {


 void execute(
      String request, ObjectInputStream in, ObjectOutputStream out) throws Exception; 




}







