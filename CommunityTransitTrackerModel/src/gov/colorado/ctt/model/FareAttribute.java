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
 * The persistent class for the fare_attributes database table.
 * 
 */
@Entity
@Table(name="fare_attributes")
public class FareAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fare_id")
	private String fareId;

	@Column(name="currency_type")
	private String currencyType;

	@Column(name="payment_method")
	private byte paymentMethod;

	private BigDecimal price;

	@Column(name="transfer_domain")
	private int transferDomain;

	private byte transfers;

    public FareAttribute() {
    }

	public String getFareId() {
		return this.fareId;
	}

	public void setFareId(String fareId) {
		this.fareId = fareId;
	}

	public String getCurrencyType() {
		return this.currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public byte getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(byte paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getTransferDomain() {
		return this.transferDomain;
	}

	public void setTransferDomain(int transferDomain) {
		this.transferDomain = transferDomain;
	}

	public byte getTransfers() {
		return this.transfers;
	}

	public void setTransfers(byte transfers) {
		this.transfers = transfers;
	}

}
