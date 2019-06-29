
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Yahoo!!</title>
</head>

<h1><p><font color="green">${msg}</font></p></h1>

<form:errors path="student.*"/>
<body>
	<form action="/submitAdmisionForm.html" method="POST">
	<table>
	<tr>
	<td>Student Name :</td> <td><input name="name" type="text" /> </td>
	</tr>
	
	<tr>
	<td>Student Hobby : </td><td><input name="hobby" type="text" /> </td>
	</tr>
	<tr>
	<td> Mob  Number : </td><td><input name="mobile" type="text" /> </td>
	</tr>
	
	<tr>
	<td>Date of Birth : </td><td><input name="dob" type="text" /> </td>
	</tr>
	<tr>
	<td>Student skills : </td><td> <select  name="skills" multiple>
									<option value "Core Java">Core Java</option>
									<option value "Spring Core ">Spring Core </option>
									<option value "Spring MVC">Spring MVC</option>
									</select> </td>
	</tr>		 
	
	</table>	
	
	<table>
	<tr><td>  Student's Address </td></tr>
	
	<tr>
	
	<td>Country: <input type ="text" name ="studentAdd.country"></td>
	<td>City: <input type ="text" name ="studentAdd.city"></td>
	<td>Street: <input type ="text" name ="studentAdd.street"></td>
	<td>Pincode: <input type ="text" name ="studentAdd.pincode"></td>

	</tr>
	<tr> 
	<td><input type="submit" /> </td>
	</tr> 
	
	</table>
	</form>
</body>
</html>