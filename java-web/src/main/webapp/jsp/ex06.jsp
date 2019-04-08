<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06</title>
</head>

<%!public void jspInit() {
    System.out.println("ex06.jsp의 jspInit()");
  }

  public void jspDestroy() {
    System.out.println("ex06.jsp의 jspInit()");
  }%>
<body>
	<h1>선언부 (expression element)</h1>
	100,000,000의 입금 = <%=calculate(100000000) %>
</body>

<%!
double interest = 0.025; // 인스턴스 변수
private String calculate(long money) {// 인스턴스 메서드
    return String.format("%.2f",money + (money * interest));
  }%>
</html>

