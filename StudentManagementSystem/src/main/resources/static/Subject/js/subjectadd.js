function validation() {
	
	if (document.forms["newSubject"]["subname"].value == "") 
	{
      alert("Please enter subject name");
      document.forms["newSubject"]["subname"].focus();
      return false;
	}
}