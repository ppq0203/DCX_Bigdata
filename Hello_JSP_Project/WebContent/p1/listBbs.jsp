<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!
List<String> list = new ArrayList<String>(); 
List<String> writer = new ArrayList<String>(); 
%>
<%
Integer count = (Integer)session.getAttribute("BBS");
String title = (String)session.getAttribute("TITLE");
String write = (String)session.getAttribute("ID");
list.add(title);
writer.add(write);
%>
<body>
    <table border="1">
        <tr>
            <td>번호</td>
            <td>제목</td>
        </tr>
        <%for(int i=0; i<list.size(); i++) {%>
        <tr>
            <td><%=i+1 %></td>
            <td><a href=""><%=list.get(i) %></a></td>
            <td><a href=""><%=writer.get(i) %></a></td>
        </tr>
        <%} %>
    </table>
    <a href="bbsInput.html">글쓰기</a>
</body>
</html>