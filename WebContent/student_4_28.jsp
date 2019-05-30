<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>
<table bgcolor="#71CABF" align="center">
		<tr>
			<td colspan="2"><jsp:include page="head_s_4_28.jsp"/></td>
		</tr>
		<tr>
			<td height="400"></td>
		</tr>
		
		<tr>
			<td align="center">
				<font color="red"><s:fielderror/><s:property value="message"/></font>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<font size="2">sveabc.thisistap.com</font>
			</td>
		</tr>
	</table>
</body>
</html>