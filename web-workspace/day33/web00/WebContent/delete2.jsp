<%@page import="javax.net.ssl.HttpsURLConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야 함.==> 자바로 짜야함. -->
    <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
    <%
    //자바코드 넣는 부분!!
   	//HttpServletRequest request = new HttpServletRequest();
    //tomcat은 미리 reqeust를 만들어서 내장시켜놨어요! 
    String no = request.getParameter("no"); //"apple"
   
    
    %>
    <!-- 3. 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: lime;
}
</style>
</head>
<body>
게시글 삭제 요청되었음.
<hr color="red">
삭제할 게시글no : <%=no %> <br>


</body>
</html>