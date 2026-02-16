package Practical2.Company;

/****
 * Created by: Michael Connolly
 * Created on: 05/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class FullTimeEmployee extends Employee {

   private double annualSalary;

   public FullTimeEmployee (String num, String theirName) {
      super(num, theirName);
   }
   public void setAnnualSalary (double pay) {
      annualSalary = pay;
   }
   public double getAnnualSalary () { return annualSalary; }
   public double calculateMonthlyPay () {
      return annualSalary/12;
   }

}//class
