<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is Registration Page....</h1>
<hr>
  <div align="center">
  <form action="register">
  <input type="hidden" name="id" value="${data.id}"><br>
  <label>User Name: </label> <input type="text" name="uname" value="${data.uname}"><br>
  <label>Password: </label> <input type="password" name="pass" value="${data.pass}"><br>
  <label>Name: </label> <input type="text" name="name" value="${data.name}"><br>
  <label>Address: </label> <input type="text" name="adress" value="${data.adress}"><br>
  <label>Mobile: </label> <input type="text" name="mob" value="${data.mob}"><br>
  <input type="submit" value="SAVE">
  </form>
  </div>

</body>
</html>