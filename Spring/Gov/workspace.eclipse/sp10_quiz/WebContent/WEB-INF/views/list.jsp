<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dept2 list</title>
</head>
<body>
	<h3>dept2 List</h3>
	<c:forEach items="${list}" var='list'>
		${list.dcode}
		${list.dname}
		${list.pdept}
		${list.area}
		<hr/>
	</c:forEach>
</body>
</html>