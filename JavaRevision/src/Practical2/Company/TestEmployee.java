package Practical2.Company;
import java.util.Scanner;

/****
 * Created by: Michael Connolly
 * Created on: 05/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class TestEmployee {
   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);



      System.out.println("Enter Employee name: ");
      String name = kb.nextLine();
      System.out.println("Enter Employee number: ");
      String employeeNum = kb.nextLine();
      System.out.println("Enter Employee hourly pay: ");
      double hourlyPay = kb.nextDouble();

      PartTimeEmployee employee4 = new PartTimeEmployee(employeeNum, name);

      employee4.setHourlyPay(hourlyPay);

      System.out.println("Enter Employee hours worked: ");
      int hoursWorked = kb.nextInt();
      employee4.setHoursPerMonth(hoursWorked);

      System.out.println("Employee: " + employee4.getNumber() + "\nMonthly Pay: £" + employee4.calculateMonthlyPay());


   }//main
}//class
