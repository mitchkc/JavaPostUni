package Practical1;
import java.text.DecimalFormat;
import java.util.Calendar;

/****
 * Created by: Michael Connolly
 * Created on: 01/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class Car {

   DecimalFormat df = new DecimalFormat("0.00");
   Calendar calendar = Calendar.getInstance();
   private int id;
   private String make;
   private String ownerName;
   private String colour;
   private int yearOfManufacture;
   private int topSpeed;
   private double costPrice;
   private static int noOfCars;



   public Car(){  //default constructor
      ++noOfCars;
   }

   public Car (int carId, String carMake, String owner, String carColour, int year, int speed, double cost) {
      id = carId;
      make = carMake;
      ownerName = owner;
      colour = carColour;
      yearOfManufacture = year;
      topSpeed = speed;
      costPrice = cost;
      ++noOfCars;
   }

   public Car (int carId, String carMake, String owner, String carColour) {
      id = carId;
      make = carMake;
      ownerName = owner;
      colour = carColour;
      ++noOfCars;
   }

   public Car (int carId, String owner, int speed) {
      id = carId;
      ownerName = owner;
      topSpeed = speed;
      ++noOfCars;
   }

   public void printCarInfo () {
      System.out.println("The car id is: " + id);
      System.out.println("The car make is: " + make);
      System.out.println("The car owner is: " + ownerName);
      System.out.println("The car colour is: " + colour);
      System.out.println("The car year of manufacture is: " + yearOfManufacture);
      System.out.println("The cars top speed is: " + topSpeed);
      System.out.println("The car costs: £" + df.format(costPrice) + "\n");
   }

   public void setId (int carId) {
      id = carId;
   }
   public int getId () {
      return id;
   }
   public void setMake (String carMake) {
      make = carMake;
   }
   public String getMake () {
      return make;
   }
   public void setOwner (String carOwner) {
      ownerName = carOwner;
   }
   public String getOwner () {
      return ownerName;
   }
   public void setColour (String carColour) {
      colour = carColour;
   }
   public String getColour () {
      return colour;
   }
   public void setYear (int year) {
      yearOfManufacture = year;
   }
   public int getYear () {
      return yearOfManufacture;
   }
   public void setSpeed (int carSpeed) {
      topSpeed = carSpeed;
   }
   public int getSpeed () {
      return topSpeed;
   }
   public void setCost (double price) {
      costPrice = price;
   }
   public double getCostPrice () {
      return costPrice;
   }

   public int ageOfCar () {
      if(yearOfManufacture != 0) {
         return calendar.get(Calendar.YEAR) - yearOfManufacture;
      }
      else {
         return -1;
      }
   }

   public double currentValue (double annualDepreciation) {
      if(this.yearOfManufacture != 0 && this.costPrice != 0.00) {
         return this.costPrice - (this.costPrice * (annualDepreciation / 100) * this.ageOfCar());
      }
      else {
         return -1;
      }
   }

   public static int numberOfCars() {
      return noOfCars;
   }

}//object
