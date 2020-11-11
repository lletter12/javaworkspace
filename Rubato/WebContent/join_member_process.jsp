<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");	

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String nick = request.getParameter("nick");
	String phone = request.getParameter("phone");
	
	System.out.println("[테스트]" + id);
	System.out.println("[테스트]" + pw);
	System.out.println("[테스트]" + nick);
	System.out.println("[테스트]" + phone);
	
	//DB 연동 INSERT(update,dlete)
	
	String query = "INSERT INTO RUBATO_MEMBER VALUES(RUBATO_MEMBER_seq.nextval,'"+id+"','"+pw+"','"+nick+"','"+phone+"',SYSDATE)";
	System.out.println("[테스트 실행될 쿼리]" + query);
	
	//라이브러리 동적 모드
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//접속
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url,"scott","tiger");
	
	//실행기 뽑아 오기??
	Statement stm =  conn.createStatement();
	
	//실행
	stm.executeUpdate(query);
	
	//클로징
	stm.close();
	conn.close();
	
	//리다이렉트
	//조의사항 - 아래코드 이후 html코드가 없어야 한다.
	response.sendRedirect("./join_member_complete.jsp");
%>