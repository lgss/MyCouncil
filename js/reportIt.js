(function ($){

	var nbcApp = nbcApp || {models: {}};


	nbcApp.models.ES = function(){
		var self = this,
		geocoder,
		map,
		mapCanvas,
		mapOptions,
		mapCenter,
		mapMarker,
		mapBounds,
		lat,
		lng,
		heading = 0,
		pitch = 0,
		zoom = 0,
		problemStreet = "",
		problemLocation = "",
		$errors = $('.error'),
		$problemAddress = $("#Address"),
		$problemDetails = $("#Incident"),
		$problemName = $("#Name"),
		$problemEmail = $("#Email"),
		$problemPhone = $("#Tel"),
		$problemNumber = $("#Type"),
		$receiptOptions = $('.receipt-options'),
		$receiptCheck = $('.receipt-required'),
		$confirmation = $("#confirmation");

		this.init = function() {
			//set up the form defaults
			$errors.hide();
			$receiptOptions.hide();
			self.createMap();

			//checkbox listener
			$receiptCheck.on('click',function(e){
				if (this.checked) {
					$receiptOptions.show();
				}
				else {
					$receiptOptions.hide();
				}
			});

			//address search button listener
			$('#searchButton').on('click', function(e) {
				e.preventDefault();
				self.searchForAddress();
				//self.focusMap();
			});

			//submit button listener
			$('#Submit').on('click', function(e) {  
				e.preventDefault();
				$errors.hide();
				var error = false;
				
				//if receipt required and email isn't valid, return false
				if ($receiptCheck.prop('checked') && !self.emailCheck($problemEmail.val())){
					$(".email").show();
					error = true;
				}
				
				//if receipt required and tel isn't valid, return false
				if ($receiptCheck.prop('checked') && !self.telephoneCheck($problemPhone.val())){
					$(".phone").show();
					error = true;
				}
				
				if ($receiptCheck.prop('checked') && (!$problemPhone.val() && !$problemEmail.val())){
					$(".phone").show();
					$(".email").show();
					error = true;
				}

				if (!self.addressCheck(problemLocation)){
					self.showLocationError();
					error = true;
				}

				if(!self.checkLocationBounds(mapMarker.getPosition())){
					self.showLocationError();
					$(".map-error").show();
					error = true;
				}
				if(error){
					return false;
				}
				$(window).scrollTop($("#mainForm").scrollTop());
				$errors.hide();
				self.submitCase();
			});

			//center the map to the marker position when resized (for orientation changes)
			$(window).on('resize', function() {
				map.setCenter(mapMarker.getPosition());
			});
		};

		//shows an error if the location selected is invalid
		this.showLocationError = function (){
			$(".location").show();
			$(window).scrollTop($(".location").scrollTop());
		};

		this.hideLocationError = function (){
			$(".location").hide();
		};

		//changes the opacity of the map on focus
//		this.focusMap = function() {
//			$(mapCanvas).addClass('opaque');
//		};

		//sets up the global objects and listeners for the map
		this.createMap = function() {
			//find the container and create the map.
			mapCanvas = document.getElementById("map_canvas");
			mapCenter = new google.maps.LatLng(52.23740,-0.89463);
			mapOptions = {
					center: mapCenter,
					zoom: 12,
					scrollwheel:false,
					streetViewControl: false,
					mapTypeId: google.maps.MapTypeId.ROADMAP
			};

			var sw = new google.maps.LatLng(52.182353,-0.987396);
			var ne = new google.maps.LatLng(52.30512,-0.780029);
			mapBounds = new google.maps.LatLngBounds(sw,ne);

			//set up map objects
			geocoder = new google.maps.Geocoder();
			map = new google.maps.Map(mapCanvas,mapOptions);		
			mapMarker = new google.maps.Marker({
				position:  mapCenter,
				map: map,
				draggable:true
			});
			self.addMarkerListener();
		};

		//checks if the given latLng is within the map bounds
		this.checkLocationBounds = function(latlng) {
			return (mapBounds.contains(latlng)) ? true : false;
		};

		//listens for changes to the map marker and updates address to the nearest reverse geocoded address
		this.addMarkerListener = function() {

			//listen for the marker being dragged
			google.maps.event.addListener(mapMarker, 'dragend', function() {

				var ll = mapMarker.getPosition();
				self.updateMarker(ll);

				//find the address from latlng
				geocoder.geocode({'latLng':ll}, function (results, status) {
					if (status == google.maps.GeocoderStatus.OK) {
						if (results[0]){
							self.setNewAddress(results,false,0);
						}
					}
					else {
						if (status = "ZERP_RESULTS"){
							alert("Please enter a valid address");
						}
						else {
							alert("Geocode was not successful for the following reason: " + status);
						}
					}
				});	

			});

			google.maps.event.addListener(mapMarker, 'dragstart', function() {
				self.focusMap();
			});
		};

		//returns a list of geocoded addresses based on a search
		this.searchForAddress = function() {
			self.hideLocationError();
			var addressStr = $problemAddress.val() + " , Northampton, UK";

			geocoder.geocode( { 'address': addressStr, 'bounds':mapBounds}, function(results, status) {
				if (status == google.maps.GeocoderStatus.OK) {

					//more than one result, ask the user to select an option
					if(results.length > 1){
						self.showPropertyList(results);
					}
					//one result, just set the result as the new address
					else{
						self.setNewAddress(results,true);
					}
				} 
				else {
					if(status = "ZERP_RESULTS"){
						self.showLocationError();
					}
					else{
						alert("Geocode was not successful for the following reason: " + status);
					}
				}
			});
		};

		//updates the map marker given a latLng object
		this.updateMarker = function (latLng) {
			lat = latLng.lat();
			lng = latLng.lng();
			mapMarker.setPosition(latLng);
			map.setZoom(15);
			map.panTo(mapMarker.getPosition());
		};

		//sets the newly selected address and optionally updates the map marker
		this.setNewAddress = function(results, updateMarker, index) {
			var i = index | 0;
			//if the location is within the map bounds, set it
			if(self.checkLocationBounds(results[i].geometry.location)){
				problemLocation = results[i].formatted_address;
				problemStreet = results[i].address_components[1].long_name;
				$problemAddress.val(problemLocation);

				if (updateMarker){
					//update marker and lat/lng
					self.updateMarker(results[i].geometry.location);
				}
			}
			else {
				self.showLocationError();
			}					
		};

		//shows a list of properties within the bounds, or an error if none exist
		this.showPropertyList = function (list) {

			//set up a drop down show and return for multiple results
			var $addressCont = $('#address-results'),
			$addressList = $('#address-list'),
			inBounds = self.getPropertiesInBounds(list);

			//if there are results within the boundary
			if (inBounds){

				var output = "<option>Select</option>";
				for(var x = 0; x < inBounds.length; x+=1){
					output += '<option value="'+x+'">' + inBounds[x].formatted_address + '</option>';
				}

				$addressList.on('change',function(e) {
					//send the results, force marker update and specify the property index
					self.setNewAddress(inBounds,true,this.value);
					$addressCont.hide();
				});

				$addressList.html(output);
				$addressCont.show();
			}
			//otherwise show a location error
			else {
				self.showLocationError();
			}

		};

		//filters an array of geocoder results to only return properties within the bounds
		this.getPropertiesInBounds = function (list) {
			var inBoundsArray = [];
			for(var x = 0; x < list.length; x+=1){
				if(self.checkLocationBounds(list[x].geometry.location)){
					inBoundsArray.push(list[x]);
				}
			}

			return (inBoundsArray.length > 0) ? inBoundsArray : false;
		};

		//handles the ajax call to the server
		this.submitCase = function() {

			//show a 'sending' message while call is progressing and hide the main form
			var sendingText = '<div class="loading"><img src="images/loading.gif" alt="loading" title="loading"><span>Sending</span></div>';
			$confirmation.html(sendingText);
			$("#mainForm").hide();

			//if receipt isn't required, reset the values of email and phone
			if (!$receiptCheck.prop('checked')){
				$problemEmail.val('');
				$problemPhone.val('');
			}

			//make the ajax call
			$.ajax({
				url:"CreateCall",
				type:"POST",
				dataType:"JSON",
				data:{
					problemDetails:$problemDetails.val(),
					problemStreet:problemStreet,
					problemLocation:problemLocation,
					name:$problemName.val(),
					emailAddress:$problemEmail.val(),
					phoneNumber:$problemPhone.val(),
					lat:lat,
					lng:lng,
					heading:heading,
					pitch:pitch,
					zoom:zoom,
					problemNumber:$problemNumber.val()
				},
				success: function(data){
					self.handleSuccess(data);
				},
				error: function(jqXHR, textStatus, errorThrown){
					self.handleError();
				}
			});
		};

		//validate address
		this.addressCheck = function(address) {
			return (address) ? true : false;
		};
		//validate email
		this.emailCheck = function(email) {
			var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
			return (emailReg.test(email) || email === "") ? true : false;
		};
		
		//validate tel
		this.telephoneCheck = function(tel) {
			var regEx = /^[0-9]{6,}$/,
				tel = tel.replace(/ /g,'');
			return (regEx.test(tel) || tel === "") ? true : false;
		};
		//handle a successful form submit
		this.handleSuccess = function(data) {
			self.showSuccess(data.callNumber,data.slaDate);
		};

		//handle a failed form submit
		this.handleError = function() {
			//console.log("error");
		};

		//show the confirmation details
		this.showSuccess = function(caseRef,date) {
			var output ="<p>Your case refence number is</p>";
			output +="<span class ='caseRef'>"+caseRef+"</span>";
			output +="<p>We will aim to resolve this by</p>";
			if(date === "not available"){
				output += "<span>asap</span>";
			}else{
				output +="<span class ='caseDate'>"+date+"</span>";
			}

			$confirmation.html(output);
		};

		//end of ES object
	};

	var esForm = new nbcApp.models.ES();
	esForm.init();

})(jQuery);
