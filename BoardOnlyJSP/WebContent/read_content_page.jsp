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
			content = content.replace("\n", "<br>");
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
	<h1>게시글 보기</h1>
	작성자 : <%=writer_nick %><br>
	작성일 : <%=writedate %><br>
	제목 : <%=title %><br>
	내용 : <br>
	<%=content %>
	<br><br>
	<a href="./main_page.jsp">목록으로</a>
<%
	String sessionNo = (String)session.getAttribute("sessionNo");
	if(sessionNo != null && sessionNo.equals(writer_no)){
		out.println("<a href='./delete_content_process.jsp?c_no="+c_no+"'>삭제</a>");
		out.println("<a href='./update_content_page.jsp?c_no="+c_no+"'>수정</a>");
	}
%>
	
</body>
</html>