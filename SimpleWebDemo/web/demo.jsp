<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>CH7 - Core_forEach1.jsp</title>
</head>
<body>

	<%
		String atts[] = new String [5]; 
	    atts[0]="hello"; atts[1]="this"; 
	    atts[2]="is";
	    atts[3]="a";
	    atts[4]="pen";
	    request.setAttribute("atts", atts);
	%>
    <c:forEach items="${atts}" var="item" begin="1" end="4" step="2">
    <c:out value="${item}"></c:out>
	</c:forEach>
</body>
</html>
