<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

    String no = request.getParameter("no"); 
    String title = request.getParameter("title"); 
    String content = request.getParameter("content"); 
    String writer = request.getParameter("writer"); 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background: #037BFC;
}
</style>
</head>
<body>
글쓰기 전송 요청되었음.
<hr color="red">
번호: <%= no %><br>
제목: <%= title %><br>
내용: <%= content %><br>
작성자: <%= writer %><br>
</body>
</html>