<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Main Page</title>
</head>
<body>
<%
	//�� �������� �α����� ����� �� �� �ִ�.
	String id = null;
	if( (String)session.getAttribute("userid") != null ) {
		id = (String) session.getAttribute("userid");
		out.print(id + "�� �氡�氡<br>");
		
		if( id.equals("admin") ) {
			out.print("<a href='ex30_memberList.jsp'> ������������ </a>");
		}
	}else {
		out.print("<script>");
		out.print("location.href='ex29_login.jsp' ");
		out.print("</script>");
	}

%>
</body>
</html>