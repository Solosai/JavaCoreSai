<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到登录页面！</title>
<link rel="stylesheet" type="text/css" href="../Css/loginCss.css">
</head>
<body id="mybody" >
<center>
<div id="mydiv">
<h1 >欢迎登录</h1>
<form id="myform" action="<%=request.getContextPath() %>/servlet/MyLoginServlet" name="mylogin" method="post">
姓名：<input type="text" name="username" title="请输入姓名"/><br/><br/>
密码：<input type="password" name="userpassword" title="请输入密码" /><br/><br/>
<input class="myinput" type="submit" name="submit" value="登录" title="点击登录"/>&nbsp;&nbsp;
<input class="myinput" type="reset" name="reset" value="重置" title="点击重置"/>

</form>
</div>

</center>

</body>
</html>