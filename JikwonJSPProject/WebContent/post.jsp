<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="emp.Jikwon"%>
<%
	String no = request.getParameter("no");
	String name = request.getParameter("name");
	String title = request.getParameter("title");
	String hobby = request.getParameter("hobby");
	String phone = request.getParameter("phone");
	String comment = request.getParameter("comment");
	Jikwon j = new Jikwon();
	j.setNo(no); j.setName(name); j.setComment(comment); 
	j.setHobby(hobby); j.setPhone(phone); j.setTitle(title);
	session.setAttribute(no, j);
	System.out.println(session.getAttribute(no));
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=j.getName() %>님이 직원 등록 완료되었습니다.
<br>
<a href="list.jsp">목록으로 가기</a>
</body>
</html>