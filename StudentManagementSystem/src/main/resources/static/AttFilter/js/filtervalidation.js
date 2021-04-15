function validation() {

	if(document.forms["AttFilter"]["date"].value == "")
		{
			alert("Please select date ");
			document.forms["AttFilter"]["date"].focus();
			return false;
		}
		
}