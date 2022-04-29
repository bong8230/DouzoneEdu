<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JDBC</title>
</head>
<body>
<%
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			out.print("driver load sucess <br>");
			
			Connection conn = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:xe" , 
							"smile", 
							"oracle" );
			out.print("connection sucess <br>");
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			//conn.close();
		}
%>
</body>
</html>


