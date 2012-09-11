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
 * The primary key class for the stop_times database table.
 * 
 */
@Embeddable
public class StopTimePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="trip_id")
	private String tripId;

	@Column(name="stop_id")
	private String stopId;

    public StopTimePK() {
    }
	public String getTripId() {
		return this.tripId;
	}
	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public String getStopId() {
		return this.stopId;
	}
	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StopTimePK)) {
			return false;
		}
		StopTimePK castOther = (StopTimePK)other;
		return 
			this.tripId.equals(castOther.tripId)
			&& this.stopId.equals(castOther.stopId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.tripId.hashCode();
		hash = hash * prime + this.stopId.hashCode();
		
		return hash;
    }
}
