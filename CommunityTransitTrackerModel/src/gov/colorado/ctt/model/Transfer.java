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
 * The persistent class for the transfers database table.
 * 
 */
@Entity
@Table(name="transfers")
public class Transfer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransferPK id;

    public Transfer() {
    }

	public TransferPK getId() {
		return this.id;
	}

	public void setId(TransferPK id) {
		this.id = id;
	}
	
}
