<%@page import="multi.Bbs_DAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String no = request.getParameter("no"); 
    	
    	Bbs_DAO dao = new Bbs_DAO();
    	BbsVO bag2 = dao.one(Integer.parseInt(no));
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
<td>no</td>
<td>title</td>
<td>content</td>
<td>writer</td>
</tr>
<tr>
<td><%=bag2.getNo()%></td>
<td><%= bag2.getTitle() %> </td>
<td><%= bag2.getContent() %></td>
<td><%= bag2.getWriter() %> </td>
</tr>
</table>
</body>
</html>