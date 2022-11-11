<%@page import="com.cjc.web.crud.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
   
     function  editStudent() {
		
    	 document.fn.action="edit";
    	 document.fn.submit();
    	 
	}
     function  deleteStudent() {
 		
    	 document.fn.action="delete";
    	 document.fn.submit();
    	 
	}     
     function  addStudent() {
		
   	 document.fn.action="reg";
   	 document.fn.submit();
   	 
	}
</script>
</head>
<body>
	<h1>This is Success Page</h1>
	<hr>
	
	   <div align="center">
	   <form name="fn">
	<table border="1" style="color: green;">
		<thead>
			<tr>
				<th>Select</th>
				<th>Student ID</th>
				<th>Student Name</th>
				<th>Student Address</th>
				<th>Student Mob.No</th>
				<th>User Name</th>
				<th>Password</th>
			</tr>
		</thead>
		<tbody>
		  <c:forEach items="${data}" var="user">
		   <tr>
	        <td><input type="radio" name="id" value="${user.id}"></td>
	        <td>${user.id}</td>
	        <td>${user.name}</td>
	        <td>${user.adress}</td>
	        <td>${user.mob}</td>
	        <td>${user.uname}</td>
	        <td>${user.pass}</td>
		   </tr>
		</c:forEach>
		</tbody>
	</table>
     <input type="button" value="EDIT" onclick="editStudent()">&nbsp;&nbsp;
     <input type="button" value="DELETE" onclick="deleteStudent()">&nbsp;&nbsp;
     <input type="button" value="ADD" onclick="addStudent()">&nbsp;&nbsp;
      
</form>

	   </div>
</body>
</html>