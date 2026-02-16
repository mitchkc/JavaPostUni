package lect10a;
import java.util.Scanner;
/****
 * Created by: Michael Connolly
 * Created on: 28/08/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class exercisesPart1 {
   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);

      // ****COUNT NUMS IN ARRAY******
//      int appears = 0;
//
//   int [] count = {78, 67, 66, 60, 73, 70, 75, 67};
//   System.out.println("Enter a number: ");
//   int num = kb.nextInt();
//   //how many times does num appear in array?
//   for(int i = 0; i < count.length; i++){
//      if(count[i] == num){
//         appears++;
//      }
//   }
//      System.out.println(num + " appears " + appears + " times in the array");


      // ***** FIND NUMS IN ARRAY *****
//      int [] array = {53, 45, 30, 67, 23};
//      boolean found = false;
//      int i = 0;
//      System.out.print("Enter number: ");
//      int input = kb.nextInt();
//      while(!(found) && i < array.length){
//         if(array[i] == input){
//            found = true;
//            System.out.println("Number found at: " + i);
//         }
//         i++;
//
//      }
//      if((!found)){
//         System.out.println("num not found");
//      }

      // ***** MIN MAX *****
//      int [] list = {50, 2, 8, 34, 75, 19, 20, 44, 31, 60};
//      //print largest and smallest nums in array
//      int largest = list[0];
//      int smallest = list[0];
//      for(int i = 0; i < list.length; i++){
//
//         if(list[i] > largest){
//            largest = list[i];
//         }
//         else {
//            if(list[i] < smallest){
//               smallest = list[i];
//            }
//         }
//
//      }
//      System.out.println("Largest: " + largest + "\nSmallest: " + smallest);


      // ***** REVERSE ARRAY *****
//      int [] array = new int[6];
//      System.out.println("Enter 6 nums");
//      for (int i = 0; i < array.length; i++){
//         System.out.print("Num " + (i+1) + ": ");
//         array[i] = kb.nextInt();
//
//      }
//      for (int i = 0; i < array.length; i++){
//         System.out.print(array[i] + " ");
//      }
//      System.out.println();
//      for(int i = 5; i >= 0; i--){
//         System.out.print(array[i] + " ");
//      }


      // ***** TEST ARRAY *****
//      int [] myNums = new int[8];
//      for(int i = 0; i < myNums.length; i++){
//         System.out.print("enter num " + (i+1) + ": ");
//         myNums[i] = kb.nextInt();
//      }
//      int oddNums = 0;
//      int evenNums = 0;
//      for(int i = 0; i < myNums.length; i++){
//         if(myNums[i] % 2 == 0){
//            oddNums++;
//         }
//      }
//      if (oddNums > (myNums.length/2)){
//         evenNums = oddNums - myNums.length;
//      }
//      else {
//         evenNums = myNums.length - oddNums;
//      }
//      int total = 0;
//      for(int i = 0; i < myNums.length; i++){
//         total = myNums[i] + total;
//      }
//      double average = (double) total / myNums.length;
//
//      System.out.println("Odd numbers: " + oddNums + "\nEven nums: " + evenNums + "\nSum: " + total + "\nAverage: " + average);


      // ***** COMMISSION *****
      
   }//main
}//class
