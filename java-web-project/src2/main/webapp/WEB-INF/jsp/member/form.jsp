<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>새 회원</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="stylesheet" href="${contextRootPath}/css/common.css">
</head>
<body>

<jsp:include page="../header.jsp"/>

<div class="container">
  <h1>새 회원</h1>
  <form action='add' method='post' enctype='multipart/form-data'>
    <table border='1'>
      <tr>
        <th>이름</th>
        <td><input type='text' name='name'></td>
      </tr>
      <tr>
        <th>이메일</th>
        <td><input type='email' name='email'></td>
      </tr>
      <tr>
        <th>암호</th>
        <td><input type='password' name='password'></td>
      </tr>
      <tr>
        <th>사진</th>
        <td><input type='file' name='photoFile'></td>
      </tr>
      <tr>
        <th>전화</th>
        <td><input type='text' name='tel'></td>
      </tr>
    </table>
    <p>
      <button type='submit'>등록</button>
      <a href='.'>목록</a>
    </p>
  </form>
</body>
</html>





