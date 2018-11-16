<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<style>
	*{
		box-sizing: border-box;
	}
		html{
			height: 100%;
		}
		body{
			color: #fff;
			background: url(/sams/src/main/webapp/WEB-INF/img/bg.jpg) no-repeat center;
			background-size: cover;
			position: relative;
			height: 100%;
		}
		.login{
			position: absolute;
			left: 50%;
			top: 50%;
			transform: translate(-50%,-50%);
			width: 330px;
			height: 202px;
		}
		h2{
			text-align: center;
			font-size: 20px;
		}
		input[type = "text"],
		input[type = "password"]{
			width: 330px;
			height: 46px;
			border: rgba(255,255,255,0.2) 2px solid !important;
			border-radius: 50px;
			background-color: transparent;
			padding-left: 50px;
			outline: none;
			line-height: 50px;
			color: #fff;
			font:14px "microsoft yahei",Helvetica,Tahoma,Arial,"Microsoft jhengHei";
		}
		input{
			margin: 10px 0;	
		}
		.check{
			display: flex;
			justify-content: space-around;
		}
		input[type= 'submit']{
			width: 330px;
			height: 50px;
			background: #0096e6;
			border-width: 0;
			border-radius: 50px;
			font-size: 20px;
			color: #fff;
			cursor: pointer;
			transition: all .2s;
		}
		input[type= 'submit']:hover{
			background: #0086e0;
			color: #eee;
		}
		.user,
		.psd{
			position: relative;
		}
		.icon1,.icon2{
			width: 25px;
			height: 25px;
			position: absolute;
			left: 0;
			top: 50%;
			transform: translate(10px,-50%);
			background: url(/sams/src/main/webapp/WEB-INF/img/icon.png) no-repeat;
		}
		.icon1{	
			background-position: -125px 0;
		}
		.icon2{
			background-position: -125px -34px;
		}
		.pic{
			width: 60px;
			height: 60px;
			background: url(/sams/src/main/webapp/WEB-INF/img/huaji.png) no-repeat center;
			background-size: cover;
			margin: 0 auto 20px;
			transition: all .4s;
			position: relative;
		}
		.pic:hover{
			transform: rotate(360deg) scale(1.5);
		}
		label{
			cursor: pointer;
		}
	</style>
</head>
<body>
	<div class="login">
		<div class="pic">
		</div>
		<form action="${pageContext.request.contextPath }/login" method="post">
			<div class="user">
				<input type="text" placeholder="请输入账户">
				<div class="icon1"></div>
			</div>
			<div class="psd">
				<input type="password" placeholder="请输入密码">
				<div class="icon2"></div>
			</div>
			<div class="check">
				<label><input checked name="user" id="student" type="radio">&nbsp;学生</label>
				<label><input name="user" id="teacher" type="radio">&nbsp;老师</label>
				<label><input name="user" id="admin" type="radio">&nbsp;管理员</label>
			</div>
			<input type="submit" value="登录">
		</form>
	</div>
</body>
</html>