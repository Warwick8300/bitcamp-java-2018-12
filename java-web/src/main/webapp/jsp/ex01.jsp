<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01</title>
</head>
<body>
	<h1>JSP 구동 원리</h1>
	<pre>
  1) 웹 브라우저 ==> 서블릿 컨테이너
  - JSP 실행요청
  2) 서블릿 컨테이너가 실행
  - JSP의 서블릿 객체를 찾는다
  - 있으면, 그 서블릿을 호출
  - 없으면, JSP 엔진을 이용하여 JSP 파일을 가지고 서블릿 자바 소스파일을 생성한다
  - 자바 컴파일러를 이용하여 소스 파일을 컴파일하낟
  =
</pre>

</body>
</html>