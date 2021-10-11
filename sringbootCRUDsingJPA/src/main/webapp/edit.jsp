<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<input type="hidden" name="id" value=${data.id}>
<table border="1">
<tr>
<td>User name:-</td><td><input type="text" name="uname" value=${data.uname}></td>
</tr>
<tr>
<td>password:-</td><td><input type="text" name="pass" value=${data.pass}></td>
</tr>
<tr>
<td> name:-</td><td><input type="text" name="name" value=${data.name}></td>
</tr>
<tr>
<td>mobileno:-</td><td><input type="text" name="mobileno" value=${data.mobileno}></td>
</tr>
<tr>
<td><input type="submit" value="update"></td>
</table>
</form>
</body>
</html>