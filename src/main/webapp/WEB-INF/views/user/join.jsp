<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}"  var="rootPath" />   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ERP</title>
<link href="${rootPath}/res/css/main.css" rel="stylesheet">
</head>
<body>
	<header>
		<h1>회원가입</h1>
	</header>
	<div>
		<form method="POST" action="${rootPath}/user/join_save">
			<input id="u_email" 	name="u_email" 		placeholder="이메일" />
			<input id="u_password" 	name="u_password" 	type="password" placeholder="비밀번호" />
			<input id="re_password" type="password" 	placeholder="비밀번호 확인" />
			<input id="u_name" 		name="u_name" 		placeholder="이름" />
		</form>
	</div>
</body>
</html>