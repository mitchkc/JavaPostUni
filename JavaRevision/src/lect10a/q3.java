package lect10a;
import javax.imageio.plugins.tiff.TIFFDirectory;
import java.util.Scanner;

/****
 * Created by: Michael Connolly
 * Created on: 02/09/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class q3 {
   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);
//
//      String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
//      String [][] timetable = new String[8][5];
////      String [][] timetable = { {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"},
////                                {"9.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00"} };
//      timetable[0][0] = "COM465";
//      timetable[2][0] = "COM564";
//      timetable[3][0] = "COM564";
//      timetable[6][0] = "COM564";
//      timetable[1][1] = "COM564";
//      timetable[2][1] = "COM564";
//      timetable[5][1] = "COM640";
//      timetable[6][1] = "COM640";
//      timetable[7][1] = "COM640";
//      timetable[2][2] = "COM465";
//      timetable[7][2] = "COM465";
//      timetable[1][4] = "COM465";
//      timetable[4][4] = "COM640";
//      timetable[5][4] = "COM640";
//
//      double time = 8.00;
//      System.out.print("\t\t\t");
//      for(int row = 0; row < 8; row++){
//         System.out.print((time+1) + "\t\t\t");
//         time++;
//      }
//      System.out.println();
//      for(int i = 0; i < days.length; i++){
//         System.out.print(days[i] + "\t\t");
//         for(int row = 0; row < 8; row++) {
//
//            if(timetable[row][i] != null){
//               System.out.print(timetable[row][i] + "\t\t\t");
//            }
//            else {
//               System.out.print("\t\t\t");
//            }
//         }
//         System.out.println();

      int [] myArray = {23, 27, 32, 45, 56, 57, 60, 67};

      int bottom = 0;
      final int SIZE = myArray.length;
      int top = SIZE-1;
      int search = 32;
      boolean found = false;
      int location = 0;

      while(!found && bottom<=top)  {
         int middle = (top + bottom) / 2;
         if(myArray[middle] == search){
            found=true;
            location = middle;
         }
         else if(myArray[middle] < search){

               bottom = middle+1;
            }
         else {
               top = middle-1;
         }

      }

      System.out.println("location of " + search + " = " + location);
   }//main
}//class
