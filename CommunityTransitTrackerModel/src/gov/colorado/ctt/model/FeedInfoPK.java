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
 * The primary key class for the feed_info database table.
 * 
 */
@Embeddable
public class FeedInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="feed_publisher_name")
	private String feedPublisherName;

	@Column(name="feed_version")
	private String feedVersion;

    public FeedInfoPK() {
    }
	public String getFeedPublisherName() {
		return this.feedPublisherName;
	}
	public void setFeedPublisherName(String feedPublisherName) {
		this.feedPublisherName = feedPublisherName;
	}
	public String getFeedVersion() {
		return this.feedVersion;
	}
	public void setFeedVersion(String feedVersion) {
		this.feedVersion = feedVersion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FeedInfoPK)) {
			return false;
		}
		FeedInfoPK castOther = (FeedInfoPK)other;
		return 
			this.feedPublisherName.equals(castOther.feedPublisherName)
			&& this.feedVersion.equals(castOther.feedVersion);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.feedPublisherName.hashCode();
		hash = hash * prime + this.feedVersion.hashCode();
		
		return hash;
    }
}
