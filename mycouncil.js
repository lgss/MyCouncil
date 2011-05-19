Ext.BLANK_IMAGE_URL = 'ext/resources/images/default/s.gif';

Ext.onReady(function(){
    google.load('search', '1');
    var localSearch = new GlocalSearch();
    var geocoder = new google.maps.Geocoder();
    var useragent = navigator.userAgent;
    var clckTimeOut = null;
    var wards = new Array();
    var wardNames = new Array();
    var wardNumbers = new Array();
    var wardDocumentsURL = new Array();
    var sectorWardNames = new Array();
    var sectorSubsectorOf = new Array();
    var wardParties = new Array();
    var wardColour = new Array();
    var wardOpacity = new Array();
    var wardSector = new Array();
    var wardPolitical = new Array();
    var wardOperational = new Array();
    var councillor_names = new Array();
    var councillor_emails = new Array();
    var councillor_parties = new Array();
    var councillor_post = new Array();
    var councillor_images = new Array();
    var councillor_main_url_base;
    var councillor_main_urls = new Array();
    var councillor_social_url_types = new Array();
    var councillor_social_urls = new Array();
    var councillor_twitter_urls = new Array();
    var councillor_blog_urls = new Array();
    var councillor_personal_urls = new Array();
    var candidate_names = new Array();
    var candidate_parties = new Array();
    var candidate_votes = new Array();
    var elector_count = new Array();
    var spoiled_count = new Array();
    var social_Networks = new Array();
    var parties = new Array();
    var partiesURL = new Array();
    var ledByDescriptions = new Array();
    var cssPartyButton = new Array();
    var sectorNames = new Array();
    var sectorEmails = new Array();
    var sectorBackgroundColours = new Array();
    var sectorTextColours = new Array();
    var sectorPolitical = new Array();
    var sectorCoOrdinatorNames1 = new Array();
    var sectorCoOrdinatorImages1 = new Array();
    var sectorCoOrdinatorTelephones1 = new Array();
    var sectorCoOrdinatorFaxes1 = new Array();
    var sectorCoOrdinatorNames2 = new Array();
    var sectorCoOrdinatorImages2 = new Array();
    var sectorCoOrdinatorTelephones2 = new Array();
    var sectorCoOrdinatorFaxes2 = new Array();
    var sectorURLs = new Array();
    var partyColours = new Array();
    var partyTextColour = new Array();
    var partyWardDescriptions = new Array();
    var partyCount;
    var sortedParties = new Array();
    var sortedPartyCount = new Array();
    var reportItNames = new Array();
    var reportItTypes = new Array();
    var reportItIncidents = new Array();
    var reportItDescEmail = new Array();
    var reportItSLA = new Array();
    var totalNumOfWards = 0;
    var mouseMoveHandler;
    var leadBy;
    var leaderName;
    var leaderImage;
    var mayorName;
    var mayorImage;
    var chiefExecName;
    var chiefExecImage;
    var chiefExecImageHeight;
    var chiefExecImageWidth;
    var displayWard = 0;
    var displaySubWard = -1;
    var displayBreakdown = "";
    var inWard = false;
    var update = false;
    var picHeight = 135;
    var picWidth = 90;
    var currentMessage = 0;
    var message_timer;
    var messages_array = new Array();
    var firstLoad = true;
    var politicalView = true;
    var internal = false;
    var wardKeyDiv;
    var sectorKeyDiv;
    var currentOpenInfowindow = -1;
    var infoPanelContents;
    var searchBoxActive = false;
    var showOperationalInformation = false;
    var showPanel = false;
    var panelAnimation = false;
    var highlightHelp = false;
    var startupAnimation = true;
    var mapCenter;
    var defaultZoom;
    var mapSWBounds;
    var mapNEBounds;
    var bounds;
    var centerPoint;
    var messageScroll = true;
    var forceMessage = false;
    var forcingScroll = false;
    var messageDirectionForward = true;
    var internetExplorer = false;
    var googleDefaultLatLng;
    var googleDefaultLocationName;
    var currentBubble;
    var currentBubbleListener;
    var bubbleActive = false;
    var bubbleMenu;
    var currentPoint;
    var currentLocation;
    var justClosedBubble = false;
    var startupSearch = false;
    var startupSearchText;
    var localPrioritiesURL;
    var contactDetailsClicked = false;
    var contactContentsClicked = false;
    var outsideBoundariesMessage;
    var outsideBoundariesURL;
    var findAddressTailCheck;
    var findAddressTailSetTo;
    var boundaryType;
    var googleOutsideLatLng;
    var override = false;
    var streetviewAvailable = false;
    var streetviewLatLng;
    var miniScreen = false;
    var showReportIt = false;
    var showViewIt = false;
    var showExternalPages = false;
    var showContactScreen = false;
    var showHelp = false;
    var showInformation = false;
    var showSLA = false;
    var showFeedback = false;
    var feedbackEmailAddress;
    var menuLocation;
    var clickSearch = false;
    var jsonMeetingData;
    var streetView;
    var sectorName;
    var sectorID;
    var callCenterNumber;
    var version;
    var storePanel = false;
    var codesType = new Array();
    var codesIncident = new Array();
    var codesSectorID = new Array();
    var codesClassificationCodes = new Array();
    var reportItJson;
    var bigForm = false;
    var defaultStreetViewZoom = 0;
    var readyCount = 0;
    var debug = false;
    var widescreen = false;
    var normalMode = true;
    var preElectionMode = false;
    var electionCountMode = false;
    var jointlyHeldWards = false;
    var preElectionSidePanelText = "";
    var preElectionDefaultText = "";
    var showCandidates = false;
    var overlayDelay = 0;
    var jsonFileName = "mycouncil-lite.json";
    var mapTitle = "";
    var electionBreakdownTitle = "";
    var lastDeclaredWard = "";
    
    Ext.MessageBox.wait('Please wait whilst MyCouncil loads...');
    
    if (Ext.isIE6 || Ext.isIE7 || Ext.isIE8) {
        jsonFileName = "mycouncil-lite.json";
        overlayDelay = 5000;
    }
    
    if (navigator.userAgent.indexOf("IE") > -1) {
        internetExplorer = true;
    }
    
    if (document.cookie.length > 0) {
        cookie_start = document.cookie.indexOf("viewedHelp=true");
        if (cookie_start != -1) {
            startupAnimation = false;
        }
    }
    
    if (location.search) {
        if (Ext.urlDecode(location.search.substring(1)).internal == "true") {
            politicalView = false;
            internal = true;
        }
    };
    
    if (location.search) {
        if (Ext.urlDecode(location.search.substring(1)).override == "true") {
            override = true;
            startupAnimation = true;
        }
    };
    if (location.search) {
        if (Ext.urlDecode(location.search.substring(1)).mode == "preElection") {
            preElectionMode = true;
            normalMode = false;
            if (Ext.urlDecode(location.search.substring(1)).search == "") {
                Ext.MessageBox.alert("<CENTER>Search Result<\CENTER>", "<CENTER>Apologies, we were not able to find your address on our system.<BR><BR>If your not sure about your postcode, why not try : <BR><BR> <A HREF='http://postcode.royalmail.com/portal/rm/postcodefinder' target='_blank'>Royal Mail Postcode Finder</A><\CENTER>");
            }
        }
        if (Ext.urlDecode(location.search.substring(1)).mode == "electionCount") {
            electionCountMode = true;
            normalMode = false;
        }
    };
    
    if (location.search) {
        if (Ext.urlDecode(location.search.substring(1)).search) {
            startupSearch = true;
            startupSearchText = Ext.urlDecode(location.search.substring(1)).search;
        }
    };
    
    if (Ext.isIE) {
        defaultStreetViewZoom = 1;
        var tempHeight = 0;
        var tempWidth = 0;
        if (document.documentElement && document.documentElement.clientHeight) {
            tempHeight = document.documentElement.clientHeight;
            tempWidth = document.documentElement.clientWidth;
        }
        else {
            tempHeight = document.body.clientHeight;
            tempWidth = document.body.clientWidth;
        }
        
        var mapHeight = tempHeight - 105;
        document.getElementById("map").style.height = mapHeight + "px";
        if (tempHeight < 800) {
            picHeight = 81;
            picWidth = 54;
            document.getElementById("info_panel_details").style.fontSize = "10px";
            miniScreen = true;
        }
        else 
            if (tempWidth >= 1250) {
                bigForm = true;
            }
        if (tempWidth >= 1250) {
            widescreen = true;
        }
    }
    else {
        var mapHeight = window.innerHeight - 105;
        document.getElementById("map").style.height = mapHeight + "px";
        if (window.innerHeight < 800) {
            picHeight = 81;
            picWidth = 54;
            document.getElementById("info_panel_details").style.fontSize = "10px";
            miniScreen = true;
            defaultStreetViewZoom = 1;
        }
        else 
            if (window.innerWidth >= 1270) {
                bigForm = true;
            }
        if (window.innerWidth >= 1270) {
            widescreen = true;
        }
    }
    
    if (politicalView) {
        if (preElectionMode || electionCountMode) {
            document.getElementById("report_title").width = "60%";
            var domMainElement = document.getElementById("searchTD");
            var domDeleteElement = document.getElementById("searchBox");
            domMainElement.removeChild(domDeleteElement);
            domMainElement = document.getElementById("searchTR");
            domDeleteElement = document.getElementById("findIt");
            domMainElement.removeChild(domDeleteElement);
            domMainElement = document.getElementById("body");
            domDeleteElement = document.getElementById("messageTable");
            domMainElement.removeChild(domDeleteElement);
        }
        else {
            document.getElementById("report_title").innerHTML = "Political Map";
        }
    }
    else {
        document.getElementById("report_title").innerHTML = "Operational Map";
    }
    if (!preElectionMode && !electionCountMode) {
        document.getElementById("searchBox").setAttribute('style', "font-style:italic;color:#989898");
        document.getElementById("searchBox").value = "Enter a postcode, address or call number";
    }
    var initialPosition = mapCenter;
    
    var mapOptions = {
        zoom: 12,
        center: initialPosition,
        mapTypeId: google.maps.MapTypeId.ROADMAP,
        keyboardShortcuts: false,
        disableDefaultUI: true,
        navigationControl: true,
        navigationControlOptions: {
            style: google.maps.NavigationControlStyle.ANDROID,
            position: google.maps.ControlPosition.TOP_CENTER
        },
        mapTypeControl: true,
        scaleControl: true,
        streetViewControl: false
    };
    
    var map = new google.maps.Map(document.getElementById("map"), mapOptions);
    
    google.maps.Polygon.prototype.Contains = function(latLng){
        var j = 0;
        var oddNodes = false;
        var x = latLng.lng();
        var y = latLng.lat();
        for (var i = 0; i < this.getPath().getLength(); i++) {
            j++;
            if (j == this.getPath().getLength()) {
                j = 0;
            }
            if (((this.getPath().getAt(i).lat() < y) && (this.getPath().getAt(j).lat() >= y)) ||
            ((this.getPath().getAt(j).lat() < y) && (this.getPath().getAt(i).lat() >= y))) {
                if (this.getPath().getAt(i).lng() +
                (y - this.getPath().getAt(i).lat()) /
                (this.getPath().getAt(j).lat() - this.getPath().getAt(i).lat()) *
                (this.getPath().getAt(j).lng() - this.getPath().getAt(i).lng()) <
                x) {
                    oddNodes = !oddNodes
                }
            }
        }
        return oddNodes;
    }
    
    
    
    window.setTimeout(function(){
        timer();
    }, overlayDelay);
    
    function start_polling(){
        message_timer = Ext.TaskMgr.start({
            run: timer,
            interval: 3600000
        });
    };
    
    start_polling();
    
    function load_messages(){
        if (!preElectionMode && !electionCountMode) {
            Ext.Ajax.request({
                url: 'meetings.json',
                timeout: 30000,
                method: 'GET',
                success: function(meetingData){
                    try {
                        jsonMeetingData = Ext.util.JSON.decode(meetingData.responseText);
                    } 
                    catch (err) {
                    }
                    if (jsonMeetingData) {
                        for (var currentMeeting = 0; currentMeeting < jsonMeetingData.meetings.length; currentMeeting++) {
                            messages_array.push(jsonMeetingData.meetings[currentMeeting].html);
                        }
                        start_messages();
                    }
                }
            });
        }
    };
    
    function start_message_loader(){
        message_timer = Ext.TaskMgr.start({
            run: load_messages,
            interval: 36000000
        });
    };
    
    start_message_loader();
    
    function update_message(){
        if (!forcingScroll && (messageScroll || forceMessage)) {
            if (forceMessage) {
                forcingScroll = true;
            }
            var slideOutDirection;
            var slideInDirection;
            if (messageDirectionForward) {
                slideOutDirection = "b";
                slideInDirection = "t";
            }
            else {
                slideOutDirection = "t";
                slideInDirection = "b";
                currentMessage -= 2;
                switch (currentMessage) {
                    case -2:
                        currentMessage = messages_array.length - 2;
                        break;
                    case -1:
                        currentMessage = messages_array.length - 1;
                        break;
                }
            }
            
            if (internetExplorer) {
                document.getElementById("message_bar_text").innerHTML = "";
                window.setTimeout(function(){
                    document.getElementById("message_bar_text").innerHTML = messages_array[currentMessage];
                }, 1000);
                window.setTimeout(function(){
                    if (currentMessage < messages_array.length - 1) {
                        currentMessage++;
                    }
                    else {
                        currentMessage = 0;
                    }
                    forcingScroll = false;
                    forceMessage = false;
                    messageDirectionForward = true;
                }, 2500);
            }
            else {
                var messageElement = Ext.get("message_bar_text");
                messageElement.slideOut(slideOutDirection, {
                    duration: 1
                });
                window.setTimeout(function(){
                    document.getElementById("message_bar_text").innerHTML = messages_array[currentMessage];
                    messageElement.slideIn(slideInDirection, {
                        duration: 1
                    });
                }, 1000);
                window.setTimeout(function(){
                    if (currentMessage < messages_array.length - 1) {
                        currentMessage++;
                    }
                    else {
                        currentMessage = 0;
                    }
                    forcingScroll = false;
                    forceMessage = false;
                    messageDirectionForward = true;
                }, 2500);
            }
        }
    };
    
    function start_messages(){
        message_timer = Ext.TaskMgr.start({
            run: update_message,
            interval: 10000
        });
    };
    
    google.maps.event.addListener(map, "idle", function(){
        if (bounds) {
            if (!bounds.contains(map.getCenter())) {
                map.setCenter(centerPoint)
            };
                    }
    });
    
    google.maps.event.addListener(map, 'zoom_changed', function(){
        if (map.getMapTypeId() == "satellite") {
            if (map.getZoom() > 21) {
                map.setZoom(21);
            };
                    }
        if (map.getZoom() < 12) {
            map.setZoom(12);
        };
            });
    
    moveListener = google.maps.event.addListener(map, "mousemove", function(event){
        if (!showPanel && !panelAnimation && !bubbleActive) {
            checkWards(event.latLng);
        }
    });
    
    function checkWards(point){
        inWard = false;
        var subWard = -1;
        var selectedWard = -1;
        for (var currentWard = 0; currentWard < totalNumOfWards; currentWard++) {
            if ((politicalView && wardPolitical[currentWard]) || (!politicalView && wardOperational[currentWard])) {
                if (wards[currentWard].Contains(point)) {
                    if (selectedWard == -1) {
                        selectedWard = currentWard;
                    }
                    else {
                        subWard = selectedWard;
                        selectedWard = currentWard;
                    }
                    
                    inWard = true;
                }
            }
        };
        for (var currentWard = 0; currentWard < totalNumOfWards; currentWard++) {
            if (wardOperational[currentWard]) {
                if (wards[currentWard].Contains(point)) {
                    sectorName = sectorNames[wardSector[currentWard]];
                    sectorID = wardSector[currentWard];
                }
            }
        };
        if (showPanel || panelAnimation) {
            if (subWard == -1) {
                displayWard = selectedWard;
            }
            else {
                displayWard = subWard;
            }
        }
        if (!showPanel && !panelAnimation) {
            if (inWard) {
                if (displayWard != selectedWard || displaySubWard != subWard) {
                    wardStats(selectedWard, subWard);
                }
            }
            else {
                defaultStats();
            }
        }
    };
    
    function wardStats(currentWard, subWard){
        document.getElementById("info_panel_list").innerHTML = "";
        document.getElementById("info_panel_list_small").innerHTML = "";
        var councillorArrayItem = currentWard;
        if (subWard != -1) {
            councillorArrayItem = subWard;
        }
        var councillor_names_array = councillor_names[councillorArrayItem].toString().split(",");
        var candidate_names_array = candidate_names[councillorArrayItem].toString().split(",");
        var councillor_parties_array = candidate_parties[councillorArrayItem].toString().split(",");
        var councillor_post_array = councillor_post[councillorArrayItem].toString().split(",");
        var councillor_images_array = councillor_images[councillorArrayItem].toString().split(",");
        if (politicalView) {
            document.getElementById("info_panel_title").innerHTML = wardNames[currentWard] + " Ward";
            if (preElectionMode && showCandidates) {
                document.getElementById("info_panel_title").innerHTML += "<BR>Candidates";
            }
        }
        else {
            var tempText = sectorWardNames[currentWard];
            if (subWard == -1) {
                tempText += "<BR>" + wardNames[currentWard];
            }
            else {
                tempText += "<BR>" + wardNames[subWard];
            }
            tempText += " Ward";
            document.getElementById("info_panel_title").innerHTML = tempText;
        }
        if (electionCountMode) {
            if (councillor_names_array[0] == "") {
                document.getElementById("info_panel_title").innerHTML += "<BR>(Not Yet Declared)"
            }
            else {
                //document.getElementById("info_panel_title").innerHTML+="<BR>(Declared)"
            }
        }
        document.getElementById("info_panel_details").innerHTML = "";
        if (normalMode) {
            if (politicalView || !showOperationalInformation) {
                for (var currentCouncillor = 0; currentCouncillor < councillor_names_array.length; currentCouncillor++) {
                    var postTitle = "";
                    if (councillor_post_array[currentCouncillor]) {
                        postTitle = "<BR>";
                    }
                    if (councillor_names_array[currentCouncillor] != "") {
                        document.getElementById("info_panel_details").innerHTML += "<BR>" +
                        "<TABLE><TR><TD width=\"50%\"></TD><TD><DIV class=\"shadowed\"><img style=\"border: none;\" width=\"" +
                        picWidth +
                        "\" height=\"" +
                        picHeight +
                        "\" src=\"images/" +
                        councillor_images_array[currentCouncillor] +
                        ".jpg\" alt=\"Councillor" +
                        candidate_names_array[currentCouncillor] +
                        "\"/></DIV></TD><TD width=\"50%\"></TD></TR></TABLE>" +
                        "<B>Councillor " +
                        candidate_names_array[councillor_names_array[currentCouncillor]] +
                        "</B><BR>" +
                        parties[councillor_parties_array[councillor_names_array[currentCouncillor]]] +
                        "<BR>" +
                        councillor_post_array[currentCouncillor] +
                        postTitle;
                    }
                }
            }
            else {
                document.getElementById("info_panel_details").innerHTML = "<BR>" +
                "<CENTER><img style=\"border: none;\" width=\"" +
                picWidth +
                "\" height=\"" +
                picHeight +
                "\" src=\"images/" +
                sectorCoOrdinatorImages1[wardSector[currentWard]] +
                ".jpg\" alt=\"" +
                sectorCoOrdinatorNames1[wardSector[currentWard]] +
                "\"/></CENTER>" +
                "<B>" +
                sectorCoOrdinatorNames1[wardSector[currentWard]] +
                "</B><BR>Partnership Coordinator" +
                "<BR>Telephone: " +
                sectorCoOrdinatorTelephones1[wardSector[currentWard]] +
                "<BR>Fax: " +
                sectorCoOrdinatorFaxes1[wardSector[currentWard]];
                if (sectorCoOrdinatorNames2[wardSector[currentWard]]) {
                    document.getElementById("info_panel_details").innerHTML += "<BR><BR>" +
                    "<CENTER><img style=\"border: none;\" width=\"" +
                    picWidth +
                    "\" height=\"" +
                    picHeight +
                    "\" src=\"images/" +
                    sectorCoOrdinatorImages2[wardSector[currentWard]] +
                    ".jpg\" alt=\"" +
                    sectorCoOrdinatorNames2[wardSector[currentWard]] +
                    "\"/></CENTER>" +
                    "<B>" +
                    sectorCoOrdinatorNames2[wardSector[currentWard]] +
                    "</B><BR>Partnership Coordinator" +
                    "<BR>Telephone: " +
                    sectorCoOrdinatorTelephones2[wardSector[currentWard]] +
                    "<BR>Fax: " +
                    sectorCoOrdinatorFaxes2[wardSector[currentWard]];
                }
            }
        }
        if (preElectionMode || (electionCountMode && councillor_names_array[0] == "")) {
            if (showCandidates) {
                var candidates = candidate_names[currentWard].toString().split(",");
                var party = candidate_parties[currentWard].toString().split(",");
                var candidateText = "";
                if (!internetExplorer) {
                    candidateText += "<BR>";
                }
                candidateText += "<TABLE WIDTH='100%' border='1' cellpadding='2' cellspacing='0'>";
                candidateText += "<TR BGCOLOR=\"#C0C0C0\"><TD COLSPAN=\"2\"><B>Candidates</B></TD></TR>";
                for (var currentCandidate = 0; currentCandidate < candidates.length; currentCandidate++) {
                    candidateText += "<TR BGCOLOR=\"" + partyColours[party[currentCandidate]] + "\"><TD WIDTH='50%' ALIGN='LEFT'><FONT COLOR=\"" + partyTextColour[party[currentCandidate]] + "\">" + candidates[currentCandidate] + "</FONT></TD><TD WIDTH='50%' ALIGN='CENTER'><FONT COLOR=\"" + partyTextColour[party[currentCandidate]] + "\">" + parties[party[currentCandidate]] + "</FONT></TD></TR>";
                }
                candidateText += "</TABLE>";
                document.getElementById("info_panel_list_small").innerHTML = candidateText;
            }
            else {
                document.getElementById("info_panel_list").innerHTML = "<BR>" + preElectionSidePanelText;
            }
        }
        if (electionCountMode && councillor_names_array[0] != "") {
            electionResult(currentWard, councillor_names_array, councillor_parties_array, true);
        }
        displayWard = currentWard;
        displaySubWard = subWard;
    }
    
    function defaultStats(){
        if ((displayWard != -1 || update) && !startupSearch) {
            document.getElementById("info_panel_list").innerHTML = "";
            document.getElementById("info_panel_list_small").innerHTML = "";
            if (preElectionMode || electionCountMode) {
                document.getElementById("info_panel_title").innerHTML = "";
            }
            else {
                document.getElementById("info_panel_title").innerHTML = "Led by " + ledByDescriptions[leadBy];
            }
            
            document.getElementById("info_panel_details").innerHTML = "";
            if ((politicalView || !showOperationalInformation)) {
                if (!miniScreen) {
                    document.getElementById("info_panel_details").innerHTML += "<BR>";
                }
                if (preElectionMode || electionCountMode) {
                    if (preElectionMode) {
                        document.getElementById("info_panel_list").innerHTML = preElectionDefaultText;
                    }
                    if (electionCountMode) {
                        if (lastDeclaredWard == "") {
                            document.getElementById("info_panel_list").innerHTML = "No Wards have declared.";
                        }
                        else {
                            var lastDeclaredWardText = "";
                            var lastDeclaredWardArray = 0;
                            for (var wardCheck = 0; wardCheck < wardNumbers.length; wardCheck++) {
                                if (wardNumbers[wardCheck] == lastDeclaredWard) {
                                    lastDeclaredWardText = wardNames[wardCheck];
                                    lastDeclaredWardArray = wardCheck;
                                }
                            }
                            document.getElementById("info_panel_list").innerHTML = "<div class=\"sidePanelSubTitle\">" + "Last Declared Ward" + "</div>";
                            document.getElementById("info_panel_list").innerHTML += "<div style=\"background: #A89D1A\">" + lastDeclaredWardText + "</div><BR>";
                            var councillor_names_array = councillor_names[lastDeclaredWardArray].toString().split(",");
                            var councillor_parties_array = councillor_parties[lastDeclaredWardArray].toString().split(",");
                            electionResult(lastDeclaredWardArray, councillor_names_array, councillor_parties_array, false);
                        }
                        document.getElementById("info_panel_list_small").innerHTML += "<BR><BR>This page will automatically update itself with the latest results.";
                    }
                }
                else {
                    document.getElementById("info_panel_details").innerHTML += "<TABLE><TR><TD width=\"50%\"></TD><TD><DIV class=\"shadowed\"><img style=\"border: none;\" width=\"" + picWidth + "\" height=\"" + picHeight + "\" src=\"images/" + leaderImage + ".jpg\" alt=\"Councillor " + leaderName + "\"/></DIV></TD><TD width=\"50%\"></TD></TR></TABLE>" +
                    //"<B>Councillor " + leaderName + "</B><BR>Leader of the Council<BR>";
                    "<B>Councillor " +
                    leaderName +
                    "</B><BR>Leader of the Conservative Group<BR>";
                    if (!miniScreen) {
                        document.getElementById("info_panel_details").innerHTML += "<BR>";
                    }
                    document.getElementById("info_panel_details").innerHTML += "<TABLE><TR><TD width=\"50%\"></TD><TD><DIV class=\"shadowed\"><img style=\"border: none;\" width=\"" + picWidth + "\" height=\"" + picHeight + "\" src=\"images/" + mayorImage + ".jpg\" alt=\"Councillor " + mayorName + "\"/></DIV></TD><TD width=\"50%\"></TD></TR></TABLE>" +
                    //"<B>Councillor " + mayorName + "</B><BR>Mayor<BR><BR>";
                    "<B>" +
                    mayorName +
                    "</B><BR>Mayor<BR><BR>";
                }
                if (preElectionMode || electionCountMode) {
                    document.getElementById("info_panel_details").innerHTML += "<div class=\"sidePanelSubTitle\">" + electionBreakdownTitle + "</div>";
                    document.getElementById("info_panel_details").innerHTML += "<div style=\"background: #A89D1A;font-size: 15px\">Political Breakdown</div><BR>";
                }
                else {
                    document.getElementById("info_panel_details").innerHTML += "<div class=\"sidePanelSubTitle\">Political Breakdown</div><BR>";
                }
                document.getElementById("info_panel_details").innerHTML += "<table border=\"0\" width=\"100%\" cellpadding=\"0\" style=\"text-align: left\">" + displayBreakdown + "</table>";
            }
            else {
                document.getElementById("info_panel_details").innerHTML = "<BR>" +
                "<TABLE><TR><TD width=\"50%\"></TD><TD><DIV class=\"shadowed\"><img style=\"border: none;\" width=\"" +
                chiefExecImageHeight +
                "\" height=\"" +
                chiefExecImageWidth +
                "\" src=\"images/" +
                chiefExecImage +
                ".jpg\" alt=\"Chief Executive " +
                chiefExecName +
                "\"/></DIV></TD><TD width=\"50%\"></TD></TR></TABLE>" +
                "<B>" +
                chiefExecName +
                "</B><BR>Chief Executive<BR>" +
                "<BR>";
            }
            displayWard = -1;
        }
        if (update) {
            update = false;
        }
    }
    
    function partyStats(party){
        if (!showPanel && !panelAnimation) {
            document.getElementById("info_panel_details").innerHTML = "";
            document.getElementById("info_panel_title").innerHTML = parties[party] + " Wards";
            document.getElementById("info_panel_list").innerHTML = "<BR>";
            var wardsFound = false;
            for (var currentWard = 0; currentWard < wards.length; currentWard++) {
                if (wardParties[currentWard] == party) {
                    document.getElementById("info_panel_list").innerHTML += wardNames[currentWard] + "<BR>";
                    if (!wardsFound) {
                        wardsFound = true;
                    }
                }
            }
            if (!wardsFound) {
                document.getElementById("info_panel_list").innerHTML += "None";
            }
            displayWard = 99;
        }
    }
    
    function sectorStats(sector){
        if (!showPanel && !panelAnimation) {
            document.getElementById("info_panel_details").innerHTML = "";
            document.getElementById("info_panel_title").innerHTML = sectorNames[sector];
            if (sectorPolitical[sector]) {
                document.getElementById("info_panel_title").innerHTML += " Sector Wards";
            }
            else {
                document.getElementById("info_panel_title").innerHTML += " Wards";
            }
            document.getElementById("info_panel_list").innerHTML = "<BR>";
            var wardsFound = false;
            for (var currentWard = 0; currentWard < wards.length; currentWard++) {
                if ((sectorPolitical[sector] && wardSector[currentWard] == sector) || (!sectorPolitical[sector] && wardSector[currentWard] == sectorSubsectorOf[sector])) {
                    document.getElementById("info_panel_list").innerHTML += wardNames[currentWard] + "<BR>";
                    if (!wardsFound) {
                        wardsFound = true;
                    }
                }
            }
            if (!wardsFound) {
                document.getElementById("info_panel_list").innerHTML += "None";
            }
            displayWard = 99;
        }
    }
    
    function viewClick(){
        map.controls[google.maps.ControlPosition.LEFT_TOP].removeAt(0);
        map.controls[google.maps.ControlPosition.LEFT_TOP].removeAt(0);
        map.controls[google.maps.ControlPosition.RIGHT].removeAt(0);
        if (politicalView) {
            politicalView = false;
        }
        else {
            politicalView = true;
        }
        var switchDiv = document.createElement('DIV');
        if (politicalView) {
            document.getElementById("report_title").innerHTML = "Political Map";
            new MapKey(switchDiv, map, "black", "white", "Switch to operational view", "Click here to switch to operational view", 0, false, true, false, false, false, false, true, false, false, "12px");
            for (var currentWard = 0; currentWard < wards.length; currentWard++) {
                wards[currentWard].setOptions({
                    fillColor: wardColour[currentWard]
                });
                if (wardPolitical[currentWard]) {
                    wards[currentWard].setMap(map);
                }
                else {
                    wards[currentWard].setMap(null);
                }
            }
            map.controls[google.maps.ControlPosition.RIGHT].push(wardKeyDiv);
        }
        else {
            document.getElementById("report_title").innerHTML = "Operational Map";
            new MapKey(switchDiv, map, "black", "white", "Switch to political view", "Click here to switch to political view", 0, false, true, false, false, false, false, false, false, false, "12px");
            for (var currentWard = 0; currentWard < wards.length; currentWard++) {
                wards[currentWard].setOptions({
                    fillColor: sectorBackgroundColours[wardSector[currentWard]]
                });
                if (wardOperational[currentWard]) {
                    wards[currentWard].setMap(map);
                }
                else {
                    wards[currentWard].setMap(null);
                }
            }
            map.controls[google.maps.ControlPosition.RIGHT].push(sectorKeyDiv);
        }
        map.controls[google.maps.ControlPosition.LEFT_TOP].push(switchDiv);
        createMenu();
        update = true;
        if (!showPanel && !panelAnimation && !bubbleActive) {
            defaultStats();
        }
    }
    
    function MenuClick(help, information, feedback, sla){
        if (!panelAnimation) {
            if (!showHelp && !showSLA && !showInformation && !showFeedback) {
                storePanel = true;
            }
            else {
                storePanel = false;
            }
            panelAnimation = true;
            if ((help && showHelp) || (sla && showSLA) || (information && showInformation) || (feedback && showFeedback)) {
                showPanel = false;
            }
            else {
                showPanel = true;
            }
            if (help || showHelp) {
                if (showHelp) {
                    showHelp = false;
                }
                else {
                    showHelp = true;
                }
            }
            if (sla || showSLA) {
                if (showSLA) {
                    showSLA = false;
                }
                else {
                    showSLA = true;
                }
            }
            if (information || showInformation) {
                if (showInformation) {
                    showInformation = false;
                }
                else {
                    showInformation = true;
                }
            }
            if (feedback || showFeedback) {
                if (showFeedback) {
                    showFeedback = false;
                }
                else {
                    showFeedback = true;
                }
            }
            var panelDiv = document.getElementById("info_panel");
            var panelElement = Ext.get("info_panel");
            if (showPanel) {
                map.controls[google.maps.ControlPosition.LEFT_TOP].removeAt(0);
                map.controls[google.maps.ControlPosition.LEFT_TOP].removeAt(0);
                createView();
                createMenu();
                panelElement.slideOut('r', {
                    duration: 1
                });
                window.setTimeout(function(){
                    if (storePanel) {
                        infoPanelContents = panelDiv.innerHTML;
                    }
                    if (miniScreen) {
                        if (internetExplorer && !Ext.isIE8) {
                            if (sla) {
                                panelDiv.setAttribute('className', "menuMiniSLAContents");
                            }
                            else {
                                panelDiv.setAttribute('className', "menuMiniContents");
                            }
                        }
                        else {
                            if (sla) {
                                panelDiv.setAttribute('class', "menuMiniSLAContents");
                            }
                            else {
                                panelDiv.setAttribute('class', "menuMiniContents");
                            }
                        }
                    }
                    else {
                        if (internetExplorer && !Ext.isIE8) {
                            if (sla) {
                                panelDiv.setAttribute('className', "menuSLAContents");
                            }
                            else {
                                panelDiv.setAttribute('className', "menuContents");
                            }
                        }
                        else {
                            if (sla) {
                                panelDiv.setAttribute('class', "menuSLAContents");
                            }
                            else {
                                panelDiv.setAttribute('class', "menuContents");
                            }
                        }
                    }
                    if (help) {
                        panelDiv.innerHTML = "<BR>" +
                        "1. Move the mouse around the map. If this help screen is closed (click on the red 'Help' button " +
                        "in the top left corner of the map) then moving the mouse around the map will show you the relevant " +
                        "councillors for that area.<BR><BR>" +
                        "2. Move the mouse over the map legend (top right of the map) to a list of which wards are controlled " +
                        "by which political parties. Click on the legend entries to see each parties local website.<BR><BR>" +
                        "3. Identify a location you are interested in. Drag the map, use the zoom buttons, type in an address, postcode or place to find the location.<BR><BR>" +
                        "4. Click on the map at that location. A menu will display and for that location you will be able to find out more details about the councillors, send them a message, tell " +
                        "us your priorites you would like resolved, read documents about what we are already doing for the area or send a message to your local coordinator.";
                    }
                    if (sla) {
                        var tempHTML = "<table><tr><th><B>Type</B>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</th><th><B>Description</B></th><th><B><CENTER>Working Days</CENTER></B></th></tr>";
                        for (var currentReportItItem = 0; currentReportItItem < reportItNames.length; currentReportItItem++) {
                            tempHTML += "<tr><td>" + reportItTypes[currentReportItItem] + '</td><td>' + reportItIncidents[currentReportItItem] + '</td><td><CENTER>' + reportItSLA[currentReportItItem] + '</CENTER></td></tr>';
                        }
                        panelDiv.innerHTML = tempHTML;
                        panelDiv.innerHTML += "</table";
                    }
                    if (information) {
                        panelDiv.innerHTML = "<BR>" +
                        "MyCouncil was developed using " +
                        "<A HREF='http://en.wikipedia.org/wiki/Open-source_software' target='_blank'>Open Source</A> technologies.<BR><BR>" +
                        "We therefore believe it is only right to put MyCouncil back into the public domain " +
                        "for others to freely use or improve upon.<BR><BR>" +
                        "All of the software, installation and configuration documentation can be found by clicking on the SourceForge image below.<BR><BR>" +
                        "We have made MyCouncil as easy to install as possible. You can have a template version of MyCouncil up and running in minutes, which " +
                        "you can then configure to display information for your own council.<BR><BR>" +
                        "<CENTER><a href='http://sourceforge.net/projects/mycouncil' target='_blank'><img src='http://sflogo.sourceforge.net/sflogo.php?group_id=342086&amp;type=14' width='150' height='40' alt='Get MyCouncil at SourceForge.net. Fast, secure and Free Open Source software downloads'></a></CENTER>";
                    }
                    if (feedback) {
                        var tempRows = 9;
                        var defaultClassName = 'formDefault';
                        var activeClassName = 'formActive';
                        if (miniScreen) {
                            tempRows = 4;
                            defaultClassName = 'miniFormDefault';
                            activeClassName = 'miniFormActive';
                        }
                        panelDiv.innerHTML = "<BR>" +
                        "We need your feedback to help us improve the MyCouncil application.<BR><BR>" +
                        "Please tell us what you like, don't like or what you'd like to see.<BR><BR>" +
                        "If you provide us with an email address (optional), we will respond to your feedback.<BR><BR>" +
                        '<div class="header"><div id="bubbleBack">' +
                        '<table width="100%" border="0" cellpadding="0" cellspacing="2">' +
                        '<tr>' +
                        '<td colspan="3" class="sidePanelSubTitle">' +
                        '<DIV class="' +
                        cssPartyButton[0] +
                        '"> Your Feedback</DIV><BR>' +
                        '</td>' +
                        '</tr>' +
                        '<tr>' +
                        '<td width="5%" style="background: black"></td>' +
                        '<td style="padding:5px 5px 5px 5px"><input id="feedbackContactDetails" class="' +
                        defaultClassName +
                        '" onmousedown="if(this.className==\'' +
                        defaultClassName +
                        '\'){this.value=\'\';this.focus();this.className=\'' +
                        activeClassName +
                        '\'}" onfocus="if(this.className==\'' +
                        defaultClassName +
                        '\'){this.value=\'\';this.className=\'' +
                        activeClassName +
                        '\'}" onmouseover="this.style.cursor=\'text\'" type="textbox" value="Enter your email address here" size="30"></td>' +
                        '<td width="5%" style="background: black"></td>' +
                        '</tr>' +
                        '<tr>' +
                        '<td width="5%" style="background: black"></td>' +
                        '<td style="padding:5px 5px 5px 5px"><textarea id="feedbackDetails" rows="' +
                        tempRows +
                        '" cols="30" class="' +
                        defaultClassName +
                        '" onmousedown="if(this.className==\'' +
                        defaultClassName +
                        '\'){this.value=\'\';this.focus();this.className=\'' +
                        activeClassName +
                        '\'}" onfocus="if(this.className==\'' +
                        defaultClassName +
                        '\'){this.value=\'\';this.className=\'' +
                        activeClassName +
                        '\'}" onmouseover="this.style.cursor=\'text\'">Enter your feedback here</textarea></td>' +
                        '<td width="5%" style="background: black"></td>' +
                        '</tr>' +
                        '<tr>' +
                        '<td width="5%" style="background: black"></td>' +
                        '<td onClick="formClick(false,document.getElementById(\'feedbackContactDetails\').value,document.getElementById(\'feedbackDetails\').value,0,\'\',\'\')" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Send Feedback</td>' +
                        '<td width="5%" style="background: black"></td>' +
                        '</tr>' +
                        '<tr>' +
                        '<td width="5%" style="background: black"></td>' +
                        '<td style="text-align: centre" cstyle="background: black">&nbsp</td>' +
                        '<td width="5%" style="background: black"></td>' +
                        '</tr>' +
                        '</table>' +
                        '</div></div>';
                    }
                    panelElement.slideIn('r', {
                        duration: 1
                    });
                }, 1500);
                window.setTimeout(function(){
                    panelAnimation = false;
                }, 2600);
            }
            else {
                panelElement.slideOut('r', {
                    duration: 1
                });
                window.setTimeout(function(){
                    if (internetExplorer && !Ext.isIE8) {
                        panelDiv.setAttribute('className', "");
                    }
                    else {
                        panelDiv.setAttribute('class', "");
                    }
                    panelDiv.setAttribute('style', "text-align: centre;");
                    panelDiv.innerHTML = infoPanelContents;
                    panelElement.slideIn('r', {
                        duration: 1
                    });
                    window.setTimeout(function(){
                        panelDiv.innerHTML = infoPanelContents;
                    }, 1100);
                }, 1500);
                window.setTimeout(function(){
                    panelAnimation = false;
                    map.controls[google.maps.ControlPosition.LEFT_TOP].removeAt(0);
                    map.controls[google.maps.ControlPosition.LEFT_TOP].removeAt(0);
                    createView();
                    createMenu();
                }, 2700);
            }
        }
    }
    
    function createView(){
        var switchDiv = document.createElement('DIV');
        if (politicalView) {
            new MapKey(switchDiv, map, "black", "white", "Switch to operational view", "Click here to switch to operational view", 0, false, true, false, false, false, false, true, false, false, "12px");
        }
        else {
            new MapKey(switchDiv, map, "black", "white", "Switch to political view", "Click here to switch to political view", 0, false, true, false, false, false, false, false, false, false, "12px");
        }
        map.controls[google.maps.ControlPosition.LEFT_TOP].push(switchDiv);
    }
    
    function createMenu(){
        var menuDiv = document.createElement('DIV');
        var buttonBackgroundColour = "gray";
        var buttonTextColour = "white";
        var buttonSelectedBackgroundColour = "red";
        var buttonSelectedTextColour = "black";
        if (!preElectionMode && !electionCountMode) {
            if (!showHelp) {
                new MapKey(menuDiv, map, buttonTextColour, buttonBackgroundColour, "Help", "Click here to show help information", 0, false, false, true, true, false, false, false, false, false, "12px");
            }
            else {
                new MapKey(menuDiv, map, buttonSelectedTextColour, buttonSelectedBackgroundColour, "Help", "Click here to hide help information", 0, false, false, true, true, false, false, false, false, false, "12px");
            }
            if (!showSLA) {
                new MapKey(menuDiv, map, buttonTextColour, buttonBackgroundColour, "Target Dates", "Click here to show information about our target dates for resolving issues", 0, false, false, true, false, true, false, false, false, true, "12px");
            }
            else {
                new MapKey(menuDiv, map, buttonSelectedTextColour, buttonSelectedBackgroundColour, "Target Dates", "Click here to hide information about target dates", 0, false, false, true, false, true, false, false, false, true, "12px");
            }
        }
        if (!showInformation) {
            new MapKey(menuDiv, map, buttonTextColour, buttonBackgroundColour, "Open Source", "Click here to show information about Open Source", 0, false, false, true, false, true, false, false, false, false, "12px");
        }
        else {
            new MapKey(menuDiv, map, buttonSelectedTextColour, buttonSelectedBackgroundColour, "Open Source", "Click here to hide information about Open Source", 0, false, false, true, false, true, false, false, false, false, "12px");
        }
        if (!showFeedback) {
            new MapKey(menuDiv, map, buttonTextColour, buttonBackgroundColour, "Send Feedback", "Click here to send us your feedback", 0, false, false, true, false, false, true, false, false, false, "12px");
        }
        else {
            new MapKey(menuDiv, map, buttonSelectedTextColour, buttonSelectedBackgroundColour, "Send Feedback", "Click here to hide feedback form", 0, false, false, true, false, false, true, false, false, false, "12px");
        }
        map.controls[google.maps.ControlPosition.LEFT_TOP].push(menuDiv);
    }
    
    function whenReady(id, callback){
        var interval = setInterval(function(){
            var element = document.getElementById(id);
            if (element) {
                clearInterval(interval);
                callback(element);
            }
        }, 500);
    }
    
    function singleClick(point, returnedFromViewCall){
        clickSearch = true;
        window.clearTimeout(clckTimeOut);
        clckTimeOut = null;
        clearBubble();
        if (!bubbleActive && !returnedFromViewCall) {
            checkWards(point.latLng);
        }
        currentPoint = point;
        if (returnedFromViewCall) {
            justClosedBubble = false;
        }
        if (justClosedBubble) {
            justClosedBubble = false;
        }
        else {
            bubbleActive = true;
            var tempLatLng;
            if (returnedFromViewCall) {
                tempLatLng = point;
            }
            else {
                tempLatLng = point.latLng;
            }
            var nearestStreetView = new google.maps.StreetViewService().getPanoramaByLocation(tempLatLng, 50, checkStreetViewLocation);
        }
    }
    
    function checkStreetViewLocation(data, status){
        var outsideLocation;
        var insideLocation;
        if (status == google.maps.StreetViewStatus.OK) {
            streetviewAvailable = true;
        }
        else {
            streetviewAvailable = false;
        }
        if (status == google.maps.StreetViewStatus.OK && inWard) {
            insideLocation = data.location.description;
            outsideLocation = "'" + data.location.description + "'<BR><BR>Is not within the " + boundaryType + " boundary.";
            checkLocation(currentPoint, insideLocation, outsideLocation)
        }
        else {
            var tempPoint;
            if (currentPoint.latLng) {
                tempPoint = currentPoint.latLng;
            }
            else {
                tempPoint = currentPoint;
            }
            if (geocoder && inWard) {
                geocoder.geocode({
                    'latLng': tempPoint
                }, function(results, status){
                    if (status == google.maps.GeocoderStatus.OK) {
                        if (results[0]) {
                            insideLocation = results[0].formatted_address;
                            outsideLocation = "'" + results[0].formatted_address + "'<BR><BR>Is not within the " + boundaryType + " boundary.";
                        }
                        else {
                            insideLocation = "this location.";
                            outsideLocation = "This location is not within the " + boundaryType + " boundary. ";
                        }
                    }
                    else {
                        insideLocation = "this location.";
                        outsideLocation = "This location is not within the " + boundaryType + " boundary. ";
                    }
                    checkLocation(currentPoint, insideLocation, outsideLocation);
                });
            }
            else {
                insideLocation = "this location.";
                outsideLocation = "This location is not within the " + boundaryType + " boundary. ";
                checkLocation(currentPoint, insideLocation, outsideLocation);
            }
        }
    };
    
    function checkLocation(currentPoint, insideLocation, outsideLocation){
        if (inWard) {
            createBubble(currentPoint, insideLocation);
        }
        else {
            displayConfirmation(outsideLocation);
        }
    }
    
    function displayConfirmation(outsideLocation){
        bubbleActive = false;
        Ext.MessageBox.minWidth = 500;
        var confirmBox = Ext.MessageBox.confirm("<CENTER>Hello</CENTER>", "<CENTER>" + outsideLocation + "<BR><BR>" + outsideBoundariesMessage + "</CENTER>", processConfirmation).getDialog();
        ;
        confirmBox.defaultButton = 2;
        confirmBox.focus();
    }
    
    function processConfirmation(response){
        if (response == "yes") {
            window.location = outsideBoundariesURL;
        }
    };
    
    function createBubble(point, location){
        if (clickSearch) {
            if (point.latLng) {
                streetviewLatLng = point.latLng;
            }
            else {
                streetviewLatLng = point;
            }
        }
        if (clickSearch || (!clickSearch && (menuLocation.substr(3, 2)).toLowerCase() == "nn")) {
            menuLocation = "near " + location.substring(0, location.indexOf(","));
        }
        gotoMainMenu(location, false, null, false)
        currentLocation = location;
        
        if (point.latLng) {
            currentBubble = new google.maps.InfoWindow({
                content: bubbleMenu,
                position: point.latLng
            });
        }
        else {
            currentBubble = new google.maps.InfoWindow({
                content: bubbleMenu,
                position: point
            });
        }
        currentBubble.open(map);
        currentBubbleListener = google.maps.event.addListener(currentBubble, "closeclick", function(){
            clearBubble();
            justClosedBubble = false;
            window.clearTimeout(clckTimeOut);
            clckTimeOut = null;
        });
    }
    
    gotoMainMenu = function setBubbleContents(location, internal, internalLocationDescription, setBubbleContents){
        var tempText1;
        var tempText2;
        if (internal) {
            tempText1 = "for search term '";
            tempText2 = "' ";
        }
        else {
            tempText1 = "";
            tempText2 = "";
        }
        if (preElectionMode) {
            var pollingStationAddress = menuLocation.substring(3).replace(/,/g, "<BR>");
            bubbleMenu = '<BR><div class="header"><div id="bubbleBack">' +
            '<table width="350px" border="0" cellpadding="0" cellspacing="2">' +
            '<tr>' +
            '<td colspan="3" class="sidePanelSubTitle">' +
            'Your polling station address<BR>' +
            '<DIV class="bubbleMidiText"><BR><CENTER>' +
            pollingStationAddress +
            '</CENTER>';
            
            bubbleMenu += '</DIV><BR>' +
            '</td>' +
            '</tr>';
            
            bubbleMenu += '<tr>' +
            '</tr>' +
            '</table>' +
            '</div></div>';
        }
        else {
            bubbleMenu = '<BR><div class="header"><div id="bubbleBack">' +
            '<table width="350px" border="0" cellpadding="0" cellspacing="2">' +
            '<tr>' +
            '<td colspan="3" class="sidePanelSubTitle">' +
            'What would you like to do?<BR>' +
            '<DIV class="bubbleMiniText">' +
            tempText1 +
            menuLocation +
            tempText2;
            
            if (internal) {
                bubbleMenu += '<BR> in ' + internalLocationDescription;
            }
            
            bubbleMenu += '</DIV><BR>' +
            '</td>' +
            '</tr>';
            
            if (showReportIt) {
                bubbleMenu += '<tr>' +
                '<td width="5%" style="background: black"></td>' +
                '<td onClick="gotoProblemMenu()" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Report a problem</td>' +
                '<td width="5%" style="background: black"></td>' +
                '</tr>';
            }
            if (showViewIt) {
                bubbleMenu += '<tr>' +
                '<td width="5%" style="background: black"></td>' +
                '<td onClick="gotoViewMenu()" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">View a problem</td>' +
                '<td width="5%" style="background: black"></td>' +
                '</tr>';
            }
            
            bubbleMenu += '<tr>' +
            '<td width="5%" style="background: black"></td>' +
            '<td onClick="gotoCouncillorMenu()" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Your Councillors</td>' +
            '<td width="5%" style="background: black"></td>' +
            '</tr>' +
            '<tr>' +
            '<td width="5%" style="background: black"></td>' +
            '<td onClick="gotoCoordinatorMenu()" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Your Neighbourhood</td>' +
            '<td width="5%" style="background: black"></td>' +
            '</tr>' +
            '<tr>' +
            '<td width="5%" style="background: black"></td>' +
            '<td id="clearMap" style="text-align: centre" cstyle="background: black">&nbsp</td>' +
            '<td width="5%" style="background: black"></td>' +
            '</tr>' +
            '</table>' +
            '</div></div>';
        }
        
        if (setBubbleContents) {
            currentBubble.setContent(bubbleMenu);
        };
        
            }
    
    gotoCouncillorMenu = function(){
        var ward = displayWard;
        
        if (displaySubWard != -1) {
            ward = displaySubWard;
        }
        
        var bubbleMenu = '<BR><div class="header"><div id="bubbleBack">' +
        '<table width="350px" border="0" cellpadding="0" cellspacing="2">' +
        '<tr>' +
        '<td colspan="3" class="sidePanelSubTitle">' +
        'Your Councillors<BR>' +
        '<DIV class="bubbleMiniText">' +
        wardNames[ward] +
        ' Ward';
        
        bubbleMenu += '</DIV><BR>' +
        '</td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td onClick="gotoCouncillorDetailsSelector(' +
        displayWard +
        ',false)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Find out more about your councillors</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>';
        
        if (showContactScreen) {
            bubbleMenu += '<tr>' +
            '<td width="5%" style="background: black"></td>' +
            '<td onClick="gotoCouncillorDetailsSelector(' +
            displayWard +
            ',true)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Contact your councillors</td>' +
            '<td width="5%" style="background: black"></td>' +
            '</tr>';
        }
        
        
        bubbleMenu += '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td onClick="gotoMainMenu(\'' +
        currentLocation +
        '\',false,null,true)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Main Menu</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td id="clearMap" style="text-align: centre" cstyle="background: black">&nbsp</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '</table>' +
        '</div></div>';
        
        currentBubble.setContent(bubbleMenu);
        
    }
    
    gotoCoordinatorMenu = function(){
    
        var ward = displayWard;
        
        if (displaySubWard != -1) {
            ward = displaySubWard;
        }
        
        var bubbleMenu = '<BR><div class="header"><div id="bubbleBack">' +
        '<table width="350px" border="0" cellpadding="0" cellspacing="2">' +
        '<tr>' +
        '<td colspan="3" class="sidePanelSubTitle">' +
        'Your Neighbourhood<BR>' +
        '<DIV class="bubbleMiniText">' +
        wardNames[ward] +
        ' Ward';
        
        bubbleMenu += '</DIV><BR>' +
        '</td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td onClick="gotoPriorities()" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Tell us your local priorities</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td onClick="gotoArea(' +
        displayWard +
        ')" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">How we\'re dealing with your local priorities</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>';
        
        if (showContactScreen) {
            bubbleMenu += '<tr>' +
            '<td width="5%" style="background: black"></td>' +
            '<td onClick="gotoContactMessage(' +
            displayWard +
            ',-1,false)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Contact neighbourhood management</td>' +
            '<td width="5%" style="background: black"></td>' +
            '</tr>';
        }
        bubbleMenu += '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td onClick="gotoMainMenu(\'' +
        currentLocation +
        '\',false,null,true)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Main Menu</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td id="clearMap" style="text-align: centre" cstyle="background: black">&nbsp</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '</table>' +
        '</div></div>';
        
        currentBubble.setContent(bubbleMenu);
        
    }
    
    gotoViewMenu = function(){
    
        resetSearchBox();
        var ward = displayWard;
        
        if (displaySubWard != -1) {
            ward = displaySubWard;
        }
        
        var defaultClassName = 'formDefault';
        var activeClassName = 'formActive';
        
        var bubbleMenu = '<BR><div class="header"><div id="bubbleBack">' +
        '<table width="350px" border="0" cellpadding="0" cellspacing="2" onmouseover="document.getElementById(\'callReference\').focus()">' +
        '<tr>' +
        '<td colspan="3" class="sidePanelSubTitle">' +
        'View a problem<BR>' +
        '<DIV class="bubbleMiniText">Please enter a six digit call number';
        
        bubbleMenu += '</DIV>' +
        '</td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td style="padding:5px 5px 5px 5px"><input id="callReference" class="' +
        defaultClassName +
        '" onmousedown="if(this.className==\'' +
        defaultClassName +
        '\'){this.value=\'\';this.focus();this.className=\'' +
        activeClassName +
        '\'}" onfocus="if(this.className==\'' +
        defaultClassName +
        '\'){this.value=\'\';this.className=\'' +
        activeClassName +
        '\'}" onmouseover="this.style.cursor=\'text\'" type="textbox" value="" size="6"></td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>';
        
        bubbleMenu += '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td onClick="getCallDetails(document.getElementById(\'callReference\').value,true,false,false)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">View the problem</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>';
        
        bubbleMenu += '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td onClick="gotoMainMenu(\'' +
        currentLocation +
        '\',false,null,true)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Main Menu</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td id="clearMap" style="text-align: centre" cstyle="background: black">&nbsp</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '</table>' +
        '</div></div>';
        
        currentBubble.setContent(bubbleMenu);
        
    }
    
    gotoProblemMenu = function(){
    
        var ward = displayWard;
        
        if (displaySubWard != -1) {
            ward = displaySubWard;
        }
        
        var formEntries = "";
        for (var currentReportItItem = 0; currentReportItItem < reportItNames.length; currentReportItItem++) {
            formEntries += '<option value="' + currentReportItItem + '">' + reportItNames[currentReportItItem] + '</option>';
        }
        
        var form = "";
        var inputSize = 38;
        var textAreaSize = 34;
        
        if (Ext.isChrome) {
            inputSize = 38;
            textAreaSize = 37;
        }
        if (Ext.isIE) {
            inputSize = 37;
            textAreaSize = 37;
        }
        
        var formDefaultClass = "miniFormDefault";
        var formActiveClass = "miniFormActive";
        var streetViewText1 = "Move the camera picture below (optional) :";
        var streetViewText2 = "Does the image show where the problem is?&nbsp";
        var useStreetviewLinks = false;
        
        if (bigForm) {
            formDefaultClass = "formDefault";
            formActiveClass = "formActive";
            streetViewText1 = "Move the camera picture below to show the problem location (optional) :";
            streetViewText2 = "Does the camera image above now show where the problem is located?&nbsp";
            useStreetviewLinks = true;
        }
        
        if (streetviewAvailable) {
            form = '<form action="#" onsubmit="process(this); return false" action="#">' +
            '<table border="0" width="100%" cellpadding="10">' +
            '<tr>' +
            '<td width="50%" valign="top" halign="center">' +
            'Choose the type of problem :<br>' +
            '<select class="' +
            formActiveClass +
            '" name="problemType" id="problemType">' +
            formEntries +
            '</select>' +
            '<BR>' +
            '<textarea class="' +
            formDefaultClass +
            '" name="problemDetails" id="problemDetails" rows="4" cols="' +
            textAreaSize +
            '" onmousedown="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.focus();this.className=\'' +
            formActiveClass +
            '\'}" onfocus="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.className=\'' +
            formActiveClass +
            '\'}" onmouseover="this.style.cursor=\'text\'">Please describe the problem here<\/textarea><br>' +
            '<input class="' +
            formDefaultClass +
            '" name="problemLocation" id="problemLocation" size="' +
            inputSize +
            '" maxlength="53" onmousedown="if(this.className==\'' +
            formDefaultClass +
            '\'){this.focus();this.className=\'' +
            formActiveClass +
            '\'}" onfocus="if(this.className==\'' +
            formDefaultClass +
            '\'){this.className=\'' +
            formActiveClass +
            '\'}" onmouseover="this.style.cursor=\'text\'" value="' +
            menuLocation +
            '"><\/input><br>' +
            '<input type="hidden" name="problemStreet" id="problemStreet" size="' +
            inputSize +
            '" maxlength="53" value="' +
            menuLocation +
            '"><\/input>' +
            '<input class="' +
            formDefaultClass +
            '" name="name" id="name" size="' +
            inputSize +
            '" maxlength="53" onmousedown="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.focus();this.className=\'' +
            formActiveClass +
            '\'}" onfocus="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.className=\'' +
            formActiveClass +
            '\'}" onmouseover="this.style.cursor=\'text\'" value="Your name here (optional)"><\/input><br>' +
            '<input class="' +
            formDefaultClass +
            '" name="emailAddress" id="emailAddress" size="' +
            inputSize +
            '" maxlength="53" onmousedown="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.focus();this.className=\'' +
            formActiveClass +
            '\'}" onfocus="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.className=\'' +
            formActiveClass +
            '\'}" onmouseover="this.style.cursor=\'text\'" value="Your email address here (optional)"><\/input><br>' +
            '<input class="' +
            formDefaultClass +
            '" name="phoneNumber" id="phoneNumber" size="' +
            inputSize +
            '" maxlength="53" onmousedown="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.focus();this.className=\'' +
            formActiveClass +
            '\'}" onfocus="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.className=\'' +
            formActiveClass +
            '\'}" onmouseover="this.style.cursor=\'text\'" value="Your phone number here (optional)"><\/input><br>' +
            '</td>' +
            '<td style="white-space:nowrap" valign="top" halign="center">' +
            streetViewText1 +
            '<div style="height:150px" id="formID">' +
            '</div>' +
            streetViewText2 +
            '<input type="checkbox" name="streetviewed" id="streetviewed" value="true" />' +
            '</td>' +
            '</tr>' +
            '<tr>' +
            '<td colspan="2" onClick="reportProblem(ward=\'' +
            ward +
            '\',document.getElementById(\'problemType\').value,document.getElementById(\'problemDetails\').value,document.getElementById(\'problemLocation\').value,document.getElementById(\'problemStreet\').value,document.getElementById(\'name\').value,document.getElementById(\'emailAddress\').value,document.getElementById(\'phoneNumber\').value,document.getElementById(\'streetviewed\').checked)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Report the problem</td>' +
            '</tr>' +
            '</table' +
            '</form>';
        }
        else {
            form = '<form action="#" onsubmit="process(this); return false" action="#">' +
            '<table border="0" width="100%" cellpadding="10">' +
            '<tr>' +
            '<td width="50%" valign="top" halign="center">' +
            'Choose the type of problem :<br>' +
            '<select class="' +
            formActiveClass +
            '" name="problemType" id="problemType">' +
            formEntries +
            '</select>' +
            '<BR><BR>' +
            '<textarea class="' +
            formDefaultClass +
            '" name="problemDetails" id="problemDetails" rows="5" cols="' +
            textAreaSize +
            '" onmousedown="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.focus();this.className=\'' +
            formActiveClass +
            '\'}" onfocus="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.className=\'' +
            formActiveClass +
            '\'}" onmouseover="this.style.cursor=\'text\'">Please describe the problem here<\/textarea><br>' +
            '<input class="' +
            formDefaultClass +
            '" name="problemLocation" id="problemLocation" size="' +
            inputSize +
            '" maxlength="53" onmousedown="if(this.className==\'' +
            formDefaultClass +
            '\'){this.focus();this.className=\'' +
            formActiveClass +
            '\'}" onfocus="if(this.className==\'' +
            formDefaultClass +
            '\'){this.className=\'' +
            formActiveClass +
            '\'}" onmouseover="this.style.cursor=\'text\'" value="' +
            menuLocation +
            '"><\/input><br>' +
            '<input type="hidden" name="problemStreet" id="problemStreet" size="' +
            inputSize +
            '" maxlength="53" value="' +
            menuLocation +
            '"><\/input>' +
            '<input class="' +
            formDefaultClass +
            '" name="name" id="name" size="' +
            inputSize +
            '" maxlength="53" onmousedown="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.focus();this.className=\'' +
            formActiveClass +
            '\'}" onfocus="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.className=\'' +
            formActiveClass +
            '\'}" onmouseover="this.style.cursor=\'text\'" value="Your name here (optional)"><\/input><br>' +
            '<input class="' +
            formDefaultClass +
            '" name="emailAddress" id="emailAddress" size="' +
            inputSize +
            '" maxlength="53" onmousedown="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.focus();this.className=\'' +
            formActiveClass +
            '\'}" onfocus="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.className=\'' +
            formActiveClass +
            '\'}" onmouseover="this.style.cursor=\'text\'" value="Your email address here (optional)"><\/input><br>' +
            '<input class="' +
            formDefaultClass +
            '" name="phoneNumber" id="phoneNumber" size="' +
            inputSize +
            '" maxlength="53" onmousedown="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.focus();this.className=\'' +
            formActiveClass +
            '\'}" onfocus="if(this.className==\'' +
            formDefaultClass +
            '\'){this.value=\'\';this.className=\'' +
            formActiveClass +
            '\'}" onmouseover="this.style.cursor=\'text\'" value="Your phone number here (optional)"><\/input><br>' +
            '</td>' +
            '</tr>' +
            '<tr>' +
            '<td colspan="2" onClick="reportProblem(ward=\'' +
            ward +
            '\',document.getElementById(\'problemType\').value,document.getElementById(\'problemDetails\').value,document.getElementById(\'problemLocation\').value,document.getElementById(\'problemStreet\').value,document.getElementById(\'name\').value,document.getElementById(\'emailAddress\').value,document.getElementById(\'phoneNumber\').value)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Report the problem</td>' +
            '</tr>' +
            '</table' +
            '</form>';
        }
        
        var bubbleMenu = '<BR><div class="header"><div id="bubbleBack">' +
        '<table border="0" cellpadding="0" cellspacing="2">' +
        '<tr>' +
        '<td colspan="3" class="sidePanelSubTitle">' +
        'Report a problem<BR>' +
        '<DIV class="bubbleMiniText">' +
        wardNames[ward] +
        ' Ward';
        
        bubbleMenu += '</DIV>' +
        '</td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td><DIV class="bubbleMiniText">' +
        form +
        '</DIV></td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '</table>' +
        '</div></div>';
        
        currentBubble.setContent(bubbleMenu);
        currentBubble.open(map);
        var panoramaOptions = {
            position: streetviewLatLng,
            addressControl: false,
            linksControl: useStreetviewLinks,
            enableFullScreen: true,
            features: {
                userPhotos: false
            },
            pov: {
                heading: 0,
                pitch: 0,
                zoom: defaultStreetViewZoom
            }
        };
        
        whenReady('formID', function(formID){
            document.getElementById("formID").innerHTML = ".";
            streetView = new google.maps.StreetViewPanorama(document.getElementById("formID"), panoramaOptions);
        });
    }
    
    gotoConfirmationMenu = function(problemType, callNumber, slaDate, email, text){
    
        var ward = displayWard;
        
        if (displaySubWard != -1) {
            ward = displaySubWard;
        }
        
        var confirmationText = "";
        
        if (slaDate == "not available") {
            slaDate = 'This type of problem currently has no target resolution date';
        }
        else {
            slaDate = 'Target resolution date is ' + slaDate;
        }
        
        confirmationText = "Thank you for raising a call with us regarding ";
        confirmationText += reportItDescEmail[problemType];
        confirmationText += ", please use the call number above when enquiring about the current state of the problem.";
        confirmationText += "<BR><BR>";
        if (email != "" && text != "") {
            confirmationText += "We will notify you via email and telephone when your problem has been resolved.";
        }
        else 
            if (email != "") {
                confirmationText += "We will notify you via email when your problem has been resolved.";
            }
            else 
                if (text != "") {
                    confirmationText += "We will notify you via telephone when your problem has been resolved.";
                }
        if (email != "") {
            confirmationText += " If you wish to enquire about the current state of the problem then use our search box, the main menu option or the link contained in your confirmation email.";
        }
        else {
            confirmationText += " If you wish to enquire about the current state of the problem then use our search box or the main menu option.";
        }
        
        var bubbleMenu = '<BR><div class="header"><div id="bubbleBack">' +
        '<table border="0" cellpadding="0" cellspacing="2">' +
        '<tr>' +
        '<td colspan="3" class="sidePanelSubTitle">' +
        'Report a problem<BR>' +
        '<DIV class="bubbleMiniText">' +
        wardNames[ward] +
        ' Ward' +
        '</DIV>' +
        '</td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td style="text-align: centre" class="reverseButton">Your call number is ' +
        callNumber +
        '</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td style="text-align: centre" class="slaText">' +
        slaDate +
        '</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td><DIV class="bubbleMidiText">' +
        confirmationText +
        '</DIV></td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td onClick="gotoMainMenu(\'' +
        currentLocation +
        '\',false,null,true)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Main Menu</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>';
        
        if (!miniScreen) {
            bubbleMenu += '<tr>' +
            '<td width="5%" style="background: black"></td>' +
            '<td id="clearMap" style="text-align: centre" cstyle="background: black">&nbsp</td>' +
            '<td width="5%" style="background: black"></td>' +
            '</tr>';
        }
        
        bubbleMenu += '</table>' +
        '</div></div>';
        currentBubble.setContent(bubbleMenu);
        currentBubble.open(map);
    }
    
    reportProblem = function(ward, problemType, problemDetails, problemLocation, problemStreet, name, emailAddress, phoneNumber, streetviewed){
        Ext.MessageBox.wait('Please wait whilst the problem is being registered...');
        if (problemDetails == 'Please describe the problem here') {
            problemDetails = "";
        }
        if (name == 'Your name here (optional)') {
            name = "";
        }
        if (emailAddress == 'Your email address here (optional)') {
            emailAddress = "";
        }
        if (phoneNumber == 'Your phone number here (optional)') {
            phoneNumber = "";
        }
        var heading = "";
        var pitch = "";
        var zoom = "";
        if (streetviewed) {
            var streetviewPOV = streetView.getPov();
            heading = streetviewPOV.heading;
            pitch = streetviewPOV.pitch;
            zoom = streetviewPOV.zoom;
        }
        var classificationCode = "";
        var descriptionEmail = "";
        for (var currentCode = 0; currentCode < codesClassificationCodes.length; currentCode++) {
            if (codesType[currentCode].toLowerCase() == reportItTypes[problemType].toLowerCase() &&
            (codesIncident[currentCode].toLowerCase() == reportItIncidents[problemType].toLowerCase() || codesIncident[currentCode] == "*") &&
            (codesSectorID[currentCode] == sectorID || codesSectorID[currentCode] == "*")) {
                classificationCode = codesClassificationCodes[currentCode];
            }
        }
        var tempLat;
        var tempLng;
        if (clickSearch) {
            if (currentPoint.latLng) {
                tempLat = currentPoint.latLng.lat();
                tempLng = currentPoint.latLng.lng();
            }
            else {
                tempLat = currentPoint.lat();
                tempLng = currentPoint.lng();
            }
        }
        else {
            tempLat = currentPoint.lat();
            tempLng = currentPoint.lng();
        }
        if (streetviewed) {
            tempLat = streetView.getPosition().lat();
            tempLng = streetView.getPosition().lng();
        }
        var encodedHeading = encodeURIComponent(heading);
        var encodedPitch = encodeURIComponent(pitch);
        var encodedZoom = encodeURIComponent(zoom);
        var tempURL = ""
        if (document.location.href.indexOf("?") != -1) {
            tempURL = document.location.href.substring(0, document.location.href.indexOf("?"));
        }
        else {
            tempURL = document.location.href;
        }
        
        var northingEasting = LLtoNE(tempLat, tempLng);
        Ext.Ajax.request({
            url: 'CreateCall?',
            params: {
                classificationCode: classificationCode,
                problemType: reportItNames[problemType],
                problemDetails: problemDetails,
                problemStreet: problemStreet,
                problemLocation: problemLocation,
                descriptionEmail: reportItDescEmail[problemType],
                name: name,
                emailAddress: emailAddress,
                phoneNumber: phoneNumber,
                lat: tempLat,
                lng: tempLng,
                heading: encodedHeading,
                pitch: encodedPitch,
                zoom: encodedZoom,
                ward: wardNames[ward],
                sector: sectorName,
                myCouncilURL: tempURL,
                northing: northingEasting.north,
                easting: northingEasting.east
            },
            timeout: 30000,
            method: 'POST',
            success: function(response){
                Ext.MessageBox.hide();
                try {
                    reportItJson = Ext.util.JSON.decode(response.responseText);
                } 
                catch (err) {
                    Ext.MessageBox.alert('<CENTER>Hello</CENTER>', 'Apologies, but there was an error handling your problem. Please try again later.');
                }
                if (reportItJson.result == "success") {
                    gotoConfirmationMenu(problemType, reportItJson.callNumber, reportItJson.slaDate, emailAddress, phoneNumber);
                }
                else {
                    Ext.MessageBox.alert('<CENTER>Hello</CENTER>', 'Apologies, but there was an error processing your problem. Please try again later.');
                }
            },
            failure: function(response){
                Ext.MessageBox.alert('<CENTER>Hello</CENTER>', 'Apologies, but there was an error reporting your problem. Please try again later.');
            }
        });
    }
    
    formClick = function(contact, contactDetails, messageDetails, ward, selection, councillor){
        if (contactDetails == "Enter your contact details here" || contactDetails == "Enter your email address here") {
            contactDetails = "";
        }
        if (messageDetails != 'Enter your message here' && messageDetails != '') {
            var emailAddress;
            var messageType;
            if (contact) {
                if (councillor) {
                    messageType = 1;
                    var councillor_emails_array = councillor_emails[ward].toString().split(",");
					if (selection == -1) {
                        emailAddress = councillor_emails_array;
                    }
                    else {
                        emailAddress = councillor_emails_array[selection];
                    }
				}
                else {
                    messageType = 2;
                    emailAddress = sectorEmails[wardSector[ward]];
                }
            }
            else {
                messageType = 3;
                emailAddress = feedbackEmailAddress;
            }
            var encodedContactDetails = encodeURIComponent(contactDetails);
            var encodedMessageDetails = encodeURIComponent(messageDetails);
            var encodedEmailTo = encodeURIComponent(emailAddress);
            var encodedSector = encodeURIComponent(sectorNames[wardSector[ward]]);
            Ext.Ajax.request({
                            url: 'SendMessage?contact=' + encodedContactDetails + '&message=' + encodedMessageDetails + '&emailTo=' + encodedEmailTo + '&messageType=' + messageType + '&sector=' + encodedSector,
                            timeout: 30000,
                            method: 'POST',
                            success: function (response) {
                                var sendEmailResponse;
                                try {
                                    sendEmailResponse = Ext.util.JSON.decode(response.responseText);
                                    if (contact) {
                                        redirectFromContact(councillor, sendEmailResponse.message);
                                    }
                                    else {
                                        Ext.MessageBox.alert('<CENTER>Hello</CENTER>', sendEmailResponse.message);
                                        MenuClick(false, false, true, false);
                                    }
                                }
                                catch (err) {
                                    Ext.MessageBox.alert('<CENTER>Hello</CENTER>', 'Apologies, but there was an error sending your message. Please try again later.');
                                    sendEmailResponse = Ext.util.JSON.decode(response.responseText);
                                }
                            },
                            failure: function (response) {
                                Ext.MessageBox.alert('<CENTER>Hello</CENTER>', 'Apologies, but there was an error sending your message. Please try again later.');
                                sendEmailResponse = Ext.util.JSON.decode(response.responseText);
                            }
                        });
        }
    }
    
    function redirectFromContact(councillor, message){
        if (councillor) {
            Ext.MessageBox.alert('<CENTER>Hello</CENTER>', message);
            gotoCouncillorMenu();
        }
        else {
            Ext.MessageBox.alert('<CENTER>Hello</CENTER>', message);
            gotoCoordinatorMenu();
        }
    }
    
    gotoArea = function(ward){
        spawnWindow(wardDocumentsURL[displayWard]);
    }
    
    gotoPriorities = function(ward){
        window.open(localPrioritiesURL);
    }
    
    gotoCouncillorDetailsSelector = function(ward, contact){
        var councillorArrayItem = ward;
        if (displaySubWard != -1) {
            councillorArrayItem = displaySubWard;
            ward = displaySubWard;
        }
        var councillor_names_array = councillor_names[councillorArrayItem].toString().split(",");
		var candidate_names_array = candidate_names[councillorArrayItem].toString().split(",");
        var councillor_parties_array = candidate_parties[councillorArrayItem].toString().split(",");
        
        var tempText;
        if (contact) {
            tempText = "Contact which";
        }
        else {
            tempText = "Details for which";
        }
        
        var bubbleMenuCouncillorDetailsSelect = '<BR><div class="header"><div id="bubbleBack">' +
        '<table width="300px" border="0" cellpadding="0" cellspacing="2">' +
        '<tr>' +
        '<td colspan="3" class="sidePanelSubTitle">' +
        tempText +
        ' Councillor?<BR>' +
        '<DIV class="bubbleMiniText">' +
        wardNames[ward] +
        ' Ward' +
        '</DIV><BR>' +
        '</td>' +
        '</tr>';
        
        var procCall;
        
        if (contact) {
            bubbleMenuCouncillorDetailsSelect += '<tr>' +
            '<td width="5%" style="background: black"></td>' +
            '<td onClick="gotoContactMessage(' +
            councillorArrayItem +
            ',-1,true)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">All my councillors</td>' +
            '<td width="5%" style="background: black"></td>' +
            '</tr>';
        }
        
        for (var currentCouncillor = 0; currentCouncillor < councillor_names_array.length; currentCouncillor++) {
            if (councillor_names_array[currentCouncillor] != "") {
                if (contact) {
                    procCall = "gotoContactMessage(" + councillorArrayItem + "," + currentCouncillor + ",true)";
                }
                else {
                    procCall = "gotoCouncillorDetails(" + councillorArrayItem + "," + currentCouncillor + ")";
                }
                bubbleMenuCouncillorDetailsSelect += '<tr>' +
                '<td width="5%" style="background: black"></td>' +
                '<td onClick="' +
                procCall +
                '" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'' +
                cssPartyButton[councillor_parties_array[councillor_names_array[currentCouncillor]]] +
                '\'" style="text-align: centre" class="' +
                cssPartyButton[councillor_parties_array[councillor_names_array[currentCouncillor]]] +
                '">' +
                candidate_names_array[councillor_names_array[currentCouncillor]] +
                '</td>' +
                '<td width="5%" style="background: black"></td>' +
                '</tr>';
            }
        }
        
        bubbleMenuCouncillorDetailsSelect += '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td onClick="gotoMainMenu(\'' +
        currentLocation +
        '\',false,null,true)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Main Menu</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>';
        
        bubbleMenuCouncillorDetailsSelect += '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td style="text-align: centre" cstyle="background: black">&nbsp</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>' +
        '</table>' +
        '</div></div>';
        currentBubble.setContent(bubbleMenuCouncillorDetailsSelect);
    }
    
    gotoContactMessage = function(ward, selection, councillor){
    
        var councillorArrayItem = ward;
        if (displaySubWard != -1) {
            councillorArrayItem = displaySubWard;
            ward = displaySubWard;
        }
        
        var councillor_names_array = councillor_names[ward].toString().split(",");
		var temp_candidate_names = candidate_names[ward].toString().split(",");
		var councillor_parties_array = candidate_parties[councillorArrayItem].toString().split(",");
        
        var tempText;
        var tempCSS;
        
        var tempRows = 9;
        var defaultClassName = 'formDefault';
        var activeClassName = 'formActive';
        
        if (miniScreen) {
            tempRows = 4;
            defaultClassName = 'miniFormDefault';
            activeClassName = 'miniFormActive';
        }
        
        if (councillor) {
            if (selection == -1) {
                tempText = "Your Councillors";
                tempCSS = cssPartyButton[0];
            }
            else {
				tempText = "Councillor " + temp_candidate_names[councillor_names_array[selection]];
                tempCSS = cssPartyButton[councillor_parties_array[councillor_names_array[selection]]];
            }
        }
        else {
            tempText = "Your coordinator";
            tempCSS = cssPartyButton[0];
            ;
        }
        var bubbleMenuContact = '<BR><div class="header"><div id="bubbleBack">' +
        '<table width="300px" border="0" cellpadding="0" cellspacing="2">' +
        '<tr>' +
        '<td colspan="3" class="sidePanelSubTitle">' +
        '<DIV class="' +
        tempCSS +
        '"> ' +
        tempText +
        '</DIV>' +
        '<DIV class="bubbleMiniText">' +
        wardNames[ward] +
        ' Ward' +
        '</DIV>' +
        '</td>' +
        '</tr>'
        
        bubbleMenuContact += '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td style="padding:5px 5px 5px 5px"><input id="contactDetails" class="' +
        defaultClassName +
        '" onmousedown="if(this.className==\'' +
        defaultClassName +
        '\'){this.value=\'\';this.focus();this.className=\'' +
        activeClassName +
        '\'}" onfocus="if(this.className==\'' +
        defaultClassName +
        '\'){this.value=\'\';this.className=\'' +
        activeClassName +
        '\'}" onmouseover="this.style.cursor=\'text\'" type="textbox" value="Enter your contact details here" size="30"></td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>';
        
        bubbleMenuContact += '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td style="padding:5px 5px 5px 5px"><textarea id="messageDetails" rows="' +
        tempRows +
        '" cols="30" class="' +
        defaultClassName +
        '" onmousedown="if(this.className==\'' +
        defaultClassName +
        '\'){this.value=\'\';this.focus();this.className=\'' +
        activeClassName +
        '\'}" onfocus="if(this.className==\'' +
        defaultClassName +
        '\'){this.value=\'\';this.className=\'' +
        activeClassName +
        '\'}" onmouseover="this.style.cursor=\'text\'">Enter your message here</textarea></td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>';
        
        bubbleMenuContact += '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td onClick="formClick(true,document.getElementById(\'contactDetails\').value,document.getElementById(\'messageDetails\').value,' +
        ward +
        ',' +
        selection +
        ',' +
        councillor +
        ')" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Send Message</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>';
        
        bubbleMenuContact += '<tr>' +
        '<td width="5%" style="background: black"></td>' +
        '<td onClick="gotoMainMenu(\'' +
        currentLocation +
        '\',false,null,true)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Main Menu</td>' +
        '<td width="5%" style="background: black"></td>' +
        '</tr>';
        
        if(!miniScreen){
 		  bubbleMenuContact += //'<tr>' +
          '<td width="5%" style="background: black"></td>' +
          '<td style="text-align: centre" cstyle="background: black">&nbsp</td>' +
          '<td width="5%" style="background: black"></td>' +
          '</tr>';
        }
 
        bubbleMenuContact += '</table>' + '</div></div>';
        currentBubble.setContent(bubbleMenuContact);
        currentBubble.open(map);
    }
    
    spawnWindow = function(url){
        var subWindow = window.open(url);
        window.setTimeout(function(){
            subWindow.focus();
        }, 500);
    }
    
    gotoCouncillorDetails = function(ward, selection){
        var councillor_parties_array = candidate_parties[ward].toString().split(",");
        var councillor_names_array = councillor_names[ward].toString().split(",");
        var councillor_main_url_array = councillor_main_urls[ward].toString().split(",");
        var councillor_social_url_type_array = councillor_social_url_types[ward].toString().split(",");
        var councillor_social_url_array = councillor_social_urls[ward].toString().split(",");
        var councillor_twitter_url_array = councillor_twitter_urls[ward].toString().split(",");
        var councillor_blog_url_array = councillor_blog_urls[ward].toString().split(",");
        var councillor_personal_url_array = councillor_personal_urls[ward].toString().split(",");
        var councillorNeedsMenu = false;
        if (councillor_parties_array[councillor_names_array[selection]] != 4) {
            councillorNeedsMenu = true;
        }
        if (!councillorNeedsMenu) {
            if (councillor_social_url_array[selection] ||
            councillor_twitter_url_array[selection] ||
            councillor_blog_url_array[selection] ||
            councillor_personal_url_array[selection]) {
                councillorNeedsMenu = true;
            }
        }
        if (!showExternalPages) {
            councillorNeedsMenu = false;
        }
        if (councillorNeedsMenu) {
            var bubbleMenuCouncillorDetailsSelect = '<BR><div class="header"><div id="bubbleBack">' +
            '<table width="300px" border="0" cellpadding="0" cellspacing="2">' +
            '<tr>' +
            '<td colspan="3" class="sidePanelSubTitle">' +
            '<DIV class="' +
            cssPartyButton[councillor_parties_array[selection]] +
            '">Councillor ' +
            councillor_names_array[selection] +
            '</DIV>' +
            '<DIV class="bubbleMiniText">' +
            wardNames[ward] +
            ' Ward<BR>(NBC is not responsible for external content)' +
            '</DIV><BR>' +
            '</td>' +
            '</tr>' +
            '<tr>' +
            '<td width="5%" style="background: black"></td>' +
            '<td onClick="spawnWindow(\'' +
            councillor_main_url_base +
            +councillor_main_url_array[selection] +
            '\')" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">My Council profile</td>' +
            '<td width="5%" style="background: black"></td>' +
            '</tr>';
            
            if (councillor_social_url_array[selection]) {
                bubbleMenuCouncillorDetailsSelect += '<tr>' +
                '<td width="5%" style="background: black"></td>' +
                '<td onClick="spawnWindow(\'' +
                councillor_social_url_array[selection] +
                '\')" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Add me on ' +
                social_Networks[councillor_social_url_type_array[selection]] +
                '</td>' +
                '<td width="5%" style="background: black"></td>' +
                '</tr>';
            }
            
            if (councillor_twitter_url_array[selection]) {
                bubbleMenuCouncillorDetailsSelect += '<tr>' +
                '<td width="5%" style="background: black"></td>' +
                '<td onClick="spawnWindow(\'' +
                councillor_twitter_url_array[selection] +
                '\')" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Follow me on Twitter</td>' +
                '<td width="5%" style="background: black"></td>' +
                '</tr>';
            }
            
            if (councillor_blog_url_array[selection]) {
                bubbleMenuCouncillorDetailsSelect += '<tr>' +
                '<td width="5%" style="background: black"></td>' +
                '<td onClick="spawnWindow(\'' +
                councillor_blog_url_array[selection] +
                '\')" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Read my blog</td>' +
                '<td width="5%" style="background: black"></td>' +
                '</tr>';
            }
            
            if (councillor_personal_url_array[selection]) {
                bubbleMenuCouncillorDetailsSelect += '<tr>' +
                '<td width="5%" style="background: black"></td>' +
                '<td onClick="spawnWindow(\'' +
                councillor_personal_url_array[selection] +
                '\')" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Visit my website</td>' +
                '<td width="5%" style="background: black"></td>' +
                '</tr>';
            }
            
            if (partiesURL[councillor_parties_array[selection]]) {
                bubbleMenuCouncillorDetailsSelect += '<tr>' +
                '<td width="5%" style="background: black"></td>' +
                '<td onClick="spawnWindow(\'' +
                partiesURL[councillor_parties_array[selection]] +
                '\')" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">My local party website</td>' +
                '<td width="5%" style="background: black"></td>' +
                '</tr>';
            }
            
            bubbleMenuCouncillorDetailsSelect += '<tr>' +
            '<td width="5%" style="background: black"></td>' +
            '<td onClick="gotoMainMenu(\'' +
            currentLocation +
            '\',false,null,true)" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: centre" class="button">Main Menu</td>' +
            '<td width="5%" style="background: black"></td>' +
            '</tr>';
            
            bubbleMenuCouncillorDetailsSelect += '<tr>' +
            '<td width="5%" style="background: black"></td>' +
            '<td style="text-align: centre" cstyle="background: black">&nbsp</td>' +
            '<td width="5%" style="background: black"></td>' +
            '</tr>' +
            '</table>' +
            '</div></div>';
            currentBubble.setContent(bubbleMenuCouncillorDetailsSelect);
        }
        else {
            spawnWindow(councillor_main_url_base + councillor_main_url_array[selection]);
        }
    }
    
    var enterKey = new Ext.KeyMap(document, {
        key: [13],
        fn: function(e){
            if (searchBoxActive) {
                if (isCallNumber(document.getElementById("searchBox").value)) {
                    getCallDetails(document.getElementById("searchBox").value, false, true, false);
                }
                else {
                    findAddress(false);
                }
            }
            else {
                getCallDetails(document.getElementById("callReference").value, true, false, false);
            }
        }
    });
    
    if (useragent.indexOf('MSIE') != -1) {
        google.maps.event.addListener(map, "dblclick", function(){
            window.clearTimeout(clckTimeOut);
            clckTimeOut = null;
        });
    }
    
    if (!preElectionMode && !electionCountMode) {
        var searchBox = Ext.get(document.getElementById("searchBox"));
        searchBox.on('mousedown', function(){
            searchBoxActive = true;
            document.getElementById("searchBox").value = "";
            document.getElementById("searchBox").setAttribute('style', "");
            document.getElementById("searchBox").focus();
        });
    }
    
    if (!preElectionMode && !electionCountMode) {
        var findButton = Ext.get(document.getElementById("findIt"));
        findButton.on('click', function(){
            if (searchBoxActive) {
                if (isCallNumber(document.getElementById("searchBox").value)) {
                    getCallDetails(document.getElementById("searchBox").value, false, true, false);
                }
                else {
                    findAddress(false);
                }
            }
        });
    }
    
    function isCallNumber(searchString){
        var isCallNumber = false;
        if (searchString.length == 6) {
            var numbers = '0123456789';
            var isNumeric = true;
            for (currentNumber = 0; currentNumber < searchString.length; currentNumber++) {
                if (numbers.indexOf(searchString.charAt(currentNumber), 0) == -1) {
                    isNumeric = false;
                }
            }
            if (isNumeric) {
                isCallNumber = true;
            }
        }
        return isCallNumber;
    }
    
    getCallDetails = function(callReference, fromMenu, fromSearch, fromURL){
    
        var viewItJson;
        var viewItForm;
        var bubbleMenu;
        Ext.Ajax.request({
            url: 'ViewCall?',
            params: {
                caseRef: callReference
            },
            timeout: 30000,
            method: 'POST',
            success: function(response){
                startupSearch = false;
                Ext.MessageBox.hide();
                try {
                    viewItJson = Ext.util.JSON.decode(response.responseText);
                } 
                catch (err) {
                    Ext.MessageBox.alert('<CENTER>Hello</CENTER>', 'Apologies, but there was an error handling the problem. Please try again later.');
                }
                if (viewItJson.result == "success") {
                    if (viewItJson.status == "not found") {
                        if (fromURL) {
                            Ext.MessageBox.alert('<CENTER>Hello</CENTER>', 'Apologies, but this is not a valid call number.');
                        }
                        else {
                            Ext.MessageBox.alert('<CENTER>Hello</CENTER>', 'Apologies, but this is not a valid call number. Please try again.');
                        }
                        return;
                    }
                    else {
                        resetSearchBox();
                        var tempStatus = "";
                        var showSla = true;
                        if (viewItJson.status == "open") {
                            tempStatus = "Open";
                        }
                        else {
                            tempStatus = "Closed";
                            showSla = false;
                        }
                        if (viewItJson.txtheading) {
                            viewItForm = '<BR><table border="0" width="100%" cellpadding="10">' +
                            '<tr>' +
                            '<td width="1%" valign="top" halign="center">' +
                            '&nbsp Status' +
                            '</td>' +
                            '<td width="1%" valign="top" halign="center">' +
                            ':' +
                            '</td>' +
                            '<td width="48%" valign="top" halign="center"><span style="background-color:' +
                            viewItJson.slaColour +
                            '">' +
                            tempStatus +
                            '&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</span></td>' +
                            '<td width="60%" style="white-space:nowrap;color:black" valign="top" halign="center" rowspan="5">' +
                            '<div style="height:150px" id="viewID">' +
                            '</div>';
                            
                            if (!miniScreen || widescreen) {
                                viewItForm += 'Above is an image of the problem area &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp' +
                                '&nbsp';
                            }
                            
                            viewItForm += '</td>' +
                            '</tr>' +
                            '<tr>' +
                            '<td style="white-space: nowrap;" width="1%" valign="top" halign="center">' +
                            '&nbsp Reported on' +
                            '</td>' +
                            '<td width="1%" valign="top" halign="center">' +
                            ':' +
                            '</td>' +
                            '<td width="48%" valign="top" halign="center">' +
                            viewItJson.created +
                            '</td>' +
                            '</tr>';
                            
                            if (showSla && viewItJson.dueDate) {
                                viewItForm += '<tr>' +
                                '<td style="white-space: nowrap;" width="1%" valign="top" halign="center">' +
                                '&nbsp Target Date' +
                                '</td>' +
                                '<td width="1%" valign="top" halign="center">' +
                                ':' +
                                '</td>' +
                                '<td width="48%" valign="top" halign="center">' +
                                viewItJson.dueDate +
                                '</td>' +
                                '</tr>';
                            }
                            
                            if (viewItJson.closed) {
                                viewItForm += '<tr>' +
                                '<td style="white-space: nowrap" width="1%" valign="top" halign="center">' +
                                '&nbsp Closed Date' +
                                '</td>' +
                                '<td width="1%" valign="top" halign="center">' +
                                ':' +
                                '</td>' +
                                '<td width="48%" valign="top" halign="center">' +
                                viewItJson.closed +
                                '</td>' +
                                '</tr>';
                            }
                            
                            if (viewItJson.cbotype) {
                                viewItForm += '<tr>' +
                                '<td width="1%" valign="top" halign="center">' +
                                '&nbsp Problem' +
                                '</td>' +
                                '<td width="1%" valign="top" halign="center">' +
                                ':' +
                                '</td>' +
                                '<td style="white-space: nowrap" width="48%" valign="top" halign="center">' +
                                viewItJson.cbotype +
                                '</td>' +
                                '</tr>';
                            }
                            if (viewItJson.txtstreet) {
                                viewItForm += '<tr>' +
                                '<td width="1%" valign="top" halign="center">' +
                                '&nbsp Location' +
                                '</td>' +
                                '<td width="1%" valign="top" halign="center">' +
                                ':' +
                                '</td>' +
                                '<td width="48%" valign="top" halign="center">' +
                                viewItJson.txtstreet +
                                '<BR><BR>' +
                                '</td>' +
                                '</tr>';
                            }
                            
                            if (miniScreen && !widescreen) {
                                viewItForm += '<TR><td colspan="4">&nbsp</td></TR>';
                            }
                            viewItForm += '<tr>' +
                            '<td colspan="4" onClick="returnToMainMenu()" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: center" class="button">Main Menu</td>' +
                            '</tr>' +
                            '</table';
                            bubbleMenu = '<BR><div class="header"><div id="bubbleBack">' +
                            '<table border="0" cellpadding="0" cellspacing="2">' +
                            '<tr>' +
                            '<td colspan="3" class="sidePanelSubTitle">';
                            if (miniScreen) {
                                bubbleMenu += '&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Call number ' + callReference + '&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<BR>';
                            }
                            else {
                                bubbleMenu += '&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Call number ' + callReference + '&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<BR>';
                            }
                        }
                        else {
                            viewItForm = '<BR><table border="0" width="100%" cellpadding="10">' +
                            '<tr>' +
                            '<td width="1%" valign="top" halign="center">' +
                            'Status' +
                            '</td>' +
                            '<td width="1%" valign="top" halign="center">' +
                            ':' +
                            '</td>' +
                            '<td width="48%" valign="top" halign="center"><span style="background-color:' +
                            viewItJson.slaColour +
                            '">' +
                            tempStatus +
                            '&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</span></td>' +
                            '</tr>' +
                            '<tr>' +
                            '<td style="white-space: nowrap;" width="1%" valign="top" halign="center">' +
                            'Reported on' +
                            '</td>' +
                            '<td width="1%" valign="top" halign="center">' +
                            ':' +
                            '</td>' +
                            '<td width="48%" valign="top" halign="center">' +
                            viewItJson.created +
                            '</td>' +
                            '</tr>';
                            
                            if (showSla && viewItJson.dueDate) {
                                viewItForm += '<tr>' +
                                '<td style="white-space: nowrap;" width="1%" valign="top" halign="center">' +
                                'Target Date' +
                                '</td>' +
                                '<td width="1%" valign="top" halign="center">' +
                                ':' +
                                '</td>' +
                                '<td width="48%" valign="top" halign="center">' +
                                viewItJson.dueDate +
                                '</td>' +
                                '</tr>';
                            }
                            
                            if (viewItJson.closed) {
                                viewItForm += '<tr>' +
                                '<td style="white-space: nowrap;" width="1%" valign="top" halign="center">' +
                                'Closed Date' +
                                '</td>' +
                                '<td width="1%" valign="top" halign="center">' +
                                ':' +
                                '</td>' +
                                '<td width="48%" valign="top" halign="center">' +
                                viewItJson.closed +
                                '</td>' +
                                '</tr>';
                            }
                            
                            if (viewItJson.cbotype) {
                                viewItForm += '<tr>' +
                                '<td width="1%" valign="top" halign="center">' +
                                'Problem' +
                                '</td>' +
                                '<td width="1%" valign="top" halign="center">' +
                                ':' +
                                '</td>' +
                                '<td width="48%" valign="top" halign="center">' +
                                viewItJson.cbotype +
                                '</td>' +
                                '</tr>';
                            }
                            if (viewItJson.txtstreet) {
                                viewItForm += '<tr>' +
                                '<td width="1%" valign="top" halign="center">' +
                                'Location' +
                                '</td>' +
                                '<td width="1%" valign="top" halign="center">' +
                                ':' +
                                '</td>' +
                                '<td width="48%" valign="top" halign="center">' +
                                viewItJson.txtstreet +
                                '<BR><BR>' +
                                '</td>' +
                                '</tr>';
                            }
                            
                            viewItForm += '<tr>' +
                            '<td colspan="4" onClick="returnToMainMenu()" onmouseover="this.style.cursor=\'pointer\';this.className=\'reverseButton\'" onmouseout="this.style.cursor=\'auto\';this.className=\'button\'" style="text-align: center" class="button">Main Menu</td>' +
                            '</tr>' +
                            '</table';
                            bubbleMenu = '<BR><div class="header"><div id="bubbleBack">' +
                            '<table border="0" cellpadding="0" cellspacing="2">' +
                            '<tr>' +
                            '<td colspan="3" class="sidePanelSubTitle">';
                            
                            if (miniScreen) {
                                bubbleMenu += ' Call number ' + callReference + '<BR>';
                            }
                            else {
                                bubbleMenu += '&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Call number ' + callReference + '&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<BR>';
                            }
                        }
                        
                        if (viewItJson.txtward) {
                            bubbleMenu += '<DIV class="bubbleMiniText">' + viewItJson.txtward + ' Ward' +
                            '</DIV>';
                        }
                        
                        bubbleMenu += '</td>' +
                        '</tr>' +
                        '<tr>' +
                        '<td width="5%" style="background: black"></td>' +
                        '<td><DIV class="bubbleMidiText">' +
                        viewItForm +
                        '</DIV></td>' +
                        '<td width="5%" style="background: black"></td>' +
                        '</tr>' +
                        '</table>' +
                        '</div></div>';
                        if (viewItJson.txtlongtitude) {
                            currentPoint = new google.maps.LatLng(viewItJson.txtlatitude, viewItJson.txtlongtitude);
                        }
                        else {
                            currentPoint = mapCenter;
                        }
                        map.setZoom(16);
                        checkWards(currentPoint);
                        if (fromSearch || fromURL) {
                            if (currentBubble) {
                                currentBubble.close();
                            }
                            currentBubble = new google.maps.InfoWindow({
                                content: bubbleMenu,
                                position: currentPoint
                            });
                            currentBubble.open(map);
                            currentBubbleListener = google.maps.event.addListener(currentBubble, "closeclick", function(){
                                clearBubble();
                                justClosedBubble = false;
                                window.clearTimeout(clckTimeOut);
                                clckTimeOut = null;
                            });
                            bubbleActive = true;
                        }
                        else {
                            currentBubble.setPosition(currentPoint);
                            currentBubble.setContent(bubbleMenu);
                            currentBubble.open(map);
                        }
                        if (viewItJson.txtheading) {
                            var tempZoom = parseInt(viewItJson.txtzoom);
                            if (miniScreen && tempZoom < 2) {
                                tempZoom = 2;
                            }
                            var panoramaOptions = {
                                position: currentPoint,
                                navigationControl: false,
                                addressControl: false,
                                linksControl: false,
                                enableFullScreen: true,
                                features: {
                                    userPhotos: false
                                },
                                pov: {
                                    heading: parseInt(viewItJson.txtheading),
                                    pitch: parseInt(viewItJson.txtpitch),
                                    zoom: tempZoom
                                }
                            };
                            if (fromURL) {
                                readyCount = 1;
                            }
                            whenReady('viewID', function(viewID){
                                window.setTimeout(function(){
                                    document.getElementById("viewID").innerHTML = ".";
                                    streetView = new google.maps.StreetViewPanorama(document.getElementById("viewID"), panoramaOptions);
                                }, 500);
                                readyCount++;
                            });
                        }
                    }
                }
                else {
                    Ext.MessageBox.alert('<CENTER>Hello</CENTER>', 'Apologies, but there was an error retrieving the problem. Please try again later.');
                }
            },
            failure: function(response){
                Ext.MessageBox.alert('<CENTER>Hello</CENTER>', 'Apologies, but there was an error getting the problem. Please try again later.');
                startupSearch = false;
            }
        });
    }
    
    returnToMainMenu = function(){
        singleClick(currentPoint, true);
    }
    
    var resetButton = Ext.get(document.getElementById("resetMap"));
    resetButton.on('click', function(){
        clearBubble();
        justClosedBubble = false;
        var point = mapCenter;
        map.setCenter(point);
        map.setZoom(12);
        point = googleOutsideLatLng;
        resetSearchBox();
        if (!showPanel && !panelAnimation) {
            checkWards(point);
        }
    });
    
    if (!preElectionMode && !electionCountMode) {
        var previousMessageButton = Ext.get(document.getElementById("previousMessage"));
        previousMessageButton.on('click', function(){
            messageDirectionForward = false;
            forceMessage = true;
            update_message();
        });
        previousMessageButton.on('mouseover', function(){
            document.body.style.cursor = 'pointer';
        });
        previousMessageButton.on('mouseout', function(){
            document.body.style.cursor = 'auto';
        });
        var nextMessageButton = Ext.get(document.getElementById("nextMessage"));
        nextMessageButton.on('click', function(){
            forceMessage = true;
            update_message();
        });
        nextMessageButton.on('mouseover', function(){
            document.body.style.cursor = 'pointer';
        });
        nextMessageButton.on('mouseout', function(){
            document.body.style.cursor = 'auto';
        });
        var messageBar = Ext.get(document.getElementById("message_bar"));
        messageBar.on('mouseover', function(){
            messageScroll = false;
        });
        messageBar.on('mouseout', function(){
            messageScroll = true;
        });
    }
    
    function resetSearchBox(){
        if (!preElectionMode && !electionCountMode) {
            document.getElementById("searchBox").setAttribute('style', "font-style:italic;color:#989898");
            document.getElementById("searchBox").value = "Enter a postcode, address or call number";
            document.getElementById("searchBox").blur();
            searchBoxActive = false;
        }
    }
    
    function findAddress(startup){
        clearBubble();
        clickSearch = false;
        bubbleActive = true;
        var addressTail = "";
        var addressCheck;
        var searchAddress = "";
        if (startup) {
            addressCheck = startupSearchText.toLowerCase();
            searchAddress = startupSearchText;
            menuLocation = "at " + searchAddress;
        }
        else {
            addressCheck = document.getElementById("searchBox").value.toLowerCase();
            searchAddress = document.getElementById("searchBox").value;
            menuLocation = "at " + searchAddress;
        }
        if (addressCheck.length > 0) {
            if (addressCheck.indexOf(findAddressTailCheck) == -1) {
                addressTail = findAddressTailSetTo;
            }
            googleGeocode(searchAddress, searchAddress + addressTail, function(point, found, mapped){
                if (found) {
                    inWard = false;
                    var pointWard = "";
                    var pointZoom = 16;
                    if (!mapped) {
                        pointZoom = 12;
                    }
                    var subWard = -1;
                    var selectedWard = -1;
                    for (var currentWard = 0; currentWard < totalNumOfWards; currentWard++) {
                        if (wards[currentWard].Contains(point)) {
                            if (sectorSubsectorOf[wardSector[currentWard]] == -1) {
                                subWard = currentWard;
                            }
                            else {
                                selectedWard = currentWard;
                            }
                            inWard = true;
                        }
                    };
                    var infoWard = "";
                    if (mapped) {
                        if (selectedWard != -1 && subWard != -1) {
                            pointWard = wardNames[subWard] + " Ward, " + sectorNames[wardSector[selectedWard]];
                            infoWard = wardNames[subWard];
                        }
                        else {
                            if (selectedWard == -1) {
                                selectedWard = subWard
                            }
                            pointWard = wardNames[selectedWard] + " Ward, " + sectorNames[wardSector[selectedWard]] + " Sector";
                            infoWard = wardNames[selectedWard]
                        }
                    }
                    else {
                        pointWard = "Outside boundaries of " + googleDefaultLocationName + " " + boundaryType;
                        pointZoom = 12;
                    }
                    map.setCenter(point);
                    map.setZoom(pointZoom);
                    if (internal) {
                        clearBubble();
                        bubbleActive = true;
                        gotoMainMenu(searchAddress, internal, infoWard + " ward, " + sectorNames[wardSector[selectedWard]] + " sector", false)
                        currentBubble = new google.maps.InfoWindow({
                            content: bubbleMenu,
                            position: point
                        });
                        currentBubble.open(map);
                        currentBubbleListener = google.maps.event.addListener(currentBubble, "closeclick", function(){
                            clearBubble();
                            justClosedBubble = false;
                        });
                    }
                    else {
                        currentPoint = point;
                        streetviewLatLng = point;
                        var nearestStreetView = new google.maps.StreetViewService().getPanoramaByLocation(point, 50, checkStreetViewLocation);
                    }
                }
                else {
                    map.setCenter(point);
                    map.setZoom(12);
                }
                if (!showPanel && !panelAnimation && mapped) {
                    checkWards(point);
                }
                if (!mapped) {
                    defaultStats();
                }
                resetSearchBox();
            });
        }
    }
    
    function googleGeocode(searchTerm, address, callbackFunction){
        var resultInWard = false;
        var resultLat;
        var resultLng;
        var point;
        if (geocoder) {
            geocoder.geocode({
                'address': searchTerm + findAddressTailSetTo,
                'bounds': bounds,
                'region': 'uk'
            }, function(results, status){
                if (status == google.maps.GeocoderStatus.OK) {
                    point = results[0].geometry.location;
                    if (debug) {
                        alert("Lat=" + point.lat() + ",Lng=" + point.lng());
                        alert("location=" + results[0].address_components[0].long_name);
                    }
                    if (point.lat() == googleDefaultLatLng.lat() && point.lng() == googleDefaultLatLng.lng() && googleDefaultLocationName == results[0].address_components[0].long_name) {
                        googleLocalSearch(searchTerm, address, callbackFunction);
                    }
                    else {
                        for (var currentWard = 0; currentWard < totalNumOfWards; currentWard++) {
                            if (!resultInWard && wards[currentWard].Contains(point)) {
                                resultInWard = true;
                            }
                        }
                        if (resultInWard) {
                            callbackFunction(point, true, true);
                        }
                        else {
                            displayConfirmation("'" + searchTerm + "' cannot be found within the " + boundaryType + " boundary. ");
                            var point = mapCenter;
                            callbackFunction(point, false, false);
                        }
                    }
                }
                else {
                    if (preElectionMode && status == 'ZERO_RESULTS') {
                        geocoder.geocode({
                            'address': searchTerm.substring(searchTerm.toUpperCase().indexOf("NN")),
                            'bounds': bounds,
                            'region': 'uk'
                        }, function(results, status){
                            if (status == google.maps.GeocoderStatus.OK) {
                                point = results[0].geometry.location;
                                for (var currentWard = 0; currentWard < totalNumOfWards; currentWard++) {
                                    if (!resultInWard && wards[currentWard].Contains(point)) {
                                        resultInWard = true;
                                    }
                                }
                                if (resultInWard) {
                                    callbackFunction(point, true, true);
                                }
                            }
                        })
                    }
                    else {
                        Ext.MessageBox.alert("Search Result", "Geocode was not successful for the following reason: " + status);
                    }
                }
            });
        }
    }
    
    function googleLocalSearch(searchTerm, address, callbackFunction){
        var resultInWard = false;
        localSearch.setSearchCompleteCallback(null, function(){
            if (localSearch.results[0]) {
                resultLat = localSearch.results[0].lat;
                resultLng = localSearch.results[0].lng;
                point = new google.maps.LatLng(resultLat, resultLng);
                for (var currentWard = 0; currentWard < totalNumOfWards; currentWard++) {
                    if (!resultInWard && wards[currentWard].Contains(point)) {
                        resultInWard = true;
                    }
                }
                if (resultInWard) {
                    menuLocation = "at " + localSearch.results[0].streetAddress;
                    callbackFunction(point, true);
                }
                else {
                    displayConfirmation("'" + searchTerm + "' cannot be found within the " + boundaryType + " boundary.")
                    var point = mapCenter;
                    callbackFunction(point, false);
                }
            }
        });
        localSearch.execute(address + ", UK");
    }
    
    function clearBubble(){
        if (currentBubble != null) {
            currentBubble.close();
            currentBubble = null;
            currentBubbleListener = null;
            bubbleActive = false;
            justClosedBubble = true;
            streetviewAvailable = false;
            startupSearch = false;
        }
    }
    
    function MapKey(keyDiv, map, text_colour, background_colour, text, title, selection, key, view, showPanel, help, information, feedback, political, version, sla, fontSize){
    
        keyDiv.style.padding = '5px';
        
        var controlUI = document.createElement('DIV');
        controlUI.style.backgroundColor = background_colour;
        controlUI.style.color = text_colour;
        controlUI.style.borderColor = 'black';
        controlUI.style.borderStyle = 'solid';
        controlUI.style.borderWidth = '2px';
        controlUI.style.cursor = 'pointer';
        controlUI.style.textAlign = 'center';
        controlUI.title = title;
        keyDiv.appendChild(controlUI);
        
        var controlText = document.createElement('DIV');
        controlText.style.fontFamily = 'Arial,sans-serif';
        controlText.style.fontSize = fontSize;
        controlText.style.paddingLeft = '4px';
        controlText.style.paddingRight = '4px';
        controlText.innerHTML = text;
        controlUI.appendChild(controlText);
        
        google.maps.event.addDomListener(controlUI, 'mouseover', function(){
        
            if (!showPanel && !panelAnimation && !bubbleActive) {
                if (key && political) {
                    partyStats(selection);
                }
                if (key && !political) {
                    sectorStats(selection);
                }
            }
        });
        
        google.maps.event.addDomListener(controlUI, 'click', function(){
            if (key && political && partiesURL[selection]) {
                spawnWindow(partiesURL[selection]);
            }
            if (key && !political) {
                spawnWindow(sectorURLs[selection]);
            }
            if (version) {
                spawnWindow("http://sourceforge.net/projects/mycouncil");
            }
            if (view) {
                viewClick();
            }
            if (help && !startupAnimation) {
                MenuClick(true, false, false, false);
            }
            if (sla && !startupAnimation) {
                MenuClick(false, false, false, true);
            }
            if (information && !startupAnimation) {
                MenuClick(false, true, false, false);
            }
            if (feedback && !startupAnimation) {
                MenuClick(false, false, true, false);
            }
        });
    }
    
    function OGBNorthEast(east, north){
        this.north = north;
        this.east = east;
    }
    
    function LLtoNE(lat, lon){
        var deg2rad = Math.PI / 180;
        var rad2deg = 180.0 / Math.PI;
        
        var phi = lat * deg2rad; // convert latitude to radians
        var lam = lon * deg2rad; // convert longitude to radians
        var a = 6377563.396; // OSGB semi-major axis
        var b = 6356256.91; // OSGB semi-minor axis
        var e0 = 400000; // easting of false origin
        var n0 = -100000; // northing of false origin
        var f0 = 0.9996012717; // OSGB scale factor on central meridian
        var e2 = 0.0066705397616; // OSGB eccentricity squared
        var lam0 = -0.034906585039886591; // OSGB false east
        var phi0 = 0.85521133347722145; // OSGB false north
        var af0 = a * f0;
        var bf0 = b * f0;
        
        // easting
        var slat2 = Math.sin(phi) * Math.sin(phi);
        var nu = af0 / (Math.sqrt(1 - (e2 * (slat2))));
        var rho = (nu * (1 - e2)) / (1 - (e2 * slat2));
        var eta2 = (nu / rho) - 1;
        var p = lam - lam0;
        var IV = nu * Math.cos(phi);
        var clat3 = Math.pow(Math.cos(phi), 3);
        var tlat2 = Math.tan(phi) * Math.tan(phi);
        var V = (nu / 6) * clat3 * ((nu / rho) - tlat2);
        var clat5 = Math.pow(Math.cos(phi), 5);
        var tlat4 = Math.pow(Math.tan(phi), 4);
        var VI = (nu / 120) * clat5 * ((5 - (18 * tlat2)) + tlat4 + (14 * eta2) - (58 * tlat2 * eta2));
        var east = e0 + (p * IV) + (Math.pow(p, 3) * V) + (Math.pow(p, 5) * VI);
        
        // northing
        var n = (af0 - bf0) / (af0 + bf0);
        var M = Marc(bf0, n, phi0, phi);
        var I = M + (n0);
        var II = (nu / 2) * Math.sin(phi) * Math.cos(phi);
        var III = ((nu / 24) * Math.sin(phi) * Math.pow(Math.cos(phi), 3)) * (5 - Math.pow(Math.tan(phi), 2) + (9 * eta2));
        var IIIA = ((nu / 720) * Math.sin(phi) * clat5) * (61 - (58 * tlat2) + tlat4);
        var north = I + ((p * p) * II) + (Math.pow(p, 4) * III) + (Math.pow(p, 6) * IIIA);
        
        // make whole number values
        east = Math.round(east); // round to whole number of meters
        north = Math.round(north);
        
        return new OGBNorthEast(east, north);
    }
    
    function Marc(bf0, n, phi0, phi){
        return bf0 *
        (((1 + n + ((5 / 4) * (n * n)) + ((5 / 4) * (n * n * n))) * (phi - phi0)) -
        (((3 * n) + (3 * (n * n)) + ((21 / 8) * (n * n * n))) * (Math.sin(phi - phi0)) * (Math.cos(phi + phi0))) +
        ((((15 / 8) * (n * n)) + ((15 / 8) * (n * n * n))) * (Math.sin(2 * (phi - phi0))) * (Math.cos(2 * (phi + phi0)))) -
        (((35 / 24) * (n * n * n)) * (Math.sin(3 * (phi - phi0))) * (Math.cos(3 * (phi + phi0)))));
    }
    
    function sortNumber(a, b){
        return b - a;
    }
    
    function addCommas(nStr){
        nStr += '';
        x = nStr.split('.');
        x1 = x[0];
        x2 = x.length > 1 ? '.' + x[1] : '';
        var rgx = /(\d+)(\d{3})/;
        while (rgx.test(x1)) {
            x1 = x1.replace(rgx, '$1' + ',' + '$2');
        }
        return x1 + x2;
    }
    
    function trimNumber(s){
        while (s.substr(0, 1) == '0' && s.length > 1) {
            s = s.substr(1, 9999);
        }
        return s;
    }
    
    function electionResult(ward, councillor_names_array, councillor_parties_array, wardView){
        var candidates = candidate_names[ward].toString().split(",");
        var party = candidate_parties[ward].toString().split(",");
        var votes = candidate_votes[ward].toString().split(",");
        
        var sortedVotes = new Array();
        for (var currentCouncillor = 0; currentCouncillor < candidates.length; currentCouncillor++) {
            sortedVotes[currentCouncillor] = votes[currentCouncillor] + "=" + currentCouncillor;
        }
        sortedVotes.sort();
        var candidateText = "";
        if (!internetExplorer && wardView) {
            candidateText += "<BR>";
        }
        candidateText += "<TABLE WIDTH='100%' border='1' cellpadding='2' cellspacing='0'>";
        candidateText += "<TR BGCOLOR=\"#C0C0C0\"><TD COLSPAN=\"2\"><B>Elected to Council</B></TD></TR>";
        for (var currentCouncillor = 0; currentCouncillor < councillor_names_array.length; currentCouncillor++) {
            candidateText += "<TR BGCOLOR=\"" + partyColours[party[councillor_names_array[currentCouncillor]]] + "\"><TD WIDTH='50%' ALIGN='LEFT'><FONT COLOR=\"" + partyTextColour[party[councillor_names_array[currentCouncillor]]] + "\">" + candidates[councillor_names_array[currentCouncillor]] + "</FONT></TD><TD WIDTH='50%' ALIGN='CENTER'><FONT COLOR=\"" + partyTextColour[party[councillor_names_array[currentCouncillor]]] + "\">" + parties[party[councillor_names_array[currentCouncillor]]] + "</FONT></TD></TR>";
        }
        candidateText += "</TABLE>";
        document.getElementById("info_panel_list_small").innerHTML = candidateText;
        document.getElementById("info_panel_list_small").innerHTML += "<BR>";
        candidateText = "<TABLE WIDTH='100%' border='1' cellpadding='2' cellspacing='0'>";
        candidateText += "<TR BGCOLOR=\"#C0C0C0\"><TD COLSPAN=\"4\"><B>Full Results</B></TD></TR>";
        candidateText += "<TR><TD><B>Name</B></TD><TD><B>Party</B></TD><TD><B>Votes</B></TD><TD><B>%</B></TD></TR>";
        var totalVotes = 0;
        for (var currentCandidate = candidates.length - 1; currentCandidate > -1; currentCandidate--) {
            var sortedCandidate = sortedVotes[currentCandidate].toString().split("=");
            totalVotes += parseInt(trimNumber(votes[sortedCandidate[1]]));
        }
        for (var currentCandidate = candidates.length - 1; currentCandidate > -1; currentCandidate--) {
            var sortedCandidate = sortedVotes[currentCandidate].toString().split("=");
            candidateText += "<TR BGCOLOR=\"" + partyColours[party[sortedCandidate[1]]] + "\"><TD WIDTH='50%' ALIGN='LEFT'><FONT COLOR=\"" + partyTextColour[party[sortedCandidate[1]]] + "\">" + candidates[sortedCandidate[1]] + "</FONT></TD><TD WIDTH='50%' ALIGN='CENTER'><FONT COLOR=\"" + partyTextColour[party[sortedCandidate[1]]] + "\">" + parties[party[sortedCandidate[1]]] + "</FONT></TD><TD WIDTH='50%' ALIGN='RIGHT'><FONT COLOR=\"" + partyTextColour[party[sortedCandidate[1]]] + "\">" + addCommas(trimNumber(votes[sortedCandidate[1]])) + "</FONT></TD><TD WIDTH='50%' ALIGN='CENTER'><FONT COLOR=\"" + partyTextColour[party[sortedCandidate[1]]] + "\">" + Math.round((parseInt(trimNumber(votes[sortedCandidate[1]])) / totalVotes) * 100) + "</FONT></TD></TR>";
        }
        candidateText += "</TABLE>";
        document.getElementById("info_panel_list_small").innerHTML += candidateText;
        document.getElementById("info_panel_title").innerHTML += "<BR>(Declared - Turnout " + Math.round(((totalVotes + parseInt(spoiled_count[ward])) / elector_count[ward]) * 100) + "%)";
    }
    
    function timer(){
        Ext.Ajax.request({
            url: jsonFileName,
            timeout: 30000,
            method: 'GET',
            success: function(wardData){
                try {
                    jsonData = Ext.util.JSON.decode(wardData.responseText);
                } 
                catch (err) {
                    Ext.MessageBox.alert('Hello', 'There is a problem with the MyCouncil page, please try again later.');
                }
                update = true;
                jointlyHeldWards = false;
                partyCount = new Array(0, 0, 0, 0, 0);
                sortedParties = new Array();
                sortedPartyCount = new Array();
                totalNumOfWards = 0;
                leadBy = jsonData.ledBy;
                mapCenter = jsonData.mapCenter;
                defaultZoom = jsonData.defaultZoom;
                map.setCenter(mapCenter);
                map.setZoom(defaultZoom);
                mapSWBounds = jsonData.mapSWBounds;
                mapNEBounds = jsonData.mapNEBounds;
                outsideBoundariesMessage = jsonData.outsideBoundariesMessage;
                outsideBoundariesURL = jsonData.outsideBoundariesURL;
                findAddressTailCheck = jsonData.findAddressTailCheck;
                findAddressTailSetTo = jsonData.findAddressTailSetTo;
                googleOutsideLatLng = jsonData.googleOutsideLatLng;
                boundaryType = jsonData.boundaryType;
                bounds = new google.maps.LatLngBounds(mapSWBounds, mapNEBounds);
                googleDefaultLatLng = jsonData.googleDefaultLatLng;
                googleDefaultLocationName = jsonData.googleDefaultLocationName;
                feedbackEmailAddress = jsonData.feedbackEmailAddress;
                callCenterNumber = jsonData.callCenterNumber;
                centerPoint = map.getCenter();
                version = jsonData.version;
                leaderName = jsonData.leader.name;
                leaderImage = jsonData.leader.image;
                mayorName = jsonData.mayor.name;
                mayorImage = jsonData.mayor.image;
                chiefExecName = jsonData.chiefExec.name;
                chiefExecImage = jsonData.chiefExec.image;
                chiefExecImageHeight = jsonData.chiefExec.imageHeight;
                chiefExecImageWidth = jsonData.chiefExec.imageWidth;
                localPrioritiesURL = jsonData.localPrioritiesURL;
                councillor_main_url_base = jsonData.councillor_main_url_base;
                preElectionSidePanelText = jsonData.preElectionSidePanelText;
                preElectionDefaultText = jsonData.preElectionDefaultText;
                electionBreakdownTitle = jsonData.electionBreakdownTitle;
                lastDeclaredWard = jsonData.lastDeclaredWard;
                if (preElectionMode) {
                    document.getElementById("report_title").innerHTML = jsonData.preElectionMapTitle;
                }
                if (electionCountMode) {
                    document.getElementById("report_title").innerHTML = jsonData.electionCountMapTitle;
                }
                if (jsonData.debug == "true") {
                    debug = true;
                }
                if (jsonData.showOperationalInformation == "true") {
                    showOperationalInformation = true;
                }
                if (jsonData.showReportIt == "true") {
                    showReportIt = true;
                }
                if (jsonData.showViewIt == "true") {
                    showViewIt = true;
                }
                if (jsonData.showExternalPages == "true") {
                    showExternalPages = true;
                }
                if (jsonData.showContactScreen == "true") {
                    showContactScreen = true;
                }
                if (jsonData.showCandidates == "true") {
                    showCandidates = true;
                }
                for (var currentReportItEntry = 0; currentReportItEntry < jsonData.reportITentries.length; currentReportItEntry++) {
                    reportItNames[currentReportItEntry] = jsonData.reportITentries[currentReportItEntry].name;
                    reportItTypes[currentReportItEntry] = jsonData.reportITentries[currentReportItEntry].type;
                    reportItIncidents[currentReportItEntry] = jsonData.reportITentries[currentReportItEntry].incident;
                    reportItDescEmail[currentReportItEntry] = jsonData.reportITentries[currentReportItEntry].descriptionEmail;
                    reportItSLA[currentReportItEntry] = jsonData.reportITentries[currentReportItEntry].sla;
                }
                if (jsonData.instance == "test") {
                    for (var currentCode = 0; currentCode < jsonData.classificationCodesTest.length; currentCode++) {
                        codesType[currentCode] = jsonData.classificationCodesTest[currentCode].type;
                        codesIncident[currentCode] = jsonData.classificationCodesTest[currentCode].incident;
                        codesSectorID[currentCode] = jsonData.classificationCodesTest[currentCode].sectorID;
                        codesClassificationCodes[currentCode] = jsonData.classificationCodesTest[currentCode].classificationCode;
                    }
                }
                if (jsonData.instance == "live") {
                    for (var currentCode = 0; currentCode < jsonData.classificationCodesLive.length; currentCode++) {
                        codesType[currentCode] = jsonData.classificationCodesLive[currentCode].type;
                        codesIncident[currentCode] = jsonData.classificationCodesLive[currentCode].incident;
                        codesSectorID[currentCode] = jsonData.classificationCodesLive[currentCode].sectorID;
                        codesClassificationCodes[currentCode] = jsonData.classificationCodesLive[currentCode].classificationCode;
                    }
                }
                for (var currentPartiesURL = 0; currentPartiesURL < jsonData.partiesURL.length; currentPartiesURL++) {
                    partiesURL[currentPartiesURL] = jsonData.partiesURL[currentPartiesURL].url;
                }
                for (var currentSocialNetwork = 0; currentSocialNetwork < jsonData.social_networks.length; currentSocialNetwork++) {
                    social_Networks[currentSocialNetwork] = jsonData.social_networks[currentSocialNetwork].name;
                }
                for (var currentParty = 0; currentParty < jsonData.parties.length; currentParty++) {
                    var partyID = jsonData.parties[currentParty].partyID;
                    parties[partyID] = jsonData.parties[currentParty].name;
                    ledByDescriptions[partyID] = jsonData.parties[currentParty].ledByDescription;
                    cssPartyButton[partyID] = jsonData.parties[currentParty].cssPartyButton;
                    partyColours[partyID] = jsonData.parties[currentParty].partyColour;
                    partyTextColour[partyID] = jsonData.parties[currentParty].partyTextColour;
                    partyWardDescriptions[partyID] = jsonData.parties[currentParty].partyWardDescription;
                }
                for (var currentSector = 0; currentSector < jsonData.sectors.length; currentSector++) {
                    var sectorID = jsonData.sectors[currentSector].sectorID;
                    sectorNames[sectorID] = jsonData.sectors[currentSector].name;
                    sectorEmails[sectorID] = jsonData.sectors[currentSector].email;
                    sectorBackgroundColours[sectorID] = jsonData.sectors[currentSector].backgroundColour;
                    sectorTextColours[sectorID] = jsonData.sectors[currentSector].textColour;
                    sectorSubsectorOf[sectorID] = jsonData.sectors[currentSector].subSectorOf;
                    sectorURLs[sectorID] = jsonData.sectors[currentSector].url;
                    if (jsonData.sectors[currentSector].political == "true") {
                        sectorPolitical[sectorID] = true;
                    }
                    else {
                        sectorPolitical[sectorID] = false;
                    }
                    for (var currentCoOrdinator = 0; currentCoOrdinator < jsonData.sectors[currentSector].coOrdinators.length; currentCoOrdinator++) {
                        switch (currentCoOrdinator) {
                            case 0:
                                sectorCoOrdinatorNames1[currentSector] = jsonData.sectors[currentSector].coOrdinators[currentCoOrdinator].name;
                                sectorCoOrdinatorImages1[currentSector] = jsonData.sectors[currentSector].coOrdinators[currentCoOrdinator].image;
                                sectorCoOrdinatorTelephones1[currentSector] = jsonData.sectors[currentSector].coOrdinators[currentCoOrdinator].telephone;
                                sectorCoOrdinatorFaxes1[currentSector] = jsonData.sectors[currentSector].coOrdinators[currentCoOrdinator].fax;
                                break;
                            case 1:
                                sectorCoOrdinatorNames2[currentSector] = jsonData.sectors[currentSector].coOrdinators[currentCoOrdinator].name;
                                sectorCoOrdinatorImages2[currentSector] = jsonData.sectors[currentSector].coOrdinators[currentCoOrdinator].image;
                                sectorCoOrdinatorTelephones2[currentSector] = jsonData.sectors[currentSector].coOrdinators[currentCoOrdinator].telephone;
                                sectorCoOrdinatorFaxes2[currentSector] = jsonData.sectors[currentSector].coOrdinators[currentCoOrdinator].fax;
                                break;
                        }
                    }
                }
                for (var currentWard = 0; currentWard < jsonData.wards.length; currentWard++) {
                    totalNumOfWards++;
                    councillor_parties[currentWard] = jsonData.wards[currentWard].councillor_parties;
                    var firstParty = 0;
                    wardNames[currentWard] = jsonData.wards[currentWard].name;
                    wardNumbers[currentWard] = jsonData.wards[currentWard].number;
                    wardDocumentsURL[currentWard] = jsonData.wards[currentWard].wardDocumentsURL;
                    councillor_names[currentWard] = jsonData.wards[currentWard].councillor_names;
                    councillor_emails[currentWard] = jsonData.wards[currentWard].councillor_emails;
                    councillor_post[currentWard] = jsonData.wards[currentWard].councillor_post;
                    councillor_images[currentWard] = jsonData.wards[currentWard].councillor_images;
                    councillor_main_urls[currentWard] = jsonData.wards[currentWard].councillor_main_url;
                    councillor_social_url_types[currentWard] = jsonData.wards[currentWard].councillor_social_url_type;
                    councillor_social_urls[currentWard] = jsonData.wards[currentWard].councillor_social_url;
                    councillor_twitter_urls[currentWard] = jsonData.wards[currentWard].councillor_twitter_url;
                    councillor_blog_urls[currentWard] = jsonData.wards[currentWard].councillor_blog_url;
                    councillor_personal_urls[currentWard] = jsonData.wards[currentWard].councillor_personal_url;
                    candidate_names[currentWard] = jsonData.wards[currentWard].candidate_names;
                    candidate_parties[currentWard] = jsonData.wards[currentWard].candidate_parties;
                    candidate_votes[currentWard] = jsonData.wards[currentWard].candidate_votes;
                    candidate_parties_array = candidate_parties[currentWard].toString().split(",");
                    elector_count[currentWard] = jsonData.wards[currentWard].elector_count;
                    spoiled_count[currentWard] = jsonData.wards[currentWard].spoiled_count;
                    var councillor_parties_array = councillor_names[currentWard].toString().split(",");
                    for (var currentParty = 0; currentParty < councillor_parties_array.length; currentParty++) {
                        if (currentParty == 0 && candidate_parties_array[councillor_parties_array[currentParty]] != 0) {
                            firstParty = candidate_parties_array[councillor_parties_array[currentParty]];
                            wardParties[currentWard] = candidate_parties_array[councillor_parties_array[currentParty]];
                        }
                        else {
                            if (candidate_parties_array[councillor_parties_array[currentParty]] != firstParty && candidate_parties_array[councillor_parties_array[currentParty]] != 0) {
                                firstParty = 5;
                                wardParties[currentWard] = 0;
                                jointlyHeldWards = true;
                            }
                        }
                    }
                    var wardOpacity = 0;
                    if (firstParty != 0) {
                        wardOpacity = .5;
                    }
                    for (var currentCouncillor = 0; currentCouncillor < councillor_parties_array.length; currentCouncillor++) {
                        partyCount[candidate_parties_array[councillor_parties_array[currentCouncillor]]]++;
                    }
                    if (wards[currentWard] != null) {
                        //map.removeOverlay(wards[currentWard]);
                        wards[currentWard].setMap(null);
                    }
                    wardColour[currentWard] = partyColours[firstParty];
                    wardOpacity[currentWard] = wardOpacity;
                    wardSector[currentWard] = jsonData.wards[currentWard].sector;
                    if (jsonData.wards[currentWard].political == "true") {
                        wardPolitical[currentWard] = true;
                    }
                    else {
                        wardPolitical[currentWard] = false;
                    }
                    if (jsonData.wards[currentWard].operational == "true") {
                        wardOperational[currentWard] = true;
                    }
                    else {
                        wardOperational[currentWard] = false;
                    }
                    sectorWardNames[currentWard] = sectorNames[jsonData.wards[currentWard].sector];
                    if (wardPolitical[currentWard]) {
                        sectorWardNames[currentWard] += " Sector";
                    }
                    var initialColour;
                    if (politicalView) {
                        initialColour = partyColours[firstParty];
                    }
                    else {
                        initialColour = sectorBackgroundColours[wardSector[currentWard]];
                    }
                    if (!wardPolitical[currentWard] && wardOperational[currentWard]) {
                        wardOpacity = .5;
                    }
                    if (initialColour == null) {
                        initialColour = "";
                    }
                    wards[currentWard] = new google.maps.Polygon({
                        paths: jsonData.wards[currentWard].points,
                        strokeColor: "black",
                        strokeOpacity: 1,
                        strokeWeight: 2,
                        fillColor: initialColour,
                        fillOpacity: wardOpacity
                    });
                    google.maps.event.addListener(wards[currentWard], "click", function(event){
                        if (clckTimeOut) {
                            window.clearTimeout(clckTimeOut);
                            clckTimeOut = null;
                        }
                        else {
                            if (preElectionMode || electionCountMode) {
                                clearBubble();
                            }
                            else {
                                clckTimeOut = window.setTimeout(function(){
                                    singleClick(event, false)
                                }, 500);
                            }
                        }
                    });
                    if ((politicalView && wardPolitical[currentWard]) || (!politicalView && wardOperational[currentWard])) {
                        wards[currentWard].setMap(map);
                    }
                    
                    if (update && inWard && displayWard == currentWard) {
                        wardStats(currentWard, -1);
                    }
                };
                var currentPosition = 0;
                for (var currentTotal = 100; currentTotal > 0; currentTotal--) {
                    for (var currentParty = 1; currentParty < parties.length; currentParty++) {
                        if (partyCount[currentParty] == currentTotal) {
                            sortedParties[currentPosition] = currentParty;
                            sortedPartyCount[currentPosition] = currentTotal;
                            currentPosition++;
                        }
                    }
                }
                wardKeyDiv = document.createElement('DIV');
                displayBreakdown = "";
                for (var currentParty = 0; currentParty < parties.length - 1; currentParty++) {
                    if (sortedPartyCount[currentParty] > 0) {
                        displayBreakdown += "<tr>" +
                        "<td width=\"50%\" valign=\"top\" halign=\"center\" style=\"text-align: left\">" +
                        parties[sortedParties[currentParty]] +
                        " (" +
                        sortedPartyCount[currentParty] +
                        ")" +
                        "</td>" +
                        "<td width=\"50%\" valign=\"top\" halign=\"center\">" +
                        "<table border=\"0\" width=\"100%\" cellpadding=\"0\" style=\"text-align: left\">" +
                        "<tr>" +
                        "<td width=\"" +
                        (sortedPartyCount[currentParty] * 2) +
                        "%\" style=\"border-color:black;border-style:solid;border-width:1px;background:" +
                        partyColours[sortedParties[currentParty]] +
                        "\">" +
                        "&nbsp" +
                        "</td>" +
                        "<td width=\"" +
                        (100 - (sortedPartyCount[currentParty] * 2)) +
                        "%\">" +
                        "</td>" +
                        "</tr>" +
                        "</table>" +
                        "</td>" +
                        "</tr>";
                        new MapKey(wardKeyDiv, map, partyTextColour[sortedParties[currentParty]], partyColours[sortedParties[currentParty]], parties[sortedParties[currentParty]], "Wards held by " + partyWardDescriptions[sortedParties[currentParty]] + " are in " + partyColours[sortedParties[currentParty]], sortedParties[currentParty], true, false, false, false, false, false, true, false, false, "12px");
                    }
                }
                if (jointlyHeldWards) {
                    new MapKey(wardKeyDiv, map, "white", "gray", "Jointly Held", "Wards held by more than one party are in grey", 0, true, false, false, false, false, false, true, false, false, "12px");
                }
                if (!inWard) {
                    defaultStats();
                }
                var switchDiv = document.createElement('DIV');
                sectorKeyDiv = document.createElement('DIV');
                var newMapDiv = document.createElement('DIV');
                for (var currentSector = 0; currentSector < sectorNames.length; currentSector++) {
                    var buttonText = sectorNames[currentSector];
                    var buttonLabel = "Wards within the " + sectorNames[currentSector];
                    if (sectorPolitical[currentSector]) {
                        buttonText += " Sector";
                        buttonLabel += " Sector";
                    }
                    buttonLabel += " are in " + sectorBackgroundColours[currentSector];
                    new MapKey(sectorKeyDiv, map, sectorTextColours[currentSector], sectorBackgroundColours[currentSector], buttonText, buttonLabel, currentSector, true, false, false, false, false, false, false, false, false, "12px");
                }
                if (firstLoad) {
                    if (normalMode) {
                        if (politicalView) {
                            new MapKey(switchDiv, map, "black", "white", "Switch to operational view", "Click here to switch to operational view", 0, false, true, false, false, false, false, false, false, false, "12px");
                            map.controls[google.maps.ControlPosition.RIGHT].push(wardKeyDiv);
                        }
                        else {
                            new MapKey(switchDiv, map, "black", "white", "Switch to political view", "Click here to switch to political view", 0, false, true, false, false, false, false, false, false, false, "12px");
                            map.controls[google.maps.ControlPosition.RIGHT].push(sectorKeyDiv);
                        }
                    }
                    map.controls[google.maps.ControlPosition.TOP_LEFT].push(newMapDiv);
                    map.controls[google.maps.ControlPosition.LEFT_TOP].push(switchDiv);
                    createMenu();
                    var versionDiv = document.createElement('DIV');
                    new MapKey(versionDiv, map, "black", "white", version, "This is the version of MyCouncil you are using", 0, false, false, false, false, false, false, false, true, false, "12px");
                    map.controls[google.maps.ControlPosition.BOTTOM_RIGHT].push(versionDiv);
                }
                else {
                    map.controls[google.maps.ControlPosition.RIGHT].removeAt(0);
                    if (politicalView) {
                        map.controls[google.maps.ControlPosition.RIGHT].push(wardKeyDiv);
                    }
                    else {
                        map.controls[google.maps.ControlPosition.RIGHT].push(sectorKeyDiv);
                    }
                }
                if (startupSearch) {
                    if (isCallNumber(startupSearchText)) {
                        getCallDetails(startupSearchText, false, false, true);
                    }
                    else {
                        findAddress(true);
                    }
                }
                Ext.MessageBox.hide();
                window.setTimeout(function(){
                    if (startupAnimation) {
                        highlightHelp = true;
                        map.controls[google.maps.ControlPosition.LEFT].removeAt(0);
                        createMenu();
                        highlightHelp = false;
                        MenuClick(true, false, false, false);
                    }
                }, 4000);
                window.setTimeout(function(){
                    if (startupAnimation) {
                        highlightHelp = true;
                        map.controls[google.maps.ControlPosition.LEFT].removeAt(0);
                        createMenu();
                        highlightHelp = false;
                        MenuClick(true, false, false, false);
                        startupAnimation = false;
                        var expiryDate = new Date();
                        expiryDate.setDate(expiryDate.getDate() + 365);
                        document.cookie = "viewedHelp=true" + ((365 == null) ? "" : ";expires=" + expiryDate.toUTCString());
                    }
                }, 14000);
                firstLoad = false;
            }
        });
    }
    
});
