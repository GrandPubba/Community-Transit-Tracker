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
 * The persistent class for the agency database table.
 * 
 */
@Entity
@Table(name="agency")
public class Agency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="agency_id")
	private String agencyId;

	@Column(name="agency_fare_url")
	private String agencyFareUrl;

	@Column(name="agency_lang")
	private String agencyLang;

	@Column(name="agency_name")
	private String agencyName;

	@Column(name="agency_phone")
	private String agencyPhone;

	@Column(name="agency_timezone")
	private String agencyTimezone;

	@Column(name="agency_url")
	private String agencyUrl;

    public Agency() {
    }

	public String getAgencyId() {
		return this.agencyId;
	}

	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	public String getAgencyFareUrl() {
		return this.agencyFareUrl;
	}

	public void setAgencyFareUrl(String agencyFareUrl) {
		this.agencyFareUrl = agencyFareUrl;
	}

	public String getAgencyLang() {
		return this.agencyLang;
	}

	public void setAgencyLang(String agencyLang) {
		this.agencyLang = agencyLang;
	}

	public String getAgencyName() {
		return this.agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getAgencyPhone() {
		return this.agencyPhone;
	}

	public void setAgencyPhone(String agencyPhone) {
		this.agencyPhone = agencyPhone;
	}

	public String getAgencyTimezone() {
		return this.agencyTimezone;
	}

	public void setAgencyTimezone(String agencyTimezone) {
		this.agencyTimezone = agencyTimezone;
	}

	public String getAgencyUrl() {
		return this.agencyUrl;
	}

	public void setAgencyUrl(String agencyUrl) {
		this.agencyUrl = agencyUrl;
	}

}
