<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
  <%@ page import="java.sql.*" %>
   <%@ page import="connUtil.util.*" %>
  <%@ page import="dbclose.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ȸ�� �˻�</title>
<style type="text/css">
	table {		border: solid 2px black;		border-collapse: collapse;   	}
	tr {		border: solid 1px blue;		background-color: white;		color : black;	}
	td {		border: solid 1px red;	}
</style>
</head>
<%
		//1. �˻��� ����� �̸� �޾ƿ���
		request.setCharacterEncoding("euc-kr");
		String name = request.getParameter("search");
		//out.print(name);
		//2. ��ȿ�� �˻�
		if ( name == null || name.trim().equals("") ) {
			response.sendRedirect("ex30_memberList.jsp");
			return;
		}
		
		//3. db �����Ͽ� select ���� db�� ����
		Connection conn = null;
  		PreparedStatement pstmt = null;
  		ResultSet rs = null;
  		
  		try{
  			conn = ConnectionUtil.getConnection("oracle");
  			String sql = "SELECT COUNT(*) FROM KOSTAMEMBER WHERE NAME LIKE '%" + name + "%' "; 
  			String sql2 = "SELECT ID, NAME, EMAIL FROM KOSTAMEMBER WHERE NAME LIKE '%" + name + "%' ";
  																							
  			pstmt = conn.prepareStatement(sql);
  			rs = pstmt.executeQuery();
  			
  		//4. �� ����� �޾ƿͼ� ���̺� ���·� �����ֱ�
  		rs.next();
  		int count = rs.getInt(1); 		
%>
<body>
	<table style="width: 900px; height: 500px">
		<tr>
			<td colspan="2"><jsp:include page="/CommonModule/Top.jsp" /> </td>
		</tr>
		<tr>
			<td  style="width: 200px"><jsp:include page="/CommonModule/Left.jsp" /> </td>
			<td style="width: 700px">
				<div  align="center">
					<table width="500" border="1">
						<tr bgcolor="gold">
							<th width="30%">���̵�</th>
							<th width="30%">�̸�</th>
							<th width="30%">�̸���</th>
						</tr>
						<%
							 	if( count > 0 ) {
							 		pstmt = conn.prepareStatement(sql2);
							 		rs = pstmt.executeQuery();
							 		while (rs.next()){
							 			String id = rs.getString(1);
							 			String name2 = rs.getString(2);
							 			String email = rs.getString(3);
							 			
						%>
							<tr>
								<td><%= id %></td>
								<td><%= name2 %></td>
								<td><%= email %></td>
							</tr>
						<%
							 		}//while end
							 		out.println("<tr><td colspan='3'>");
						 			out.println("<b>" + name + "���� ��" + count +"�� �Դϴ�. </b>");
						 			out.println("</td></tr>");
						 			
							 	} else {
							 		out.println("<tr><td colspan='3'>");
						 			out.println("<b>" + name + "�� ������ �����ϴ�. </b>");
						 			out.println("</td></tr>");
							 	} //end if
						%>					
					</table>
				</div>
			
			</td>
		</tr>
		<%	
  		}catch (Exception e){
  			e.printStackTrace();
  		}finally{
  			//5. ����� �ڿ� �ݳ� 
  			CloseUtil.close(rs);
  			CloseUtil.close(pstmt);
  			CloseUtil.close(conn);
  		}
  	%>
	<tr>
		<td colspan="2"><jsp:include page="/CommonModule/Bottom.jsp" /> </td>
	</tr>
	</table>
</body>
</html>






