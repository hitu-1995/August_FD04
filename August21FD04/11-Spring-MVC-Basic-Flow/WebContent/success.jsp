<%@page import="com.cjc.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: blue;">You are Loged in SuccessFully!!!</h1>
<%
Student stu=(Student)request.getAttribute("stu1"); 
%>
User Name :- <%=stu.getUname()%>
Password :- <%=stu.getPass()%>
 Name :- <%=stu.getName()%>
Address :- <%=stu.getAddr()%>

</body>
</html>