<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Yahoo!!</title>
</head>
<body>

<h2> ${msg}</h2>
<h2> ${student.hobby}</h2>
<H1>${student.name}</H1>
<H1>${student.hobby}</H1>

<table>

<tr><td>Student Name : </td>
<td>${student.name}</td>
</tr>
<tr><td>Student Hobby : </td>
<td>${student.hobby}</td>
</tr>
<tr><td>Student Mobile : </td>
<td>${student.mobile}</td>
</tr>
<tr><td>Date of Birth : </td>
<td>${student.dob}</td>
</tr>
<tr><td>Skills : </td>
<td>${student.skills}</td>
</tr>

<tr><td>Student Address </td>
<td> country : ${student.studentAdd.country}</td>
<td> city : ${student.studentAdd.city}</td>
<td> street : ${student.studentAdd.street}</td>
<td> pincode : ${student.studentAdd.pincode}</td>
</tr>



</table>
</body>
</html>