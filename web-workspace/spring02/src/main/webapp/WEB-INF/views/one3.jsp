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
북마크 검색이 완료되었습니다.<br>
${bag.id}<br>
${bag.name}<br>
${bag.url}<br>
${bag.img}<br>
<img src ="resources/img/${bag.img}">
</body>
</html>