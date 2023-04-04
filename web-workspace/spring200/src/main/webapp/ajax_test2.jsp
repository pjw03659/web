<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			url: "list5",
			success : function(x) {
			$('#result').append(x)
			}//success
		})//ajax
	
		
		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url: "update2",
				data: {
					no :$('#bbsno').val(),
					content: $('#content').val()
				},
				success : function(x) {
					$('#result').append(x)
					alert('수정 성공!')
					document.location.reload() 
				}//success
			})//ajax
		})//b2
		
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url: "delete2",
				data: {
					no :$('#bbsno2').val()
				},
				success : function(x) {
					alert('삭제 완료')
					document.location.reload() 
				}//success
			})//ajax
		})//b3
		
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
			crossOrigin: true,
			url:'http://api.openweathermap.org/data/2.5/weather?q=seoul&units=metirc&lang=kr&appid=43238037f8f84c1b9d70369513a425e6',
			dataType : 'json',
			success: function(x){
				console.log(x);
				$('#result').html("위치"+x.name+"<br>"+
						"날씨"+x.weather[0].description+"<br>"+
						"풍속"+x.wind.speed+"<br>"+
						"최고 기온"+x.main.temp_max+"<br>"+
						"최저 기온"+x.main.temp_min+"<br>"+
						"체감 온도"+x.main.feels_like+"<br>"+
						"구름"+x.clouds.all+"<br>")
			}
			
		})
		})//b4
	})
</script>
</head>
<body>
수정할 게시물 번호: <input id="bbsno" value="2">
수정할 내용: <input id="content" value="안녕">
<button id="b2">bbs 수정</button><br>
삭제할 게시물 번호: <input id="bbsno2" value="20">
<button id="b3">bbs 삭제</button><br>
<button id="b4">날씨 불러오기</button><br>


<hr color="red">
<div id="result"></div>
</body>
</html>