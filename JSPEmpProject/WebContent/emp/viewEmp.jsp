<%@page import="test.employee.Employee"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="login.html"%>
<jsp:useBean id="empList" class="java.util.ArrayList" scope="session" />
<jsp:useBean id="emp" class="test.employee.Employee" scope="session"/> 
<jsp:setProperty property="*" name="emp" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>Insert title here</title>
</head>
<body>
	<center>
	<b> 직원&nbsp; 상세&nbsp;정보</b><br/>
	<table border="1" align ="center" width="40%" height="200px">

<%
	System.out.println(emp.getNo());
	for(Object e : empList)
	{	if(emp.getNo() == ((Employee)e).getNo()) 
		{	emp = (Employee)e;
%>
	<tr>
		<td><b>사번</b></td>
		<td><jsp:getProperty property="no" name="emp"/></td>
	</tr>
	<tr>
		<td><b>이름</b></td>
		<td></><jsp:getProperty property="name" name="emp"/></td>
	</tr>
	<tr>
		<td><b>직위</b></td>
		<td></><jsp:getProperty property="title" name="emp"/></td>
	</tr>
	<tr>
		<td><b>직책</b></td>
		<td></><jsp:getProperty property="position" name="emp"/></td>
	</tr>
	<tr>
		<td><b>전화번호</b></td>
		<td><jsp:getProperty property="phone" name="emp"/></td>
	</tr>
	<tr>
		<td><b>취미</b></td>
		<td><jsp:getProperty property="hobby" name="emp"/></td>
	</tr>
	<tr>
		<td><b>비고</b></td>
		<td><jsp:getProperty property="comment" name="emp"/></td>
	</tr>
<%
		}
	}
%>
	</table>
	</center>
</body>
</html>