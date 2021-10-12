package com.abc.collections.programs;

import java.util.ArrayList;
import java.util.List;

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
		//Display duplicate list
		
		
		List<Car> telanganaCars = getTelanganaCars(cars);
		
		// Display telanagana cars info
		
		// sort cars by price;
		sortCarsByPrice(cars);
		
		
		// Display cars after sorting
		
		
		//sort cars by model
		
		
		//Display cars after sorting by model
		
		
		// get the most expensive car and print it.
		
	}

	
	
	private static void displayCarsInfo(List<Car> cars) {
		for(Car car : cars) {
			System.out.println("name : "+ car.getNumber() + "   Cost:"+ car.getCost());
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
		
		Car honda01 = new Car("AP-0001",15500, "honda");
			
		
		cars.add(toyota11);
		cars.add(honda34);
		cars.add(toyota22);
		cars.add(honda01);
		return cars;
	}
	
	
	// creates a duplicate collection
	private static List<Car> createDuplicateList(List<Car> cars) {
		
		return null;
	}
	
	
	// Create a new list with numbers starts with TN.
	private static List<Car> getTelanganaCars(List<Car> cars) {
		
		
		return null;
	}
	
	
	
	private static void sortCarsByPrice(List<Car> cars) {
		// sort the list. 
		
		// print the list
	}
	
	
	private static void sortCarsByModel(List<Car> cars) {
		// sort the list. Order - Toyota followed by honda objects.
		
		// print the list
		
	}
	
	
	private static Car getTheMostExpensiveCar(List<Car> cars) {
		// Identify the most expensive car
		
	    return null;
	}
	
	
}



