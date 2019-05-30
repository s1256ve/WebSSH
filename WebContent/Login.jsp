<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#00A6EE">
	<s:form action="login">
		<s:textfield name="login.name" key="name"/>
		<s:password name="login.password" key="password"/>
		<s:submit value="Go"/>
		<s:reset value="重設"/>
	</s:form>
</body>
</html>