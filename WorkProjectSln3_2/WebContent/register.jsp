<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="./register.css">
<title>회원가입</title>
</head>
<body>
    <div id="con">
    <div id="login">
    <div id="login_form"><!--로그인 폼-->
    <form method="get" action="postRegister.jsp">
        <h3 class="login" style="letter-spacing:-1px;">Sign up to Web</h3>

        <!-- <p>
            <input type="submit" value="Sign in with Google" class="btn" style="background-color:#217Af0">
        </p> 구글로 로그인-->

        <hr>

        <!-- <span>ID</span> -->
        <p style="text-align: left; font-size:12px; color:#666">Id</p>
        <input type="text" name="ID" placeholder="아이디" class="size">
        <p></p>
        </label><!--아이디-->

        <label>
        <!-- <span>PW</span> -->
        <p style="text-align: left; font-size:12px; color:#666">Password </p>
        <input type="password" name="PWD" placeholder="비밀번호" class="size">
        </label><!--비밀번호-->

<!--         <label>
            <span>PW</span>
            <p style="text-align: left; font-size:12px; color:#666"> </p>
            <input type="password" placeholder="비밀번호 확인" class="size">
        </label>비밀번호 확인 -->
         <label>
                <!-- <span>PW</span> -->
            <p style="text-align: left; font-size:12px; color:#666">Name</p>
                <input type="text" name="NAME" placeholder="이름" class="size">
        </label> <!--이름-->
        <br />  
          직위 
        <select name="LEVEL">
        	<option value="Manager">Manager</option>
		    <option value="Engineer">Engineer</option>
		    <option value="Sales">Sales</option>
        </select>


    <br>
        <p>
            <input type="submit" value="Create Acoout" class="btn">
            
        </p>
    </form>

    <hr>
    <p class="find">
        <span><a href="login.jsp" >로그인 페이지로 이동</a></span>
    </p>
    </div>
    <div>
    </div><!--con-->

</body>
</html>