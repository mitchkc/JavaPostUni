package Practical2.Company;

import Practical2.CardboardBox;

/****
 * Created by: Michael Connolly
 * Created on: 05/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class CasualEmployee extends Employee{

   private double hourlyPay;

   public CasualEmployee (String num, String theirName){
      super(num, theirName);
   }
   public void setHourlyPay (double pay) { hourlyPay = pay; }
   public double getHourlyPay () { return hourlyPay; }
   public double calculateWeeklyPay () {
      return hourlyPay*7*5;
   }

}//class
