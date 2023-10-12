<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<head>
<meta charset="UTF-8">
<title>ERP MAIN</title>
<script src="https://kit.fontawesome.com/3aaa5e7779.js" crossorigin="anonymous"></script>
<link href="${rootPath}/res/css/main.css?ver=20231005_001" rel="stylesheet">
<link href="${rootPath}/res/css/main/bbs.css?ver=20231005_024" rel="stylesheet">
<link href="${rootPath}/res/css/main/member.css?ver=20231011_011" rel="stylesheet">
<script>
	var rootPath = "${rootPath}"
</script>
<script src="${rootPath}/res/js/join.js?ver=20231005_024"></script>
<script src="${rootPath}/res/js/main/member.js?ver=20231012_016"></script>
</head>