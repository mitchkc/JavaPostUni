package lect10b.Params;

/****
 * Created by: Michael Connolly
 * Created on: 09/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class TestParameters {
   public static void main(String[] args) {

         // Test Multiply
      System.out.println("------   TEST MULTIPLY   ------");
      int length, width;
      length = 20;
      width = 5;

      System.out.println("The area is: " + Parameters.multiply(length, width) + "\n\n");


         // Test Primitives
      System.out.println("-----   TEST PRIMITIVES   -----");
      int num = 0;
      char letter = 'a';
      boolean test = false;

      System.out.println("number = " + num + "\nLetter = " + letter + "\ntest = " + test);
      Parameters.testPrimitives(num, letter, test);
      System.out.println("number = " + num + "\nLetter = " + letter + "\ntest = " + test + "\n\n");
         // primitives aren't changed as only a COPY of them is passed to the method


         // TEST ARRAY
      System.out.println("-----   TEST ARRAY   -----");
      char [] letters = {'a', 'b', 'c'};
      System.out.println("Letters[0] = " + letters[0] + "\nLetters[1] = " + letters[1] + "\nLetters[2] = " + letters[2]);
      Parameters.testArray(letters);
      System.out.println("Letters[0] = " + letters[0] + "\nLetters[1] = " + letters[1] + "\nLetters[2] = " + letters[2]);
         // Array contents are changes as a COPY of the reference is passed

   }//main
}//class
