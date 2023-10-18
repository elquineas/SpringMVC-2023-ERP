<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- <div>작성하기</div> -->
<form method="post" class="main bbs">
	<div class="main bbs_box">
		<div class="bbs title_box">
			<input id="title" name="title" placeholder="제목을 입력해 주세요" value="${BOARD.b_title}" />
			<div id="count_box">조회수 : ${BOARD.b_count}</div>
		</div>
		<div class="bbs default_box">
			<input id="input_name" name="name" placeholder="작성자" value="${BOARD.b_username}" readonly="readonly"/>
			<input id="input_time" name="time" placeholder="작성시간" value="${BOARD.b_date}" readonly="readonly"/>
		</div>
		<div class="bbs content_box">
			<textarea name="content" placeholder="내용을 입력해 주세요" rows="30">${BOARD.b_content}</textarea>
			<!-- rows="" cols="" value="${BOARD.b_content}"   -->
		</div>
		
	</div>
</form>