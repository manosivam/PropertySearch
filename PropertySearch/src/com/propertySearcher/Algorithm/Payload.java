package com.propertySearcher.Algorithm;

import java.util.List;

import com.propertySearcher.property.Location;

public class Payload {

	List<Long> propertyIDsSearchSpace;
	SearchFilter searchFilter;

	public Payload(List<Long> propertyIDsSearchSpace,Location preferredLocation, double minPrice, double maxPrice, int minBedrooms,
			int maxBedrooms, int minBathrooms, int maxBathrooms) {
		
		this.propertyIDsSearchSpace = propertyIDsSearchSpace;
		this.searchFilter = new SearchFilter(preferredLocation, minPrice, maxPrice, minBedrooms, maxBedrooms, minBathrooms, maxBathrooms);
	}

	public List<Long> getPropertyIDsSearchSpace() {
		return propertyIDsSearchSpace;
	}

	public void setPropertyIDsSearchSpace(List<Long> propertyIDsSearchSpace) {
		this.propertyIDsSearchSpace = propertyIDsSearchSpace;
	}
	
	public SearchFilter getSearchFilter() {
		return searchFilter;
	}

	public void setSearchFilter(SearchFilter searchFilter) {
		this.searchFilter = searchFilter;
	}
	
}
