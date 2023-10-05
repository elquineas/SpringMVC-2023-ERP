<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<nav>
	<ul>
		<li><a href="${rootPath}/main/bbs">게시판</a></li>
		<li><a href="${rootPath}/main/notice">공지사항</a></li>
		<li><a href="${rootPath}/main/userInfo">회원정보</a></li>
		<sec:authorize access="hasRole('ADMIN')">
			<li><a href="${rootPath}/main/admin">관리자</a></li>
		</sec:authorize>
	</ul>
</nav>