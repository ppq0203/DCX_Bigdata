<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.HashMap" %>
    <%@ page import="test.employee.Employee" %>
    <%@ page import="test.employee.RWEmpData" %>
<%@ page import="user.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<%
String target = "";
if (session.getAttribute("ID") == null || !session.getAttribute("ID").equals("root")){
	target = "../login.html";
	response.sendRedirect(target);
}
String id = request.getParameter("ID");
RWEmpData rwe = new RWEmpData();
HashMap<String, Employee> hmEmp = rwe.readEmps();
Employee emp = (Employee)hmEmp.get(id);

String name = emp.getName();
String level = emp.getLevel();
String phone = emp.getPhone();
%>
</head>
<body>
	<table>
		<tr>
			<th>사번</th>
			<td><%=id %></td>
		</tr>
		<tr>
			<th>이름</th>
			<td><%=name %></td>
		</tr>
		<tr>
			<th>직위</th>
			<td><%=level %></td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td><%=phone %></td>
		</tr>
	</table>
</body>
</html>