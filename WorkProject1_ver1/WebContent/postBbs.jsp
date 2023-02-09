<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bbs.Bbs"%>
<!DOCTYPE html>
<html>
<%
String subject = (String)request.getParameter("SUBJECT");
String content = (String)request.getParameter("CONTENT");
System.out.println("subject : " + subject);
System.out.println("content : " + content);
String writer = (String)session.getAttribute("ID");
System.out.println("writer : " + writer);
	Bbs bbs = new Bbs(subject, content, writer);
%>
<head><meta charset="UTF-8">
<title>방명록 게시판</title>
</head>
<body>
<%
int post_num = 1;
while(session.getAttribute(Integer.toString(post_num)) != null)
	post_num++;
session.setAttribute(Integer.toString(post_num), bbs);
out.println(subject + " 게시물 저장이 완료되었습니다.");
%>

<a href="listBbs.jsp">게시판가기</a>
</body>
</html>