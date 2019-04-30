<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
  trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>회원 목록</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="${contextRootPath}/css/common.css">
</head>
<body>

  <jsp:include page="../header.jsp" />
  
  <div class="container">
  <h1>회원 목록</h1>
  <p>
    <a href='form' class="btn btn-primary btn-sm">새 회원</a>
  </p>
  <div class="bit-list">
  <table class="table table-hover">
    <tr>
      <th scope="col">번호</th>
      <th scope="col">이름</th>
      <th scope="col">이메일</th>
      <th scope="col">전화</th>
      <th scope="col">가입일</th>
    </tr>
<c:forEach items="${list}" var="member">
    <tr>
      <th scope="col">${member.no}</th>
      <td><a href='${member.no}'>${member.name}</a></td>
      <td>${member.email}</td>
      <td>${member.tel}</td>
      <td>${member.registeredDate}</td>
    </tr>
</c:forEach>
  </table>
</div>

 
  <form class="form-inline my-2 my-lg-0" action='search'>
        <input class="form-control mr-sm-2" type="search" placeholder="검색" aria-label="검색" id="keyword" name='keyword'>
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">검색</button>
      </form>
 
 <nav aria-label="목록 페이지 이동">
  <ul class="pagination justify-content-center">
    <li class="page-item ${pageNo <= 1 ? 'disabled' : '' }">
    <a class="page-link" 
        href="?pageNo=${pageNo - 1}&pageSize=${pageSize}">이전</a></li>
    <li class="page-item active"><span class="page-link" href="#">${pageNo}</span></li>
    <li class="page-item ${pageNo >= totalPage ? 'disabled' : ''}">
    <a class="page-link" 
        href="?pageNo=${pageNo + 1}&pageSize=${pageSize}">다음</a></li>
  </ul>
</nav>

</div><!-- .container -->
<jsp:include page="../javascript.jsp"/>
</body>
</html>





