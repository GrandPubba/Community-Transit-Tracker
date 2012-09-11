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
 * The persistent class for the stops database table.
 * 
 */
@Entity
@Table(name="stops")
public class Stop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="stop_id")
	private String stopId;

	@Column(name="location_type")
	private byte locationType;

	@Column(name="parent_station")
	private String parentStation;

	@Column(name="stop_code")
	private String stopCode;

	@Column(name="stop_desc")
	private String stopDesc;

	@Column(name="stop_lat")
	private BigDecimal stopLat;

	@Column(name="stop_lon")
	private BigDecimal stopLon;

	@Column(name="stop_name")
	private String stopName;

	@Column(name="stop_timezone")
	private String stopTimezone;

	@Column(name="stop_url")
	private String stopUrl;

	@Column(name="wheelchair_bording")
	private Byte wheelchairBording;

	@Column(name="zone_id")
	private String zoneId;

    public Stop() {
    }

	public String getStopId() {
		return this.stopId;
	}

	public void setStopId(String stopId) {
		this.stopId = stopId;
	}

	public byte getLocationType() {
		return this.locationType;
	}

	public void setLocationType(byte locationType) {
		this.locationType = locationType;
	}

	public String getParentStation() {
		return this.parentStation;
	}

	public void setParentStation(String parentStation) {
		this.parentStation = parentStation;
	}

	public String getStopCode() {
		return this.stopCode;
	}

	public void setStopCode(String stopCode) {
		this.stopCode = stopCode;
	}

	public String getStopDesc() {
		return this.stopDesc;
	}

	public void setStopDesc(String stopDesc) {
		this.stopDesc = stopDesc;
	}

	public BigDecimal getStopLat() {
		return this.stopLat;
	}

	public void setStopLat(BigDecimal stopLat) {
		this.stopLat = stopLat;
	}

	public BigDecimal getStopLon() {
		return this.stopLon;
	}

	public void setStopLon(BigDecimal stopLon) {
		this.stopLon = stopLon;
	}

	public String getStopName() {
		return this.stopName;
	}

	public void setStopName(String stopName) {
		this.stopName = stopName;
	}

	public String getStopTimezone() {
		return this.stopTimezone;
	}

	public void setStopTimezone(String stopTimezone) {
		this.stopTimezone = stopTimezone;
	}

	public String getStopUrl() {
		return this.stopUrl;
	}

	public void setStopUrl(String stopUrl) {
		this.stopUrl = stopUrl;
	}

	public Byte getWheelchairBording() {
		return this.wheelchairBording;
	}

	public void setWheelchairBording(Byte wheelchairBording) {
		this.wheelchairBording = wheelchairBording;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

}
