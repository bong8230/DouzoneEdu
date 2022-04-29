
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Basic</title>
</head>
<body>
<%
		out.print("access success");

		Class.forName("oracle.jdbc.OracleDriver"); 
		Connection conn = null;
		Statement  stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(
							"jdbc:oracle:thin:@192.168.2.36:1521:orcl" , 
							"kingsmile", 
							"1234" );
			stmt = conn.createStatement();
			String sql = "SELECT * FROM DEPT2";
			rs = stmt.executeQuery(sql);
			
%>
		dcode &nbsp;&nbsp; dname &nbsp;&nbsp; pdept &nbsp;&nbsp; area <br>	
			
<%
		while( rs.next() ) {
			out.print(rs.getString(1) + "\t");
			out.print(rs.getString(2) + "\t");
			out.print(rs.getString(3) + "\t");
			out.print(rs.getString(4) + "<br>");
		} // while end
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			//conn.close();
		}
%>
</body>
</html>