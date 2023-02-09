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

%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/53a8c415f1.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="./login.css">
</head>
<body>
<%
//id = "????" or id = null/""
if ((id == null) || id.equals(""))
{
%>
<form action="postLogin3.jsp" method="get">
    <div class="wrap">
        <div class="login">
            <h2>Log-in</h2>
            <div class="login_id">
                <h4>ID</h4>
                <input type="text" name="ID" placeholder="Id">
            </div>
            <div class="login_pw">
                <h4>Password</h4>
                <input type="password" name="PWD" placeholder="Password">
            </div>
            <div class="submit">
                <input type="submit" value="Login">
            </div>
			<a href="register.jsp">회원가입</a><br>
        </div>
    </div>
</form>

<%	
}else
{
	String target = "postLogin3.jsp";
	//redirect
	response.sendRedirect(target);
}
%>  		
</body>
</html>