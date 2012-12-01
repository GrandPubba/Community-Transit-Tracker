/*******************************************************************************
 * Copyright 2012 NIC Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.google.places;

import java.util.Map;

import org.jboss.resteasy.client.ProxyFactory;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.spi.ResteasyProviderFactory;


public class GooglePlaces {
	
	public static String GOOGLE_PLACES_URL = "https://maps.googleapis.com/maps/api/place/";
	public static String GOOGLE_PLACES_API_KEY = "AIzaSyCMO1zPZlPEweBiivRnwvDsEjmDpG19dps";
	
	private static GooglePlaces _googlePlaces;
	
	private GooglePlaces() {
		super();
		RegisterBuiltin.register(ResteasyProviderFactory.getInstance());
	}
	
	public static synchronized GooglePlaces getInstance() {
		if(_googlePlaces == null) {
			_googlePlaces = new GooglePlaces();
		}
		return _googlePlaces;
	}
	@SuppressWarnings("rawtypes")
	public Map placeSearch(
			String location,
			Integer radius,
			String rankby,
			String sensor,
			String keyword,
			String language,
			String name,
			String types,
			String pagetoken) {
		
		return getGooglePlacesClient().search(GOOGLE_PLACES_API_KEY, location, radius, rankby, sensor, keyword, language, name, types, pagetoken);
	}
	
	@SuppressWarnings("rawtypes")
	public Map add(
			String sensor,
			Map placeAddRequest
			) {
		return getGooglePlacesClient().add(GOOGLE_PLACES_API_KEY, sensor, placeAddRequest);
	}

	private GooglePlacesClient getGooglePlacesClient() { 
		return ProxyFactory.create(GooglePlacesClient.class, GOOGLE_PLACES_URL);
	}
}
