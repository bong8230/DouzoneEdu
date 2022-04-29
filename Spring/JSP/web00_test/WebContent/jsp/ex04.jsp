<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>JSP Page Test</title>
</head>
<body>
<h2>스크립트릿</h2>
<%
	int x = 30;
	out.println(x);
	
%>
<br />
<% 
	String str = "DouZone 힘내라!!";
	
	for(int i=1; i < 11; i++){ 
		out.print(i +"\t");
	}
%>
<h2>디클레이션</h2>
<%!
	public String show(){
		String name = "doyeon";
		return name;
	}

%>

<h2>표현식</h2>
<%= show() %> <br />
<%-- <%= 변수, 값, 수식 %> --%>
<%= 3+5 %>
	
</body>
</html>