package com.eomcs.lms.dao.mariadb;

// DBMS 적용
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.eomcs.lms.dao.PhotoFileDao;
import com.eomcs.lms.domain.PhotoFile;
import com.eomcs.util.ConnectionFactory;

public class PhotoFileDaoImpl implements PhotoFileDao {


  public List<PhotoFile> findByPhotoBoardNo(int photoBoardNo) {
    List<PhotoFile> list = new ArrayList<PhotoFile>();
    Connection con = ConnectionFactory.create();
    // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
    try (PreparedStatement stmt = con.prepareStatement(
        "select photo_file_id, photo_id, file_path from lms_photo_file where photo_id = ? order by photo_id desc")) {
      stmt.setInt(1, photoBoardNo);


      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          PhotoFile photoFile = new PhotoFile();
          photoFile.setNo(rs.getInt("photo_file_id"));
          photoFile.setPhotoBoardNo(rs.getInt("photo_id"));
          photoFile.setFilePath(rs.getString("file_path"));

          list.add(photoFile);
        }
        return list;
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }



  }

  public void insert(PhotoFile photoBoard) {
    Connection con = ConnectionFactory.create();
    // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
    try (PreparedStatement stmt =
        con.prepareStatement("insert into lms_photo_file(file_path, photo_id) values(?,?)")) {

      stmt.setString(1, photoBoard.getFilePath());
      stmt.setInt(2, photoBoard.getPhotoBoardNo());
      stmt.executeUpdate();


    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public int deleteByPhotoBoardNo(int photoBoardNo) {


    Connection con = ConnectionFactory.create();
    // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법
    try (PreparedStatement stmt =
        con.prepareStatement("delete from lms_photo_file where photo_id = ?")) {

      stmt.setInt(1, photoBoardNo);
      return stmt.executeUpdate();


    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  /*
   * public PhotoBoard findByNo(int no) { PhotoBoard photoBoard = new PhotoBoard(); Connection con =
   * ConnectionFactory.create(); try (PreparedStatement stmt2 =
   * con.prepareStatement("update lms_photo set vw_cnt = vw_cnt + 1 where photo_id = ?")) {
   * stmt2.setInt(1, no); stmt2.executeUpdate();
   * 
   * 
   * // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법 try (PreparedStatement stmt =
   * con.prepareStatement("select * from lms_photo where photo_id = ?")) {
   * 
   * stmt.setInt(1, no);
   * 
   * try (ResultSet rs = stmt.executeQuery()) { if (rs.next()) {
   * photoBoard.setNo(rs.getInt("photo_id")); photoBoard.setTitle(rs.getString("titl"));
   * photoBoard.setCreatedDate(rs.getDate("cdt")); photoBoard.setViewCount(rs.getInt("vw_cnt"));
   * photoBoard.setLessonNo(rs.getInt("lesson_id")); return photoBoard; } else {
   * 
   * return null; }
   * 
   * }
   * 
   * } } catch (Exception e) { throw new RuntimeException(e); }
   * 
   * 
   * }
   * 
   * public int update(PhotoBoard photoBoard) { Connection con = ConnectionFactory.create(); try
   * (Connection con = DriverManager
   * .getConnection("jdbc:mariadb://localhost/bitcampdb?user=bitcamp&password=1111")) {
   * 
   * 
   * // PreparedStatement 미리sql 문장을 준비하여 값을 삽입하는 기법 try (PreparedStatement stmt =
   * con.prepareStatement("update lms_photo set titl = ?, lesson_id = ? where photo_id = ?")) {
   * stmt.setString(1, photoBoard.getTitle()); stmt.setInt(2, photoBoard.getLessonNo());
   * stmt.setInt(3, photoBoard.getNo());
   * 
   * return stmt.executeUpdate();
   * 
   * } } catch (Exception e) { throw new RuntimeException(e); }
   * 
   * }
   * 
   * 
   */



}


