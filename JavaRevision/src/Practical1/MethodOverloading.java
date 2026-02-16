package Practical1;
import java.util.Scanner;
import java.text.DecimalFormat;

/****
 * Created by: Michael Connolly
 * Created on: 30/04/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class MethodOverloading {

   public static double calculateArea (int pside){ //equilateral triangle
      return (Math.sqrt(3)/4)*Math.pow(pside, 2);
   }

   public static double calculateArea(int pside1, int pside2){
      return 0.5 * pside2 * Math.sqrt((Math.pow(pside1,2) - Math.pow(pside2, 2)/4));
   }

   public static double calculateArea(int pside1, int pside2, int pside3){
      double s = 0;
      s = (double) (pside1 + pside2 + pside3) /2;
      return Math.sqrt(s*(s-pside1)*(s-pside2)*(s-pside3));
   }

   public static void main(String[] args) {

      int equilateralSide;
      int isosceles1;
      int isosceles2;
      int scalene1;
      int scalene2;
      int scalene3;
      DecimalFormat df = new DecimalFormat("0.00");

      System.out.println("Equilateral Triangle");
      System.out.println("*******************");
      System.out.println("Enter the length of the side of the equilateral: ");
      Scanner keyboard = new Scanner(System.in);
      equilateralSide = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("The area of the triangle is " + df.format(calculateArea(equilateralSide)) + " units squared\n");

      System.out.println("Isosceles Triangle");
      System.out.println("******************");
      System.out.println("Enter side a of Isosceles: ");
      isosceles1 = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("Enter side b of Isosceles: ");
      isosceles2 = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("The area of the isosceles triangle is " + df.format(calculateArea(isosceles1, isosceles2)) + " units squared\n");

      System.out.println("Scalene Triangle");
      System.out.println("***************");
      System.out.println("Enter side a of Scalene Triangle: ");
      scalene1 = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("Enter side b of Scalene Triangle: ");
      scalene2 = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("Enter side c of Scalene Triangle: ");
      scalene3 = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("The area of the Scalene Triangle is " + df.format(calculateArea(scalene1, scalene2, scalene3)) + " units squared");


   }//main
}//class
