<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
<form:form method="POST" commandName="user" action="${pageContext.request.contextPath}/user/add.html">
<table>
          <tr>
			<td><label for="">Mobile</label></td>
			<td><input name="mobile" type="text"></td>
		</tr>
       		<tr>
			<td><label for="">Email id</label></td>
			<td><input name="email" type="text"></td>
		</tr>
		<tr>
			<td><label for="">Password</label></td>
			<td><input name="password" type="password"></td>
		</tr>
		
	    <tr>
	        <td><input type="submit" value="Sign Up" > </td>
	    </tr>
		
</table>
</form:form>
</body>
</html>