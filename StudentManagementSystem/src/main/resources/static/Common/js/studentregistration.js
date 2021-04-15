function validation()
{
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
	if (document.forms["student"]["email"].value == "") 
	{
      alert("Please enter student email");
      document.forms["student"]["email"].focus();
      return false;
	}
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
	
}