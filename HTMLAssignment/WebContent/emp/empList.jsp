<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Enumeration" %>
    <%@ page import="java.util.HashMap" %>
    <%@ page import="java.util.Iterator" %>
    <%@ page import="test.employee.Employee" %>
    <%@ page import="test.employee.RWEmpData" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<%
String target = "";
if (session.getAttribute("ID") == null || !session.getAttribute("ID").equals("root")){
	target = "../login.html";
	response.sendRedirect(target);
}
%>
<script>
	function listView(userid){
	    let f = document.createElement('form');
	    
	    let obj;
	    obj = document.createElement('input');
	    obj.setAttribute('type', 'hidden');
	    obj.setAttribute('name', 'ID');
	    obj.setAttribute('value', userid);
	    
	    f.appendChild(obj);
	    f.setAttribute('method', 'get');
	    f.setAttribute('action', 'empInfo.jsp');
	    document.body.appendChild(f);
	    f.submit();
	}
</script>
</head>
<body>
	<table>
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>직위</th>
			<th>전화번호</th>
		</tr>
		
		<%
		RWEmpData rwe = new RWEmpData();
		HashMap<String, Employee> hmEmp = rwe.readEmps();
		Iterator<String> it = hmEmp.keySet().iterator();
		while(it.hasNext()){  // 맵키가 존재할경우
			String key = it.next();  // 맵키를 꺼냄
			Employee emp = (Employee)hmEmp.get(key);  // 키에 해당되는 객체 꺼냄
			String id = emp.getNo();
    		String name = emp.getName();
    		String level = emp.getLevel();
    		String phone = emp.getPhone();
     	%>
  				<tr>
					<td><a href="javascript:listView('<%=id %>')"><%=id %></a></td>
					<td><%=name %></td>
					<td><%=level %></td>
					<td><%=phone %></td>
				</tr>
     			
     			
      	<%
	    }
		%>


	</table>
</body>
</html>