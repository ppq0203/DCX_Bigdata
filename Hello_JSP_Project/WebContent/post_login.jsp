<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pass");
System.out.println("Log:: ID: " + id +"\n" + "Password: " + pwd);
out.println("Web:: ID: " + id +"\n" + "Password: " + pwd);
%><br />
환영합니다.<br />
<%=request.getParameter("id")%>님<br />
 <%= 1 %>번째 방문자입니다.<br />
</body>
</html>