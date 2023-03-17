<%@page import="multi.PlaylistVO"%>
<%@page import="multi.PlaylistDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    	String id = request.getParameter("id"); 
    	
    	PlaylistDAO dao = new PlaylistDAO();
    	ArrayList<PlaylistVO> list= dao.list();
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<style>
a {
	text-decoration: none;
	color: black;
}
</style>
<body>
<% if(list.size()==0){ %>
<h3>등록된 노래가 없습니다.</h3>
<img src="img/empty.png" width=250 height=250>
<% } else { %>
<table class="table table-danger table-striped">
<tr>
<td>노래 제목</td>
<td>아티스트</td>
<td>장르</td>
</tr>
<% for(PlaylistVO bag2:list){ %>
<tr>
	
	<td>
	<a href="one5.jsp?id=<%= bag2.getId() %>">
	<%= bag2.getTitle() %>
	</a>
	</td>
	<td><%= bag2.getArtist() %></td>
	<td><%= bag2.getGenre() %></td>
	
</tr>	
<%} %>
<%} %>
</table>
<hr color="red">
	<a href= "insert5.html">
		<button id="b1">노래 추가</button>
	</a>
	<a href= "delete5.html">
		<button id="b1">노래 삭제</button>
	</a>
	<a href= "update5.html">
		<button id="b1">노래목록 수정</button>
	</a>
	<hr>
	<input name ="serch">
	<a href= "serch.jsp">
		<button id="b1">검색</button>
	</a>
</body>
</html>