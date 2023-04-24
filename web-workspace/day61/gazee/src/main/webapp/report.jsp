<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
			
		})
	})
	
</script>
<link href="resources/css/nav.css" rel="stylesheet" />
</head>
<body>
	<div id="wrap">
		<div id="header">
			<div id="login">
				<ul class="user">
					<li>로그인</li>
					<li id="line">|</li>
					<li>회원가입</li>
				</ul>
			</div>
			<div class="headerContent">
				<img src="resources/img/gazee_logo.png" id="logo">
				<ul class="menu">
					<li>마이페이지</li>
					<li>커뮤니티</li>
					<li>고객센터</li>
					<li>신고하기</li>
					<li><button id="sell">판매하기</button></li>
				</ul>
			</div>
			<div id= "reportBbs"></div>
		</div>
		<div id="content">
			<div id="report">
				<h1 id="report_head">신고게시판</h3>
				<ul class="reportMenu">
				<li><form method="get">
					<label for="category">카테고리</label> <select id="category" name="category" size="1">
						<option value="">선택하세요.</option>
						<option value="결제 관련">결제 관련</option>
						<option value="배송 관련">배송 관련</option>
						<option value="거래 관련">거래 관련</option>
					</select>
				</form></li>
				<li><button id="reportList">목록</button></li>
				<li><button id="sell">글쓰기</button></li>
				</ul>
			</div>
		</div>	
	</div>
	<div id="footer">
		<div>
			<p style="margin: 0; font-size: 12px;">Copyrightⓒ 2023. gazee.
				All rights reserved.</p>
		</div>
	</div>
</body>
</html>