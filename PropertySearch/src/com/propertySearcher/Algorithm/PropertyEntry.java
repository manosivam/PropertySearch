package com.propertySearcher.Algorithm;

import com.propertySearcher.property.Property;

public class PropertyEntry {

	Property propertyDetails; 
	double matchPercent;
	
	public PropertyEntry(Property propertyDetails, double matchPercent) {
		super();
		this.propertyDetails = propertyDetails;
		this.matchPercent = matchPercent;
	}

	public Property getPropertyDetails() {
		return propertyDetails;
	}

	public void setPropertyDetails(Property propertyDetails) {
		this.propertyDetails = propertyDetails;
	}

	public double getMatchPercent() {
		return matchPercent;
	}

	public void setMatchPercent(double matchPercent) {
		this.matchPercent = matchPercent;
	}
	
	
	
}
