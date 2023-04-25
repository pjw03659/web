<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<table class= "table table-striped" style= "width : 1000px ; margin: 0 auto; ">
<tr>
	<td class="top">번호</td>
	<td class="top">제목</td>
	<td class="top">작성자</td>
	<td class="top">등록일</td>
	<td class="top">조회수</td>
</tr>
<c:forEach items="${list}" var="bag" >
<tr>
	<td class="down">${bag.no}</td>
	<td class="down">
		<a href="one2.multi?no=${bag.no}">${bag.title}</a>
	</td>
	<td class="down">${bag.mem_id}</td>
	<td class="down">${bag.date}</td>
	<td class="down">${bag.view}</td>
</tr> 
</c:forEach>
</table>
