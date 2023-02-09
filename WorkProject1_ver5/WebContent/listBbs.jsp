<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bbs.Bbs"%>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>v5 Insert title here</title>
</head>
<body>
<%
String sub = null;
String cont = null;
String writer = null;
Cookie[] cookies =  request.getCookies();
if(cookies != null)
{
	for(int i = 0; i < cookies.length; i++)
	{
		if (cookies[i].getName().equals("SUBJECT") )
			sub = cookies[i].getValue();
		if (cookies[i].getName().equals("CONTENT") )
			cont = cookies[i].getValue();
		if (cookies[i].getName().equals("ID") )
			writer = cookies[i].getValue();
	}
}
%>
			<table>
					<tr>
						<th >번호</th><th >제목</th><th >내용</th><th >작성자</th>
					</tr>
							<tr>
								<td><%=1 %></td>
								<td><%=sub %></td>
								<td><%=cont %></td>
								<td><%=writer %></td>
							</tr>
			</table>
			<a href="bbsInput.jsp">글쓰기</a>
<%
if(writer==null) {
	response.sendRedirect("login.html");
}
%>
</body>
</html>