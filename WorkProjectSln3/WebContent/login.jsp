<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
//로그인이 되어 있는지 체크
Cookie[] cookies = request.getCookies();
String id = "";
if(cookies != null) 
{	int length = cookies.length; // 전체 갯수.   사과1, 사과2 -> 2개, 사과0, 사과1 -> 2개
	for (int j = 0; j < length; j++) {
//		System.out.println(cookies[j].getName() + " :: " + cookies[j].getValue());
		if(cookies[j].getName().equals("ID"))
			id = cookies[j].getValue();
	}
}

%>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//id = "????" or id = null/""
if ((id == null) || id.equals(""))
{
%>

	<!-- 로그인 최초화면  -->
  		<!--  <form method="get" action="postLogin.jsp"> -->
  		<form method="get" action="postLogin3.jsp">
  		<table border="0">
  		<tr><td colspan="2">로그인 화면</td></tr>
  		<tr><td>아이디</td><td><input type="text" name="ID" maxlength="20" size="20"></td></tr>
  		<tr><td>비밀번호</td><td><input type="password" name="PWD" maxlength="20"></td></tr>
  		<tr><td></td><td><input type="submit" value="로그인"></td></tr>
  		</table>
  		</form>
<%	
}else
{
	String target = "postLogin3.jsp";
	//redirect
	response.sendRedirect(target);
}
%>  		
</body>
</html>