<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("id") == null){ %>
<h3>로그인 화면입니다. </h3>
<hr color="red">
<form action="login" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	<button type="submit">서버로 전송</button>
</form>
<%} else {%>
<hr color="red">
${id}님이 로그인 중입니다.~!
<br>
<a href="news.jsp">
	<button style="background: pink;" >뉴스 사이트로 go</button>
</a><br>
<a href="cafe.jsp">
	<button style="background: pink;" >카페 사이트로 go</button>
</a>
<%} %>
</body>
</html>