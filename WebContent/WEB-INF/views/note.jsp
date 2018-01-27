<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create your note</title>
</head>
<body>
	<jsp:include page="_header.jsp" />
	<form:form id="createNote" modelAttribute="note" action="processNote"
		method="post">
		<h2>Create a note</h2>
		<table align="center">
			<tr>
				<td><form:label path="slug">Title</form:label></td>
				<td><form:input path="slug" name="slug" id="slug" /></td>
				<td><form:label path="details">Note Details</form:label></td>
				<form:textarea path="details" name="details" id="details" cols="50"
					rows="10"></form:textarea>
				<td><form:label path="references">References</form:label></td>
				<td><form:input path="references" name="references"
						id="references" /></td>
				<td><form:label path="category">Category</form:label></td>
				<td><form:input path="category" name="category" id="category" /></td>
			</tr>
			<tr>
				<td><form:button id="create" name="create">Save Note</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>