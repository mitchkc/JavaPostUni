package Practical2;

/****
 * Created by: Michael Connolly
 * Created on: 02/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class CD {

   private int id;  private String artist;  private String album;   private double costPrice;
   private double salePrice;  private int year; private boolean single;

   public CD () {   } // default constructor
   public CD (String cdArtist, String albumName, int yearRelease, boolean singleDouble) {
      artist = cdArtist;   album = albumName;   year = yearRelease;  single = singleDouble;
   }
   public CD (String cdArtist, String albumName, double cost, double sale, int yearRelease, boolean singleDouble) {
      artist = cdArtist;   album = albumName;   costPrice = cost;   salePrice = sale;   year = yearRelease;
      single = singleDouble;
   }
   public void printAllInfo () {
      System.out.println("Artist: " + artist);   System.out.println("Album: " + album);
      System.out.println("Cost: " + costPrice);   System.out.println("Sale: " + salePrice);
      System.out.println("Year: " + year);
      if(single){
         System.out.println("Single\n");
      }
      else {
         System.out.println("Double\n");
      }
   }
   public int getYear () { return year; }
   public void updatePrice (double amount) {
      costPrice = amount+costPrice;
      salePrice = salePrice+(amount*2);
   }
   public double getProfit () {
      return salePrice - costPrice;
   }

}//class
