<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facility Management System</title>
</head>
<body>
<h1>Facility Data</h1>
<form:form action="facility.do" method="POST" commandName="student">
	<table>
		<tr>
			<td width="182">Id</td>
			<td width="63"><form:input path="Id" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><form:input path="address" /></td>
		</tr>
		<tr>
			<td>Contact</td>
			<td><form:input path="contact" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>Id</th>
	<th>Name</th>
	<th>Address</th>
	<th>Contact</th>
	<c:forEach items="${facilityList}" var="facility">
		<tr>
			<td>${facility.Id}</td>
			<td>${facility.name}</td>
			<td>${facility.address}</td>
			<td>${facility.contact}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
</body>
</html>