<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</head>
<body>
<div id="con">
    <div id="login">
	    <div id="login_form"><!--로그인 폼-->
		    <form method="get" action="postRegister.jsp">
		        <h3 class="login" style="letter-spacing:-1px;">직원 정보 등록</h3>
		        
		        <hr>
				<label>
		        사번
		        <input type="text" name="no" placeholder="사번" class="size" />
		        </label><!--아이디-->
				<br />
		        
		        <label>
		        이름 
		        <input type="text" name="name" placeholder="이름" class="size">
		        </label><!--비밀번호-->
				<br />
				
				<label>
		        직위 
		        <select name="level">
		        	<option value="Manager">Manager</option>
				    <option value="Engineer">Engineer</option>
				    <option value="Sales">Sales</option>
		        </select>
		        </label><!--비밀번호-->
				<br />
				
				<label>
		        전화번호
		        <input type="text" name="phone" class="size">
		        </label><!--비밀번호-->
				<br />
				
				<label>
		        취미 
		        <input type="checkbox" name="">문화
		        <input type="checkbox" name="">스포츠
		        <input type="checkbox" name="">기타
		        </label><!--비밀번호-->
				<br />
				
				<label>
		        비고
				<textarea rows="" cols=""></textarea>
		        </label><!--비밀번호-->
				<br />
			<hr>
		    <button type="submit">작성완료</button>
		    <button type="reset">취소</button>
				
		    </form>
	
		    
	    </div>
    </div>
</div>
</body>
</html>