<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>v5 Insert title here</title>
</head>
<body>
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