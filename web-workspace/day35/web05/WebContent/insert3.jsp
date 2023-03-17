<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
<%

    /* String id = request.getParameter("id"); 
    String name = request.getParameter("name"); 
    String content = request.getParameter("content"); 
    String price = request.getParameter("price"); 
    String company = request.getParameter("company"); 
    String img = request.getParameter("img");  */
    
    //1.받은 데이터를 dao에 주기위해 가방을 만들어서 넣는다
   /*  ProductVO bag = new ProductVO();
    bag.setId(id);
    bag.setName(name);
    bag.setContent(content);
    bag.setPrice(Integer.parseInt(price));
    bag.setCompany(company);
    bag.setImg(img); */
    
    //2.dao에게 가방을 전달하면서 insert 요청
    ProductDAO dao = new ProductDAO();
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
상품 등록 요청되었음.
<hr color="red">
<img src="img/<%=bag.getImg() %>" width=200 height=200>
</body>
</html>