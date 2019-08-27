package com.propertySearcher.property;

public class Property {

	private long id;
	private double price;
	private int numberOfBedRooms; 
	private int numberOfBathRooms;
	private Location location;
	
	public Property(long id, double price, int numberOfBedRooms, int numberOfBathRooms, Location location) {
		this.id = id;
		this.price = price;
		this.numberOfBedRooms = numberOfBedRooms;
		this.numberOfBathRooms = numberOfBathRooms;
		this.location = location;
	}

	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumberOfBedRooms() {
		return numberOfBedRooms;
	}

	public void setNumberOfBedRooms(int numberOfBedRooms) {
		this.numberOfBedRooms = numberOfBedRooms;
	}

	public int getNumberOfBathRooms() {
		return numberOfBathRooms;
	}

	public void setNumberOfBathRooms(int numberOfBathRooms) {
		this.numberOfBathRooms = numberOfBathRooms;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Property(){
		
	}
	
}
