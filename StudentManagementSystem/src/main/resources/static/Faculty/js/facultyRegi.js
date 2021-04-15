function validation() {
	
	var pass = document.forms["faculty"]["password"].value;
	var cpass = document.forms["faculty"]["repassword"].value;

	if(document.forms["faculty"]["facultyname"].value =="")
		{
		 alert("Please enter faculty name");
	      document.forms["faculty"]["facultyname"].focus();
	      return false;
		}
	if(document.forms["faculty"]["mobilenumber"].value =="")
	{
	 alert("Please enter faculty Number");
      document.forms["faculty"]["mobilenumber"].focus();
      return false;
	}
	if(document.forms["faculty"]["mobilenumber"].value.length != 10)
	{
	 alert("Please enter valid 10 digit number");
      document.forms["faculty"]["mobilenumber"].focus();
      return false;
	}
	
	if(document.forms["faculty"]["email"].value =="")
	{
	 alert("Please enter faculty email");
      document.forms["faculty"]["email"].focus();
      return false;
	}
	if(document.forms["faculty"]["address"].value =="")
	{
	 alert("Please enter faculty address");
      document.forms["faculty"]["address"].focus();
      return false;
	}
	
	if(document.forms["faculty"]["bdate"].value =="")
	{
	 alert("Please select faculty Birth Date");
      document.forms["faculty"]["bdate"].focus();
      return false;
	}
	if (document.forms["faculty"]["password"].value == "") 
	{
      alert("Please enter Password");
      document.forms["faculty"]["password"].focus();
      return false;
	}
	if (document.forms["faculty"]["repassword"].value == "") 
	{
      alert("Please enter Confirm Password");
      document.forms["faculty"]["repassword"].focus();
      return false;
	}
	if(pass != cpass)
	{
		  alert("Passwords are not match");
	      return false;
	}
}