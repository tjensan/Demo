

function validation(){
	
	const form= document.getElementById('container');

form.addEventListener('submit', e =>{
	e.preventDefault();
});

	var fname;
	
	fname = document.getElementById('fname');
	
	if(fname=="") alert("Enter your first name");
}