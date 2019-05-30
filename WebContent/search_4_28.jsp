<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
<style>
	.font1{font-size:13px;}
</style>
</head>
<body>
	<s:form action="selectBook" method="post" theme="simple">
		<table border="1" width="200" cellspacing=1 class="font1">
			<tr bgcolor="#E9EDF5">
				<td>Book Select</td>
			</tr>
			<tr>
				<td align="left" valign="top" height="400">
					<br>Book Id：<br><br>
					<s:textfield name="lend.readerId" size="15"/>
					<s:submit value="Search"/>
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>