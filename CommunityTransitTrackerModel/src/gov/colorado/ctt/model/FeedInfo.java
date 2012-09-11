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
 * The persistent class for the feed_info database table.
 * 
 */
@Entity
@Table(name="feed_info")
public class FeedInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FeedInfoPK id;

	@Column(name="feed_end_date")
	private String feedEndDate;

	@Column(name="feed_lang")
	private String feedLang;

	@Column(name="feed_publisher_url")
	private String feedPublisherUrl;

	@Column(name="feed_start_date")
	private String feedStartDate;

    public FeedInfo() {
    }

	public FeedInfoPK getId() {
		return this.id;
	}

	public void setId(FeedInfoPK id) {
		this.id = id;
	}
	
	public String getFeedEndDate() {
		return this.feedEndDate;
	}

	public void setFeedEndDate(String feedEndDate) {
		this.feedEndDate = feedEndDate;
	}

	public String getFeedLang() {
		return this.feedLang;
	}

	public void setFeedLang(String feedLang) {
		this.feedLang = feedLang;
	}

	public String getFeedPublisherUrl() {
		return this.feedPublisherUrl;
	}

	public void setFeedPublisherUrl(String feedPublisherUrl) {
		this.feedPublisherUrl = feedPublisherUrl;
	}

	public String getFeedStartDate() {
		return this.feedStartDate;
	}

	public void setFeedStartDate(String feedStartDate) {
		this.feedStartDate = feedStartDate;
	}

}
