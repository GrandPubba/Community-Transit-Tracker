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
 * The persistent class for the calendar database table.
 * 
 */
@Entity
@Table(name="calendar")
public class Calendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="service_id")
	private String serviceId;

	@Column(name="end_date")
	private String endDate;

	private byte friday;

	private byte monday;

	private byte saturday;

	@Column(name="start_date")
	private String startDate;

	private byte sunday;

	private byte thursday;

	private byte tuesday;

	private byte wednesday;

    public Calendar() {
    }

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public byte getFriday() {
		return this.friday;
	}

	public void setFriday(byte friday) {
		this.friday = friday;
	}

	public byte getMonday() {
		return this.monday;
	}

	public void setMonday(byte monday) {
		this.monday = monday;
	}

	public byte getSaturday() {
		return this.saturday;
	}

	public void setSaturday(byte saturday) {
		this.saturday = saturday;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public byte getSunday() {
		return this.sunday;
	}

	public void setSunday(byte sunday) {
		this.sunday = sunday;
	}

	public byte getThursday() {
		return this.thursday;
	}

	public void setThursday(byte thursday) {
		this.thursday = thursday;
	}

	public byte getTuesday() {
		return this.tuesday;
	}

	public void setTuesday(byte tuesday) {
		this.tuesday = tuesday;
	}

	public byte getWednesday() {
		return this.wednesday;
	}

	public void setWednesday(byte wednesday) {
		this.wednesday = wednesday;
	}

}
