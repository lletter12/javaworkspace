<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

<head>

<title>Rubato Login</title>

</head>

<body>

 <!-- 네비게이션  -->

 <nav class="navbar navbar-default">

  <div class="navbar-header">

   <button type="button" class="navbar-toggle collapsed" 

    data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"

    aria-expaned="false">

     <span class="icon-bar"></span>

     <span class="icon-bar"></span>

     <span class="icon-bar"></span>

    </button>

    <a class="navbar-brand" href="main.jsp">JSP Board</a>

  </div>

  <div class="collapse navbar-collapse" id="#bs-example-navbar-collapse-1">

   <ul class="nav navbar-nav">

    <li><a href="main.jsp">Main</a></li>

    <li><a href="bbs.jsp">Board</a></li>

   </ul>

    

   <ul class="nav navbar-nav navbar-right">

    <li class="dropdown">

     <a href="#" class="dropdown-toggle"

      data-toggle="dropdown" role="button" aria-haspopup="true"

      aria-expanded="false">Connect<span class="caret"></span></a>

     <ul class="dropdown-menu">

      <li class="active"><a href="login.jsp">Login</a></li>

      <li><a href="join.jsp">Join</a></li>

      

     </ul>

    </li>

   </ul>

  </div> 

 </nav>

 <!-- 로긴폼 -->

 <div class="container">

  <div class="col-lg-4"></div>

  <div class="col-lg-4">

  <!-- 점보트론 -->

   <div class="jumbotron" style="padding-top: 20px;">

   <!-- 로그인 정보를 숨기면서 전송post -->

   <form method="post" action="loginAction.jsp">

    <h3 style="text-align: center;">Logo</h3>

    <div class="form-group">

     <input type="text" class="form-control" placeholder="ID" name="userID" maxlength="20">

    </div>

       

    <div class="form-group">

     <input type="password" class="form-control" placeholder="PW" name="userPassword" maxlength="20">

    </div>

    <input type="submit" class="btn btn-primary form-control" value="Login">

    

    

   </form>

  </div>

 </div>

</div>

 

 

 <!-- 애니매이션 담당 JQUERY -->

 <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script> 

<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

 

</body>

</html>