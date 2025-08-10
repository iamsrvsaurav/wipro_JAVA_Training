<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp Include</title>
</head>
<body>
<table>
<tr>
<td>
<jsp:include page="header.jsp" flush="true" >
<jsp:param value="Rakesh Kr. Srivastava" name="empname"/>
<jsp:param value="Sr. Consultant" name="designation"/>
</jsp:include>
</td>
</tr>
<tr>
<td>Department:IT Training</td>
</tr>
</table>
</body>
</html>