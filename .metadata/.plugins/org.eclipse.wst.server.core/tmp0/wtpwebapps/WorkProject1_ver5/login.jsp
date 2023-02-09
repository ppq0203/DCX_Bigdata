<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
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
        </div>
    </div>
</form>
</body>
</html>