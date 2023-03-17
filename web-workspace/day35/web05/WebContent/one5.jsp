<%@page import="multi.PlaylistVO"%>
<%@page import="multi.PlaylistDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id"); 
    	
    	PlaylistDAO dao = new PlaylistDAO();
    	PlaylistVO bag2 = dao.one(Integer.parseInt(id));
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
<td>노래id</td>
<td><%=bag2.getId()%></td>
</tr>
<tr>
<td>노래 제목</td>
<td><%= bag2.getTitle() %> </td>
</tr>
<tr>
<td>아티스트</td>
<td><%= bag2.getArtist() %></td>
</tr>
<tr>
<td>장르</td>
<td><%= bag2.getGenre() %> </td>
</tr>
<tr>
<td>앨범 이미지</td>
<td><img src="img/<%= bag2.getAlb_img() %>" width=250 height=250>
 </td>
</tr>
</table>
</body>
</html>