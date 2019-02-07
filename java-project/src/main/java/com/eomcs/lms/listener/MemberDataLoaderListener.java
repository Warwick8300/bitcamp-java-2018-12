package com.eomcs.lms.listener;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.eomcs.lms.context.ApplicationListener;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;

//applicationListene
public class MemberDataLoaderListener implements ApplicationListener {

  @Override
  public void starApplication(Map<String, Object> context) {
    System.out.println("애플리케이션이 시작할때 준비할 작업을 수행한다");
    try (ObjectInputStream in = new ObjectInputStream(
        new BufferedInputStream(new FileInputStream("member.data")))){




    context.put("memberLsit", in.readObject());

    } catch (Exception e) {
      System.out.println("게시글 데이터를 읽는 중 오류 발생: " + e.toString());
      context.put("memberLsit", new LinkedList<Board>());

    }
    
    
    


  }

  @SuppressWarnings("unchecked")
  @Override
  public void endApplication(Map<String, Object> context) {
    System.out.println("애플리케이션이 종료될때 작업을 수행 ");    
    try (ObjectOutputStream out = new ObjectOutputStream(
        new BufferedOutputStream(
            new FileOutputStream("member.data")));) {
      out.writeObject(context.get("memberLsit"));


    } catch (Exception e) {
      System.out.println("게시글 데이터를 쓰는 중 오류 발생: " + e.toString());
    }
  
  
  }

}
