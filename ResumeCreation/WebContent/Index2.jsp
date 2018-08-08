<%@page import="com.cg.resume.Resume"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!-- This is the Jsp file that receives the object of resume created by the controller and 
	extracts the required fields to be displayed in the web page and displayes it -->


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

table{
	align-self: stretch;
}
#content {
    position: relative;
}
#content img {
    position: absolute;
    top: 0px;
    right: 50px;
}

</style>
</head>
<body>
<h1 align="center">Created Resume</h1>
<%
	Resume resume = (Resume)request.getAttribute("ResumeObject");
%>

<table align="center" cellspacing="20">

<div id = "content" >
<img src="<%=resume.getPhoto() %>" height="100" width="100">
</div>

	<tr >
		<td>
			Name :
		</td>
		<td>
			<%=resume.getFname()+" "+resume.getLname()%>
		</td>
	<tr>
	
<!--	<tr>
		<td>
			Last Name :
		</td>
		<td>
			<%=resume.getLname()%>
		</td>
	</tr> -->
	
	<tr>
		<td>
			Gender :
		</td>
		<td>
			<%=resume.getGender()%>
		</td>
	</tr>	
	<tr>
		<td>
			Highest Qualification :
		</td>
		<td>
			<%=resume.getQualification()%>
		</td>
	</tr>	
	<tr>
		<td>
			Date Of Birth : 
		</td>
		<td>
			<%=resume.getDob()%>
		</td>
	</tr>	
	<tr>
		<td>
			Hobbies : 
		</td>
		<td>
			<% for(String hobbies : resume.getHobbies()){
				%>
				
				<%=hobbies+" "%>
				<% 
			}%>
		</td>
	</tr>	
	<tr>
		<td>
			Address :
		</td>
		<td>
			<%=resume.getAddress()%>
		</td>
	</tr>	
	<tr>
		<td>
			Skills : 
		</td>
		<td>
			<% for(String skill : resume.getSkills()){
				%>
				
				<%=skill%>&nbsp&nbsp
				
				<% 
			}%>
		</td>
	</tr>	
	<tr>
		<td>
			Email : 
		</td>
		<td>
			<%=resume.getEmail() %>
		</td>
	</tr>	
	<tr>
		<td>
			Contact Number :
		</td>
		<td>
			<%=resume.getContactNumber() %>
		</td>
	 </tr>
	 <tr>
		<td>
			Summary :
		</td>
		<td>
			<%=resume.getSummary() %>
		</td>
	 </tr>
</table>


</body>
</html>