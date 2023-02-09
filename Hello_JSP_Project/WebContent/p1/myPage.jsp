<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
String id = (String)session.getAttribute("ID");
%>
<head>
<meta charset="UTF-8">
<title><%=id %>님의 마이페이지</title>
</head>
<body>
	<%=id %>님 의 마이페이지<br />
	<a href="bbsInput.html">게시글 작성 페이지로...</a><br /><br />
	<a href="login.html">로그아웃</a>
	<!-- 로그아웃 링크를 누르면 해당 URL을 주소표시줄에 치는 것과 같고 get방식 -->
	<a href="">회원탈퇴</a>
</body>
</html>