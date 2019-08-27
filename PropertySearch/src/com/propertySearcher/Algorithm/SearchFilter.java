package com.propertySearcher.Algorithm;

import com.propertySearcher.property.Location;

public class SearchFilter {

	private Location preferredLocation;
	private double minPrice, maxPrice;
	private int minBedrooms,maxBedrooms, minBathrooms, maxBathrooms;
	
	public SearchFilter(Location preferredLocation, double minPrice, double maxPrice, int minBedrooms, int maxBedrooms,
			int minBathrooms, int maxBathrooms) {
		this.preferredLocation = preferredLocation;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.minBedrooms = minBedrooms;
		this.maxBedrooms = maxBedrooms;
		this.minBathrooms = minBathrooms;
		this.maxBathrooms = maxBathrooms;
	}
	public Location getPreferredLocation() {
		return preferredLocation;
	}
	public void setPreferredLocation(Location preferredLocation) {
		this.preferredLocation = preferredLocation;
	}
	public double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}
	public double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}
	public int getMinBedrooms() {
		return minBedrooms;
	}
	public void setMinBedrooms(int minBedrooms) {
		this.minBedrooms = minBedrooms;
	}
	public int getMaxBedrooms() {
		return maxBedrooms;
	}
	public void setMaxBedrooms(int maxBedrooms) {
		this.maxBedrooms = maxBedrooms;
	}
	public int getMinBathrooms() {
		return minBathrooms;
	}
	public void setMinBathrooms(int minBathrooms) {
		this.minBathrooms = minBathrooms;
	}
	public int getMaxBathrooms() {
		return maxBathrooms;
	}
	public void setMaxBathrooms(int maxBathrooms) {
		this.maxBathrooms = maxBathrooms;
	}
	
	
	
}
