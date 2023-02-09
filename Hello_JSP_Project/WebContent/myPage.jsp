<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
String id = (String)session.getAttribute("ID");
%>
<head>
<meta charset="UTF-8">
<title><%=id %>님의 Page</title>
</head>
<body>
<p>
<%=id %>님의 마이페이지<br />
 <a href="hello.html">홈으로</a><br />
 </p>
</body>
</html>