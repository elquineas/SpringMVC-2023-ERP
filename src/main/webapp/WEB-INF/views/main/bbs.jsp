<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}"  var="rootPath" />   

	<h1>게시판</h1>
	<div>게시판 글 리스트</div>
	<div><a href="${rootPath}/main/bbs_input">작성하기</a></div>