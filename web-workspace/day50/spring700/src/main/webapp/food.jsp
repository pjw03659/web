<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><a href="list">전체 음식 목록 가지고 오기 </a><br></h3>
<h3>음식 데이터를 입력</h3>
<hr color="red">
<form action="insert" method="get">
	이름 : <input name="name" value="라면" ><br>
	가격 : <input name="price" value="4000"><br>
	이미지 : <input name="img" value="ramen.jpg"><br>
	<button type="submit" >서버로 전송</button>
</form>
<hr color="red">
<h3>음식 정보 수정 </h3>
<hr color="red">
<form action="update" method="get">
	번호 : <input name="no" ><br>
	가격 : <input name="price" value="5000"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>음식 정보 삭제</h3>
<hr color="red">
<form action="delete" method="get">
	번호 : <input name="no" ><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<h3>음식 상세 정보</h3>
<form action="one" method="get">
	번호 : <input name="no" value="1" ><br>
	<button type="submit" >서버로 전송</button>
</form>
</body>
</html>