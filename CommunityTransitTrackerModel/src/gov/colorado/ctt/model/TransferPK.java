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
 * The primary key class for the transfers database table.
 * 
 */
@Embeddable
public class TransferPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="from_stop_id")
	private String fromStopId;

	@Column(name="to_stop_id")
	private String toStopId;

	@Column(name="transfer_type")
	private byte transferType;

	@Column(name="min_transfer_time")
	private int minTransferTime;

    public TransferPK() {
    }
	public String getFromStopId() {
		return this.fromStopId;
	}
	public void setFromStopId(String fromStopId) {
		this.fromStopId = fromStopId;
	}
	public String getToStopId() {
		return this.toStopId;
	}
	public void setToStopId(String toStopId) {
		this.toStopId = toStopId;
	}
	public byte getTransferType() {
		return this.transferType;
	}
	public void setTransferType(byte transferType) {
		this.transferType = transferType;
	}
	public int getMinTransferTime() {
		return this.minTransferTime;
	}
	public void setMinTransferTime(int minTransferTime) {
		this.minTransferTime = minTransferTime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransferPK)) {
			return false;
		}
		TransferPK castOther = (TransferPK)other;
		return 
			this.fromStopId.equals(castOther.fromStopId)
			&& this.toStopId.equals(castOther.toStopId)
			&& (this.transferType == castOther.transferType)
			&& (this.minTransferTime == castOther.minTransferTime);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fromStopId.hashCode();
		hash = hash * prime + this.toStopId.hashCode();
		hash = hash * prime + ((int) this.transferType);
		hash = hash * prime + this.minTransferTime;
		
		return hash;
    }
}
