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
 * The primary key class for the calendar_dates database table.
 * 
 */
@Embeddable
public class CalendarDatePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="service_id")
	private String serviceId;

	private String date;

    public CalendarDatePK() {
    }
	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CalendarDatePK)) {
			return false;
		}
		CalendarDatePK castOther = (CalendarDatePK)other;
		return 
			this.serviceId.equals(castOther.serviceId)
			&& this.date.equals(castOther.date);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.serviceId.hashCode();
		hash = hash * prime + this.date.hashCode();
		
		return hash;
    }
}
