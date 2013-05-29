(function($) {

	var nbcApp = nbcApp || {};

	var $loading = $('#loading');
	var $loading2 = $('#loading2');

	var $noPostCode = $('#noPostCode');
	var $nonNBCPostCode = $('#nonNBCPostCode');
	var $postCodeNotValid = $('#postCodeNotValid');
	var $postCodeNotFound = $('#postCodeNotFound');

	var $mainform = $('#mainform');
	var $confirmation = $('#confirmation');
	var $formSubmitted = $('#formSubmitted');
	var $formDetails = $('#formdetails');

	var $validName = $('#validName');
	var $validTel = $('#validTel');
	var $validEmail = $('#validEmail');
	var $noAddressSelected = $('#noAddressSelected');
	var $noDateSelected = $('#noDateSelected');
	var $noItemSelected = $('#noItemSelected');
	var $houseNumber = $('#cboHouseNumber');
	var $txtCustName = $('#txtCustName');
	var $txtCustTel  = $('#txtCustTel');
	var $txtCustEmail  = $('#txtCustEmail');
	var $txtCustPostCode = $('#txtCustPostCode');
	var $txtCustAddress = $('#txtCustAddress');
	var $cboSelectDate = $('#cboSelectDate');
	var $cboItem1 = $('#cboItem1');
	var $cboItem2 = $('#cboItem2');
	var $cboItem3 = $('#cboItem3');
	var $txtAddInfo = $('#txtAddInfo');
	var $tckTerms = $('#tckTerms');
	var $caseRef = $('#caseRef');
	var $objRef = $('#objRef');
	var $sumAddDetails = $('#sumAddDetails');
	var $SummaryDetails = $('#SummaryDetails');
	var $addressRequired = $('#addressRequired');
	var $agreeTerms = $('#agreeTerms');
	var $formdetails = $('#formdetails');
	var $ajaxLoading = $('#ajax-wait');



	nbcApp.init = function(){
		//On page Field Changes
		$formDetails.hide();
		$loading.hide();
		$loading2.hide();

		//Post Code Error Messages
		$noPostCode.hide();
		$nonNBCPostCode.hide();
		$postCodeNotValid.hide();
		$postCodeNotFound.hide();

		//Page Changes
		$confirmation.hide();
		$formSubmitted.hide();

		//Error Messages
		$validName.hide();
		$validTel.hide();
		$validEmail.hide();
		$noAddressSelected.hide();
		$noDateSelected.hide();
		$noItemSelected.hide();
		$agreeTerms.hide();
	}();

	var property;

	/*AJAX REQUESTS---------------------------------------------------------------------------------------------*/	
	/*-------------------------------------------------------------------------------------------------------------------*/	

	/*Get the house number ----------------------------------------------------------------------------------------*/	
	var getHouseNum = function(pc){
		var url = "GetPropertyList?postCode="+pc+"&callback=?";
		return $.ajax({
			url: url,
			dataType:"JSONP"
		});
	};



	/*Get the full address ---------------------------------------------------------------------------------------------*/
	var getAddress = function(idnum){
		var results = property.results;
		for (var x = 0; x < results.length; x++){
			if(results[x].objectId === idnum){
				//Put the full address in the txtCustAddress txt box--------------------------------------------
				$txtCustAddress.val(results[x].fullAddress);
				//Put the object id in a hidden text box ---------------------------------------------------------
				$objRef.val(results[x].objectId);
				break;  
			}
		}
	};	


	/*Get collection date-------------------------------------------------------------*/
	var getCollectionDate = function(pc){
		var url = "GetBulkyCollectionDates?postCode="+pc+"&callback=?";
		$.ajax({
			url: url,
			dataType:"JSONP",
			success: function (data){
				$cboSelectDate.show();
				$loading.hide();
				var results = data.dates;
				//Default text to add to top of results------------------------------------------------------------------------
				var printDate = '<option value = "">Select Date</option>';

				//Get a list of dates add them to printDate--------------------------------------------------------------
				for(var x = 0; x < results.length; x++){
					var selectDate = results[x].textDate;
					var row = "<option value="+results[x].textDate+">"+setDay(pc)+" "+selectDate+"</option>";
					printDate += row;
				}

				//Print the date in the form---------------------------------------------------------------------------------------
				$cboSelectDate.html(printDate);

			},
			error: function (xhr,err,errThrown){
				//console.log("Error");
			}
		});
	};

//	------------------------------------------------------------
	var submitDetails = function () {
		var url = "CreateLaganBulky";
		$.ajaxSetup({
		    beforeSend:function(){
		    	$ajaxLoading.show();
		    },
		    complete:function(){
		    	$ajaxLoading.hide();
		    }
		});
		$.ajax({
			type:  'POST' ,
			dataType:"JSON",
			url: url,
			data: {
				objRef : $objRef.val(),
				txtCustName : $txtCustName.val(),
				txtCustTel  : $txtCustTel.val(),
				txtCustEmail  : $txtCustEmail.val(),
				txtCustPostCode  : $txtCustPostCode.val(),
				txtCustAddress  : $txtCustAddress.val(),
				cboSelectDate  : $cboSelectDate.val(),
				cboItem1  : $cboItem1.val(),
				cboItem2  : $cboItem2.val(),
				cboItem3  : $cboItem3.val(),
				txtAddInfo  : $txtAddInfo.val(),
				tckTerms  : $tckTerms.val(),
				txtObjectRef : $objRef.val()
			} ,
			success: function(data){
				if(data.success){
				var ref = data.caseref;
					ref = ref.substr(6,12);
					$caseRef.html(ref);
					$formSubmitted.show();
				} else{
					alert('Unfortunately there has been an error, please try your booking again.');
					init();
				}

			}
		});
	};



	/*EVENT LISTENERS------------------------------------------------------------------------------------------------*/
	/*---------------------------------------------------------------------------------------------------------------*/

//	Find address -----------------------------------------------------------------------------
	$('#btnFindAddress').on('click',function(e){
		e.preventDefault();
		if(validatePostCode()){
			var pc =$txtCustPostCode.val();
			var stripSpace = pc.replace(/ /g,'');
			var promise = getHouseNum(stripSpace);
			promise.done(function(data){
				property = data;
				var populate = "<option>Select House Number</option>";
				var results = data.results;
				//If no results found display message
				if(results.length === 0){
					$postCodeNotFound.show();
					$loading2.hide();
				}
				else{
					$postCodeNotFound.hide();
					for (var x = 0; x < results.length; x++){
						var newAddress = results[x].addressNumber;
						var row = "<option value="+results[x].objectId + ">" + newAddress + "</option>";
						populate += row;			
					};
					$houseNumber.html(populate);
					displayForm();
					getCollectionDate(stripSpace);
				}
			});
			promise.fail(function(){
				alert("Sorry, there was an error getting properties for that postcode, please try again.");
			});
			//getCollectionDate(stripSpace);
		}
	});

//	Get full address on House number change -----------------------------------------------
	$houseNumber.on('change', function(){
		var idnum = $houseNumber.val();
		$addressRequired.hide();
		getAddress(idnum);
	});

//	Submit Case -----------------------------------------------------------------------------------------------------
	$('#btnSubmitCase').on('click',function(e){
		e.preventDefault();
		$confirmation.hide();
		submitDetails();
	});


//	Amend Button -----------------------------------------------------------------------------------------------------
	$('#btnAmend').on("click", function(e){
		e.preventDefault();
		$confirmation.hide();
		$mainform.show();
	});


//	Submit form to summary-------------------------------------------------------------------------------------------
	$('#btnSubmit').on("click", function(e){
		e.preventDefault();
		if(validateForm()){
			//Submit Form----
			$mainform.hide();
			$confirmation.show();
			$(window).scrollTop($confirmation.scrollTop());
			summary();
		}
	});

//	Validate of the form----------------------------------------------------------------------------------------------------------------
//	----------------------------------------------------------------------------------------------------------------
	//overall form check------
	var validateForm = function(){
		var checkName = validateName();
		var checkEmail = validateEmail();
		var checkCheck = validateCheck();
		var checkAddress = validateAddress();
		var checkTel = validateTel();
		var checkDate = validateDate();
		var checkItems = validateItems();

		if(checkName && checkEmail && checkCheck && checkAddress && checkTel && checkDate && checkItems ){
			return true;
		}
		else{
			if(!checkName || !checkEmail || !checkTel){
				$(window).scrollTop($mainform.scrollTop());
			}
			return false;
		}
	};

	//Check Name ---------------
	var validateName = function(){
		var regEx = /^[ a-z A-Z \xE1 \xE1 \xE9 \xED \xF3 \xFA \xC1 \xC9 \xCD \xD3 \xDA \x27 \x2D ]+$/;
		var name = $txtCustName.val();
		if (name){
			if(regEx.test(name)){
				$validName.hide();
				return true;
			};
		}
		$validName.show();
		return false;
	};
//	check Email ------------------------
	var validateEmail = function() { 
		var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
		var email = $('#txtCustEmail').val();
		if(re.test(email)){
			$validEmail.hide();
			return true;
		}
		$validEmail.show();
		return false;
	};
	//Check post Code is vallid------------------------------------------------------------------------------------------
	var validatePostCode = function (){
		var pc =$txtCustPostCode.val();
		var stripSpace = pc.replace(/ /g,'');
		var regEx = /[n  N][n N][0-5][0-9][a-z A-Z][a-z A-Z]$/
			var inArea = /[n N][n N][0-5]/
				if(regEx.test(stripSpace)){
					postCodeError($loading2);
					return true;
				}
				else{
					if(pc.length === 0 ){
						postCodeError($noPostCode);
					}
					else if(!inArea.test(stripSpace)){
						postCodeError($nonNBCPostCode);
					}
					else{
						postCodeError($postCodeNotValid);
					}
				};

				return false;
	};

//	check Terms and conditions ---------------------------------------
	var validateCheck = function(){
		if($tckTerms[0].checked){
			$agreeTerms.hide();
			return true;
		}
		$agreeTerms.show();
		return false;
	};
//	check Address -----------------------------------------------------
	var validateAddress = function() {
		var address = $txtCustAddress.val();
		if(address.length > 0){
			$noAddressSelected.hide();
			return true;
		}
		$noAddressSelected.show();
		return false;
	};
//	Check Telephone Number-------------------------------------------
	var validateTel = function(){
		var regEx = /^[0-9]{6,}$/;
		var tel = $txtCustTel.val();
		var stripSpace = tel.replace(/ /g,'');
		if(regEx.test(stripSpace)){
			$validTel.hide();
			return true;
		};
		$validTel.show();
		return false;
	};
	//Check Date -----------------------------------------------------------
	var validateDate = function(){
		var date = $('#cboSelectDate').val();
		if(date){
			$('#noDateSelected').hide();
			return true;
		}
		$('#noDateSelected').show();
		return false;
	};
	//Check at least 1 item selected ---------------------------------------
	var validateItems = function(){
		var item1 = $cboItem1.val();
		var item2 = $cboItem2.val();
		var item3 = $cboItem3.val();

		if(!item1 && !item2 && !item3){
			$noItemSelected.show();
			return false;
		}
		$noItemSelected.hide();
		return true;
	};

	/*MISC FUNCTIONS ----------------------------------------------------------------------------------------------*/
	/*-------------------------------------------------------------------------------------------------------------*/

//	Set the day for the collection date --------------------------------------------------------------------------
	var setDay = function(pc){
		var postCodePart = pc.slice(0,3);
		var upperPostCode = postCodePart.toUpperCase();

		var collectionDay = "";
		switch (upperPostCode){
		case 'NN1':
			collectionDay = 'Thursday';
			break;
		case 'NN2':
			collectionDay = 'Thursday';
			break;
		case 'NN3':
			collectionDay = 'Tuesday';
			break;
		case 'NN4':
			collectionDay = 'Monday';
			break;
		case 'NN5':
			collectionDay = 'Monday';
			break;
		}

		return collectionDay;
	};


//	Populate the sumary page------------------------------------------------------------
	var summary = function (){
		var item1 = $cboItem1.val();
		var item2 = $cboItem2.val();
		var item3 = $cboItem3.val();
		var date1 = $cboSelectDate.val();
		var collectionItems = "";
		var collectionDate = ""; 
		var existingDetails = $txtAddInfo.val();
		//Items to be collected --------------------------
		if (item1){
			collectionItems += '<p class="redHighlight">'+item1+'</p>';
		}
		if (item2){
			collectionItems += '<p class="redHighlight">'+item2+'</p>';
		}
		if (item3){
			collectionItems += '<p class="redHighlight">'+item3+'</p>';
		}			

		$('#items').html(collectionItems);
		//Collection Date ---------------------------------
		if(date1){
			collectionDate = date1;
		}		
		$('#date').html(collectionDate);
		//Additional Details -------------------------------
		//console.log(existingDetails)
		if(!existingDetails){
			$sumAddDetails.hide();
		}
		else{		
			$SummaryDetails.html(existingDetails);
		};

	};

	//Post Code Error Message--------------------------------------------------------
	var postCodeError = function (error){
		$noPostCode.hide();
		$nonNBCPostCode.hide();
		$postCodeNotValid.hide();
		$loading2.hide();
		error.show();
	};

	//Display form when address is found--------------
	var displayForm = function(){
		$loading2.hide();			
		$cboSelectDate.hide();
		$loading.show();
		$formdetails.show();
	};
})(jQuery);