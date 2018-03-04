<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="editPlayerServlet">
<table>
<c:forEach items="${requestScope.allItems}" var="currentitem">
<tr>
	<td><input type="radio" name="id" value="${currentitem.playerId}"></td>
	<td>${currentitem.firstName}</td>
	<td>${currentitem.lastName}</td>
	<td>${currentitem.phoneNumber}</td>
	<td>${currentitem.screenName}</td>
	<td>${currentitem.teamId}</td>
</tr>
</c:forEach>
</table>
<input type="submit" value="Delete Selected Player" name="doThisToItem">
<input type="submit" value="Add New Player" name="doThisToItem">
<input type="submit" value="Back To Menu" name="doThisToItem">
	</form>
</body>
</html>