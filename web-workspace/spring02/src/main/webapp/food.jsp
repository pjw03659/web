<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>음식 입력 화면입니다.</h3>
<form action="food" method="get">
좋아하는 음식: <input type="text" name="like" value="라면"><br>
싫어하는 음식: <input type="text" name="dislike" value="커피"><br>
	<button type="submit">서버로 전송</button>
</form>
</body>
</html>