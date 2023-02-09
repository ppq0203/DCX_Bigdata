<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="login.html"%>
<jsp:useBean id="empList" class="java.util.ArrayList" scope="session" />
<!-- jsp:useBean id="empList" class="java.util.ArrayList<test.employee.Employee>" scope="session" /> -->
<jsp:useBean id="emp" class="test.employee.Employee" scope="session"/> 
<jsp:setProperty property="*" name="emp" />
<!DOCTYPE html>
<html>
<% 
	System.out.println("postEmp.jsp after action\n" + emp);
	empList.add(emp);
%>
<head><meta charset="UTF-8">
<title>방명록 게시판</title>
</head>
<body>
<%
//emp.getId().equals("root")

%>

[<jsp:getProperty property="name" name="emp"/>] 직원등록이 완료되었습니다.

<a href="listEmp.jsp">게시판가기</a>
</body>
</html>