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
import java.math.BigDecimal;


/**
 * The persistent class for the stop_times database table.
 * 
 */
@Entity
@Table(name="stop_times")
public class StopTime implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private StopTimePK id;

	@Column(name="arrival_time")
	private String arrivalTime;

	@Column(name="departure_time")
	private String departureTime;

	@Column(name="drop_off_type")
	private byte dropOffType;

	@Column(name="pickup_type")
	private byte pickupType;

	@Column(name="shape_dist_traveled")
	private BigDecimal shapeDistTraveled;

	@Column(name="stop_headsign")
	private String stopHeadsign;

	@Column(name="stop_sequence")
	private int stopSequence;

    public StopTime() {
    }

	public StopTimePK getId() {
		return this.id;
	}

	public void setId(StopTimePK id) {
		this.id = id;
	}
	
	public String getArrivalTime() {
		return this.arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public byte getDropOffType() {
		return this.dropOffType;
	}

	public void setDropOffType(byte dropOffType) {
		this.dropOffType = dropOffType;
	}

	public byte getPickupType() {
		return this.pickupType;
	}

	public void setPickupType(byte pickupType) {
		this.pickupType = pickupType;
	}

	public BigDecimal getShapeDistTraveled() {
		return this.shapeDistTraveled;
	}

	public void setShapeDistTraveled(BigDecimal shapeDistTraveled) {
		this.shapeDistTraveled = shapeDistTraveled;
	}

	public String getStopHeadsign() {
		return this.stopHeadsign;
	}

	public void setStopHeadsign(String stopHeadsign) {
		this.stopHeadsign = stopHeadsign;
	}

	public int getStopSequence() {
		return this.stopSequence;
	}

	public void setStopSequence(int stopSequence) {
		this.stopSequence = stopSequence;
	}

}
