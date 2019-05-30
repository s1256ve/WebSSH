<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookManage</title>
<style>
	.font1{font-size:13px;}
</style>
<script language="javascript">
function check(thisObject){
	var sTmp="";
	sTmp=thisObject.value;
	if(isNaN(sTmp)){
		alert("Please enter number");
		thisObject.select();
	}
}
</script>
</head>
<body bgcolor="#71CABF">
<table bgcolor=#71CABF align="center" class="font1">
		<tr>
			<td colspan="2"><jsp:include page="head_4_28.jsp"/></td>
		</tr>
		<tr>
			<s:form theme="simple" action="book" method="post" enctype="multipart/form-data" validate="true">
			<td><jsp:include page="funcselect_4_28.jsp"/></td>
			<td><jsp:include page="lendbookinfo_4_28.jsp"/></td>
			</s:form>
		</tr>
		<tr>
			<td colspan="2" align="center">
				sveabc.thisistap.com
			</td>
		</tr>
	</table>
</body>
</html>