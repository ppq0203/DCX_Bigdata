<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="bbsInput.jsp"%>
<%@page import="bbs.Bbs"%>
<%@page import="java.util.Enumeration"%>
<%!
Bbs[] bbsList = new Bbs[10];
int count = 0; // 실제 bbs가 존재하는 크기
int last = -1; // 실제 bbs가 존재하는 마지막 순서값
%> 
<% 
try
	 {
%>	
		<jsp:useBean id="bbs" type="bbs.Bbs" scope="session"/>
		<jsp:useBean id="emp" type="emp.Emp" scope="session"/>
		<% // first step : count = 0, last = -1 -> count = 1, last = 0
	  // second step : count = 1, last = 0 -> count = 2, last = 1
		System.out.println("listBbs.jsp before action[count = "+count+"]\n" + bbsList[(last < 0)? 0:last] + "\n" + emp);
		bbsList[count++] = new Bbs(bbs);
		System.out.println("listBbs.jsp after action\n" + bbsList[++last] + "\n" + emp); //count가 증가되었기 때문에 count-1이 실제 해당 데이터를 가리킨다.
		String se_name, se_value;
		Enumeration enum_01 = session.getAttributeNames();
		while(enum_01.hasMoreElements()) {
			se_name = enum_01.nextElement().toString();
			se_value = session.getAttribute(se_name).toString();
			System.out.println("얻어온 세션 이름 : " + se_name);
			System.out.println("얻어온 세션 값 : " + se_value);
		}
		session.removeAttribute("bbs"); 
	}
	catch(Exception e)
	{ System.out.println("listBbs.jsp :: " + e.getMessage());
		/* response.sendRedirect("bbsInput.jsp"); */
	}
if (count <= 0){
	response.sendRedirect("bbsInput.jsp");
}
%>

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
	for (int i = 0; i < count; i++)
	{
%>			
			<tr>
				<td><%=i+1 %></td>
				<td><%=bbsList[i].getSubject() %></td>
				<td><%=bbsList[i].getContent() %></td>
				<td><%=bbsList[i].getWriter() %></td>
			</tr>	
<%
	}
%>	
	</table>
	<a href="bbsInput.jsp">글쓰기</a>
</body>
</html>