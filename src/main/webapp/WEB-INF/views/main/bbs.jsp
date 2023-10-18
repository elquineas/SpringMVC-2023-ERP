<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<c:set value="${pageContext.request.contextPath}"  var="rootPath" />   

<div class="board body">
	<h1>게시판</h1>
	<table class="board table">
		<thead>
			<tr>
				<td>작성자</td>
				<td>제목</td>
				<td>날짜</td>
				<td>조회수</td>
			</tr>
		</thead>
		<tbody class="board list">
			<c:forEach items="${BOARD_LIST}" var="BOARD" varStatus="status">
					<tr data-seq="${BOARD.b_seq}" >
						<td>${BOARD.b_username}</td>
						<td>${BOARD.b_title}</td>
						<td>${BOARD.b_date}</td>
						<td>${BOARD.b_count}</td>
					</tr>
			</c:forEach>
		</tbody>
	</table>
	<div><a href="${rootPath}/main/bbs_input">작성하기</a></div>
</div>
