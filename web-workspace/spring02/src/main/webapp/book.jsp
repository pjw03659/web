<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>북마크 등록 화면입니다.</h3>
<hr color="red">
<form action ="insert3.multi" method="get">
name:<input name ="name" value="naver"><br>
url: <input name ="url" value="http://www.naver.com"><br>
img: <input name ="img" value="naver.jpg"><br>
<button type="submit"> 북마크 등록 </button>
</form>
<hr color="red">
<!-- one?id=1 -->
<h3>북마크 검색 화면입니다.</h3>
<hr color="red">
<form action="one3.multi" method="get">
	아이디 : <input name="id" value="1"><br>
	<button type="submit">북마크 검색</button>
</form>
<hr color="red">


</body>
</html>