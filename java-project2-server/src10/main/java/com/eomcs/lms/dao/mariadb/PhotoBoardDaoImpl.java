package com.eomcs.lms.dao.mariadb;

// DBMS 적용
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.dao.PhotoBoardDao;
import com.eomcs.lms.domain.PhotoBoard;
import com.eomcs.util.ConnectionFactory;

public class PhotoBoardDaoImpl implements PhotoBoardDao {


  public List<PhotoBoard> findAll() {
    List<PhotoBoard> list = new ArrayList<PhotoBoard>();

    // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
    try (Connection con = ConnectionFactory.crate();
        PreparedStatement stmt = con.prepareStatement(
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


    // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
    try (Connection con = ConnectionFactory.crate();
        PreparedStatement stmt =
            con.prepareStatement("insert into lms_photo(titl, lesson_id)" + " values(?,?)",
                Statement.RETURN_GENERATED_KEYS)) {

      stmt.setString(1, photoBoard.getTitle());
      stmt.setInt(2, photoBoard.getLessonNo());
      stmt.executeUpdate();

      try (ResultSet rs = stmt.getGeneratedKeys()) {
        rs.next();
        photoBoard.setNo(rs.getInt(1));
      }


    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public PhotoBoard findByNo(int no) {
    PhotoBoard photoBoard = new PhotoBoard();

    try (Connection con = ConnectionFactory.crate();
        PreparedStatement stmt2 =
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

    // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
    try (Connection con = ConnectionFactory.crate();
        PreparedStatement stmt = con
            .prepareStatement("update lms_photo set titl = ?, lesson_id = ? where photo_id = ?")) {
      stmt.setString(1, photoBoard.getTitle());
      stmt.setInt(2, photoBoard.getLessonNo());
      stmt.setInt(3, photoBoard.getNo());

      return stmt.executeUpdate();


    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public int delete(int no) {



    // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
    try (Connection con = ConnectionFactory.crate();
        PreparedStatement stmt = con.prepareStatement("delete from lms_photo where photo_id = ?")) {

      stmt.setInt(1, no);
      return stmt.executeUpdate();


    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}


