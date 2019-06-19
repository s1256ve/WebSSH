<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String a="a",A="A";
		request.setAttribute("a", a);
		session.setAttribute("A", A);
		
		List<String> list = new ArrayList<String>();
	      list.add("Max");
	      list.add("Michael");
	      list.add("Scott");
	      list.add("Jeffry");
	      list.add("Joe");
	      request.setAttribute("names", list);
	      
	      Map<String,String> map=new HashMap<String,String>();
	      map.put("a", "1");
	      map.put("b", "2");
	      map.put("c", "3");
	      request.setAttribute("map", map);
	      
	      String ss="String 1";
	      request.setAttribute("ss", ss);
	%>
	<br>&lt;s:property&gt;--------------------------------------------<br>
	<s:property value="#request.a"/>
	<s:property value="#session.A"/><br>
	<br>&lt;s:iterator&gt;(List)--------------------------------------------<br>
	1):<s:iterator value="{'1','2','3','4','5'}">

   		<s:property value='number'/>B

   </s:iterator><br>
   2):<ol>
        <s:iterator value="#request.names" status="stuts">
            <s:if test="#stuts.odd == true">
                <li>White <s:property/></li>
            </s:if>
            <s:else>
                <li style="background-color:cyan"><s:property/></li>
            </s:else>
        </s:iterator>
    </ol><br>
    3): <s:iterator value="{'a','b','c','d','e'}" var='char' status='st'>

     <s:if test="#st.isEven">
   	          現在的索引是奇數為:<s:property value='#attr.st.index'/>

     </s:if>

      	 當前元素值:<s:property value='char'/><br>

   </s:iterator><br>

   <br>&lt;s:iterator&gt;(Map)--------------------------------------------<br>
   
   <s:iterator value="#attr.map" status="st">
        key : <s:property value='key'/>
        value:<s:property value='value'/>
   </s:iterator>
   <br>&lt;s:if/else if/else&gt;(Change ss to get other result)--------------------------------------------<br>
	<s:if test="%{#attr.ss=='String 1'}">
		This is String 1
	</s:if>
	<s:elseif test="%{#attr.ss=='String 2'}">
    	This is String 2
	</s:elseif>
	<s:else>
    	Other Strings
	</s:else>
	<br>&lt;s:select&gt;(Demo)--------------------------------------------<br>
	<s:form action="resultAction" namespace="/">

<h2>
	<s:select label="What's your favor search engine" 
		headerKey="-1" headerValue="Select Search Engines"
		list="searchEngine" 
		name="yourSearchEngine" 
		value="defaultSearchEngine" />
</h2> 

<h2>
	<s:select label="Select a month" 
		headerKey="-1" headerValue="Select Month"
		list="#{'1':'Jan', '2':'Feb', '3':'Mar', '4':'Apr','5':'May'}" 
		name="yourMonth" 
		value="2" />
</h2> 

<s:submit value="submit" name="submit" />
	
</s:form>
<br>info-------------------------------------------------------<br>
list屬性(必設)：必須是一個可以迭代的源，如為一個List, Map, Set等<br> 
	1)如果集合為javabean：&lt;s:select theme="simple" name="sex" list="#request.sexs" listKey="id" listValue="name"&gt;&lt;/s:select&gt;<br>
	2)如果集合為list：&lt;s:select theme="simple" name="sexList" list="{'男','女'}"&gt;&lt;/s:select&gt;<br>
	3)如果集合為map：&lt;s:select theme="simple" name="sexMap" list="# {1:'男',2:'女'}" listKey="key" listValue="value"&gt;&lt;/s:select&gt;<br>
	listKey：設置後台傳送的數據項。<br>
	listValue：設置前台顯示的數據項。<br>
	emptyOption：設置是否有空選項。<br>
	value：設置默認顯示數據列表list中的選項。<br>
	headerValue：設置下拉框頭條顯示數據。<br>
	headerKey：設置下拉框頭條後台傳回的數據。<br>
	其他說明:https://dotblogs.com.tw/rickeysu/2014/02/13/143977
</body>
</html>
