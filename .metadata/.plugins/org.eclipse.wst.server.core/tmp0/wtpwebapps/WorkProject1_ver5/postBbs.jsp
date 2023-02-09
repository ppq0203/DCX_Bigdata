<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bbs.Bbs"%>
<!DOCTYPE html>
<html>
<%

%>
<head><meta charset="UTF-8">
<title>v5 방명록 게시판</title>
</head>
<body>
<%
Cookie[] cookies = request.getCookies();
if( cookies != null )
{
	Cookie cookie = cookies[0];
	int length= cookies.length;
	for(int j =0; j < length; j++)
	{
		System.out.println( "postBbs cookie " + j + " : " + cookies[j].getName() + " :: " + cookies[j].getValue() );
	}
}

String sub = (String)request.getParameter("SUBJECT");
String cont = (String)request.getParameter("CONTENT");

Cookie subCookie = new Cookie("SUBJECT", sub);
Cookie contCookie = new Cookie("CONTENT", cont);

response.addCookie(subCookie);
response.addCookie(contCookie);


out.println((String)request.getParameter("SUBJECT") + " 게시물 저장이 완료되었습니다.");
%>

<a href="listBbs.jsp">게시판가기</a>
</body>
</html>