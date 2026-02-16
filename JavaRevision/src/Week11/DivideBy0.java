package Week11;
import java.util.Scanner;
/****
 * Created by: Michael Connolly
 * Created on: 10/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class DivideBy0 {
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);

      boolean valid = true;

      do {
         System.out.println("Enter a positive number: ");
         int posNum = kb.nextInt();
         System.out.println("Enter a number to divide by: ");
         int divideBy = kb.nextInt();

         try {
            System.out.println("Answer: " + posNum / divideBy);
            valid = false;
         }
         catch (Exception error) {
            System.out.print("\nCannot divide by 0\n");
         }
      }
      while (valid);


   }//main
}//class
