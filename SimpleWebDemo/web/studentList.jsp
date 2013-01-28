<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
     function delStudent(id){
    	 if (confirm("你确认删除这个学生信息吗？")){
    		 location.href="/SimpleWebDemo/DeleteStudent?id="+id;
    	 }
     }
</script>
</head>

<body>
	<center>
		<table border="0">
			<tr>
				<td>姓名</td>
				<td>性别</td>
				<td>备注</td>
				<td>操作</td>
			</tr>
			<c:forEach var="item" items="${list}">
				<tr>
					<td><c:out value="${item.name}" /></td>
					<td><c:out value="${item.sexName}" /></td>
					<td><c:out value="${item.memo}" /></td>
					<td><a href="#"
						onclick="delStudent(<c:out value="${item.id}" />)">删除</a></td>
				</tr>
			</c:forEach>
		</table>
		<p>
			<a href="/SimpleWebDemo/studentAdd.jsp">继续添加学生信息</a>
		</p>
</body>
</html>