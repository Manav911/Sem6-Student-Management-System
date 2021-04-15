function validation(){
	
	var pass = document.forms["admin"]["adminpassword"].value;
	var cpass= document.forms["admin"]["repassword"].value;
	
	if(document.forms["admin"]["adminname"].value == "")
		{
			alert("Please enter name");
			document.forms["admin"]["adminname"].focus();
			return false;
		}
	if(document.forms["admin"]["adminemail"].value == "")
	{
		alert("Please enter email");
		document.forms["admin"]["adminemail"].focus();
		return false;
	}
	if(document.forms["admin"]["admingender"].value == "Gender")
	{
		alert("Please select gender");
		document.forms["admin"]["admingender"].focus();
		return false;
	}
	if(document.forms["admin"]["adminmobilenumber"].value == "")
	{
		alert("Please enter number");
		document.forms["admin"]["adminmobilenumber"].focus();
		return false;
	}
	if(document.forms["admin"]["adminmobilenumber"].value.length != 10)
	{
		alert("Please enter 10 digit number");
		document.forms["admin"]["adminmobilenumber"].focus();
		return false;
	}
	if(document.forms["admin"]["adminpassword"].value == "")
	{
		alert("Please enter password");
		document.forms["admin"]["adminpassword"].focus();
		return false;
	}
	if(document.forms["admin"]["repassword"].value == "")
	{
		alert("Please enter confirm password");
		document.forms["admin"]["repassword"].focus();
		return false;
	}
	if(pass !=  cpass)
	{
		alert("Password and confirm password not match");
		return false;
			
	}
	
	
}
