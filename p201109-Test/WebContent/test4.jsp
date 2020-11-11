<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "java.util.*" %>

<%
	int a = 10;
	out.println(a);
	this.test();
%>

<%! 
	private int b = 20;
	public void test(){
		System.out.println("!!!!");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 반갑습니다 -->
	<%
		//out.println("반갑습니다");
	
	%>
	
	<%--반갑습니다.12312321 --%>

	<%
		out.println(a);
		out.println(c);
	%>
	
	<%! /*멤버선언*/
		int c =20;
	%>
	
	<%=a%>
	<%="안녕하세요" + a%>
	
	<%
		Scanner scn = null;
	%>
	
	
	
</body>
</html>