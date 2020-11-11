<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    

<!DOCTYPE html>
<html>
<head> 
<meta charset="utf-8">
<title>rubato클래식기타 커뮤니티</title>
  <link rel="stylesheet" type="text/css" href="css/common.css">
  <link rel="stylesheet" type="text/css" href="css/header.css">
  <link rel="stylesheet" type="text/css" href="css/footer.css">
  <link rel="stylesheet" type="text/css" href="css/board_left.css">
  <link rel="stylesheet" type="text/css" href="css/board_list_main.css">
</head>
<body>
<div id="wrap">
<header>
  <a href="index.jsp"><img id="logo" src="img/logo.png"></a>
<nav id="top_menu">
  HOME | LOGIN | JOIN | NOTICE
</nav>
<nav id="main_menu">
  <ul>
    <li><a href="board_list.jsp">자유 게시판</a></li>
    <li><a href="#">기타 연주</a></li>
    <li><a href="#">공동 구매</a></li>
    <li><a href="#">연주회 안내</a></li>
    <li><a href="#">회원 게시판</a></li>
  </ul>
</nav>
</header> <!-- header -->
<aside>
  <article id="login_box">
    <%
	String sessionNick = (String)(session.getAttribute("sessionNick"));
	String sessionNo = (String)(session.getAttribute("sessionNo"));

	if(sessionNick == null){
%> 		
    <img id="login_title" src="img/ttl_login.png">
    <form action="./login.process.jsp" method="post">
    <div id="input_button">
    <ul id="login_input">
      <li><input type="text" name="id"></li>
      <li><input type="password" name="pw"></li>
    </ul>
    <input type="image" id="login_btn" src="img/btn_login.gif">
    </div>
    </form>
    <div class="clear"></div>
    <div id="join_search">
      <a href ="join_member_page.jsp"><input type="image" id="join_btn" src="img/btn_join.gif"></a>
      <input type="image" id="search_btn" src="img/btn_search.gif">
    </div>
<% }else { 
	
%>
	<div><%=sessionNick %> 님 환영합니다.</div>
	<div><a href='./logout_process.jsp'>로그아웃</a></div>
		
<%		
	}
%>	
	 
  </article>
</aside>
  <section id="main">
    <img src="img/comm.gif">
    <h2 id="board_title">자유 게시판 </h2>
    <div id="total_search">
      <div id="total">▷ 총 개의 게시물이 있습니다.</div>
      <div id="search">
        <div id="select_img"><img src="img/select_search.gif"></div>
        <div id="search_select">
          <select>
            <option>제목</option>
            <option>내용</option>
            <option>글쓴이</option>
          </select> 
        </div>
        <div id="search_input"><input type="text"></div>
        <div id="search_btn"><img src="img/search_button.gif"></div>
      </div>
    </div>

<%

	String query = "SELECT * FROM RUBATO_CONTENT, RUBATO_MEMBER WHERE RUBATO_content.m_no = RUBATO_member.m_no ORDER BY RUBATO_content.c_no DESC";
	System.out.println("[테스트 실행될 쿼리]" + query);
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url,"scott","tiger");
		
	Statement stm = conn.createStatement();
	
	ResultSet rs = stm.executeQuery(query);
	
	while(rs.next()){
	String c_no = rs.getString("c_no");
	String c_title = rs.getString("c_title");
	String m_nick = rs.getString("m_nick");
	String c_writedate = rs.getString("c_writedate");
	String c_count = rs.getString("c_count");
	
%>
    <table>
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>글쓴이</th>
        <th>일시</th>
        <th>조회수</th>
      </tr>    
      <tr>
        <td class="col1"><%=c_no %></td>
        <td class="col2">
          <a href="board_view.jsp"><%=c_title %></a>
        </td>
        <td class="col3"><%=m_nick %></td>
        <td class="col4"><%=c_writedate %></td>
        <td class="col5"><%=c_count %></td>
      </tr>

    </table>
    <div id="buttons">
      <div class="col1">◀ 이전 1 다음 ▶</div>
      <div class="col2">
        <img src="img/list.png">
        <%} %>
       <% if(sessionNo != null){%> 
        <a href="board_write.jsp"><img src="img/write.png"></a>
        <%} %>
      </div>
    </div>
  </section> <!-- section main -->
  <div class="clear"></div>

  <footer>
    <img id="footer_logo" src="img/footer_logo.gif">
    <ul id="address">
      <li>서울시 강남구 삼성동 1234 우 : 123-1234</li>  
      <li>TEL : 031-123-1234  Email : email@domain.com</li>
      <li>COPYRIGHT (C) 루바토 ALL RIGHTS RESERVED</li>
    </ul>
    <ul id="footer_sns">
      <li><img src="img/facebook.gif"></li>  
      <li><img src="img/blog.gif"></li>
      <li><img src="img/twitter.gif"></li>
    </ul>
  </footer> <!-- footer -->
</div> <!-- wrap -->
</body>
</html>
<%
rs.close();
stm.close();
conn.close();
%>
