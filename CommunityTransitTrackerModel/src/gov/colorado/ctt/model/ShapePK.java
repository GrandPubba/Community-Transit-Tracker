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
 * The primary key class for the shapes database table.
 * 
 */
@Embeddable
public class ShapePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="shape_id")
	private String shapeId;

	@Column(name="shape_pt_lat")
	private long shapePtLat;

	@Column(name="shape_pt_lon")
	private long shapePtLon;

	@Column(name="shape_pt_sequence")
	private int shapePtSequence;

    public ShapePK() {
    }
	public String getShapeId() {
		return this.shapeId;
	}
	public void setShapeId(String shapeId) {
		this.shapeId = shapeId;
	}
	public long getShapePtLat() {
		return this.shapePtLat;
	}
	public void setShapePtLat(long shapePtLat) {
		this.shapePtLat = shapePtLat;
	}
	public long getShapePtLon() {
		return this.shapePtLon;
	}
	public void setShapePtLon(long shapePtLon) {
		this.shapePtLon = shapePtLon;
	}
	public int getShapePtSequence() {
		return this.shapePtSequence;
	}
	public void setShapePtSequence(int shapePtSequence) {
		this.shapePtSequence = shapePtSequence;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ShapePK)) {
			return false;
		}
		ShapePK castOther = (ShapePK)other;
		return 
			this.shapeId.equals(castOther.shapeId)
			&& (this.shapePtLat == castOther.shapePtLat)
			&& (this.shapePtLon == castOther.shapePtLon)
			&& (this.shapePtSequence == castOther.shapePtSequence);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.shapeId.hashCode();
		hash = hash * prime + ((int) (this.shapePtLat ^ (this.shapePtLat >>> 32)));
		hash = hash * prime + ((int) (this.shapePtLon ^ (this.shapePtLon >>> 32)));
		hash = hash * prime + this.shapePtSequence;
		
		return hash;
    }
}
