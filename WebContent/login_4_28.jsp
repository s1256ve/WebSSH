<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body bgcolor="#71CABF">
<s:form action="login_4_28" method="post">
	<table align=center>
		
		<tr>
			<td>Name<s:textfield name="name" size="20"/></td>
		</tr>
		<tr>
			<td>Password<s:password name="password" size="21"/></td>
		</tr>
		<tr>
			<td>
				<s:submit value="login"/>
				<s:reset value="Reset"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<font color="red"><s:fielderror/><s:property value="message"/></font>
			</td>
		</tr>
	</table>
</s:form>
</body>
</html>