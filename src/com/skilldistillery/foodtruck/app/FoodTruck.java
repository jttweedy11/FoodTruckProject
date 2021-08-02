package com.skilldistillery.foodtruck.app;

public class FoodTruck {
	private int id;
	private String name;
	private String foodType;
	private int rating;
	private static int countFoodTrucks = 0;
	
//	public FoodTruck() {
//	}
	
	public FoodTruck(String pname, String pfoodType, int rating) {
		name = pname;
		foodType = pfoodType;
		this.rating = rating;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
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
