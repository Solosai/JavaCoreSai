<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${param.username };
<%

String uname=request.getParameter("username");
String upswd=request.getParameter("userpassword");
if(uname.equals("zhang")&&upswd.equals("123456")){
	%>
	<jsp:forward page="../Html/loginSuccess.html"/>
	<%
}else{
	%>
	<jsp:forward page="../Html/loginFailed.html"/>
	<%
	}
%>

</body>
</html>