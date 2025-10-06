package com.pluralsight;

public class Vehicle {//this class should have vehicle id, makeModel, color, odometerReading, price
    //I need to instantiate the object and create a method named vehicle
    private long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;
    //every object instantiated with this vehicle class will have these feilds
    //

    // creating a public method named vehicle
    //this is where the vehicle will get its characteristics
    public Vehicle(long vehicleID, String makeModel, String color, int odometerReading, float price){
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }
    //^^ this is the constructor method

    // this is where i generated the setter and getter methods
    //all the getter and setter methods is either get or chanhe the objects you needed

    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
