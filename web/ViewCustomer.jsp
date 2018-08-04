<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View customer</title>
</head>
<body>
<form action="ViewCustomer">
<table border="0">
<tr>
<td>Latitude</td><td><input type="text" name="latitude" required="true"></td>
</tr>
<tr>
<td>Longitude</td><td><input type="text" name="longitude" required="true"></td>
</tr>
</table>
<input type="submit" value="View Customer">
</form>
<%
try{
ArrayList<String> al=(ArrayList)request.getSession().getAttribute("result");
for(String a : al)
{
	out.print(a);
}
}
catch(Exception e){
	
}
%>
</body>
</html>