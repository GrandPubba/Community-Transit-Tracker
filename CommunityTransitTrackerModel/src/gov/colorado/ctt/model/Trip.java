/*******************************************************************************
 *    Copyright 2012 NIC Inc.
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 ******************************************************************************/
package gov.colorado.ctt.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trips database table.
 * 
 */
@Entity
@Table(name="trips")
public class Trip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="trip_id")
	private String tripId;

	@Column(name="block_id")
	private String blockId;

	@Column(name="direction_id")
	private byte directionId;

	@Column(name="route_id")
	private String routeId;

	@Column(name="service_id")
	private String serviceId;

	@Column(name="shape_id")
	private String shapeId;

	@Column(name="trip_headsign")
	private String tripHeadsign;

	@Column(name="trip_short_name")
	private String tripShortName;

    public Trip() {
    }

	public String getTripId() {
		return this.tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getBlockId() {
		return this.blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	public byte getDirectionId() {
		return this.directionId;
	}

	public void setDirectionId(byte directionId) {
		this.directionId = directionId;
	}

	public String getRouteId() {
		return this.routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getShapeId() {
		return this.shapeId;
	}

	public void setShapeId(String shapeId) {
		this.shapeId = shapeId;
	}

	public String getTripHeadsign() {
		return this.tripHeadsign;
	}

	public void setTripHeadsign(String tripHeadsign) {
		this.tripHeadsign = tripHeadsign;
	}

	public String getTripShortName() {
		return this.tripShortName;
	}

	public void setTripShortName(String tripShortName) {
		this.tripShortName = tripShortName;
	}

}
