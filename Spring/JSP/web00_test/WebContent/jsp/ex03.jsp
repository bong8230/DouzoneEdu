<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>JSP Page Test</title>
</head>

<body>
<%
	int x = 30;
	out.print(x);
	String str = "DouZone 힘내라!!";
%>
<hr>
<%	for(int i=1; i < 11; i++){ %>
	<span><%= i %></span>
<%}%>
<hr>
<%= str %>

</body>
</html>