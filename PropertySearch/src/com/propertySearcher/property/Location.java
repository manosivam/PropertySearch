package com.propertySearcher.property;

public class Location {

	private double lat, longt;

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLongt() {
		return longt;
	}

	public void setLongt(double longt) {
		this.longt = longt;
	}

	public Location(double lat, double longt) {
		this.lat = lat;
		this.longt = longt;
	}
	
}
