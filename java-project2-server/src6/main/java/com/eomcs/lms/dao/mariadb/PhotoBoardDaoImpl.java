package com.eomcs.lms.dao.mariadb;

// DBMS 적용
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.domain.PhotoBoard;

public class PhotoBoardDaoImpl implements PhotoBoardDao {
  Connection con;

  // Dao가 사용하는 커넥션 객체를 외부에서 주입받는당



  public PhotoBoardDaoImpl(Connection con) {
    this.con = con;
  }


  public List<PhotoBoard> findAll() {
    List<PhotoBoard> list = new ArrayList<PhotoBoard>();

    // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
    try (PreparedStatement stmt = con.prepareStatement(
        "select photo_id,titl,cdt, vw_cnt, lesson_id from lms_photo order by photo_id desc")) {
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          PhotoBoard photoBoard = new PhotoBoard();
          photoBoard.setNo(rs.getInt("photo_id"));
          photoBoard.setTitle(rs.getString("titl"));
          photoBoard.setCreatedDate(rs.getDate("cdt"));
          photoBoard.setViewCount(rs.getInt("vw_cnt"));
          photoBoard.setLessonNo(rs.getInt("lesson_id"));
          list.add(photoBoard);
        }
        return list;
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }



  }

  public void insert(PhotoBoard photoBoard) {
    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {


      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt =
          con.prepareStatement("insert into lms_photo(titl, lesson_id)" + " values(?,?)")) {

        stmt.setString(1, photoBoard.getTitle());
        stmt.setInt(2, photoBoard.getLessonNo());
        stmt.executeUpdate();

      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public PhotoBoard findByNo(int no) {
    PhotoBoard photoBoard = new PhotoBoard();

      try (PreparedStatement stmt2 =
          con.prepareStatement("update lms_photo set vw_cnt = vw_cnt + 1 where photo_id = ?")) {
        stmt2.setInt(1, no);
        stmt2.executeUpdate();
      

      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt =
          con.prepareStatement("select * from lms_photo where photo_id = ?")) {

        stmt.setInt(1, no);

        try (ResultSet rs = stmt.executeQuery()) {
          if (rs.next()) {
            photoBoard.setNo(rs.getInt("photo_id"));
            photoBoard.setTitle(rs.getString("titl"));
            photoBoard.setCreatedDate(rs.getDate("cdt"));
            photoBoard.setViewCount(rs.getInt("vw_cnt"));
            photoBoard.setLessonNo(rs.getInt("lesson_id"));
            return photoBoard;
          } else {

            return null;
          }

        }

      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }


  }

  public int update(PhotoBoard photoBoard) {
    try (Connection con = DriverManager
        .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {


      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt =
          con.prepareStatement("update lms_photo set titl = ?, lesson_id = ? where photo_id = ?")) {
        stmt.setString(1, photoBoard.getTitle());
        stmt.setInt(2, photoBoard.getLessonNo());
        stmt.setInt(3, photoBoard.getNo());

        return stmt.executeUpdate();

      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public int delete(int no) {

  

      // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
      try (PreparedStatement stmt =
          con.prepareStatement("delete from lms_photo where photo_id = ?")) {

        stmt.setInt(1, no);
        return stmt.executeUpdate();

      
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}


