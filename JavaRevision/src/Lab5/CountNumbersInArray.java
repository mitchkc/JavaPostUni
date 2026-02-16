package Lab5;

import java.lang.reflect.Array;
import java.util.Scanner;

/****
 * Created by: Michael Connolly
 * Created on: 20/05/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class CountNumbersInArray {
   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);

      int [] array = {78, 67, 66, 60, 73, 70, 75, 67};
      int count= 0;

      System.out.println("Enter number: ");
      int num = kb.nextInt();

      for (int i = 0; i < array.length; i++){
         if (array[i] == num){
            count++;
         }
      }
      System.out.println("num appears: " + count + " times");



   }//main
}//class
