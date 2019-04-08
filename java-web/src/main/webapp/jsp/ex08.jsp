<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.net.Socket"
  import="java.util.List,java.util.Map" autoFlush="false" buffer="8kb"
  trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05</title>
</head>
<body>
  <h1>지시문 (directive element) - include</h1>
  <%@ include file="./ex08_header.txt"%>
  <p>테스트</p>
  <%@ include file="./ex08_footer.txt"%>
</body>
</html>

