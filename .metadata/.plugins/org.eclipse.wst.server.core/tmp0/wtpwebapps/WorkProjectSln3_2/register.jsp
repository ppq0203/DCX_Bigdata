<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="./register.css">
<title>ȸ������</title>
</head>
<body>
    <div id="con">
    <div id="login">
    <div id="login_form"><!--�α��� ��-->
    <form method="get" action="postRegister.jsp">
        <h3 class="login" style="letter-spacing:-1px;">Sign up to Web</h3>

        <!-- <p>
            <input type="submit" value="Sign in with Google" class="btn" style="background-color:#217Af0">
        </p> ���۷� �α���-->

        <hr>

        <!-- <span>ID</span> -->
        <p style="text-align: left; font-size:12px; color:#666">Id</p>
        <input type="text" name="ID" placeholder="���̵�" class="size">
        <p></p>
        </label><!--���̵�-->

        <label>
        <!-- <span>PW</span> -->
        <p style="text-align: left; font-size:12px; color:#666">Password </p>
        <input type="password" name="PWD" placeholder="��й�ȣ" class="size">
        </label><!--��й�ȣ-->

<!--         <label>
            <span>PW</span>
            <p style="text-align: left; font-size:12px; color:#666"> </p>
            <input type="password" placeholder="��й�ȣ Ȯ��" class="size">
        </label>��й�ȣ Ȯ�� -->
         <label>
                <!-- <span>PW</span> -->
            <p style="text-align: left; font-size:12px; color:#666">Name</p>
                <input type="text" name="NAME" placeholder="�̸�" class="size">
        </label> <!--�̸�-->
        <br />  
          ���� 
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
        <span><a href="login.jsp" >�α��� �������� �̵�</a></span>
    </p>
    </div>
    <div>
    </div><!--con-->

</body>
</html>