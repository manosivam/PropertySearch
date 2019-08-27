package com.propertySearcher.Algorithm;

import com.propertySearcher.property.Location;

public interface IPercentFinder {

	double findBathroomsMatchPercent(int preferredMin, int preferredMax, int bathroomsInProperty);

	double findBedroomsMatchPercent(int preferredMin, int preferredMax, int bedroomsInProperty);

	double findBudgetMatchPercent(double propertyPrice, double minBudget, double maxBudget);

	double findLocationMatchPercent(Location propertyLocation, Location searchLocation);

	boolean isBathroomsMatchesWithTheSearchToProcess(int preferredMin, int preferredMax, int bathroomsInProperty);

	boolean isBedroomsMatchesWithTheSearchToProcess(int preferredMin, int preferredMax, int bedroomsInProperty);

	boolean isBudgetValidToProcess(double propertyPrice, double minBudget, double maxBudget);

}