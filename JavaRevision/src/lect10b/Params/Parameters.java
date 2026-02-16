package lect10b.Params;

/****
 * Created by: Michael Connolly
 * Created on: 09/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class Parameters {

   //method to return multiplication of 2 nums
   public static int multiply(int num1, int num2){
      return(num1 * num2);
   }

   public static void testPrimitives(int aNum, char aLetter, boolean aTest){
      aNum = aNum + 10;
      aLetter = 'R';
      aTest = !(aTest);
   }

   public static void testArray(char [] someLetters){
      someLetters [0] = 'X';
      someLetters [1] = 'Y';
      someLetters [2] = 'Z';
   }
}//class
