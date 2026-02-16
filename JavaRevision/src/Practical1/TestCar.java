package Practical1;
import java.util.Scanner;

/****
 * Created by: Michael Connolly
 * Created on: 01/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class TestCar {
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);

      Car myCar = new Car();
      Car sistersCar = new Car(100, "Ford", "My sister Mary", "Red", 2008, 105, 10995.00);
      Car bossCar = new Car(101, "Honda", "Pat Bell", "Silver", 2011, 210, 27500.00);
      Car aCar = new Car(102, "Ford", "Janet Allison", "Red");
      Car bCar = new Car(103, "John Smith", 100);

      myCar.printCarInfo();
      sistersCar.printCarInfo();
      bossCar.printCarInfo();
      aCar.printCarInfo();
      bCar.printCarInfo();

      bCar.setMake("Vauxhall");
      bCar.setOwner("James Rodgers");
      bCar.setYear(2012);
      bCar.setCost(10000.00);
      bCar.printCarInfo();

      Car cCar = new Car();
      cCar.setId(104);  cCar.setMake("Toyota"); cCar.setOwner("Robert Smith");   cCar.setColour("Blue");
      cCar.setYear(2010);  cCar.setSpeed(120);  cCar.setCost(12000);
      cCar.printCarInfo();

      System.out.println("bCar is a: " + bCar.getMake() + ", is " + bCar.getColour() + " and was made in " + bCar.getYear() + "\n");

      System.out.println("cCar is: " + cCar.ageOfCar() + " years old.\n");

      System.out.println("aCar is: " + aCar.ageOfCar() + " years old.\n");

      System.out.println("Enter depreciation rate for cCar: ");
      double depValue = kb.nextDouble();
//      kb.nextLine();
      System.out.println("Old value of cCar: £" + cCar.getCostPrice() + "\nCurrent cost of cCar: £" + cCar.currentValue(depValue) + "\n");

      System.out.println("Total number of cars: " + Car.numberOfCars());

   }//main
}//class
