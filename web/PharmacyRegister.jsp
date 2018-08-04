<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pharmacy Register</title>
</head>
<body>
<form action="PharmacyRegister">
<table border="0">
<tr>
<td>name</td><td><input type="text" name="name" required="true"></td>
</tr>
<tr>
<td>Address</td><td><input type="text" name="address" required="true"></td>
</tr>
<tr>
<td>Phone</td><td><input type="text" name="phone" required="true"></td>
</tr>
<tr>
<td>Latitude</td><td><input type="text" name="latitude" required="true"></td>
</tr>
<tr>
<td>Longitude</td><td><input type="text" name="longitude" required="true"></td>
</tr>




<%
try{
if(Integer.parseInt((String)request.getSession().getAttribute("insertresult"))>0){
	out.print("inserted sucessfully");
request.getSession().removeAttribute("insertresult");
}else{
	out.print("inserted not sucessfull");
}
}catch(Exception e){
	
}

%>
</table>
<input type="submit" value="Add Pharmacy">
</form>
</body>
</html>