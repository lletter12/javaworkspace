<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시판</h1>
<%
	String sessionNick = (String)(session.getAttribute("sessionNick"));
	String sessionNo = (String)(session.getAttribute("sessionNo"));

	if(sessionNick != null){
		out.println(sessionNick + "님 환영합니다.");
		out.println("<a href='./logout_process.jsp'>로그아웃</a>");
	}else {
		out.println("비회원으로 접근하였습니다.");
		out.println("<a href='./login_page.jsp'>로그인</a>");
	}
%>
	<table border="1">
	<tr><td>글번호</td><td>제목</td><td>작성자</td><td>작성일</td></tr>
<%
	//DB 연동 Select
	String query = "SELECT * FROM JSP_CONTENT, JSP_MEMBER WHERE jsp_content.m_no = jsp_member.m_no ORDER BY jsp_content.c_no DESC";
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
	while(rs.next()){
		String c_no = rs.getString("c_no");
		String c_title = rs.getString("c_title");
		String m_nick = rs.getString("m_nick");
		String c_writedate = rs.getString("c_writedate");
		
		out.print("<tr>");
		out.print("<td>" + c_no + "</td>");
		out.print("<td><a href='./read_content_page.jsp?c_no="+c_no+"'>" + c_title + "</td>");
		out.print("<td>" + m_nick + "</td>");
		out.print("<td>" + c_writedate + "</td>");
		out.println("</tr>");
	}
	
	
	//클로징	
	rs.close();
	stm.close();
	conn.close();
%>	

	</table>
	
<%
	if(sessionNo != null){
		out.println("<a href='./write_content_page.jsp'>글쓰기</a>");
	}
	
%>	
		
</body>
</html>