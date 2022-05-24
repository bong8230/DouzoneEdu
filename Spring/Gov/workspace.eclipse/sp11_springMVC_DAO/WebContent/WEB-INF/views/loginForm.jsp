<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jstl/core_rt" %>
    
<c:set  var="path" value="${ pageContext.request.contextPath}" /><br />
<%-- 경로 : ${ pageContext.request.contextPath}<br /> --%>
<!DOCTYPE html >
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 화면</title>
</head>
<body>
	Session value : <c:out value=" ${sessionScope.USERID}" /> <br />
					<%-- 
						<%= session.getAttribute("USERID") %> 
						<%= request.getContextPath() %>
					--%>
	<form action="${ path }/login.do"  method="POST">
		<table border="1">
			<tr>
				<td>아이디:</td>
				<td>
					<input type="text" name="id" size="20"  placeholder="id 입력 요망">
				</td>
			</tr>
			<tr>
				<td>비밀번호:</td>
				<td>
					<input type="password" name="pwd" size="20"  placeholder="password 입력 요망"> 
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="로그인">
					<input type="reset"  value="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>