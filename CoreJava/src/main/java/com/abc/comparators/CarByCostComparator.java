package com.abc.comparators;

import java.util.Comparator;

import com.abc.dataobjects.Car;

public class CarByCostComparator implements Comparator<Car> {

	// 0 - equal objects
	// <0 - in order
	// >0 - not in the order

	public int compare(Car s1, Car s2) {

		Integer cost1 = s1.getCost();
		Integer cost2 = s2.getCost();

		return cost1.compareTo(cost2);

	}
}
