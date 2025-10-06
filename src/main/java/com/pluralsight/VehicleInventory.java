package com.pluralsight;

import java.sql.Struct;
import java.util.Scanner;

public class VehicleInventory {
    //this is where the main method is going to be
    //this is where we need to prompt for user input
    //this is also where we need to create an array + a counter variable that tells how many vehicles are in array
    //  creating an array  for vehicleId, makeModel, color, odometerReading, and price
    //we will have the scanner outside of the main method so we can call on it at anytime
    public static Scanner vroom = new Scanner(System.in);

    public static void main(String[] args) {
        Vehicle ford = new Vehicle(101121, "Ford Explorer", "red", 45000, 13500);
        System.out.println(ford.getVehicleID());
        // using the Vehicle classs to create an array called inventory whos elements should be Vehicle object. array has length of 20
        Vehicle[] inventory = new Vehicle[20];
        int carsInInventory = 6;
        // preloading the array with 6 Vehicles
        inventory[0] = ford;
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        inventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 1600);
        // creating a int variable to have user input their answer
        // this is where the method for the list all vehicles will go
        // ctl f in workbook
        // this is where we add vehicle

        System.out.println("What do you want to do?");
        System.out.println(" 1 - List all vehicles ");
        System.out.println(" 2 - Search by make/model ");
        System.out.println(" 3 - Search by price range ");
        System.out.println(" 4 - Search by color  ");
        System.out.println(" 5 - Add a vehicle ");
        System.out.println(" 6 - Quit ");

        int response = askQuestion("Enter your command:");

        // this is where i will create the switch statement
        switch (response) {
            case 1

                ;
        }

        //I still am not entirely sure how to make a static method
        //Lets start with what i need to happen
        // i need to create a method that ask's for each of the information to be provided
        //what Im doing in line 19 is essentially storing an asked question in a variable, why ?
        //I dont need this variable to be called upon anywhere else
        //

    }

    public static void listAllVehicles(Vehicle[] inventory) {
        // what we wanna do is loop through the invintory array
        //at each pass we want to print out each element in ivintory
        // we want to itterate the vehicle invintory and display the vehicleid
        //at each itteration we want to display the vehicalid of each element
        for (int i = 0; i < inventory.length; i++) {
            if (i < carsInInventory) {
                System.out.println(inventory[i].getVehicleID());
                // what is saying is if i is < cars invintory give getVehicalId
            }
            // if we dont need to return anything the return type would be void

        }


    }

    public static int askQuestion(String theQuestion) {
        System.out.println(theQuestion);
        int response = vroom.nextInt();
        return response;
    }

}
