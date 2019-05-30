<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Welcome!<br>EL:
Your name:${l.getName()}<br>
Your password:${l.getPassword()}<br>
set:
<s:set var="login" value="#session['l']"/>
name:<s:property value="login.name"/><br>
password:<s:property value="login.password"/><br>
</body>
</html>