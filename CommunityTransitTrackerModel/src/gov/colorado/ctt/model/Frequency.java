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
 * The persistent class for the frequencies database table.
 * 
 */
@Entity
@Table(name="frequencies")
public class Frequency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="trip_id")
	private String tripId;

	@Column(name="end_time")
	private String endTime;

	@Column(name="exact_times")
	private byte exactTimes;

	@Column(name="headway_secs")
	private int headwaySecs;

	@Column(name="start_time")
	private String startTime;

    public Frequency() {
    }

	public String getTripId() {
		return this.tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public byte getExactTimes() {
		return this.exactTimes;
	}

	public void setExactTimes(byte exactTimes) {
		this.exactTimes = exactTimes;
	}

	public int getHeadwaySecs() {
		return this.headwaySecs;
	}

	public void setHeadwaySecs(int headwaySecs) {
		this.headwaySecs = headwaySecs;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
