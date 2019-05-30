<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body bgcolor="#00A6EE">
<center>
	<s:form action="login_4_14">
	<table border=1>
		<tr>
		<s:textfield name="member.user" key="user"/></tr>
		<tr>
		<s:password name="member.password" key="password"/></tr>
		<tr>
		<s:submit value="Go"/></tr>
		<tr>
		<s:reset value="重設"/></tr>
		<tr><td>
		<a href="add_4_14.jsp">Add Account</a></td></tr>
	</table>	
	</s:form>
</center>	
</body>
</html>