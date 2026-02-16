package Arrays2;
import java.util.Scanner;

/****
 * Created by: Michael Connolly
 * Created on: 27/08/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class lectureMultiDArrays {
   public static void main(String[] args) {

      Scanner kb = new Scanner(System.in);

//      final int ROWS = 3;
//      final int COLUMNS = 5;
//
//      int [][] grid = new int [ROWS] [COLUMNS];
//
//      for(int row = 0; row < ROWS; row++){
//         for(int column = 0; column < COLUMNS; column++) {
//            System.out.println("Enter a number in row " + row + " column " + column + ": ");
//            grid[row][column]  = kb.nextInt();
//         }
//      }
//
//      for(int row = 0; row < ROWS; row++){
//         for (int column = 0; column < COLUMNS; column++){
//            System.out.print("\t" + grid[row][column]);
//         }
//         System.out.println();   // once inner loop hits column < COLUMNS it exits to outer loop to iterate and start again
//      }

//      int [][] grid = { {1, 2, 3, 4, 5},
//                        {6, 7, 8, 9, 10},
//                        {11, 12, 13, 14, 15} };
//
//      for(int row = 0; row < 3; row++){
//         for (int column = 0; column < 5; column++){
//            System.out.print("\t" + grid[row][column]);
//         }
//         System.out.println();
//      }
//
//      grid[2][4] = 7;
//      System.out.println();
//
//      for(int row = 0; row < 3; row++){
//         for (int column = 0; column < 5; column++){
//            System.out.print("\t" + grid[row][column]);
//         }
//         System.out.println();
//      }
//
//      for(int row = 0; row < 3; row++){
//         for (int column = 0; column < 5; column++){
//            if(grid[row][column] == 2){
//               grid[row][column] = 0;
//            }
//         }
//         System.out.println();
//      }
//
//      for(int row = 0; row < 3; row++){
//         for (int column = 0; column < 5; column++){
//            System.out.print("\t" + grid[row][column]);
//         }
//         System.out.println();
//      }

            // READ IN AND STORE NAMES AND MARKS OF STUDENTS IN 3 MODULES
      final int NUMOFSTUDENTS = 5;
      final int NUMOFMODS = 3;
      String [] names = new String[NUMOFSTUDENTS];
      int [][] marks = new int [NUMOFSTUDENTS] [NUMOFMODS];
      double [] studentAverage = new double[NUMOFSTUDENTS];
      double [] moduleAverage = new double[NUMOFMODS];

      for (int row = 0; row < NUMOFSTUDENTS; row++){
         System.out.print("Enter student name: ");
         names[row] = kb.next();
         for(int column = 0; column < NUMOFMODS; column++){
            int module = column+1;
            System.out.print("Enter " + names[row] + "'s mark for module " + module + ": ");
            marks[row][column] = kb.nextInt();
         }
         System.out.println();
      }

      for (int row = 0; row < NUMOFSTUDENTS; row++){
         int total = 0;
         for(int column = 0; column < NUMOFMODS; column++){
            total = total+marks[row][column];
         }
         studentAverage[row] = (double)total/NUMOFMODS;
      }

      for (int column = 0; column < NUMOFMODS; column++){
         int total = 0;
         for(int row = 0; row < NUMOFSTUDENTS; row++){
            total = total+marks[row][column];
         }
         moduleAverage[column] = (double)total/NUMOFSTUDENTS;
      }

      System.out.println("\nName\t\tMark 1\tMark 2\tMark 3\t Average");
      for(int row = 0; row < NUMOFSTUDENTS; row++){
         System.out.print(names[row]);
         for(int column = 0; column < NUMOFMODS; column++){
            System.out.print("\t\t" + marks[row][column]);
         }
         System.out.println("\t\t" + studentAverage[row]);
      }
      System.out.print("Module Average\t");
      for (int column = 0; column < NUMOFMODS; column++){
         System.out.print(moduleAverage[column] + "\t");
      }

   }//main
}//class
