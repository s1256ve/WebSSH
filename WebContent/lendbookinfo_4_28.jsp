<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta charset="UTF-8">
<title>Lend Book Info</title>
<style>
	.font1{font-size:13px;}
</style>
</head>
<body>
	<table border="1" width="599" cellspacing="1" class="font1">
		<tr bgcolor="#E9EDF5">
			<td>Book Info</td>
		</tr>
		<tr>
			<td height="400" valign="top"><br>
				<s:if test="#request.onebook==null">
				<table class="font1">
					<tr>
						<td width="100">ISBN:</td>
						<td><s:textfield name="book.ISBN" value=""/></td>
						<td width="100">Price:</td>
						<td><s:textfield name="book.price" value="" onblur="check(this)"/></td>
					</tr>
					<tr>
						<td width="100">Book Name:</td>
						<td><s:textfield name="book.bookName" value=""/></td>
						<td width="100">Count:</td>
						<td><s:textfield name="book.cnum" value="" onblur="check(this)"/></td>
					</tr>
					<tr>
						<td width="100">Publish:</td>
						<td><s:textfield name="book.publisher" value=""/></td>
						<td width="100">Number of book:</td>
						<td><s:textfield name="book.snum" value="" disabled="true"/></td>
					</tr>
					<tr>
						<td width="100">Author:</td>
						<td><s:textfield name="book.author" value=""/></td>
					</tr>
					<tr>
						<td valign="top">Summary:</td>
						<td><s:textarea cols="20" rows="6" value="" name="book.summary"/></td>
						<td colspan="2" align="center">
							<img id="image" src="" width="100" height="120"/>
						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td colspan="1" align="right">Picture:</td>
						<td colspan="2">
							<s:file name="photo" accept="image/*" onchange="document.all['image'].src=this.value;"/>
						</td>
					</tr>
					<tr>
						<td colspan="4" align="center">
							<font color="red"><s:property value="message"/></font>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<font color="red"><s:fielderror/></font>
						</td>
					</tr>
				</table>
				</s:if>
				<s:else>
				<s:set var="onebook" value="#request.onebook"/>
				<table>
					<tr>
						<td width="100">ISBN:</td>
						<td>
							<input type="text" value="<s:property value="#onebook.ISBN"/>" name="book.ISBN" readonly/>
						</td>
						<td width="100">Price:</td>
						<td>
							<input type="text" value="<s:property value="#onebook.price"/>" name="book.price" onblur="check(this)"/>
						</td>
					</tr>
					<tr>
						<td width="100">Book Name:</td>
						<td>
							<input type="text" value="<s:property value="#onebook.bookName"/>" name="book.bookName"/>
						</td>
						<td width="100">Count:</td>
						<td>
							<input type="text" value="<s:property value="#onebook.cnum"/>" name="book.cnum" onblur="check(this)"/>
						</td>
					</tr>
					<tr>
						<td width="100">Publish:</td>
						<td>
							<input type="text" value="<s:property value="#onebook.publisher"/>" name="book.publisher"/>
						</td>
						<td width="100">Number of book:</td>
						<td>
							<input type="text" value="<s:property value="#onebook.snum"/>" name="book.snum" onblur="check(this)"/>
						</td>
					</tr>
					<tr>
						<td width="100">Author:</td>
						<td>
							<input type="text" value="<s:property value="#onebook.author"/>" name="book.author"/>
						</td>
					</tr>
					<tr>
						<td valign="top">Summary:</td>
						<td>
							<textarea rows="6" cols="20" name="book.summary">
								<s:property value="#onebook.summary"/>
							</textarea>
						</td>
						<td colspan="2" align="center">
							<img id="image" src="getImage.action?book.ISBN=<s:property value="#onebook.ISBN"/>" width="100" height="120">
						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td colspan="1" align="right">Picture:</td>
						<td colspan="2">
							<s:file name="photo"  accept="image/*" onchange="document.all['image'].src=this.value;"/>
						</td>
					</tr>
					<tr>
						<td colspan="4" align="center">
							<s:property value="message"/>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<font color="red"><s:fielderror/></font>
						</td>
					</tr>
				</table>
				</s:else>
			</td>
		</tr>
	</table>
</body>
</html>