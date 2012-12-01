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
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the routes database table.
 * 
 */
@Entity
@Table(name="routes")
@XmlRootElement
public class Route implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="route_id")
	private String routeId;

	@Column(name="agency_id")
	private String agencyId;

	@Column(name="route_color")
	private String routeColor;

	@Column(name="route_desc")
	private String routeDesc;

	@Column(name="route_long_name")
	private String routeLongName;

	@Column(name="route_short_name")
	private String routeShortName;

	@Column(name="route_text_color")
	private String routeTextColor;

	@Column(name="route_type")
	private byte routeType;

	@Column(name="route_url")
	private String routeUrl;

    public Route() {
    }

	public String getRouteId() {
		return this.routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getAgencyId() {
		return this.agencyId;
	}

	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	public String getRouteColor() {
		return this.routeColor;
	}

	public void setRouteColor(String routeColor) {
		this.routeColor = routeColor;
	}

	public String getRouteDesc() {
		return this.routeDesc;
	}

	public void setRouteDesc(String routeDesc) {
		this.routeDesc = routeDesc;
	}

	public String getRouteLongName() {
		return this.routeLongName;
	}

	public void setRouteLongName(String routeLongName) {
		this.routeLongName = routeLongName;
	}

	public String getRouteShortName() {
		return this.routeShortName;
	}

	public void setRouteShortName(String routeShortName) {
		this.routeShortName = routeShortName;
	}

	public String getRouteTextColor() {
		return this.routeTextColor;
	}

	public void setRouteTextColor(String routeTextColor) {
		this.routeTextColor = routeTextColor;
	}

	public byte getRouteType() {
		return this.routeType;
	}

	public void setRouteType(byte routeType) {
		this.routeType = routeType;
	}

	public String getRouteUrl() {
		return this.routeUrl;
	}

	public void setRouteUrl(String routeUrl) {
		this.routeUrl = routeUrl;
	}

}
