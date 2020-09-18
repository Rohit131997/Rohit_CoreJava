<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
<%@page import="com.jsp.dao.StudentDetails"%>
<%@page import="java.util.Iterator"%> 

<% ArrayList<StudentDetails> studentList = (ArrayList) request.getAttribute("StuList"); %> <%--Assigning ArrayList object containing Employee data to the local object --%>


<table cellspacing="2" cellpadding="2">

<tr><th>Student ID</th><th>Student Age</th><th>Student Name</th><th>Student City</th></tr>
<%
// Iterating through subjectList
if(request.getAttribute("StuList") != null)  // Null check for the object
{
	Iterator<StudentDetails> iterator = studentList.iterator();  // Iterator interface
	
	while(iterator.hasNext())  // iterate through all the data until the last record
	{
		StudentDetails stuDetails = iterator.next(); //assign individual employee record to the employee class object
	%>
	<tr><td><%=stuDetails.getStudentID()%></td>
		<td><%=stuDetails.getStudentAge()%></td>
		<td><%=stuDetails.getStudentName()%></td>
		<td><%=stuDetails.getStudentCity()%></td>
	</tr>
	<%
	}
}
%>
</table>

</body>
</html>