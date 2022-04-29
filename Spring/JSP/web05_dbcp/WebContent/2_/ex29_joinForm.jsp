<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Main Intro</title>
<style type="text/css">
	table {
		border: solid 2px black;
		border-collapse: collapse;
	}
	tr {
		border: solid 1px blue;
		background-color: white;
		color : black;
	}
	td {
		border: solid 1px red;	
	}
</style>
</head>
<body>
	<table style="width: 900px; height: 500px">
		<tr>
			<td colspan="2"><jsp:include page="/CommonModule/Top.jsp" /> </td>
		</tr>
		<tr>
			<td  style="width: 200px"><jsp:include page="/CommonModule/Left.jsp" /> </td>
			<td style="width: 700px">
				<form action="ex29_joinOK.jsp" method="post" name="joinForm">
					<h3>ȸ�� ����</h3>
					<div>
						<table>
							<tr>
								<th>ID : </th>
								<td><input type="text" name="id" id = "id" ></td>
							</tr>
							<tr>
								<th>PWD : </th>
								<td><input type="password" name="pwd" id = "pwd" ></td>
							</tr>
							<tr>
								<th>Name : </th>
								<td><input type="text" name="name" id = "name" ></td>
							</tr>
							<tr>
								<th>age : </th>
								<td><input type="number" name="age" id = "age"  maxlength="3"></td>
							</tr>
							<tr>
								<th>Gender : </th>
								<td>
										<input type="radio" name="gender" id = "gender"  value="��" checked>����
										<input type="radio" name="gender" id = "gender"  value="��" >����
								</td>
							</tr>
							<tr>
								<th>Email : </th>
								<td><input type="email" name="email" id = "email" ></td>
							</tr>
							
							<tr>
								<td colspan="2">
										<a href="javascript:joinForm.submit()"> ȸ�� �����ϱ�</a>
										|| <a href="javascript:joinForm.reset()"> �ٽ� �ۼ��ϱ�</a>
								</td>
							</tr>
						</table>
					</div>
				</form>
			</td>
		</tr>
		<tr>
			<td colspan="2"><jsp:include page="/CommonModule/Bottom.jsp" /> </td>
		</tr>
	</table>
</body>
</html>






