<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.net.Socket"
	   import="java.util.List,java.util.Map"
	autoFlush="false"
	buffer="8kb" trimDirectiveWhitespaces="true"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex07</title>
</head>
<body>
	<h1>지시문 (directive element)</h1>
	<%
	  for (int i = 0; i < 1000; i++) {
	    out.print(". ");
	  }
	%>
</body>
</html>

