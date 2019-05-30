<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>css_5_19</title>
<link rel="stylesheet" href="css/css_5_19.css" type="text/css"> 
<!-- 

<style type="text/css">
@import"cs1.css"; 
</style> -->

 <!-- 
<style type="text/css">
a
{
  font-size:30pt;
}
p
{
	font-size:30px;
	color:#00A0E5;
	border: 2px solid black;
	margin-right: 4px; margin-bottom: 4px;
}
.ex2
{
border: 2px solid black;
}
.ex3
{
border: 2px solid black;
}
#d1
{
	font-size:30px;
	color:green;
}
#d2
{
	font-size:30px;
	color:blue;
}
.d1
{
	font-size:30px;
	color:green;
}
.d2
{
	font-size:30px;
	color:blue;
}
.ex
{
	border: 2px solid black;
}
.ex>#d
{
 font-size:30px;
 color:red;
}
</style>
 -->

</head>
<body>
<p>
	Ex1: use tag(&lt;p&gt;)<br>
	123<br>
	456
</p>
<div class="ex2">
Ex2: use id
<div id="d1">id:d1 (green)</div>
<div id="d2">id:d2 (blue)</div>
</div>
<div class="ex3">
Ex3: use class
<div class="d1">class:d1 (green)</div>
<div class="d2">class:d2 (blue)</div>
</div>
<div class="ex">
	Ex: child combinator(this is a div class='ex')
	<div id="d">this is a div id='d'</div>
</div>
</body>
</html>