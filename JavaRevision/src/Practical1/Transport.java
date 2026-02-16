package Practical1;
import java.util.Scanner;

/****
 * Created by: Michael Connolly
 * Created on: 29/04/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class Transport {
   static Scanner keyboard = new Scanner(System.in);



   public static int getWeight(int number){
      System.out.println("Please enter the weight of container " + number + " (in kg) or -1 to finish: ");
      int weight = keyboard.nextInt();
      keyboard.nextLine();
      return weight;
   }

   public static double calculateCost(int number, int weight){
      final int highWeight = 1000;
      final int highCost = 1200;
      double cost;
      final int lowWeight = 500;
      final int middleCost = 750;
      final int lowCost = 400;
      final int discountNum = 5;
      final double discountRate = 0.25;

      if(weight > highCost){
         cost = highCost;
      }
      else{
         if(weight > lowCost){
            cost = middleCost;
         }
         else{
            cost = lowCost;
         }
      }

      if(number <= discountNum){
         cost = cost - (cost * discountRate);
      }
      return cost;
   }

   public static void main(String[] args) {
      int weight;
      final int Terminator = -1;
      int totalWeight = 0;
      int numOfContainers = 0;
      double cost = 0;

      weight = getWeight(1);
      while(weight != -1){
         totalWeight = totalWeight+weight;
         numOfContainers++;
         weight = getWeight(numOfContainers);
      }
      cost = calculateCost(numOfContainers, totalWeight);

      System.out.println("total number of containers = " + numOfContainers);
      System.out.println("total weight of containers = " + totalWeight);
      System.out.println("total cost = £" + cost);
   }

}//class
