<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%
	request.setCharacterEncoding("utf-8");
	String c_no = request.getParameter("c_no");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	//DB 연동 INSERT(update,dlete)
		String query = "UPDATE JSP_CONTENT SET c_title='"+title+"', c_content='"+content+"' WHERE c_no=" + c_no;
		System.out.println("[테스트 실행될 쿼리]" + query);
		
		//라이브러리 동적 모드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//접속
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url,"scott","tiger");
		
		//실행기 뽑아 오기??
		Statement stm =  conn.createStatement();
		
		//실행
		stm.executeQuery(query);
		
		//클로징
		stm.close();
		conn.close();
		
		response.sendRedirect("./main_page.jsp");
%>