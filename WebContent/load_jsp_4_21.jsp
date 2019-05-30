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
<s:label>Load Accout(jsp)</s:label>
<s:form  action="success_load_jsp_4_21.jsp">
	<table border="1">
		<tr>
			<s:textfield name="id" label="id"/>
		</tr>
		
		<tr>
			<s:submit name="load" value="load"/>
		</tr>
	</table>
</s:form>
</body>
</html>