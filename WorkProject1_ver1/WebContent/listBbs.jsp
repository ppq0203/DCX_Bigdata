<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bbs.Bbs"%>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Insert title here</title>
</head>
<body>
			<table>
					<tr>
						<th >번호</th><th >제목</th><th >내용</th><th >작성자</th>
					</tr>
					<%
						for(int i = 1;session.getAttribute(Integer.toString(i)) != null; i++)
						{
							Bbs bbs = (Bbs)session.getAttribute(Integer.toString(i));
					%>
							<tr>
								<td><%=i %></td>
								<td><%=bbs.getSubject() %></td>
								<td><%=bbs.getContent() %></td>
								<td><%=bbs.getWriter() %></td>
							</tr>
					<%
						}
					%>
			</table>
			<a href="bbsInput.jsp">글쓰기</a>
</body>
</html>