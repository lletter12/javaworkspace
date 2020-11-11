<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<%
	request.setCharacterEncoding("utf-8");
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	//DB 연동 SELECT ....
	String query = "SELECT * FROM RUBATO_MEMBER WHERE m_id = '"+id+"' AND m_pw = '"+pw+"'";
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
		String m_no = rs.getString("m_no");
		String m_nick = rs.getString("m_nick");
		
		//의도: 유지가 되어야 될 정보가 메모리에 존재해야된다(지속되어야한다)
		session.setAttribute("sessionNo", m_no);
		session.setAttribute("sessionNick", m_nick);
		
		response.sendRedirect("./index.jsp");
	}else{
		//로그인 실패...
		response.sendRedirect("./login_fail.jsp");
	}
	
	//클로징
	rs.close();
	stm.close();
	conn.close();
%>    