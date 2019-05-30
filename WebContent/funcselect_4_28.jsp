<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta charset="UTF-8">
<title>FuncSelect</title>
</head>
<body>
	<table border="1" width="200" cellspacing=1 class="font1">
		<tr bgcolor="#E9EDF5">
			<td>FuncSelect</td>
		</tr>
		<tr>
			<td align="center" valign="top" height="400">
				<br><s:submit value="Add Book" method="addBook"/><br>
				<br><s:submit value="Delete Book" method="deleteBook"/><br>
				<br><s:submit value="Update Book" method="updateBook"/><br>
				<br><s:submit value="Search Book" method="selectBook"/>
			</td>
		</tr>
	</table>
</body>
</html>