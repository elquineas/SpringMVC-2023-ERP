<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<c:set value="${pageContext.request.contextPath}"  var="rootPath" />   

<div class="member body">
	<div class="member insert_btn_box"><h1>회원정보</h1><button type="button" class="member insert_btn">추 가</button></div>
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
					<input id="u_seq_${status.index}" value="${USER.u_seq}" type="hidden"/>
					<td id="id_${status.index}" >${USER.u_id}</td>
					<td id="u_name_${status.index}" >${USER.u_name}</td>
					<td>${USER.d_name}<input id="d_name_${status.index}" value="${USER.u_dept}" type="hidden"/></td>
					<td>${USER.p_name}<input id="p_name_${status.index}" value="${USER.u_position}" type="hidden"/></td>
					<td><button data-id="${status.index}" type="button" class="member update_btn">수 정</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<div class="member modal_back">
		<div class="member modal save">
			<input id="new_seq" value="${SEQ}" type="hidden"/>
			<f:form  action="${rootPath}/main/userInfo" method="POST" class="member save">
				<input id="input_seq" name="u_seq" type="hidden"/>
				<div class="member input_box">
					<label>아이디</label>
					<input id="input_id" name="u_id" readonly="readonly" value=""/>
				</div>
				<div class="member input_box">
					<label>이름</label>
					<input id="input_uname" name="u_name" value="" />
				</div>
				<div class="member input_box">
					<label>부서</label>
					<select id="select_dname" name="u_dept">
						<option value="9999">없음</option>
						<c:forEach items="${DEPT_LIST}" var="LIST">
							<option value="${LIST.d_num}">${LIST.d_name}</option>
						</c:forEach>
					</select>
				</div>
				<div class="member input_box">
					<label>직급</label>
					<select id="select_pname" name="u_position">
					<option value="9999">없음</option>
						<c:forEach items="${POSITION_LIST}" var="LIST">
							<option value="${LIST.p_num}">${LIST.p_name}</option>
						</c:forEach>
					</select>
				</div>
				<div class="member input_btn_box">
					<button type="button" class="member modal_save_btn">저 장</button>
					<button type="button" class="member modal_cancle_btn">취 소</button>
				</div>
			</f:form>
		</div>
		
		<div class="member modal insert">
			<input id="new_seq" value="${SEQ}" type="hidden"/>
			<f:form  action="${rootPath}/main/userAddInfo" method="POST" class="member insert">
				<input id="insert_input_seq" name="u_seq" type="hidden"/>
				<div class="member input_box">
					<label>아이디</label>
					<input id="insert_input_id" name="u_id" value=""/>
				</div>
				<div class="member input_box">
					<label>비밀번호</label>
					<input id="insert_input_pw" name="u_password" value=""/>
				</div>
				<div class="member input_box">
					<label>이름</label>
					<input id="insert_input_uname" name="u_name" value="" />
				</div>
				<div class="member input_box">
					<label>부서</label>
					<select id="insert_select_dname" name="u_dept">
						<option value="9999">없음</option>
						<c:forEach items="${DEPT_LIST}" var="LIST">
							<option value="${LIST.d_num}">${LIST.d_name}</option>
						</c:forEach>
					</select>
				</div>
				<div class="member input_box">
					<label>직급</label>
					<select id="insert_select_pname" name="u_position">
						<option value="9999">없음</option>
						<c:forEach items="${POSITION_LIST}" var="LIST">
							<option value="${LIST.p_num}">${LIST.p_name}</option>
						</c:forEach>
					</select>
				</div>
				<div class="member input_btn_box">
					<button type="button" class="member insert_save_btn">저 장</button>
					<button type="button" class="member insert_cancle_btn">취 소</button>
				</div>
			</f:form>
		</div>
	</div>
</div>