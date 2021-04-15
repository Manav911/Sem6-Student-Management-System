function validation() {
	
	if (document.forms["UploadAssignment"]["asstitle"].value == "") 
	{
      alert("Please enter title");
      document.forms["UploadAssignment"]["asstitle"].focus();
      return false;
	}
	if (document.forms["UploadAssignment"]["assdescription"].value == "") 
	{
      alert("Please enter description");
      document.forms["UploadAssignment"]["assdescription"].focus();
      return false;
	}
	if (document.forms["UploadAssignment"]["file"].value == "") 
	{
      alert("Please select at least one file");
      document.forms["UploadAssignment"]["file"].focus();
      return false;
	}
	
}