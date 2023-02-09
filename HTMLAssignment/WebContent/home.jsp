<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
String target = "";
if (session.getAttribute("ID") == null || !session.getAttribute("ID").equals("root")){
	target = "login.html";
	response.sendRedirect(target);
}
%>
</head>
<body>
	관리자님 로그인되었습니다.<br />
	즐거운 하루 되세요..<br />
	<img alt="" src="https://search.pstatic.net/sunny/?src=https%3A%2F%2Fthumb2.gettyimageskorea.com%2Fimage_preview%2F700%2F202006%2FFKF%2F1251266989.jpg&type=sc960_832">
</body>
</html>