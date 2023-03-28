<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
<h3>게시물 글쓰기 화면입니다.</h3>
<hr color = "red">
<form action ="insert2.multi" method="get">
no: <input name ="no" value="001"><br>
title: <input name ="title" value="Tuesday"><br>
content: <input name ="content" value="tired"><br>
writer: <input name ="writer" value="park"><br>
<button type="submit"> 서버로 전송 </button>
</form>
<hr color = "red">

<h3>게시물 수정 화면입니다.</h3>
<hr color = "red">
<form action ="update2.multi" method="get">
no: <input name ="no" value="apple"><br>
content: <input name ="content" value="not tired"><br>
<button type="submit"> 서버로 전송 </button>
</form>

<hr color = "red">
<h3>게시물 삭제 화면입니다.</h3>
<hr color = "red">
<form action ="delete2.multi" method="get">
no: <input name ="no" value="001"><br>
<button type="submit"> 서버로 전송 </button>
</form>
<hr color = "red">

<h3>게시물 검색 화면입니다.</h3>
<hr color = "red">
<form action ="one2.multi" method="get">
no: <input name ="no" value="001"><br>
<button type="submit"> 서버로 전송 </button>
</form>
<hr color = "red">
<button type="button">먹통 버튼(아무기능 없음)</button>
</body>
</html>