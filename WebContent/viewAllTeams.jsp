<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="ViewAllTeamsServlet">
		<table>
			<c:forEach items="${requestScope.allItems}" var="currentitem">
				<tr>
					<td><input type="radio" name="id" value="${currentitem.id}"></td>
					<td>${currentitem.store}</td>
					<td>${currentitem.item}</td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="Edit Selected Player" name="doThisToItem">
		<input type="submit" value="Delete Selected Player" name="doThisToItem">
		
	</form>
</body>
</html>