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
			//1. 새로 로그인하는 사람이 우선
			//  새로운(요청의) 아이디와 기존의(쿠키의) 아이디를 비교한다.
			//  새로운 아이디를 쿠키에 담아 응답에 저장한다.
			//2. 원래 로그인되어 있는 사람이 우선 
			//  새로운(요청의) 아이디와 기존의(쿠키의) 아이디를 비교한다.
			//  id? -> 새로운 아이디 <- 쿠키의 기존 아이디를 덮어쓴다.
			//3. html - static web content -> ? dynamic -> jsp
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
<title><%=id %>님의 Page</title>
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

<a href="hello.html">홈으로</a> &nbsp; &nbsp; &nbsp;
<a href="listBbs.jsp">게시판가기</a><br>
<p>
환영합니다.<br>
<%=id %>님<br>

</body>
</html>