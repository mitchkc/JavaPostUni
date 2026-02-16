package lect10b.DeckOfCards;
import java.util.Scanner;
/****
 * Created by: Michael Connolly
 * Created on: 08/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class PlayCards {
   static Scanner kb = new Scanner(System.in);

//   private static void printDeck(Card [] pDeck){
//      for(Card card : pDeck){
//         card.printCard();
//      }
//   }

   private static void printDeck(Card [] pDeck){
      for(int i = 0; i < pDeck.length; i++){
         pDeck[i].printCard();
      }
   }

//   private static boolean sameCard (Card card1, Card card2){   // this is comparing references, not values so will always be false!!!
//      if(card1 == card2){
//         return true;
//      }
//      else{
//         return false;
//      }
//   }
   private static boolean sameCard(Card card1, Card card2){
      return card1.getSuit() == card2.getSuit() && card1.getRank() == card2.getRank();
   }

   private static int findCardPos (Card [] pDeck, Card pCard){

      for(int i = 0; i < pDeck.length; i++){
         if(sameCard(pDeck[i], pCard)){
            return i;
         }
      }
      return -1;
   }

   protected static int enterSuit (){
      int suit;
      System.out.print("1=Clubs, 2=Diamonds, 3=Hearts, 4=Spades\nEnter a suit: ");
      suit = kb.nextInt();
      return suit-1;
   }
   protected static int enterRank (){
      int rank;
      System.out.print("1=Ace, 2=2, 11=Jack etc..\nEnter a Rank: ");
      rank = kb.nextInt();
      return rank;
   }
   public static void main(String[] args) {

      final int SUIT = 4;
      final int RANK = 13;
      final int DECKSIZE = 52;
      Card [] deck = new Card[DECKSIZE];
      int index = 0;

      for(int suit = 0; suit < SUIT; suit++){
         for(int rank = 1; rank <= RANK; rank++){
            deck[index] = new Card(suit, rank);
            index++;
         }
      }

      Card myCard1 = new Card(enterSuit(), enterRank());
      myCard1.printCard();
      int pos1 = findCardPos(deck, myCard1);
      System.out.println("My Card 1 is located at position: " + pos1);

      Card myCard2 = new Card(enterSuit(), enterRank());
      myCard2.printCard();
      int pos2 = findCardPos(deck, myCard2);
      System.out.println("My Card 2 is located at position: " + pos2);


      if(sameCard(myCard1, myCard2) == true){
         System.out.println("The cards are the same");
      }
      else {
         System.out.println("The cards are different");
      }

      printDeck(deck);


   }//main
}//class
