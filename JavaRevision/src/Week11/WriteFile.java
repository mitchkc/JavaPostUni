package Week11;

import java.io.PrintWriter;

/****
 * Created by: Michael Connolly
 * Created on: 10/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class WriteFile {

   static PrintWriter myOutFile;
   public static void main(String[] args) {

      boolean open;
      int [] marks = {45, 67, 49, 78, 90, 77};
      String myFileName = "reults.txt";

      try{
         myOutFile = new PrintWriter(myFileName);
         open = true;
      }
      catch(Exception error){
         System.out.println("Error: " + error.getMessage());
         open = false;
      }

      try{
         if(open){
            myOutFile.println(marks.length);          // printing first the number of marks in array
            for(int i = 0; i < marks.length; i++){
               myOutFile.print(marks[i] + " ");
            }
            myOutFile.println();
            myOutFile.close();
            open = false;
            System.out.println("Written and closed!");
         }
      }
      catch(Exception error){
         System.out.println("Error: " + error.getMessage());
      }
   }//main
}//class
