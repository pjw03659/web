<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    //입력한값 받아오기.
    String tel =request.getParameter("tel");
    String result="";
    String pre =tel.substring(0,3);
    switch(pre){
    case "010":
    	result="100";
    	break;
    case "011":
    	result="111";
    	break;
    default:
    	result="222";
    }
	
    Random r = new Random();
    int post =r.nextInt(900)+100;
    result= result +post;
    
    %><%= result %>