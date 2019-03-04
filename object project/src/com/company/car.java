package com.company;

/**
 * Created by lj2100 on 2/4/2019.
 */
public class car {
    //properties
    String make;
    String model;
    double milesTraveled;
    double tankSize;
    double gasInGallons;
    double milesPerGallon;

    //constructors
    public car(){
        make = "Ford";
        model = "Escape";
        milesTraveled = 0;
        tankSize = 13;
        gasInGallons = tankSize;
        milesPerGallon = 24;
    }

    public car(String Make, String Model, double TankSize, double mpg){
        make = Make;
        model = Model;
        milesTraveled = 0;
        tankSize = TankSize;
        gasInGallons = tankSize;
        milesPerGallon = mpg;
    }

    //methods
    public void DriveTillEmpty(){
        milesTraveled = milesTraveled + milesPerGallon * gasInGallons;
        gasInGallons = 0;
    }
    public void FillTank(){
        gasInGallons = tankSize;
    }
}
