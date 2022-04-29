<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../view/color.jsp" %>    
<%@ page import="edu.kosa.model.*,  java.sql.* ,  java.util.*" %>

<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gift.jsp 회원 리스트 보기</title>
<link href="../view/mystyle.css"  rel="stylesheet" type="text/css">
</head>
<body>
<center>
<table border="1" cellspacing="0"  cellpadding="5">
	<tr>
		<td bgcolor="<%=title_c %>">ID</td>
		<td bgcolor="<%=title_c %>">회원명</td>
		<td bgcolor="<%=title_c %>">생년월일</td>
		<td bgcolor="<%=title_c %>">이메일</td>
		
	</tr>
	<%
			GiftDAO dao = GiftDAO.getInstance();
			ArrayList<GiftVO>  list = dao.selectAll();
			GiftVO vo = null;
			
			for(int i=0; i< list.size() ;  i++) {
				vo = (GiftVO) list.get(i);
			 	int gno = vo.getGno();
				String gname = vo.getGname();
				int g_start = vo.getgStart();
				int g_end = vo.getgEnd();				
	%>
		<tr>
				<td><%= gno %></td>
				<td><%= gname %></td>
				<td><%= g_start%></td>
				<td><%= g_end %></td>				
		</tr>
	<%	
			} // for end
	%>
	<tr>	
		<td  colspan="6">
			<input type="button" value="메인으로"  onclick="window.location='main.jsp'  ">
		</td>
	</tr>
</table>
</center>
</body>
</html>






