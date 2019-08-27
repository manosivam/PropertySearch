package com.propertySearcher.Algorithm;

import com.propertySearcher.property.Location;

public class PercentFinder implements IPercentFinder {

	private static IPercentFinder percentFinder;

	public static IPercentFinder getInstance() {
		if (percentFinder == null) {
			percentFinder = new PercentFinder();
		}
		return percentFinder;
	}

	private PercentFinder() {

	}

	private double findBudgetDeviationPercent(double propertyPrice, double minBudget, double maxBudget) {
		if (maxBudget == 0) {
			return (propertyPrice - minBudget) * 100 / minBudget;
		} else if (minBudget == 0) {
			return (propertyPrice - maxBudget) * 100 / maxBudget;
		} else {
			double minDeviationPercent = (propertyPrice - minBudget) * 100 / minBudget;
			double maxDeviationPercent = (propertyPrice - maxBudget) * 100 / maxBudget;
			return Math.max(minDeviationPercent, maxDeviationPercent);
		}
	}

	@Override
	public double findBudgetMatchPercent(double propertyPrice, double minBudget, double maxBudget) {
		double percent = 0;
		double deviationPercent = findBudgetDeviationPercent(propertyPrice, minBudget, maxBudget);
		double percentPerDeviationPercent = 30 / (25 - 10);

		if (minBudget == 0) {
			// only maxBudget is given.
			// for full 30% +- 10% is allowed.
			if (deviationPercent < 10) {
				percent = 30;
			} else {
				percent = (25 - deviationPercent) * percentPerDeviationPercent;
			}
		} else if (maxBudget == 0) {
			if (deviationPercent < 10) {
				percent = 30;
			} else {
				percent = (25 - deviationPercent) * percentPerDeviationPercent;
			}
		}
		if (propertyPrice >= minBudget && propertyPrice <= maxBudget) {
			percent = 30;
		} else {
			percent = (25 - deviationPercent) * percentPerDeviationPercent;
		}

		return percent;
	}

	@Override
	public double findLocationMatchPercent(Location propertyLocation, Location searchLocation) {
		double percent = 0;
		double percentPerMile = (10 - 2) / 8;

		double milesApart = Math.sqrt(Math.pow(Math.abs(propertyLocation.getLat() - searchLocation.getLat()), 2)
				+ Math.pow(Math.abs(propertyLocation.getLongt() - searchLocation.getLongt()), 2));
		if (milesApart <= 2) {
			percent = 30; // full percent. we can have separate configurable rule class to get this 30%.
							// Similarly for 2, 10 miles.
		} else {
			percent = (10 - milesApart) * percentPerMile;
		}
		return percent;
	}
	
	@Override
	public boolean isBathroomsMatchesWithTheSearchToProcess(int preferredMin, int preferredMax,
			int bathroomsInProperty) {
		if (Math.abs(bathroomsInProperty - preferredMin) <= 2 || Math.abs(bathroomsInProperty - preferredMax) <= 2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isBedroomsMatchesWithTheSearchToProcess(int preferredMin, int preferredMax, int bedroomsInProperty) {
		if (Math.abs(bedroomsInProperty - preferredMin) <= 2 || Math.abs(bedroomsInProperty - preferredMax) <= 2) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isBudgetValidToProcess(double propertyPrice, double minBudget, double maxBudget) {
		double deviationPercent = findBudgetDeviationPercent(propertyPrice, minBudget, maxBudget);
		return deviationPercent > 25 ? false : true;
	}

	
	@Override
	public double findBathroomsMatchPercent(int preferredMin, int preferredMax, int bathroomsInProperty) {
		double percent = 0;

		if (preferredMax != 0 && preferredMin != 0) {
			if (bathroomsInProperty >= preferredMin && bathroomsInProperty <= preferredMax) {
				percent = 20;
			}
		} else {
			if (preferredMax == 0) {
				percent = ((4- Math.abs(bathroomsInProperty - preferredMin))*20/4-2);
			}
			else if(preferredMin ==0)
			{
				percent = ((4- Math.abs(bathroomsInProperty - preferredMax))*20/4-2);
			}
		}
		return percent;
	}

	@Override
	public double findBedroomsMatchPercent(int preferredMin, int preferredMax, int bedroomsInProperty) {
		double percent = 0;

		if (preferredMax != 0 && preferredMin != 0) {
			if (bedroomsInProperty >= preferredMin && bedroomsInProperty <= preferredMax) {
				percent = 20;
			}
		} else {
			if (preferredMax == 0) {
				percent = ((4- Math.abs(bedroomsInProperty - preferredMin))*20/4-2);
			}
			else if(preferredMin ==0)
			{
				percent = ((4- Math.abs(bedroomsInProperty - preferredMax))*20/4-2);
			}
		}
		return percent;
	}
	
}
