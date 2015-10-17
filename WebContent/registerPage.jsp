<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Taxing</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" scr="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<%
	String userName = (String) request.getAttribute("userName");
	String userPassword = (String) request.getAttribute("userPassword");
	String name = "";
	String password = "";
	if (userName == null || userName.equals("")) {
		userName = "";
		name = "用户名／email";
	} else if (userName.equals("用户名不可为空")) {
		name = userName;
		userName = "";
	} else if (userName.equals("用户名应大于2个字符")) {
		name = userName;
		userName = "";
	} else {
		name = "";
	}

	if (userPassword == null || userPassword.equals("")) {
		userPassword = "";
		password = "密码";
	} else if (userPassword.equals("密码不可为空")) {
		password = userPassword;
		userPassword = "";
	} else if (userPassword.equals("密码应大于2个字符")) {
		password = userPassword;
		userPassword = "";
	} else {
		password = "";
	}
%>
</head>
<body>
	<form action="/myJsp/Controller" method="post">
		<a href="/myJsp/Controller?action=backtohomepage" class="navbar-link">返回首页</a>
		<br /> 请输入用户名和密码： <br /> 姓名: <input type="text" placeholder=<%=name%>
			name="userName" value=<%=userName%>> <br /> 密码: <input
			type="text" placeholder=<%=password%> name="userPassword"
			value=<%=userPassword%>> <br />
		<button class="submit" name="action" value="registerSubmit">提交</button>
		<button class="submit" name="action" value="registerReset">重置</button>
	</form>
</body>
</html>