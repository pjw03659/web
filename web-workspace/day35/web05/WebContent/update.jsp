<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@page import="javax.net.ssl.HttpsURLConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야 함.==> 자바로 짜야함. -->
    <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
    <%
    String id = request.getParameter("id"); //"apple"
    String tel = request.getParameter("tel"); //"010"   
    
    MemberVO bag = new MemberVO();
    bag.setId(id);
    bag.setTel(tel);
    
    MemberDAO3 dao = new MemberDAO3();
    dao.update(bag);
    
    
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
회원수정 요청되었음.
<hr color="red">
수정할 id : <%=id %> <br>
수정할 tel : <%=tel %> <br>

</body>
</html>