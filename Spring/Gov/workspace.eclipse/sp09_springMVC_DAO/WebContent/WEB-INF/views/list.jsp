<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>
	<h3>List Page 방명록 리스트</h3>
	
	<input type="button" value="글쓰기" onclick="javascript:windows.location.href='writeform.do'">
	<p>
		<c:forEach items="${list}" var='list'>
			${ list.num }
			${ list.name }
			${ list.email }
			${ list.home }
			${ list.content}
			<hr/>
		</c:forEach>
	</p>
</body>
</html>