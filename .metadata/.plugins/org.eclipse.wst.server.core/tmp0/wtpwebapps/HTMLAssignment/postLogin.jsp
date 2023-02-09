<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<%!
private String id = "root";
private String pwd = "admin";
%>
<%
String postId = request.getParameter("ID");
String postPwd = request.getParameter("PWD");
String target = "";
%>
</head>
<body>
<%
if (postId.equals(id)&&postPwd.equals(pwd)){
	target = "home.jsp";
	session.setAttribute("ID", id);
}
else{
	target = "login.html";
}
response.sendRedirect(target);
%>

</body>
</html>