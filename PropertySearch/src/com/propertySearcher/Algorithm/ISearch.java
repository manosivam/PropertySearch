package com.propertySearcher.Algorithm;

import java.util.List;
import java.util.Set;

import com.propertySearcher.property.Location;
import com.propertySearcher.property.Property;

public interface ISearch {

	/*
	 * return list of location IDs. 
	 */
	List<PropertyEntry> doSearch(Location preferredLocation, double minPrice, double maxPrice, 
			int minBedrooms, int maxBedrooms, int minBathrooms, int maxBathrooms);

	List<Long> searchPropertyUsingSearchIndexer(Set<Location> searchLocations);
	
	List<PropertyEntry> filterPropertyAndFindMatchPercent(Payload searchPayload);
	
}
