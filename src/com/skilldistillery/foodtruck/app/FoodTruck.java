package com.skilldistillery.foodtruck.app;

public class FoodTruck {
	private int id;
	private String name;
	private String foodType;
	private double rating;
	private static int countFoodTrucks = 0;
	
	public FoodTruck() {
	}
	
	public FoodTruck(String pname, String pfoodType, double rating) {
		name = pname;
		foodType = pfoodType;
		rating = this.rating;
		countFoodTrucks++;
		id = countFoodTrucks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", foodType=");
		builder.append(foodType);
		builder.append(", rating=");
		builder.append(rating);
		builder.append("]");
		return builder.toString();
	}
	
	
}
