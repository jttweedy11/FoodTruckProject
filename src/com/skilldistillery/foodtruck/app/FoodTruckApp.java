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
				int rating = input.nextInt();
				System.out.println(foodTruckName);
				System.out.println(foodType);
				System.out.println(rating);
				input.nextLine();
				FoodTruck thisTruck = new FoodTruck(foodTruckName, foodType, rating);
				trucks[i] = thisTruck;
			}
			else if(foodTruckName.equalsIgnoreCase("exit")) {
				break;
			}
		}
	String selection = "continue";
		while(!selection.equalsIgnoreCase("quit")) {
			System.out.println("*********************Selection Menu*************************");
			System.out.println("*** 1. List all of my Food Trucks				************");
			System.out.println("*** 2. See the average rating of my food trucks	************");
			System.out.println("*** 3. Display my hightest-rated food truck		************");
			System.out.println("*** 4. Quit the program							************");
			System.out.println("*********************Selection Menu*************************");
			System.out.println("Please enter the number of the desired selection from the menu above");
			selection = input.nextLine();
			if(selection.equalsIgnoreCase("1")) {
				tApp.printFoodTrucks(trucks);
			}
			else if(selection.equalsIgnoreCase("2")) {
				tApp.getAverageRate(trucks);
			}
			else if(selection.equalsIgnoreCase("3")) {
				tApp.getHighestRated(trucks);
			}
			else if(selection.equalsIgnoreCase("4")) {
				selection = "quit";
				System.out.println("Goodbye!");
				break;
			}
		}
	}
	
	public void printFoodTrucks(FoodTruck trucks[]) {
		for(int i = 0;i<trucks.length;i++) {
			if(trucks[i] != null) {
				System.out.println(trucks[i].toString());
			}
		}
	}
	public double getAverageRate(FoodTruck trucks[]) {
		double runTot = 0.0;
		int numOfTrucks = 0;
		int i = 0;
		if(trucks[i]!= null) {
			for(int t = 0; t< trucks.length;t++) {
				numOfTrucks++;
				runTot += trucks[t].getRating();
			}
		}
		double average = (runTot/numOfTrucks);
		return average;
	}
	public FoodTruck getHighestRated(FoodTruck trucks[]) {
		FoodTruck highest = trucks[0];
		int i = 0;
		if(trucks[i]!=null) {
			for(int t = 0; t<trucks.length;t++) {
				if(trucks[t].getRating()>highest.getRating()) {
					highest = trucks[t];
				}
			}
		}
		return highest;
	}
}
