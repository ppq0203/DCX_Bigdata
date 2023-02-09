<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="login.html"%>
<jsp:useBean id="bbs" class="bbs.Bbs" scope="session" />
<jsp:useBean id="emp" type="emp.Emp" scope="session"/> 
<%
	System.out.println("postBbs.jsp before action\n" + bbs + "\n" + emp);
%>
<jsp:setProperty property="*" name="bbs" />
<!DOCTYPE html>
<html>
<%
	//String id = emp.getId();	String writer = id;	bbs.setWriter(writer);
	bbs.setWriter(emp.getId());
	System.out.println("postBbs.jsp after action\n" + bbs + "\n" + emp);
%>
<head><meta charset="UTF-8">
<title>방명록 게시판</title>
</head>
<body>
<%
//emp.getId().equals("root")

%>

[<jsp:getProperty property="subject" name="bbs"/>] 게시물 저장이 완료되었습니다.

<a href="listBbs.jsp">게시판가기</a>
</body>
</html>