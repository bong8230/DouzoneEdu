<%@page import="java.util.concurrent.ExecutionException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.* ,  dbclose.util.*"  %>
<%@ page import="dbconn.util.*"  %>
<!DOCTYPE>
<html><head>
<title>JDBC</title>
<style type="text/css">
	table { 
		border: 1px solid;  
		width: 400px;  
		
	}
	td, th {
		text-align: center;
		border: 1px solid;
	}
</style>
</head>
<body>
<h3>지역 부서 보기</h3>
<table>
	<tr>
		<th>부서코드</th><th>부서명</th><th>지역코드</th><th>지사명</th>
	</tr>
	<%	
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = ConnectionUtil.getConnection("mysql");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM user");
	
			while(rs.next()) {
	%>
	<tr>
		<td><%= rs.getString(1) %></td>
		<td><%= rs.getString(2) %></td>
		<td><%= rs.getString(3) %></td>
		<td><%= rs.getString(4) %></td>
		<td><%= rs.getString(5) %></td>
		<td><%= rs.getString(6) %></td>
	</tr>
	
	<%
			} // while end
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			CloseUtil.close(rs);
			CloseUtil.close(stmt);
			CloseUtil.close(conn);
		}
	%>
	</table>
</body>
</html>