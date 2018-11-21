<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<span style="font-size: 15px;">你好:${student.studentName}学号:${student.studentNum}</span>
		<hr>
	</div>
	<div>
		<a href="${pageContext.request.contextPath }/score?student=${student.studentNum}&sign=2">个人成绩</a><span style="font-size: 30px">　|　</span>
		<a href="${pageContext.request.contextPath }/classesScore?student=${student.studentNum}">班级成绩</a><span style="font-size: 30px">　|　</span>
		<a href="${pageContext.request.contextPath }/score?student=${student.studentNum}&sign=1">个人信息</a>
		<hr>
	</div>
	<c:if test="${ empty sign }">
		<table style="width: 40%;" border="1"  cellspacing="0">
			<tr>
				<td>科目</td>
				<td>成绩</td>
			</tr>
			<c:forEach items="${student.lists}" var="score">
				<tr>
				<td>${score.courses.cName}</td>
				<td>${score.score }</td>
			</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<c:if test="${sign ==1 }">
		学号:${student.studentNum}<br><br>
		姓名:${student.studentName}<br><br>
		性别:${student.sex }<br><br>
		qq:${student.qq }<br><br>
		专业:${student.major.mName }<br><br>
		出生日期:${student.dateOfBirth }<br><br>
		联系电话:${student.phone }	
	</c:if>
	
	
	<c:if test="${sign ==2 }">
		<form action="${pageContext.request.contextPath }/classerScoreView" style="text-align: center;">
			班级编号:<input  type="text" name="classesId" value="${classesId}"/>
			<input type="submit" value="查询"  />
		</form>
		<c:if test="${not empty lists}">
			<table>
				<tr>
					<td>学生\科目</td>
					<c:forEach items="${lists}" var="list">
						<c:forEach items="${list}" var="score">
						<c:set var="courses1" value="${score.courses.cName}" />
							<c:if test="${courses1!=courses2 }">
							<td>${score.courses.cName}</td>
							</c:if>
							<c:set var="courses2" value="${score.student.studntName}" />
						</c:forEach>
					</c:forEach>
				</tr>
				<c:forEach items="${lists}" var="list">

					<tr>
						<c:forEach items="${list}" var="score">
							<c:set var="stuName1" value="${score.student.studntName}" />
							<c:if test="${stuName1!=stuName2 }">
							<td>${score.student.studntName}</td>
							</c:if>
							<td>{score.score}</td>
							<c:set var="stuName2" value="${score.student.studntName}" />
						</c:forEach>
					</tr>
					
				</c:forEach>
			</table>
		</c:if>
		
	</c:if>
</body>
</html>