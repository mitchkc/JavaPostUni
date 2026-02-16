package Week11;
import java.util.Scanner;
import java.io.FileReader;

/****
 * Created by: Michael Connolly
 * Created on: 10/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class ReadFile {

   static FileReader myFile;
   static Scanner readFile;
   public static void main(String[] args) {

      int noOfMarks = 0;
      int num;

      try{
         myFile = new FileReader("marks.txt");
         readFile = new Scanner(myFile);
      }
      catch (Exception error){
         System.out.println("File not found");
         System.out.println(error.getMessage());
      }

//      try{
//         if(readFile.hasNext()){
//            noOfMarks = readFile.nextInt();
//            System.out.println("Number of marks: " + noOfMarks);
//         }
//      }
//      catch (Exception error){
//         System.out.println("Cant read # of rows");
//         System.out.println(error.getMessage());
//         return;
//      }

//      try {
//         while (noOfMarks != 0){
//            for(int i = 0; i < noOfMarks; i++){
//               num = readFile.nextInt();
//               System.out.println("Mark: " + num);
//            }
//            noOfMarks = readFile.nextInt();
//         }
//         System.out.println("End of file.");
//      }
//      catch(Exception error){
//         System.out.println(error.getMessage());
//      }


      while(readFile.hasNextInt()){
         readFile.nextInt();
         noOfMarks++;
      }

      // This reads and progresses the file to the end so that in the next loop the file is at its end and so throws an error
      // I would need an arrayList to store values as they are read to count the amount of them
      // then in the for loop print them

      try {
         do {
            for(int i = 0; i < noOfMarks; i++){
               num = readFile.nextInt();
               System.out.println("Mark: " + num);
            }
//            noOfMarks = readFile.nextInt();
         }
         while(noOfMarks!=0);
         System.out.println("Number of marks: " + noOfMarks + "\n" + "End of file.");
      }
      catch(Exception error){
         System.out.println("Error: " + error.getMessage());
      }



   }//main
}//class
