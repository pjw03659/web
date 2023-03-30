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
	Cookie c1 = new Cookie("name","honggildong");
	Cookie c2 = new Cookie("age","100");
	
	response.addCookie(c1);
	response.addCookie(c2);

%>
<hr>브라우저에 쿠키를 심었음.
<a href ="cookieList.jsp">쿠키리스트 가지고 오기</a>
</body>
</html>