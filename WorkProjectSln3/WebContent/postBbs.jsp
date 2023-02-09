<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <jsp:useBean id = "bbs" class="bbs.Bbs" scope="session"/> --%>
<jsp:useBean id = "bbs" type="bbs.Bbs" scope="session"/>
<jsp:setProperty property="subject" name="bbs" param="SUBJECT" />
<jsp:setProperty property="content" name="bbs" param="CONTENT" />
<!DOCTYPE html>
<html>
<%
String subject = (String)request.getParameter("SUBJECT");
String content = (String)request.getParameter("CONTENT");
String writer = "";
//로그인이 되어 있는지 체크
Cookie[] cookies = request.getCookies();
String id = "";
if(cookies != null) 
{	int length = cookies.length; // 전체 갯수.   사과1, 사과2 -> 2개, 사과0, 사과1 -> 2개
	for (int j = 0; j < length; j++) {
		//System.out.println(cookies[j].getName() + " :: " + cookies[j].getValue());
		if(cookies[j].getName().equals("ID"))
			id = cookies[j].getValue();
	}
}
/* 
writer = id;
System.out.println("subject : " + subject);
System.out.println("content : " + content);
System.out.println("writer : " + writer);

	bbs.setSubject(subject);
	bbs.setContent(content);
	bbs.setWriter(writer); 
*/

%>
<head><meta charset="UTF-8">
<title>방명록 게시판</title>
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

<%
/* 
Cookie subjectCookie = new Cookie("SUBJECT", subject);
response.addCookie(subjectCookie);
Cookie contentCookie = new Cookie("CONTENT", content);
response.addCookie(contentCookie);
Cookie writerCookie = new Cookie("WRITER", writer);
response.addCookie(writerCookie); 
*/
%>
[<jsp:getProperty property="subject" name="bbs" />] 게시물 저장이 완료되었습니다.

<a href="listBbs.jsp">게시판가기</a>
</body>
</html>