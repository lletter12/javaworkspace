<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <h1>로그인</h1>
	 <form action="./login_process.jsp" method="post">
		 ID : <input name="id" type = "text"><br>
		 PW : <input name="pw" type = "password"><br>
		 <input type ="submit" value="로그인">
		 <a href="./join_member_page.jsp">회원가입</a>
	 </form>
	 
</body>
</html>