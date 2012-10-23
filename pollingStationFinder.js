$(function(){
	
	var pollingApp = pollingApp || { models:{}};
	
	pollingApp.models.Finder = function(){
		var self = this,
			postCodeError = '<p>There was a problem finding properties for that post code, please check your post code and try again</p>',
			propertyError = '<p>There was a problem finding polling stations for that property or post code, please check your post code and try again</p>';
		this.getProperties = function(postcode){
			return $.ajax({
				url: "PollPropertyFinder?postcode=" + postcode,
				dataType: "JSON",
				type: "GET",
				delay: 2
			});
		};
		
		this.getPollStations = function(uprn){
			return $.ajax({
				url: "PollStationFinder?uprn=" + uprn,
				dataType: "JSON",
				type: "GET"
			});
		};
		
		this.searchProperties = function($el,postcode){
			var promise = self.getProperties(postcode);
			promise.done(function(d){
				if(d.success && d.properties.length > 0){
					self.addProperties($el, d);
					self.modeManager(2);
				} else{
					//didn't get results - postcode error?
					self.modeManager(1,true,postCodeError);
				}
			});
		};
		
		this.searchPollStations = function($el,uprn){
			var promise = self.getPollStations(uprn);
			promise.done(function(data){
				if(data.success){
					self.showPollingStations($el,data);
					self.modeManager(3);
				} else{
					//no list - postCode / property Error?
					self.modeManager(1,true,propertyError);
				}
				
			});
		};
		
		this.modeManager = function(mode,error,errMsg){
			
			var $step1 = $('#step1'),
				$step2 = $('#step2'),
				$step3 = $('#step3'),
				$pc = $('#postCode'),
				$error = $('#error');
			
			switch (mode){
			case 1:
				$pc.val("postCode");
				if(error){
					$error.html(errMsg);
					$error.show();
				} else{
					$error.hide();
				}
				$step1.show();
				$step2.hide();
				$step3.hide();
				break;
			case 2:
				$step1.hide();
				$step2.show();
				$step3.hide();
				break;
			case 3:
				$step1.hide();
				$step2.hide();
				$step3.show();
				break;
			default:
				self.modeManager(1,false);
			break;
			}
		}
		
		this.historyManager = function(el){
			$(el).on('hashchange',function(e){
				switch(window.location.hash){
				case "":
					self.modeManager(1,false);
					break;
				case "#step2":
					self.modeManager(2);
					break;
				case "#step3":
					self.modeManager(3);
					break;
				}
			});
		};
		
		this.addProperties = function ($el,data){
			var options = "";
			for(x = 0; x < data.properties.length; x += 1){
				options += '<option value="'+data.properties[x].uprn+'">'+data.properties[x].address+'</option>';
			}
			$el.html(options);
		};
		
		this.showPollingStations = function ($el,data){
			var results = "";
			for(x = 0; x < data.pollStations.length; x += 1){
				if(data.pollStations[x].type == "district"){
					results += '<p>Your polling station to vote in the Police and Crime Commissioner election is:</p>';
				}
				if(data.pollStations[x].type == "advisory"){
					results += '<p>Your polling station to vote in the local advisory polls is:</p>';
				}
				results += '<p class="redHighlight">'+data.pollStations[x].name+'</p>';
				results += '<p>'+data.pollStations[x].fullAddress+'</p>';
				results += '<div id="button">';
				results += '<a class="button red" href="https://maps.google.co.uk/?q='+data.pollStations[x].fullAddress+'" target="_blank"><span>View Map</span></a>';
				results += '</div>';
			}
			$el.html(results);
		};
		
		this.init = function(stepOneId,stepTwoId,stepThreeId,waitId,postCodeInputId,searchId,findItId,propNumbersId){
			var $stepOneCont = $(stepOneId),
				$stepTwoCont = $(stepTwoId),
				$stepThreeCont = $(stepThreeId),
				$postCode = $(postCodeInputId),
				$search = $(searchId),
				$findIt = $(findItId),
				$propNumber = $(propNumbersId),
				$waitCont = $(waitId);
			
			$.ajaxSetup({
			    beforeSend:function(){
			    	$waitCont.show();
			    },
			    complete:function(){
			    	$waitCont.hide();
			    }
			});
			
			self.historyManager(window);
			self.modeManager(1,false);
			$search.on('click',function(e){
				//e.preventDefault();
				self.searchProperties($propNumber,$postCode.val(),$stepOneCont,$stepTwoCont);
			});
			
			$findIt.on('click',function(e){
				//e.preventDefault();
				self.searchPollStations($stepThreeCont,$propNumber.val());
			});
		};	
		
	};
	
	
	var app = new pollingApp.models.Finder();
	
	app.init("#step1","#step2","#step3","#ajax-wait","#postcode","#search","#findIt","#propNumber");
	
});