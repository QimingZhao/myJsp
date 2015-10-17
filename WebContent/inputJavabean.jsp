<%@page import="myJsp.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Taxing</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" scr="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<%	
	request.setCharacterEncoding("UTF-8");	
    User myUser = (User) request.getAttribute("myUser");
    String downloadPdfUrl = "/pdfPage.html";
    
   /*  System.out.println("userName = " + myUser.getUserName());
	System.out.println("userPassword = " + myUser.getUserPassword());
	System.out.println("firstName = " + myUser.getFirstName());
	System.out.println("lastName = " + myUser.getLastName()); */
%>
<jsp:useBean id="simple" scope="page" class="myJsp.SimpleBean" />
<jsp:setProperty name="simple" property="*" />
</head>
<body>
	<h3>
		用户名:
		<%=myUser.getUserName()%></h3>
	<br />
	<h3>
		姓名:
		<%=myUser.getFirstName()%>
		<%=myUser.getLastName()%></h3>
	<br />
	<h3>
		1040表格已生成（下载链接）:   <a href="/myJsp/Controller?action=getDownloadPdfUrl"
			class="navbar-link" name="downloadPdfUrl" value=<%=downloadPdfUrl%>>点击查看
		</a> <br /> <br />
		<h3>谢谢使用！</h3>
</body>
</html>