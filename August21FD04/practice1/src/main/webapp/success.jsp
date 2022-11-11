<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>These is Success Page</h1>
<%String un=(String)request.getAttribute("un"); %>
<%String ps=(String)request.getAttribute("ps"); %>
<h2><%=un%></h2><br><br>
<h2><%=ps%></h2><br>

</body>
</html>