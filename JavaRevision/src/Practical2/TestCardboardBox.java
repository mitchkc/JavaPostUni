package Practical2;

import java.util.Scanner;

/****
 * Created by: Michael Connolly
 * Created on: 02/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class TestCardboardBox {
   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);

      CardboardBox myBox = new CardboardBox();
      CardboardBox yourBox = new CardboardBox(15, 5, 25);
      CardboardBox aBox = new CardboardBox(20, 15, 10, "Brown");

      myBox.showAllDetails();
      System.out.println();

      yourBox.printTopArea(); yourBox.printFrontArea(); yourBox.printSideArea();
      System.out.println();

      aBox.showAllDetails();
      aBox.printTopArea(); aBox.printFrontArea(); aBox.printSideArea();
      System.out.println();

//      System.out.println("Enter the width of myBox: ");
//      myBox.setWidth(kb.nextInt());
//      System.out.println("Enter the height of myBox: ");
//      myBox.setHeight(kb.nextInt());
//      System.out.println("Enter the depth of myBox: ");
//      myBox.setDepth(kb.nextInt());
//      System.out.println("Enter the colour of myBox: ");
//      myBox.setColour(kb.next());

      myBox.showAllDetails();

      System.out.println("Total boxes: " + CardboardBox.numOfBoxes());

      System.out.println("Enter total volume of product to be stored: ");
      CardboardBox testBox = new CardboardBox(2, 3, 4);
      int volume = kb.nextInt();
      System.out.println("Number of boxes required: " + testBox.requiredBoxes(volume));

   }//main
}//class
