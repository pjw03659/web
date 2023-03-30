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
노래 검색이 완료되었습니다<br>
${bag.id}<br>
${bag.title}<br>
${bag.artist}<br>
${bag.genre}<br>
${bag.alb_img}<br>
<img src ="resources/img/${bag.alb_img}">

</body>
</html>