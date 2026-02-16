package lect10b.club;
import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.Scanner;
/****
 * Created by: Michael Connolly
 * Created on: 05/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class membership {
   Scanner kb = new Scanner(System.in);

   private String clubName;
   private int noOfMembers;
   private member [] memberList;

   public membership(String theClubName, int numMems){
      int id;
      String name;

      clubName = theClubName;
      noOfMembers = numMems;
      memberList = new member[noOfMembers];  //initialise the array of member objects

   }

   public String getClubName (){
      return clubName;
   }

   public void addMember() {
      int id;
      String name;
      for (int i = 0; i < noOfMembers; i++) {
         System.out.println("Enter member's 5 digit id: ");
         id = kb.nextInt();
         kb.nextLine();
         System.out.println("Enter member's name: ");
         name = kb.nextLine();
         memberList[i] = new member(id, name);
      }
   }

   public String findMember(int id){
      for(int i = 0; i < noOfMembers; i++) {
         if (memberList[i].getMembershipNum() == id) {
            return memberList[i].toString();
         }
      }
      return "not found";
   }

   public String toString(){
      String result = "Club: " + clubName + "\nMembers: ";
      for(int i = 0; i < noOfMembers; i++){
         result += memberList[i].toString();
      }
      return result;
   }

}//class
