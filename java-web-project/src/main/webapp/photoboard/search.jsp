<%@page import="com.eomcs.lms.domain.PhotoBoard"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%
  List<PhotoBoard> list = (List<PhotoBoard>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<title>회원 찾기</title>
</head>
<body>
  <jsp:include page="/header.jsp" />

  <h1>사진 검색 결과(jsp)</h1>
  <table border='1'>
    <tr>
      <th>번호</th>
      <th>제목</th>
      <th>등록일</th>
      <th>조회수</th>
      <th>수업</th>
    </tr>
    <%
      for (PhotoBoard photoBoard : list) {
    %>
    <tr>
      <td><%=photoBoard.getNo()%></td>
      <td><a href='detail?no=<%=photoBoard.getNo()%>'><%=photoBoard.getTitle()%></a></td>
      <td><%=photoBoard.getCreatedDate()%></td>
      <td><%=photoBoard.getViewCount()%></td>
      <td><%=photoBoard.getLessonNo()%></td>
    
    <%
      }
    %>
  </table>
  <p>
    <a href='list'>목록</a>
  </p>
</body>
</html>




