<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="emp.Jikwon"%>
<%
	Jikwon j = (Jikwon)session.getAttribute("no");
	System.out.println(j);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>Insert title here</title>
</head>
<body>
<center>
	<b> 직원&nbsp;정보&nbsp;조회</b>
	
	<table border="1" align="center">
	<tr>
		<td><b>사번</b></td>
		<td><b>이름</b></td>
		<td><b>직위</b></td>
		<td><b>전화번호</b></td>
	</tr>
	<tr>
		<td><a href="empInfo.html"><%=j.getNo() %></a></td>
		<td><%=j.getName() %></td>
		<td><%=j.getTitle() %></td>
		<td><%=j.getPhone() %></td>
	</tr>

	</table>
	</center>
</body>
</html>