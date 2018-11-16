<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/login" method="post">
		账号:<input type="text" name="AccountNumber" style="width: 150px;"/>${fail}<br><br>
		密码:<input type="password" name="password" style="width: 150px;"/><br><br>
		<input type="radio" name="accountType" value="student" />学生
		<input type="radio" name="accountType" value="teacher" />老师
		<input type="radio" name="accountType" value="user" />管理员 <br>
		　　<input id="submitbtn" type="submit" value="登录" style="width: 150px;height: 30px;border-bottom-color: blue;"/>
	</form>
</body>
</html>