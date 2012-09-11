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
 * The persistent class for the calendar_dates database table.
 * 
 */
@Entity
@Table(name="calendar_dates")
public class CalendarDate implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CalendarDatePK id;

	@Column(name="exception_type")
	private byte exceptionType;

    public CalendarDate() {
    }

	public CalendarDatePK getId() {
		return this.id;
	}

	public void setId(CalendarDatePK id) {
		this.id = id;
	}
	
	public byte getExceptionType() {
		return this.exceptionType;
	}

	public void setExceptionType(byte exceptionType) {
		this.exceptionType = exceptionType;
	}

}
