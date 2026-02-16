package Practical2.Company;

/****
 * Created by: Michael Connolly
 * Created on: 05/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class Employee {

   private String number;
   private String name;

   public Employee () {}   // default constructor
   public Employee (String num, String theirName) {
      number = num;
      name = theirName;
   }
   public void setName (String theirName) {  name = theirName; }
   public String getNumber () { return number; }
   public String getName () { return name; }

}//class
