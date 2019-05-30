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
	<s:form action="addBook_5_12">
		<s:textfield name="ISBN" label="ISBN"/>
		<s:textfield name="bookName" label="bookName"/>
		<s:textfield name="author" label="author"/>
		<s:textfield name="publisher" label="publisher"/>
		<s:textfield name="price" label="price"/>
		<s:textfield name="cnum" label="cnum"/>
		<s:textfield name="snum" label="snum"/>
		<s:textfield name="summary" label="summary"/>
		<s:submit name="Add"/>
	</s:form>
</body>
</html>