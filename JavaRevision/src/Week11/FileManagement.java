package Week11;
import java.io.FileReader;
import java.util.Scanner;
/****
 * Created by: Michael Connolly
 * Created on: 10/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class FileManagement {

   static FileReader myFile;
   static Scanner readFile;
   public static void main(String[] args) {

      int wordCount = 0;
      String currentWord;

      try {
         myFile = new FileReader("input.txt");
         readFile = new Scanner(myFile);
      }
      catch(Exception error){
         System.out.println("File not found");
         System.out.println(error.getMessage());
      }

      try{
         while(readFile.hasNext()){
            currentWord = readFile.next();
            System.out.print(currentWord);
            wordCount=wordCount+1;
         }
         System.out.println("File contains " + wordCount + " words.");
      }
      catch (Exception error){
         System.out.println("Error reading from file");
         System.out.println("Exception " + error.getMessage() + " caught.");
      }

   }//main
}//class
