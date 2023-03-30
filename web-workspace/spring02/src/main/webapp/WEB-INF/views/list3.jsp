<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h3>북마크 전체 검색</h3><br>

<c:forEach items="${list}" var="bag"> 
<hr>
<table>
<tr>
<td>검색된 id</td> 
<td>${bag.id}</td>
</tr>
<tr>
<td>검색된 name</td> 
<td>${bag.name}</td>
</tr>
<tr>
<td>검색된 url</td> 
<td><a href= "${bag.url}">${bag.url} </a></td>
</tr>
<tr>
<td>검색된 img</td>
<td>${bag.img}</td>
</tr>
</table>
</c:forEach>
</body>
</html>