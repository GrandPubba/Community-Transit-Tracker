/*
Copyright 2012 NIC Inc.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package gov.colorado.ctt.webservices;

import gov.colorado.ctt.model.Stop;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.google.places.GooglePlaces;
import com.google.places.Location;

@Path("/")
@Stateless
public class CommunityTransitTracker {
	
	@PersistenceUnit(unitName="CommunityTransitTrackerModel")
	private EntityManagerFactory emf;
	
	@GET()
	@Produces("text/plain")
	@Path("/update")
	public String update() {
		List<Stop> stops = getStops();
		for(Stop stop : stops) {
			
		}
		return "update";
	}
	
	@GET()
	@Produces("application/json")
	@Path("/places/search")
	public Map placesSearch(
			@QueryParam("location")String location,
			@QueryParam("radius")Integer radius,
			@QueryParam("rankby")String rankby,
			@QueryParam("sensor")String sensor,
			@QueryParam("keyword")String keyword,
			@QueryParam("language")String language,
			@QueryParam("name")String name,
			@QueryParam("types")String types,
			@QueryParam("pagetoken")String pagetoken) {
		return GooglePlaces.getInstance().placeSearch(location, radius, rankby, sensor, keyword, language, name, types, pagetoken);
	}
	
	@GET()
	@Produces("application/json")
	@Path("/places/add")
	public Map placesAdd(
			@QueryParam("sensor")String sensor,
			@QueryParam("lat")BigDecimal lat,
			@QueryParam("lng")BigDecimal lng,
			@QueryParam("accuracy")BigDecimal accuracy,
			@QueryParam("name")String name,
			@QueryParam("type")String type,
			@QueryParam("language")String language
			) {
		Map placeAddRequest = new HashMap();
		Map location = new HashMap();
		location.put("lat", lat);
		location.put("lng", lng);
		placeAddRequest.put("location", location);
		placeAddRequest.put("accuracy", accuracy);
		placeAddRequest.put("name", name);
		placeAddRequest.put("types", new String[] {type});
		placeAddRequest.put("language", language);
		return GooglePlaces.getInstance().add(sensor, placeAddRequest);
	}
	
	@GET()
	@Produces("application/json")
	@Path("/stops")
	public List<Stop> getStops() {
		TypedQuery<Stop> query = emf.createEntityManager()
				.createQuery("select stop from Stop stop", Stop.class);
		return query.getResultList();
	}
}
