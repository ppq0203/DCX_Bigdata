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
session.setAttribute("ID", id);
%><br />
환영합니다.<br />
<%=session.getAttribute("ID")%>님<br />
 <%= 1 %>번째 방문하셨습니다.<br />
 <a href="myPage.jsp">마이페이지로...</a>
</body>
</html>