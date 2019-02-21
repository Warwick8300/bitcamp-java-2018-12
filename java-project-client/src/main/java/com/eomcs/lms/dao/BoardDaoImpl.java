package com.eomcs.lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;
import com.eomcs.lms.domain.Board;

public class BoardDaoImpl implements BoardDao {


  public BoardDaoImpl() {

  }

 
  public List<Board> findAll() {
    List<Board> boards = new LinkedList<Board>();


    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt = con.prepareStatement("select * from t_board")) {
        try (ResultSet rs = stmt.executeQuery()) {
          while (rs.next()) {
            Board board = new Board();
            board.setNo(rs.getInt("board_id"));
            board.setContents(rs.getString("contents"));
            board.setCreatedDate(rs.getDate("created_date"));
            board.setViewCount(rs.getInt("view_count"));
            boards.add(board);
          }

        }
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }


    return (List<Board>) boards;

  }

  public void insert(Board board) {
    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt =
          con.prepareStatement("insert into t_board( board_id, contents,created_date,view_count)"
              + " values(?,?,?,?)")) {
        stmt.setInt(1, board.getNo());
        stmt.setString(2, board.getContents());
        stmt.setDate(3, board.getCreatedDate());
        stmt.setInt(4, board.getViewCount());
        stmt.executeUpdate();

      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public Board findByNo(int no) {
    Board board = new Board();
    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt =
          con.prepareStatement("select * from t_board where board_id = " + no)) {
        try (ResultSet rs = stmt.executeQuery()) {
          if (rs.next()) {
            board.setNo(rs.getInt("board_id"));
            board.setContents(rs.getString("contents"));
            board.setCreatedDate(rs.getDate("created_date"));
            board.setViewCount(rs.getInt("view_count"));

          } else
            System.out.println("해당번호의 게시물이 존재하지 않습니다.");

        }


      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return board;

  }

  public int update(Board board) {
    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt = con.prepareStatement(
          "update t_board set contents = ?, created_date = ?, view_count = ? where board_id = ?"
              )) {
        stmt.setString(1, board.getContents());
        stmt.setDate(2, board.getCreatedDate());
        stmt.setInt(3, board.getViewCount());
        stmt.setInt(4, board.getNo());
        stmt.executeUpdate();
        return 1;

      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public int delete(int no) {

    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
      System.out.println("DBMS 연결 성공");

      //PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt = con.prepareStatement(
          "delete from t_board where board_id = "+no)) {
      int count = stmt.executeUpdate();
     
           if(count ==0) {
             System.out.println("해당번호의 게시물이 존재하지 않습니다.");
             return 1;
          }
            
       return 1;
      }
    }catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
  
}


