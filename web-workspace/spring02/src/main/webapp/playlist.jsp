<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>전체 플레이 리스트</h3>
<hr color="red">
<a href ="list4.multi">전체 플레이 리스트</a>
<hr color="red">

<h3>노래 추가 화면입니다.</h3>
<hr color="red">
<form action ="insert4.multi" method="get">
title:<input name ="title" value="Ditto"><br>
artist: <input name ="artist" value="Newjeans"><br>
genre: <input name ="genre" value="dance"><br>
alb_img: <input name ="alb_img" value="OMG.jpg"><br>
<button type="submit"> 플레이리스트에 노래 추가 </button>
</form>
<hr color="red">


<h3>노래 검색 화면입니다.</h3>
<hr color="red">
<form action="one4.multi" method="get">
	아이디 : <input name="id" value="12"><br>
	<button type="submit">노래 검색</button>
</form>
<hr color="red">

<h3>노래 제거 화면입니다.</h3>
<hr color = "red">
<form action ="delete4.multi" method="get">
id: <input name ="id" value="22"><br>
<button type="submit"> 플레이리스트에서 노래 제거 </button>
</form>
<hr color = "red">

</body>
</html>