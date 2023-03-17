<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="multi.Bbs_DAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id"); 
    	
    	ProductDAO dao = new ProductDAO();
    	ProductVO bag2 = dao.one(id);
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
<td>상품id</td>
<td>상품명</td>
<td>상품</td>
<td>가격</td>
<td>제조회사</td>
<td>이미지</td>
</tr>
<tr>
<td><%=bag2.getId()%></td>
<td><%= bag2.getName() %> </td>
<td><%= bag2.getContent() %></td>
<td><%= bag2.getPrice() %> </td>
<td><%= bag2.getCompany() %> </td>
<td><%= bag2.getImg() %> </td>
</tr>
</table>
</body>
</html>