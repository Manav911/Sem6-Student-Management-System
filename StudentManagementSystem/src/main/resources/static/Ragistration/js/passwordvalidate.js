function validation()
{
	var p = document.forms["Registration"]["password"].value;
	var rp =document.forms["Registration"]["repassword"].value;
	
	if (p != rp) 
	{
      alert("Passwords Are Not Match");
      document.forms["Registration"]["password"].focus();
      return false;
	}
	
	
}