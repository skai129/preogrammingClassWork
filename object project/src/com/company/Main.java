package com.company;

public class Main {

    public static void main(String[] args) {
	    car BakerCar = new car();
	    System.out.println("Baker's car: " + BakerCar.model);
	    car PeteCar = new car("Ford", "Mustang", 15,14);
        System.out.println("Pete's car: " + PeteCar.model);
        BakerCar.DriveTillEmpty();
        System.out.println(BakerCar.milesTraveled);
        System.out.println(PeteCar.milesTraveled);
        BakerCar.FillTank();
        BakerCar.DriveTillEmpty();
        System.out.println(BakerCar.milesTraveled);
        System.out.println(PeteCar.milesTraveled);
    }
}
