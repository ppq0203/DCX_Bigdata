<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%-- login.html의 action역할을 하는 JSP --%>
<%
String id = (String)session.getAttribute("ID");
Integer count = (Integer)session.getAttribute("COUNT");
// System.out.println("id in session : " + id);
id = request.getParameter("ID");
String pwd = request.getParameter("PWD");
System.out.println("id in request : " + id);
%>
<head>
<meta charset="UTF-8">
<title><%=id %>님의 Page</title>
</head>
<body>
<%
int countInt = 0;
if(count == null) 
	countInt = 1;
else
	countInt = count;
countInt++;
session.setAttribute("ID", id);
session.setAttribute("COUNT", countInt);

%><p>
환영합니다.<br>
<%=session.getAttribute("ID") %>님<br>
<%=countInt %>번째 방문하셨습니다.<br>
<a href="listBbs.jsp">게시판가기</a>

<p>
<a href="hello.html">홈으로</a><br>

</body>
</html>