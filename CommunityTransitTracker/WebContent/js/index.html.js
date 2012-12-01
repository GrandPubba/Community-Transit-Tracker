(function($) {
  
  $.fn.initApp = function(method) {
	  updateStops();
	  $('#list_stops').bind("pagebeforeshow", function(event, ui) {
		  updateStops();
	  });
	  $('#select_route_for_stop').bind("pagebeforeshow", function(event, ui) {
		  $("#routes_ul").empty();
		  $("#routes_ul").attr("data-route", "listview");
		  var stop = $("#select_route_for_stop").data('stop');
		  var routes = CommunityTransitTracker.getRoutesAt({
			  $entity: stop,
			  $contentType: 'application/json'
			  });
		  for(var i = 0; i < routes.length; i++) {
			  $("#routes_ul").append("<li><a href=\#estimate_arrival_time\">" + routes[i].routeLongName + "</a>");
			  $("#routes_ul").find("a:last").data("route", routes[i]);
			  $("#routes_ul").click(function() {
				 $("#estimate_arrival_time").data("route", $(this).data('route')); 
			  });
		  }		  
	  });
  };
})(jQuery);

var updateStops = function() {
	  $("#ul_stops").empty();
	  $("#ul_stops").attr("data-role", "listview");
	  if (navigator.geolocation) {
		  navigator.geolocation.getCurrentPosition(function(position) {
			  var stops = CommunityTransitTracker.getNearbyStops({
				  sensor: 'true', 
				  lat: position.coords.latitude, 
				  lng: position.coords.longitude
				  });
			  for(var i = 0; i < stops.length; i++) {
				  $("#ul_stops").append("<li><a href=\"#select_route_for_stop\">" + stops[i].stopName + "</a></li>");
				  $("#ul_stops").find("a:last").data("stop", stops[i]);
				  $('#ul_stops').find('a:last').click(function() {
					  $('#select_route_for_stop').data('stop', $(this).data('stop'));
				  });
			  } 
			  $("#ul_stops").listview('refresh');	  
		  },
		  positionError);
	  } else {
		  displayError("Location detection not supported in browser");
	  }
};

function positionError(err) {
    var msg;
    switch(err.code) {
      case err.UNKNOWN_ERROR:
        msg = "Unable to find your location";
        break;
      case err.PERMISSION_DENINED:
        msg = "Permission denied in finding your location";
        break;
      case err.POSITION_UNAVAILABLE:
        msg = "Your location is currently unknown";
        break;
      case err.BREAK:
        msg = "Attempt to find location took too long";
        break;
      default:
    	msg = "Unknown error code!";
        break;
    }
    displayError(msg);
}

function displayError(msg) {
    //TODO:  Implement an error dialog to display the error message in. 
}

$(document).ready(function() {
	$().initApp();
});

	