<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a = (int)(Math.random()*10);
	if(a > 5){
		out.println("안녕하세요");
	}else{
		out.println("반갑습니다");
	}
%>	
</body>
</html>