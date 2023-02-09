<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="emp.Emp" %>
<jsp:useBean id="emp" class="emp.Emp" scope="session"/>    
<jsp:setProperty property="*" name="emp" />
<!DOCTYPE html>
<html>
<%
System.out.println("emp data :: \n"+ emp);
String id = request.getParameter("id");
String pwd = request.getParameter("password");

if(id == null || pwd == null || id.equals("")||pwd.equals(""))
{
%>
<jsp:forward page="login.html" />
<%
}
//로그인이 되어 있는지 체크
//if(emp.getId() == null || emp.getId().equals(""))

//새로 로그인을 할 경우
if (emp.getId().equals("root") && emp.getPassword().equals("admin"))
{ // 로그인 완료

%>
<head>
<meta charset="UTF-8">
<title><jsp:getProperty property="id" name="emp"/>님의 Page</title>
</head>
<body>

<a href="hello.html">홈으로</a> &nbsp; &nbsp; &nbsp;
<a href="listBbs.jsp">게시판가기</a><br>
<p>
환영합니다.<br>
<jsp:getProperty property="id" name="emp"/>님<br>

</body>

<%  // root/admin
}else
{
%>
<jsp:forward page="login.html" />
<%
}
%>
</html>