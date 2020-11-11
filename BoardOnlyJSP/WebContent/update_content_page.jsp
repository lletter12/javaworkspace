<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String c_no = request.getParameter("c_no");
	
	//DB 연동 Select
	String query = "SELECT * FROM JSP_CONTENT, JSP_MEMBER WHERE jsp_content.m_no = jsp_member.m_no AND jsp_content.c_no = " + c_no;
	System.out.println("[테스트 실행될 쿼리]" + query);
	
	//라이브러리 동적 모드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//접속
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"scott","tiger");
		
	//실행기 뽑아 오기??
	Statement stm =  conn.createStatement();
	
	//실행
	ResultSet rs = stm.executeQuery(query);
	
	//로직
	String writer_no = null;
	String writer_nick = null;
	String title = null;
	String content = null;
	String writedate= null;
	
	if(rs.next()){
		writer_no = rs.getString("m_no");
		writer_nick = rs.getString("m_nick");
		title = rs.getString("c_title");
		content = rs.getString("c_content");
		writedate = rs.getString("c_writedate");
	}
	
	//클로징	
	rs.close();
	stm.close();
	conn.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글 수정</h1>
	<form action="./update_content_process.jsp" method="post">
	작성자 : <%=writer_nick %><br>
	제목 : <input name="title" type="text" value="<%=title%>">
	내용 : <br>
	<textarea name="content" rows="10" cols="40"><%=content %></textarea>
	<input name="c_no" value="<%=c_no %>" type="hidden">
	<br>
	<input type="submit" value="글 수정">
	</form>
</body>
</html>