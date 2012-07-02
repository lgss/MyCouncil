function getResult(){
	var url = document.getElementById('address').value;
	window.location = url;
}
function getResults(){
	var container = document.getElementById('main');
	var date = $(document).getUrlParam("date");
	var day = $(document).getUrlParam("day");
	var type = $(document).getUrlParam("type");
	
	if(type == "black" | type == "brown"){
		type += " wheelie bin";
	}
	var time = getTime(date);
	date = formatDate(date);
	var output = "<p>Your collection day is " +day+".</p>";
	if(type == "bags"){
		output += "We will be collecting your refuse and all recycling every week.<br><br>";	
	}
	else if(type == "black wheelie bin" | type == "brown wheelie bin"){
		console.log("black or brown.");
		output += "This week your "+type+" will be collected.<br><br>";
		output += "Collections alternate weekly between brown and black wheelie bins.<br><br>";
		output += "We will collect all of your recycling every week.<br><br>";
	}else{
		console.log("nowt.");
	}
	container.innerHTML = output;
}

function formatDate(longdate){
	var year = longdate.substr(0,4);
	var month = longdate.substr(4,2);
	var day = longdate.substr(6,2);
	
	return day + "/" + month + "/" + year;
}
function getTime(longdate){
	var hour = longdate.substr(8,2);
	var min = longdate.substr(10,2);
	return hour + ":" + min + "am";
}