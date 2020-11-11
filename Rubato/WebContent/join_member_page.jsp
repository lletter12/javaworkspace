<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/common.css">
<link rel="stylesheet" type="text/css" href="css/header.css">
<link rel="stylesheet" type="text/css" href="css/footer.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>
	<div id="wrapper">
	<header>
		<a href="index.html"><img id="logo" src="img/logo.png"></a>
	</header>
	<section id="body">
		<div id="body1">
			<div id="join">
			<ul><li>회원가입</li></ul>
			</div>
			<form action="./join_member_process.jsp" method="post">
			<div>
				<ul>
				<li>ID : <input name="id" type="text"></li>
				<li>PW : <input name="pw" type="password"></li>
				<li>NICK : <input name="nick" type="text"></li>
				<li>PHONE : <input name="phone" type="text"></li>
				</ul>
			</div>
			<input type="submit" value="회원가입">
			</form>
		</div>
		
	</section>
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
	</div>
</body>
</html>