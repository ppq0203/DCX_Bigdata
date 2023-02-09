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
// id = "" or id = "????"
		
//새로 로그인을 할 경우
if (id.equals(""))
{
	id = request.getParameter("ID"); //쿠키에 아이디가 존재할 경우 어떻게 할건지?
	String pwd = request.getParameter("PWD"); // 비밀번호는 어떻게 사용할건지?
	// 아이디는 뭘까요?
	// 비밀번호는 뭘까요?
	Cookie idCookie = new Cookie("ID", id);
	request.getCookies();
	response.addCookie(idCookie);
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
<script>history.back();</script>
<%	
}
%>
<form action="postBbs.jsp" method="get">
<table>
<tr><td colspan="2">글쓰기</td></tr>
<tr><td>제목</td><td><input type="text" name="SUBJECT" size="65"></td></tr>
<tr><td>내용</td><td><textarea rows="20" cols="50" name="CONTENT"></textarea></td></tr>
<tr><td></td><td><input type="submit" name="submit" value="제출"></td></tr>
</table>
</form>
</body>
</html>