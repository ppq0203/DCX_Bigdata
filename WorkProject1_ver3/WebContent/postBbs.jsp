<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="bbs.Bbs"%>
<!DOCTYPE html>
<html>
<%
	Bbs bbs = new Bbs((String)request.getParameter("SUBJECT")
							 , (String)request.getParameter("CONTENT")
							 , (String)session.getAttribute("ID") );
%>
<head>
<meta charset="UTF-8">
<title>방명록 게시판</title>
</head>
<body>
	<%
int post_num = 1;
while(session.getAttribute(Integer.toString(post_num)) != null)
	post_num++;
session.setAttribute(Integer.toString(post_num), bbs);
out.println((String)request.getParameter("SUBJECT") + " 게시물 저장이 완료되었습니다.");
%>

	<a href="listBbs.jsp">게시판가기</a>
</body>
</html>