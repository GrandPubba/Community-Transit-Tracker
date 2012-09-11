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
 * The persistent class for the fare_rules database table.
 * 
 */
@Entity
@Table(name="fare_rules")
public class FareRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fair_id")
	private String fairId;

	@Column(name="contains_id")
	private String containsId;

	@Column(name="destination_id")
	private String destinationId;

	@Column(name="origin_id")
	private String originId;

	@Column(name="route_id")
	private String routeId;

    public FareRule() {
    }

	public String getFairId() {
		return this.fairId;
	}

	public void setFairId(String fairId) {
		this.fairId = fairId;
	}

	public String getContainsId() {
		return this.containsId;
	}

	public void setContainsId(String containsId) {
		this.containsId = containsId;
	}

	public String getDestinationId() {
		return this.destinationId;
	}

	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

	public String getOriginId() {
		return this.originId;
	}

	public void setOriginId(String originId) {
		this.originId = originId;
	}

	public String getRouteId() {
		return this.routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

}
