<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
Cookie[] cookies = request.getCookies();
if( cookies != null )
{
	Cookie cookie = cookies[0];
	int length= cookies.length;
	for(int j =0; j < length; j++)
	{
		System.out.println( "login cookie " + j + " : " + cookies[j].getName() + " :: " + cookies[j].getValue() );
	}	
}
	
String id = null;
if(request.getParameter("ID") == null)
	id = (String)session.getAttribute("ID");
else
	id = request.getParameter("ID");

Integer count = (Integer)session.getAttribute("CONTENT");
String pwd = request.getParameter("PWD");

Cookie idCookie = new Cookie("ID", id);
request.getCookies();
response.addCookie(idCookie);

%>
<head>
<meta charset="UTF-8">
<title>v5 <%=id %>님의 Page</title>
</head>
<body>
<%
if(count == null) 
	count = 0;
count++;
session.setAttribute("ID", id);
session.setAttribute("COUNT", count);

%><p>
환영합니다.<br>
<%=session.getAttribute("ID") %>님<br>
<%=count %>번째 방문하셨습니다.<br>
<a href="listBbs.jsp">게시판가기</a>

<p>
<a href="hello.html">홈으로</a><br>

</body>
</html>