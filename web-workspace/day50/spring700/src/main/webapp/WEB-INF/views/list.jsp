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
	background: yellow;
}

td {
	width: 100px;
	text-align: center;
}

.top {
	background: black;
	color: white;
}

.down {
	background: lime;
}
</style>

</head>
<body>
음식 목록 검색 요청이 완료되었습니다.<br>
<table>
		<tr>
			<td class="top">no</td>
			<td class="top">name</td>
			<td class="top">price</td>
			<td class="top">img</td>
		</tr>
	<c:forEach items="${list}" var="bag"> 
		<tr>
			<td class="top">${bag.no}</td>
			<td class="top">${bag.name}</td>
			<td class="top">${bag.price}</td>
			<td class="top">${bag.img}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>