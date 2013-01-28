<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
function addStudent(){
	
	 if (document.form1.name.value==""){
		 alert("姓名不能为空！");
		 return;
	 }
	 document.form1.action="AddStudent";
	 document.form1.submit();
}
</script>
</head>
<body>
	<CENTER>
		<FONT SIZE=5 COLOR=blue>添加学生信息</FONT>
	</CENTER>
	<BR>
	<HR>
	<BR>
	<form action="AddStudent" method="POST" name="form1">
		<font size=5 color=red> </font> <br>
		<P>
			姓名 : <INPUT name=name>
		</P>
		<p>
			性能: <select name="sex">
				<option value="0">男</option>
				<option value="1">女</option>
			</select>
		<P>
			备注 : <INPUT name="memo" value="">
		</P>
		<INPUT name="add" type=button value="添加" onclick="addStudent();">
	</form>

</body>
</html>