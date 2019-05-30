<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*,java.lang.*" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Welcome User:${m.getUser()}<br>
Detail<br>
-----------------------------------------<br>
User:${m.getUser()}<br>
Name:${m.getName()}<br>
Password:${m.getPassword()}<br>
Address:${m.getAddress()}<br>
Tel:${m.getTel()}<br>
Sex:${m.getSex()}<br>
Interest:${m.getInterest()}<br>
<c:forEach var="i" items="${m.getInterest()}">
	${i},
</c:forEach><br>
Remark:${m.getRemark()}<br>
</body>
</html>