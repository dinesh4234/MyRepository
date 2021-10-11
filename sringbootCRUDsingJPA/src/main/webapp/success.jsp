<%@ page import="java.util.*"%>
<%@ page import="com.cjc.main.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1> Student information details</h1>
<script type="text/javascript">
function deletedata()
{ 
 alert("delete");
 document.myform.action="delete";
 document.myform.submit();
	}
function updatedata()
{ 
 alert("update");
 document.myform.action="edit";
 document.myform.submit();
	}

function adddata()
{ 
 alert("add");
 document.myform.action="add";
 document.myform.submit();
	}

</script>
</head>
<body>

<h1> ${Msg}</h1>
	<form name="myform">
		<table border="2">
			<tr>
				<th>sr no</th>
				<th>Id</th>
				<th>username</th>
				<th>password</th>
				<th>Name</th>
				<th>mobileno</th>
			</tr>

			<c:forEach items="${data}" var="stu">
				<tr>
					<td><input type="radio" name="id"
						value="<c:out value="${stu.id }"></c:out>"></td>
					<td><c:out value="${stu.id}"></c:out></td>
					<td><c:out value="${stu.uname}"></c:out></td>
					<td><c:out value="${stu.pass}"></c:out></td>
					<td><c:out value="${stu.name}"></c:out></td>
					<td><c:out value="${stu.mobileno}"></c:out></td>
				</tr>
			</c:forEach>
			<tr>
			<td><input type="button" value="delete" onclick="deletedata()"></td>
			<td><input type="button" value="update" onclick="updatedata()"></td>
			<td><input type="button" value="add" onclick="adddata()"></td>
			</tr>
		</table>
	</form>
</body>
</html>