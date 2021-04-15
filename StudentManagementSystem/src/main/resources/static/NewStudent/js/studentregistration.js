function validation()
{
	var emailformat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
	var pass = document.forms["student"]["password"].value;
	var cpass = document.forms["student"]["repassword"].value;
	if (document.forms["student"]["studentname"].value == "") 
	{
      alert("Please enter student name");
      document.forms["student"]["studentname"].focus();
      return false;
	}
	if (document.forms["student"]["mobilenumber"].value == "") 
	{
      alert("Please enter student number");
      document.forms["student"]["mobilenumber"].focus();
      return false;
	}
	if(document.forms["student"]["mobilenumber"].value.length != 10)
	{
	 alert("Please enter valid 10 digit number");
      document.forms["student"]["mobilenumber"].focus();
      return false;
	}
	if (document.forms["student"]["email"].value == "") 
	{
      alert("Please enter student email");
      document.forms["student"]["email"].focus();
      return false;
	}
//	if(document.forms["student"]["email"].value.match == emailformat)
//	{
//	return true;
//	}
//	else
//	{
//		alert("Please enter Valid email");
//      document.forms["student"]["email"].focus();
//      return false;
//		
//	}
	if (document.forms["student"]["address"].value == "") 
	{
      alert("Please enter student address");
      document.forms["student"]["address"].focus();
      return false;
	}
	if (document.forms["student"]["bdate"].value == "") 
	{
      alert("Please enter student birth date");
      document.forms["student"]["bdate"].focus();
      return false;
	}
	
	if (document.forms["student"]["password"].value == "") 
	{
      alert("Please enter Password");
      document.forms["student"]["password"].focus();
      return false;
	}
	if (document.forms["student"]["repassword"].value == "") 
	{
      alert("Please enter Confirm Password");
      document.forms["student"]["repassword"].focus();
      return false;
	}
	if(pass != cpass)
	{
		  alert("Passwords are not match");
	      return false;
		
		
	}
	
}