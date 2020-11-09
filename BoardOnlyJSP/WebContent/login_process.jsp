<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	//DB 연동 SELECT ....
	String query = "SELECT * FROM JSP_MEMBER WHERE m_id = '"+id+"' AND m_pw = '"+pw+"'";
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
	
	//로직 next는 return값이 true or false
	if(rs.next()){
		//로그인 성공...
		
		//중요한 코드 추가되야 됨
		
		response.sendRedirect("./main_page.jsp");
	}else{
		//로그인 실패...
		response.sendRedirect("./login_fail.jsp");
	}
	
	//클로징
	rs.close();
	stm.close();
	conn.close();
%>    