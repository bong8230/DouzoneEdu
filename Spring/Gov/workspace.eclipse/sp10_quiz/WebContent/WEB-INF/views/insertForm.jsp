<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Form</title>
</head>
<body>
	<h3>데이터 입력</h3>
	<form action="insert.do" method="post">
		dcode : <input type="text" name="dcode"><br/>
		dname : <input type="text" name="dname"><br/>
		pdept : <input type="text" name="pdept"><br/>
		area : <input type="text" name="area"><br/>
		
		<input type="submit" value="입력완료">&nbsp;&nbsp;&nbsp;
		<input type="reset" value="취소">&nbsp;&nbsp;&nbsp;
		<input type="button" value="리스트" onclick=" location.href= 'list.do' ">&nbsp;&nbsp;&nbsp;
	</form>
</body>
</html>