<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sessionNick = (String)(session.getAttribute("sessionNick"));
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글쓰기</h1>
	<form action="./write_content_process.jsp" method="post">
	작성자 : <%=sessionNick %><br>
	제목 : <input name="title" type="text"><br>
	<textarea name="content" rows="10" cols="40"></textarea>
	<br>
	<input type="submit" value="글 작성">
	</form>
	
	
</body>
</html>