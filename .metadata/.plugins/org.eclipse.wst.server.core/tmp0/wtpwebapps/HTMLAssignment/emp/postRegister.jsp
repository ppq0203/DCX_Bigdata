<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="test.employee.RWEmpData" %>
<jsp:useBean id="emp" class="test.employee.Employee" scope="request"/>
<jsp:setProperty property="*" name="emp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<%
	RWEmpData rwe = new RWEmpData();
	rwe.writeEmp(emp);
	out.print(emp.getNo());
	out.print(emp.getName());
	out.print(emp.getLevel());
	out.print(emp.getPhone());
	response.sendRedirect("empList.jsp");
%>
</head>
<body>

</body>
</html>