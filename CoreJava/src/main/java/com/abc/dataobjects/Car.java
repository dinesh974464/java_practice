package com.abc.dataobjects;

// number, cost
public class Car implements Comparable<Car> {
	// Varibales should be private
	private String number; // ex: "AP-1111", "TN-1234". First 2 characters indicate the state.
	private int cost;
	private String model; // toyota ,honda etc....

	public Car() {
		super();
	}

	public Car(String number, int cost, String model) {
		super();
		this.number = number;
		this.cost = cost;
		this.model = model;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", cost=" + cost + ", model=" + model + "]";
	}

	public int compareTo(Car otherCar) {
		Integer cost1 = this.getCost();
		Integer cost2 = otherCar.getCost();
		return cost1.compareTo(cost2);

	}

}
