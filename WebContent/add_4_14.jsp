<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Account</title>
</head>
<body>
<s:label>Add Accout</s:label>
<s:form action="add_4_14">
	<table border="1">
		<tr>
			<s:textfield name="name" label="Name"></s:textfield>
		</tr>
		<tr>
			<s:textfield name="user" label="User"/>
		</tr>
		<tr>
			<s:password name="password" label="Password"/>
		</tr>
		<tr>
			<s:textfield name="address" label="Address"/>
		</tr>
		<tr>
			<s:textfield name="tel" label="Tel"/>
		</tr>
		<tr>
			<s:radio list="#{1:'M',0:'F'}" name="sex" label="Sex"/>
		</tr>
		<tr>
			<s:checkboxlist list="#{1:'Sport',2:'Movie',3:'Music',4:'Game' }" name="interest" label="Interest"/>
		</tr>
		<tr>
			<s:textarea name="remark" label="Remark"/>
		</tr>
		<tr>
			<s:submit name="Add"/>
		</tr>
	</table>
</s:form>
</body>
</html>