<%@page import="com.multi.mvc02.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: beige;
}
</style>
</head>
<body>
<a href= "bbs.jsp">처음페이지로</a>
<a href= "list2.multi">게시물 전체 목록페이지</a>
<hr color="red">
<% 
	String id = (String)session.getAttribute("id");
	BbsVO bag = (BbsVO)request.getAttribute("bag");
	String writer = bag.getWriter();
if(id != null){	
if(id.equals(writer)){ %>
<a href="update2.multi">
	<button style="background: pink;" >수정</button>
</a>
<a href="delete2.multi?no=${bag.no}">
	<button style="background: pink;" >삭제</button>
</a>
<% }} %>
<br>
게시글 검색 처리 요청이 완료되었습니다.<br>
번호: ${bag.no}<br>
제목: ${bag.title}<br>
내용: ${bag.content}<br>
작성자: ${bag.writer}<br>
</body>
</html>