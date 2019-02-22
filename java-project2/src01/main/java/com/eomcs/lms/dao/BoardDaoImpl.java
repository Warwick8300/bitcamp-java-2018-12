package com.eomcs.lms.dao;

// DBMS 적용
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.domain.Board;

public class BoardDaoImpl implements BoardDao {


  public BoardDaoImpl() {

  }


  public List<Board> findAll() {
    List<Board> list = new ArrayList<Board>();
    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {


      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt = con.prepareStatement(
          "select board_id,conts,cdt, vw_cnt from lms_board order by board_id desc")) {
        try (ResultSet rs = stmt.executeQuery()) {
          while (rs.next()) {
            Board board = new Board();
            board.setNo(rs.getInt("board_id"));
            board.setContents(rs.getString("conts"));
            board.setCreatedDate(rs.getDate("cdt"));
            board.setViewCount(rs.getInt("vw_cnt"));
            list.add(board);
          }
          return list;
        }
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }



  }

  public void insert(Board board) {
    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {


      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt =
          con.prepareStatement("insert into lms_board(conts)" + " values(?)")) {

        stmt.setString(1, board.getContents());
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

      try (PreparedStatement stmt =
          con.prepareStatement("update lms_board set vw_cnt = vw_cnt + 1 where board_id = ?")) {
        stmt.setInt(1, no);
        stmt.executeUpdate();
      }

      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt =
          con.prepareStatement("select * from lms_board where board_id = ?")) {

        stmt.setInt(1, no);

        try (ResultSet rs = stmt.executeQuery()) {
          if (rs.next()) {
            board.setNo(rs.getInt("board_id"));
            board.setContents(rs.getString("conts"));
            board.setCreatedDate(rs.getDate("cdt"));
            board.setViewCount(rs.getInt("vw_cnt"));
            return board;
          } else {

            return null;
          }

        }


      }
    } catch (

    Exception e) {
      throw new RuntimeException(e);
    }


  }

  public int update(Board board) {
    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {


      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt = con.prepareStatement(
          "update lms_board set conts = ? where board_id = ?")) {
        stmt.setString(1, board.getContents());
        stmt.setInt(2, board.getNo());
        
        return stmt.executeUpdate();

      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public int delete(int no) {

    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
 

      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt =
          con.prepareStatement("delete from lms_board where board_id = ?")) {
        
        stmt.setInt(1, no);
        return stmt.executeUpdate();

      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}


