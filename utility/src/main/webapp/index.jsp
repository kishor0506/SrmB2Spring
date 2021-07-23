<%@page import="java.util.Date"%>
<html>
<head>
<script>
function onGetData()
{
	var uname=document.getElementById('uname').value;
	var mail=document.getElementById('mail').value;
	var phone=document.getElementById('phone').value;
	var address=document.getElementById('addr').value;
	console.log("Username : "+uname);
	console.log("Email-Id : "+mail);
	console.log("Phone Number : "+phone);
	console.log("Address : "+address);
	
}

</script>
</head>
<body>
<form>
<table>
<tr><td>Username : </td><td><input type="text" id="uname" /></td><td></td></tr>
<tr><td>Email-Id : </td><td><input type="email" id="mail" /></td></tr>
<tr><td>Phone Number : </td><td><input type="text" id="phone" maxlength="10" /></td></tr>
<tr><td>Address : </td><td><textarea  id="addr"></textarea>
<tr><td><input type="button" onClick="onGetData()" value="Submit Data"/></td></tr>
</table>
</form>
<h2><center>Displaying Current Date and Time</center></h2>
<%
out.println("Current Date and Time : "+new Date());
%>
</body>
</html>