<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%
	request.setCharacterEncoding("utf-8");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String sessionNo = (String)(session.getAttribute("sessionNo"));
	
	//DB 연동 INSERT(update,dlete)
	String query = "INSERT INTO JSP_CONTENT VALUES(JSP_CONTENT_seq.nextval,"+sessionNo+",'"+title+"','"+content+"',SYSDATE)";
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
	
	//리다이렉트
	response.sendRedirect("./board_list.jsp");
%>
