<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Taxing</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" scr="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>

<%
						String userName = (String) request.getAttribute("userName");
						String userPassword = (String) request.getAttribute("userPassword");
						String name = "";
						String password = "";
						if(userName == null || userName.equals("")){
							userName = "";
							name = "用户名／email";
						}
						else if(userName.equals("用户名不可为空")){
							name = userName;
							userName = "";
						}
						else if(userName.equals("用户名应大于2个字符")){
							name = userName;
							userName = "";
						}						
						else{
							name = "";
						}
						
						if(userPassword == null || userPassword.equals("")){
							userPassword = "";
							password = "密码";
						}
						else if(userPassword.equals("密码不可为空")){
							password = userPassword;
							userPassword = "";
						}
						else if(userPassword.equals("密码应大于2个字符")){
							password = userPassword;
							userPassword = "";
						}
						else{
							password = "";
						}	
					%>
</head>
<body>
	<!-- ------------------------导航栏开始--------------------- -->
	<nav class="nav navbar-default navbar-fixed-top" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<button class="navbar-toggle" data-toggle="collapase"
				data-target=".navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<img src="image/logo.png" height="50" width="200" alt=""
				style="margin-right: 35px; left: 0;">
		</div>

		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">首页</a></li>
				<li><a href="#">跳转1</a></li>
				<li><a href="#">跳转2</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">跳转3sub <span class="caret"></span></a>
					<ul class="bs-menu dropdown-menu">
						<li class="dropdown-submenu"><a href="#">程序员1</a>
							<ul class="bs-submenu dropdown-menu">
								<li><a href="#">程序员1_1</a></li>
								<li><a href="#">程序员1_2</a></li>
								<li><a href="#">程序员1_3</a></li>
							</ul></li>
						<li class="divider"></li>
						<li><a href="#">程序员2</a></li>
					</ul></li>
			</ul>

			<div class="navbar-form navbar-right">
				<a href="/myJsp/Controller?action=register" class="navbar-link">注册</a>
				<input type="text" class="form-control" placeholder="请输入搜索关键字"
					name="searchContent">
				<button href="/myJsp/Controller?action=search"
					class="btn btn-primary">搜索</button>
			</div>
		</div>
	</div>
	</nav>
	<!-- ------------------------导航栏结束--------------------- -->

	<div style="height: 50px;"></div>

	<!-- ------------------------用户登录开始--------------------- -->
	<div class="container">
		<h1 class="page-header">
			<span class="glyphicon glyphicon-user"></span>用户登录
		</h1>
		<form action="/myJsp/Controller" class="form-horizontal" method="post">
			<div class="form-group">
				<div class="col-sm-5">

					<input type="text" class="form-control" placeholder=<%=name%>
						name="userName" value=<%=userName%>>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-5">
					<input type="password" class="form-control"
						placeholder=<%=password%> name="userPassword"
						value=<%=userPassword%>>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-5">
					<button class="submit" name="action" value="userLogin">登录</button>
					<button class="submit" name="action" value="register">注册</button>
				</div>
			</div>
		</form>
	</div>
	<!-- ------------------------用户登录--------------------- -->

	<div style="height: 100px;"></div>

</body>
</html>