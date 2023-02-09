<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bbs" class="bbs.Bbs" scope="session"/>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
<%--
게시물 보여주기(제목, 내용, 작성자)
  -. 게시물 가져오기
  -. 나눠서 저장하기 - subject, content, writer
  -. 웹(html)에 출력
게시판 작성하기(링크 - a href...)
* 게시물 보기(링크 - a href...)

로그인을 체크
  -. 로그인 데이터 가져오기
    로그인 데이터 <- Cookie <- Cookies <- request
    request.getCoo....()
    Cookie[] cookies
    cookie = cookies[0]
    cookie(name, value)
    cookie.getName()
    cookie.getValue()
    equals()
    if(){}
		  -. 0 -> X
		  -. X -> 로그인페이지로 가기
			<script> history.back();</script>
 --%>
<%
Cookie[] cookies = request.getCookies();
String id = "";	String subject = "";	String content = "";	String writer = "";
//로그인 체크 
if(cookies != null) 
{	int length = cookies.length; // 전체 갯수.   사과1, 사과2 -> 2개, 사과0, 사과1 -> 2개
	for (int j = 0; j < length; j++) {
		//System.out.println(cookies[j].getName() + " :: " + cookies[j].getValue());
		if(cookies[j].getName().equals("ID"))
			id = cookies[j].getValue();
	}
}

//로그인이 안되었을 경우
if ((id == null) || id.equals(""))
{
%>
<script>history.back();</script>
<%	
}
%>
	<table>
			<tr>
				<th >번호</th><th >제목</th><th >내용</th><th >작성자</th>
			</tr>
			<tr>
				<td>1</td>
				<td><jsp:getProperty property="subject" name="bbs" /></td>
				<td><jsp:getProperty property="content" name="bbs" /></td>
				<td><jsp:getProperty property="writer" name="bbs" /></td>
			</tr>		
	</table>
	<a href="bbsInput.jsp">글쓰기</a>

</body>
</html>