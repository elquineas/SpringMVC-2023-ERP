<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- <div>작성하기</div> -->
<form method="post" class="main bbs">
	<div class="main bbs_box">
		<div class="bbs title_box">
			<input name="title" placeholder="제목을 입력해 주세요" value="" />
		</div>
		<div class="bbs default_box">
			<input id="input_name" name="name" placeholder="작성자" value="" readonly="readonly"/>
			<input id="input_time" name="time" placeholder="작성시간" value="" readonly="readonly"/>
		</div>
		<div class="bbs content_box">
			<textarea name="content" placeholder="내용을 입력해 주세요" value="" rows="30"></textarea>
			<!-- rows="" cols=""   -->
		</div>
		
	</div>
</form>