package com.skilldistillery.foodtruck.app;
import java.util.Scanner;
public class FoodTruckApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		FoodTruckApp tApp = new FoodTruckApp();
		System.out.println("*********************Welcome to the Food Truck App.*************************");
		System.out.println("**In This app, you will enter 5 of your favorate Food Trucks and rate them!*");
		System.out.println("**You will enter the trucks name, food type, and your rating of the truck.**");
		System.out.println("*************If you wish to exit the app, please enter exit*****************");
		System.out.println("*****************************Lets begin!************************************");
		System.out.println("****************************************************************************");
		
		FoodTruck[] trucks = new FoodTruck[5];
		FoodTruck truck;
		String foodTruckName;
		for(int i = 0; i < 5; i++) {
			System.out.println("Please enter the name of your Food Truck");
			foodTruckName = input.nextLine();
			if(!foodTruckName.equalsIgnoreCase("exit")) {
				System.out.println("Please enter the type of food offered by this truck. Examples being American, Mexican, Chinese etc..");
				String foodType = input.nextLine();
				System.out.println("Please enter your rating for this Food Truck with a 1 being your favorite, and a 5 being your least favorite.");
				double rating = input.nextDouble();
				System.out.println(foodTruckName);
				System.out.println(foodType);
				System.out.println(rating);
				input.nextLine();
				FoodTruck thisTruck = new FoodTruck(foodTruckName, foodType, rating);
				trucks[i] = thisTruck;
				
			}
		}
	}
}
