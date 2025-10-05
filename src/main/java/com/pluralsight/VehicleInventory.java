package com.pluralsight;

public class VehicleInventory { //this is where the main method is going to be
    //this is where we need to prompt for user input
    //this is also where we need to create an array + a counter variable that tells how many vehicles are in array
    //  creating an array  for vehicleId, makeModel, color, odometerReading, and price
    public static void main(String[] args) {
        long[] vehicleId = {101121, 101122, 101123, 101124, 101125, 101126};
        String[] makeModel = {"Ford Exlporer", "Toyota Camry", "Chevrolet Malibu", "Honda Civic", "Subaru Outback", "Jeep Wrangler"};
        String[] color = {"Red", "Blue", "Black", "White", "Green", "Yellow"};
        int[] odometerReading = {45000, 60000, 50000, 70000, 55000, 30000};
        float[] price = {13500, 11000, 9700, 7500, 14500, 16000};
    }
}
