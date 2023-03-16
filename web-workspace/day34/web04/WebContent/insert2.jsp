<%@page import="multi.Bbs_DAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

    String title = request.getParameter("title"); 
    String content = request.getParameter("content"); 
    String writer = request.getParameter("writer"); 
    
    //1.받은 데이터를 dao에 주기위해 가방을 만들어서 넣는다
    BbsVO bag = new BbsVO();
    bag.setTitle(title);
    bag.setContent(content);
    bag.setWriter(writer);
    
    //2.dao에게 가방을 전달하면서 insert 요청
    Bbs_DAO dao = new Bbs_DAO();
    dao.insert(bag);
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background: #037BFC;
}
</style>
</head>
<body>
글쓰기 전송 요청되었음.
<hr color="red">
제목: <%= title %><br>
내용: <%= content %><br>
작성자: <%= writer %><br>
</body>
</html>