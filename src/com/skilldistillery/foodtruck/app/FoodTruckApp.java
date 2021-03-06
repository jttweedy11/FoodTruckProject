package com.skilldistillery.foodtruck.app;
import java.util.Scanner;
public class FoodTruckApp {

	public static void main(String[] args) {
		// TODO Constructors and Welcome Menu
		Scanner input = new Scanner(System.in);
		FoodTruckApp tApp = new FoodTruckApp();
		System.out.println("*********************Welcome to the Food Truck App.*************************");
		System.out.println("**In This app, you will enter 5 of your favorate Food Trucks and rate them!*");
		System.out.println("**You will enter the trucks name, food type, and your rating of the truck.**");
		System.out.println("*************If you wish to exit the app, please enter exit*****************");
		System.out.println("*****************************Lets begin!************************************");
		System.out.println("****************************************************************************");
		
		// Build FoodTrucks and store in array of food trucks
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
				input.nextLine();
				truck = new FoodTruck(foodTruckName, foodType, rating);
				trucks[i] = truck;
			}
			else if(foodTruckName.equalsIgnoreCase("exit")) {
				break;
			}
		}
		// Evaluate user selections and envoke the appropriate method or exit the program.
	String selection = "continue";
		while(!selection.equalsIgnoreCase("quit")) {
			System.out.println("*********************Selection Menu*************************");
			System.out.println("*** 1. List all of my Food Trucks***************************");
			System.out.println("*** 2. See the average rating of my food trucks*************");
			System.out.println("*** 3. Display my hightest-rated food truck*****************");
			System.out.println("*** 4. Quit the program*************************************");
			System.out.println("************************************************************");
			System.out.println("Please enter the number of the desired selection from the menu above");
			selection = input.nextLine();
			if(selection.equalsIgnoreCase("1")) {
				tApp.printFoodTrucks(trucks);
			}
			else if(selection.equalsIgnoreCase("2")) {
				System.out.println("The average rating of your food trucks is " + tApp.getAverageRate(trucks));
			}
			else if(selection.equalsIgnoreCase("3")) {
				FoodTruck highest = tApp.getHighestRated(trucks);
				System.out.println("The highest rated Food Truck is " + highest);
			}
			else if(selection.equalsIgnoreCase("4")) {
				selection = "quit";
				System.out.println("Goodbye!");
				break;
			}
		}
		input.close();
	}
//		Methods to aggregate and present information about the food trucks and facilitate the selection menu
	public void printFoodTrucks(FoodTruck trucks[]) {
		for(int i = 0;i<trucks.length;i++) {
			if(trucks[i] != null) {
				System.out.println(trucks[i].toString());
			}
		}
	}
	public double getAverageRate(FoodTruck trucks[]) {
		int runTot = 0;
		int numOfTrucks = 0;
		int i = 0;
		while(i<5 && trucks[i] !=null) {
			numOfTrucks++;
			runTot += trucks[i].getRating();
			i++;
			}
		double average = (double)(runTot/numOfTrucks);
		return average;
		}
	public FoodTruck getHighestRated(FoodTruck trucks[]) {
		FoodTruck highest = trucks[0];
		int i = 0;
		while(i<5) {
			if(trucks[i] !=null) {
				if(trucks[i].getRating() < highest.getRating()) {
					highest = trucks[i];
				}
			}
			i++;
		}
		return highest;
	}
}
