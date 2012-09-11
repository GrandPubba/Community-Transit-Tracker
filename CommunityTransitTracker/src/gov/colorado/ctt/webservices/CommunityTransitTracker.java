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
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Stateless
public class CommunityTransitTracker {
	
	@PersistenceUnit(unitName="CommunityTransitTrackerModel")
	private EntityManagerFactory emf;
	
	@GET()
	@Produces("application/json")
	public List<Stop> getStops() {
		TypedQuery<Stop> query = emf.createEntityManager()
				.createQuery("select stop from Stop stop", Stop.class);
		return query.getResultList();
	}
}
