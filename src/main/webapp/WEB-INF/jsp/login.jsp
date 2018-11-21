<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
tr {
	height: 40px;
}

td {
	padding: 10px;
}
</style>
</head>
<body>
	<form action="${pageContext.request.contextPath }/loginView" method="post" style="text-align: center; margin-top: 225px">
			
					
					<span  style="text-align: left; font-size:15px; color: red; font-weight: bolder;">${fail}</span><br><br>
					&nbsp;账号:<input type="text" name="AccountNumber" style="width: 145px;"/><br><br>
					密码:<input type="password" name="password" style="width: 145px;"/><br><br>
			
					<input type="radio" name="accountType" value="student" />学生
					<input type="radio" name="accountType" value="teacher" />老师
					<input type="radio" name="accountType" value="user" />管理员 <br><br>
					　<input id="submitbtn" type="submit" value="登录" style="width: 190px;height: 30px;background: blue;; color: #ff0;"/>	
	</form>
</body>
</html>