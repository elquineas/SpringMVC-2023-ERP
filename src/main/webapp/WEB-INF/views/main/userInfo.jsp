<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="member body">
	<h1>회원정보</h1>
	<table class="member table">
		<thead>
			<tr>
				<td>아이디</td>
				<td>이름</td>
				<td>부서</td>
				<td>직급</td>
				<td></td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${USER_LIST}" var="USER" varStatus="status">
				<tr>
					<td id="id_${status.index}" >${USER.u_id}</td>
					<td id="u_name_${status.index}" >${USER.u_name}</td>
					<td id="d_name_${status.index}" >${USER.d_name}</td>
					<td id="p_name_${status.index}" >${USER.p_name}</td>
					<td><button type="button" class="member update_btn">수 정</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<div class="member modal_back">
		<div class="member modal">
			<div class="member input_box">
				<label>아이디</label>
				<input id="input_id" name="u_id" readonly="readonly"/>
			</div>
			<div class="member input_box">
				<label>이름</label>
				<input id="input_uname" name="u_name" />
			</div>
			<div class="member input_box">
				<label>부서</label>
				<input id="input_dname" name="d_name" />
			</div>
			<div class="member input_box">
				<label>직급</label>
				<input id="input_pname" name="p_name" />
			</div>
			<div class="member input_btn_box">
				<button class="member modal_save_btn">저 장</button>
				<button class="member modal_cancle_btn">취 소</button>
			</div>
		</div>
	</div>
</div>