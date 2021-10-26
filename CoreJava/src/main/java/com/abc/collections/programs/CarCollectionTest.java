package com.abc.collections.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.abc.comparators.CarByModelComparator;
import com.abc.dataobjects.Car;

// Purpose. 
// 1. Learning how to pass the list(objects info) from one function to another function.  
// 2. Breaking big task into small tasks and Create a method for each task.

// Add necessary logic under below comments to perform the tasks.

public class CarCollectionTest {

	public static void main(String[] args) {
		// create 2 car objects, add them to arraylist

		List<Car> cars = createCarObjects();
		displayCarsInfo(cars);

		List<Car> carsDuplicateList = createDuplicateList(cars);

		// Display duplicate list
		displayCarsInfo(carsDuplicateList);

		List<Car> telanganaCars = getTelanganaCars(cars);

		// Display telanagana cars info
		displayCarsInfo(telanganaCars);

		// sort cars by price;
		List<Car> sorted_cars = sortCarsByPrice(cars);

		// Display cars after sorting
		displayCarsInfo(sorted_cars);

		// sort cars by model
		sortCarsByModel(cars);

		displayCarsInfo(cars);

		// Display cars after sorting by model
		// get the most expensive car and print it.
		Car expensiveCar = getTheMostExpensiveCar(cars);
		System.out.println("the most expensive car  " + expensiveCar.getNumber() + "  the cost of the car   "
				+ expensiveCar.getCost() + "  the number  " + expensiveCar.getModel());
	}

	private static void displayCarsInfo(List<Car> cars) {
		for (Car car : cars) {
			System.out.println("name : " + car.getNumber() + "   Cost:" + car.getCost());
		}

	}

	private static List<Car> createCarObjects() {
		List<Car> cars = new ArrayList<Car>();

		Car toyota11 = new Car("AP-1111", 10000, "toyota");

		Car toyota22 = new Car("AP-1122", 5000, "toyota");

		Car honda34 = new Car();
		honda34.setCost(150000);
		honda34.setNumber("TN-1234");
		honda34.setModel("honda");

		Car honda01 = new Car("AP-0001", 15500, "honda");

		cars.add(toyota11);
		cars.add(honda34);
		cars.add(toyota22);
		cars.add(honda01);
		return cars;
	}

	// creates a duplicate collection
	private static List<Car> createDuplicateList(List<Car> cars) {
		List<Car> copyCarsList = new ArrayList<Car>();

		for (Car car : cars) {
			copyCarsList.add(car);
		}

		return copyCarsList;
	}

	// Create a new list with numbers starts with TN.
	private static List<Car> getTelanganaCars(List<Car> cars) {
		List<Car> z = cars;
		List<Car> tn = new ArrayList<Car>();
		for (Car t : z) {
			String x = t.getNumber();
			String y[] = x.split("-");
			if (y[0].equals("TN"))
				tn.add(t);
		}

		return tn;
	}

	private static List<Car> sortCarsByPrice(List<Car> cars) {

		sort_cost(cars);

		return cars;

	}

	private static void sort_cost(List<Car> cars) {
		Collections.sort(cars);
	}

	private static void sortCarsByModel(List<Car> cars) {
		// sort the list. Order - Toyota followed by honda objects.
		Collections.sort(cars, new CarByModelComparator());
	}

	private static Car getTheMostExpensiveCar(List<Car> cars) {

		sort_cost(cars);
		int l = cars.size();
		Car t = cars.get(l - 1);

		Car expensiveCar = null;

		for (Car temp : cars) {
			if (expensiveCar == null) {
				expensiveCar = temp;
			} else if (expensiveCar.getCost() < temp.getCost()) {
				expensiveCar = temp;
			}

		}

		return expensiveCar;
	}

}
