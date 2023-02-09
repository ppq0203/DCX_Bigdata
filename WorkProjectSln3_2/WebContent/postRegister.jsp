<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="test.employee.Employee" %>
<%@ page import="test.employee.Engineer" %>
<%@ page import="test.employee.Manager" %>
<%@ page import="test.employee.Sales" %>

<jsp:useBean id="userInfo" class="bbs.UserInfo"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
out.println("ID: "+ request.getParameter("ID"));
out.println("PWD: "+ request.getParameter("PWD"));
out.println("NAME: "+ request.getParameter("NAME"));
out.println("LEVEL: "+ request.getParameter("LEVEL"));
String id =  request.getParameter("ID");
String pwd = request.getParameter("PWD");
String name =  request.getParameter("NAME");
String level = request.getParameter("LEVEL");
//Employee emp = new Employee(id, pwd, name, level);
//ReadEmployeeData rd = new ReadEmployeeData();
//rd.writeEmp(emp);
%>
회원가입완료<br />
<a href="login.jsp">로그인하러가기</a>
</body>
</html>