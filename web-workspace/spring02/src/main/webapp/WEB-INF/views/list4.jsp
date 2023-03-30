<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
<style>
body {
	background: beige;
}
td{
	width: 100px;
	text-align: center;
}
.top{
	background: black;
	color: white;
}
.down{
	background: lime;
}
</style>

</head>
<body>
<h3>플레이리스트 전체 검색</h3><br>

<table>
<tr>
	<td class="top">ID</td>
	<td class="top">title</td>
	<td class="top">artist</td>
	<td class="top">genre</td>
	<td class="top">alb_img</td>
</tr>
<c:forEach items="${list}" var="bag">
<tr>
	<td class="down">${bag.id}</td>
	<td class="down">
		<a href="one4.multi?id=${bag.id}">${bag.title}</a>
	</td>
	<td class="down">${bag.artist}</td>
	<td class="down">${bag.genre}</td>
	<td class="down"><img src="resources/img/${bag.alb_img}" width=250 height=250></td>
</tr> 
</c:forEach>
</table>
</body>
</html>