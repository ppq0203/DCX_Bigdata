<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
String id = (String)session.getAttribute("ID");
Integer count = (Integer)session.getAttribute("BBS");
if(count == null)
	count = 0;
count++;
session.setAttribute("BBS", count);
%>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%=id %>님이 <%=count %>번째 글을 작성하셨습니다.
	<%
	String title = request.getParameter("title");
	session.setAttribute("TITLE", title);
	%>
	<a href="listBbs.jsp">게시글 리스트 페이지로...</a>
</body>
</html>