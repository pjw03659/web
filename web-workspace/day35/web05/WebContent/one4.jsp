<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id"); 
    	
    	MovieDAO dao = new MovieDAO();
    	MovieVO bag2 = dao.one(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<table class="table table-hover table-striped">
<tr>
<td>영화id</td>
<td>영화 제목</td>
<td>내용</td>
<td>장소</td>
<td>감독</td>
</tr>
<tr>
<td><%=bag2.getId()%></td>
<td><%= bag2.getTitle() %> </td>
<td><%= bag2.getContent() %></td>
<td><%= bag2.getLocation() %> </td>
<td><%= bag2.getDirector() %> </td>
</tr>
</table>
</body>
</html>