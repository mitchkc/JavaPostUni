package lect10b.club;

/****
 * Created by: Michael Connolly
 * Created on: 05/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class member {

   private int memberNumber;
   private String memberName;

   public  member(int num, String name){
      memberNumber = num;
      memberName = name;
   }

   public int getMembershipNum (){
      return memberNumber;
   }

   public String toString(){
      return ("Member Number: " + memberNumber + ". Member Name: " + memberName + "\n");
   }

}//class
