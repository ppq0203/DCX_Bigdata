<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! //JAVA영역
int count=0;
String hello="안녕하세여....";
%>
<%=hello %>> jsp1111111111<br>
<%=request.getParameter("name")%>은 <%=++count %>번째 방문자입니다.
</body>
</html>