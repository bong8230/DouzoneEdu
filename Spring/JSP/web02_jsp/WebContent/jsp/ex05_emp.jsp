<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
 <%@ page import="com.kosta.ex05.Emp" %>
 
<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ex05_emp.jsp</title>
</head>
<body>
<%!
	public String message() {
		return "th160기 코스타인들!!!";
	}
%>
<%
		Emp e = new Emp();  // 객체 생성
		e.setEmpno(7788);
		e.setName("길동아");
		e.setPay(8000);
		
		int num = 99;
%>
 	외부 package에 있는 클래스 객체 생성 <br />
 	<%= e.toString() %> <br>
 	<%= 1 + 2 + 3 %>
 	<%= num %>
 	<%= message() %>
</body>
</html>






