package lect10b.club;
import java.util.Arrays;
import java.util.Scanner;
/****
 * Created by: Michael Connolly
 * Created on: 05/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class testClub {
   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);

      membership hockey = new membership("Coleraine Hockey Club", 3);
      membership rugby = new membership("Ballymoney Rugby Club", 2);


      System.out.println("Enter members of hockey club: ");
      rugby.addMember();
      System.out.println(rugby);

      System.out.println("Enter member id: ");

      System.out.println(rugby.findMember(kb.nextInt()));

   }//main
}//class
