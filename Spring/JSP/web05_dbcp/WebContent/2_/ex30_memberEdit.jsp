<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
  <%@ page import="java.sql.*" %>
 <%@ page import="connUtil.util.*" %>
  <%@ page import="dbclose.util.*" %>
  
  <% 
	  if ( session.getAttribute("userid")  == null   ||
				!session.getAttribute("userid").equals("admin") ) {
			//�ٸ� �������� ���� �̵�...
			out.print("<script>");
			out.print("location.href='ex29_login.jsp' ");
			out.print("</script>");	
		} //if end
		
		String id = request.getParameter("id");
		
		Connection conn = null;
  		PreparedStatement pstmt = null;
  		ResultSet rs = null;
  		
  		try{
  			conn = ConnectionUtil.getConnection("oracle");
  			String sql = "SELECT ID, PWD, NAME, AGE, GENDER, EMAIL FROM KOSTAMEMBER WHERE ID = ?";
  			pstmt = conn.prepareStatement(sql);
  			pstmt.setString(1, id);
  			rs = pstmt.executeQuery();
  			rs.next();  //������ �Ѱ��� ���....
  %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="ex30_memberEditProcess.jsp" method="post">
	<center>
		<table border="1">
			<tr><td>���̵�</td><td>
				<input type="text" name="id" value="<%= rs.getString(1) %>"  readonly >
				</td></tr>
			<tr><td>���</td><td><%= rs.getString(2) %></td></tr>
			
			<tr><td>�̸�</td><td>
				<input type="text" name="name" value="<%= rs.getString(3) %>"   style="background-color: yellow;" >
				</td></tr>
				
			<tr><td>����</td><td><%= rs.getInt(4) %></td></tr>
			<tr><td>����</td><td><%= rs.getString(5) %></td></tr>
		
			<tr><td>�̸���</td><td>
				<input type="text" name="email" value="<%= rs.getString(6) %>"   style="background-color: yellow;" >
				</td></tr>
				
			<tr>
				<td  colspan="2">
					<input type="submit"  value="�����ϱ�">
					<a href='ex30_memberList.jsp' >����Ʈ�� �̵�</a>
				</td>
			</tr>
		</table>
	</center>
</form>
</body>
</html>
<%	
  		}catch (Exception e){
  			e.printStackTrace();
  		}finally{
  			CloseUtil.close(rs);
  			CloseUtil.close(pstmt);
  			CloseUtil.close(conn);
  		}
  %>
  

