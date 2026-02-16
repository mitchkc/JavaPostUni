package Practical2;

/****
 * Created by: Michael Connolly
 * Created on: 02/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class CardboardBox {

   private int width;
   private int height;
   private int depth;
   private String colour;
   private static int noOfBoxes;

   public CardboardBox () {   // default constructor
      noOfBoxes++;
   }
   public CardboardBox (int boxWidth, int boxHeight, int boxDepth, String boxColour) {
      width = boxWidth; height = boxHeight;  depth = boxDepth; colour = boxColour;  noOfBoxes++;
   }
   public CardboardBox (int boxWidth, int boxHeight, int boxDepth) {
      width = boxWidth; height = boxHeight;  depth = boxDepth; colour = "unknown";  noOfBoxes++;
   }

   public void setWidth (int boxWidth) { width = boxWidth; }
   public int getWidth () { return width; }
   public void setHeight (int boxHeight) { height = boxHeight; }
   public int getHeight () { return height; }
   public void setDepth (int boxDepth) { depth = boxDepth; }
   public int getDepth () { return depth; }
   public void setColour (String boxColour) { colour = boxColour; }
   public String getColour () { return colour; }

   public double volume (int boxWidth, int boxHeight, int boxDepth) {
      return (double)boxWidth*boxHeight*boxDepth;
   }

   public void showAllDetails () {
      System.out.println("The WIDTH of the box is: " + width + " units");
      System.out.println("The HEIGHT of the box is: " + height + " units");
      System.out.println("The DEPTH of the box is: " + depth + " units");
      System.out.println("The COLOUR of the box is: " + colour + "\n");
   }

   public void printTopArea () {
      System.out.println("Area of TOP: " + width*depth);
   }
   public void printFrontArea () {
      System.out.println("Area of FRONT: " + width*height);
   }
   public void printSideArea () {
      System.out.println("Area of SIDE: " + height*depth);
   }

   public static int numOfBoxes () { return noOfBoxes; }

   public int requiredBoxes (int volume) {
      return (int) (volume / volume(width, height, depth));
   }

}//class
