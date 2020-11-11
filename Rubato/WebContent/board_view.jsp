<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head> 
<meta charset="utf-8">
<title>클래식기타 커뮤니티</title>
<link rel="stylesheet" type="text/css" href="css/common.css">
<link rel="stylesheet" type="text/css" href="css/header.css">
<link rel="stylesheet" type="text/css" href="css/footer.css">
<link rel="stylesheet" type="text/css" href="css/board_left.css">
<link rel="stylesheet" type="text/css" href="css/board_view_main.css">
</head>
<body>
<div id="wrap">
<header>
  <a href="index.html"><img id="logo" src="img/logo.png"></a>
<nav id="top_menu">
  HOME | LOGIN | JOIN | NOTICE
</nav>
<nav id="main_menu">
  <ul>
    <li><a href="board_list.html">자유 게시판</a></li>
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
  <nav id="sub_menu">
    <ul>
      <li><a href="board_list.html">+ 자유 게시판</a></li>
      <li><a href="#">+ 방명록</a></li>
      <li><a href="#">+ 공지사항</a></li>
      <li><a href="#">+ 등업요청</a></li>
      <li><a href="#">+ 포토갤러리</a></li>
    </ul>
  </nav>
  <article id="sub_banner">
    <ul>
      <li><img src="img/banner1.png"></li>
      <li><img src="img/banner2.png"></li>		
      <li><img src="img/banner3.png"></li>
    </ul>	
  </article>
</aside> 

<section id="main">
  <img src="img/comm.gif">
  <h2 id="board_title">자유 게시판 </h2>
  <div id="view_title_box"> 
    <span>까스통님의 선물인 보드카가 정말 독하네요!!!</span>
    <span id="info">루바토 | 조회 : 208 | 2016-04-28 (09:20)</span>
  </div>	
  <p id="view_content">
    까스통님 고맙습니다. <br>
    까스통님 고맙습니다. <br>
    까스통님 고맙습니다. <br>
    까스통님 고맙습니다. <br>
    까스통님 고맙습니다. <br>
  </p>		
  <div id="comment_box">
    <img id="title_comment" src="img/title_comment.gif">
    <textarea></textarea>
    <img id="ok_ripple" src="img/ok_ripple.gif">
  </div>


	<div id="buttons">
    <a href="./board_delete_process.jsp"><img src="img/delete.png"></a>		
    <a href="./board_list.jsp"><img src="img/list.png"></a>
    <a href="./board_write.jsp"><img src="img/write.png"></a>			
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
