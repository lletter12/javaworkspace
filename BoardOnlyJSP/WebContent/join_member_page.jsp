<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="./join_member_process.jsp" method="post">
		ID : <input name="id" type="text"><br>
		PW : <input name="pw" type="password"><br>
		Nick : <input name="nick" type="text"><br>
		phone : <input name="phone" type="text"><br>
		<input type="submit" value="회원가입">
	</form>
	
</body>
</html>