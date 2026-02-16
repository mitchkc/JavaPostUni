package Practical2.Company;

/****
 * Created by: Michael Connolly
 * Created on: 05/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class PartTimeEmployee extends Employee{

   private int hoursPerMonth;
   private double hourlyPay;
   public PartTimeEmployee (String num, String theirName) {
      super(num, theirName);
   }

   public void setHourlyPay (double hourly) { hourlyPay = hourly; }
   public double getHourlyPay () { return hourlyPay; }
   public void setHoursPerMonth (int hours) { hoursPerMonth = hours; }
   public int getHoursPerMonth () { return hoursPerMonth; }
   public double calculateMonthlyPay () {
      return (double)hoursPerMonth*hourlyPay;
   }


}//class
