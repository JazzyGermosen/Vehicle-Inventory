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
        long[] vehicleId = {101121, 101122, 101123, 101124, 101125, 101126};
        String[] makeModel = {"Ford Exlporer", "Toyota Camry", "Chevrolet Malibu", "Honda Civic", "Subaru Outback", "Jeep Wrangler"};
        String[] color = {"Red", "Blue", "Black", "White", "Green", "Yellow"};
        int[] odometerReading = {45000, 60000, 50000, 70000, 55000, 30000};
        float[] price = {13500, 11000, 9700, 7500, 14500, 16000};

        // creating a int variable to have user input their answer
        // this is where the method for the list all vehicles will go
        System.out.println("What do you want to do?");
        System.out.println(" 1 - List all vehicles ");
        System.out.println(" 2 - Search by make/model ");
        System.out.println(" 3 - Search by price range ");
        System.out.println(" 4 - Search by color  ");
        System.out.println(" 5 - Add a vehicle ");
        System.out.println(" 6 - Quit ");

        int response = askQuestion("Enter your command:");


    }
    // this is where i will create the switch statement
    switch(response){
        case 1;
    }

    //I still am not entirely sure how to make a static method
    //Lets start with what i need to happen
    // i need to create a method that ask's for each of the information to be provided
    //what Im doing in line 19 is essentially storing an asked question in a variable, why ?
    //I dont need this variable to be called upon anywhere else
    //
    public static String listAllVehicals(String cars){
        System.out.println();
        String answer = vroom.nextLine();
        return answer.trim();

    }
    public static findVehicleByPrice(){

    }
    public static addAVehicle(){

    }
    public static int askQuestion(int theQuestion){
        System.out.println(theQuestion);
        String response = vroom.nextLine();
        return response.trim();
    }
    public static (){

    }

}
