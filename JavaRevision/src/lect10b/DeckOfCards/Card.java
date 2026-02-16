package lect10b.DeckOfCards;

/****
 * Created by: Michael Connolly
 * Created on: 08/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class Card {

   private int suit;    // 1=clubs, 2=diamonds, 3=hearts, 4=spades;
   private int rank;    // 1-13 for the cards themselves

   public Card(){ }  //default constructor
   public Card (int house, int cardNum){
      suit = house;
      rank = cardNum;
   }
   public int getSuit(){
      return suit;
   }
   public int getRank(){
      return rank;
   }
   public void printCard(){
      String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};   // 0-3
      String [] ranks = {"null", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};   // 0-13
      System.out.println(ranks[rank] + " of " + suits[suit]);
   }


}//class
