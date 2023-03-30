<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Cookie c11 = new Cookie("category","excersise");
Cookie c22 = new Cookie("type","soccer");
response.addCookie(c11);
response.addCookie(c22);
%>
<hr color="red">
<hr>브라우저에 쿠키를 심었음.
<a href ="page02.jsp">쿠키리스트 가지고 오기</a>
<hr color="red">




</body>
</html>