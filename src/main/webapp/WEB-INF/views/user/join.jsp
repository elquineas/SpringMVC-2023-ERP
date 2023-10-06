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
<link href="${rootPath}/res/css/join.css?ver=20231006_009" rel="stylesheet">
<script>
	var rootPath = "${rootPath}"
</script>
<script src="${rootPath}/res/js/join.js?ver=20231006_001"></script>
</head>
<body class="user join_body">
	<header class="user join_header">
		<h1>회원가입</h1>
	</header>
	<div class="user join_form_box">
		<form method="POST" action="${rootPath}/user/join_save" class="user join_form">
			<input id="u_id" 		name="u_id" 		placeholder="아이디" />
			<input id="u_password" 	name="u_password" 	type="password" placeholder="비밀번호" />
			<input id="re_password" type="password" 	placeholder="비밀번호 확인" />
			<input id="u_name" 		name="u_name" 		placeholder="이름" />
			<div class="user button_box">
				<button type="button" id="cancle">취소</button>
				<button type="submit">회원가입</button>
			</div>
		</form>
	</div>
</body>
</html>