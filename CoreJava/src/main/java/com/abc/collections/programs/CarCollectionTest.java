package com.abc.collections.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		for(Car l:carsDuplicateList) {
			System.out.println(" :  "+ "namethe duplicate list car name : "+ l.getNumber() + "   car_Cost:"+ l.getCost());
		}
		
		List<Car> telanganaCars = getTelanganaCars(cars);
		
		// Display telanagana cars info
		for(Car l:telanganaCars) {
			System.out.println("Telangana car are :  "+ "name : "+ l.getNumber() + "   Cost:"+ l.getCost());
		}
		
		// sort cars by price;
		List<Car> sorted_cars= sortCarsByPrice(cars);
		
		// Display cars after sorting
		for(Car v:cars)
			System.out.println("the sorted list is  "+"name "+v.getNumber()+"cost "+v.getCost());
		
		//sort cars by model
		sortCarsByModel(cars);
		
		//Display cars after sorting by model
		
		
		// get the most expensive car and print it.
		Car g=getTheMostExpensiveCar(cars);
		System.out.println("the most expensive car  "+g.getNumber()+"  the cost of the car   "+g.getCost()+"  the number  "+g.getModel());
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
		List<Car> x=cars;
		return x;
	}
	
	
	// Create a new list with numbers starts with TN.
	private static List<Car> getTelanganaCars(List<Car> cars) {
		List<Car> z=cars;
		List<Car> tn=new ArrayList<Car>();
		for(Car t:z) {
			String x=t.getNumber();
			String y[]=x.split("-");
			if(y[0].equals("TN"))
				tn.add(t);
		}
		
		return tn;
	}
	
	
	
	private static List<Car> sortCarsByPrice(List<Car> cars) {
		
		sort_cost(cars);
		
		
		return cars;
		
	}



	private static void sort_cost(List<Car> cars) {
		Collections.sort(cars,new Comparator<Car>()
				{
			// ascending sort.
				   public int compare(Car s1,Car s2) {
					   return Integer.valueOf(s1.getCost()).compareTo(s2.getCost());
				   }
				});
	}
	
	
	private static void sortCarsByModel(List<Car> cars) {
		// sort the list. Order - Toyota followed by honda objects.
		
		
		// print the list
		
	}
	
	
	private static Car getTheMostExpensiveCar(List<Car> cars) {
		
		sort_cost(cars);
		int l=cars.size();
		Car t=cars.get(l-1);
		
	    return t;
	}
	
	
}



