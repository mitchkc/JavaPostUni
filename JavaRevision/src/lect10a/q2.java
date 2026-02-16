package lect10a;
import java.util.Scanner;

/****
 * Created by: Michael Connolly
 * Created on: 27/08/2025
 * Updated on:
 * UPDATE PROGRAM DESCRIPTION HERE
 ****/
public class q2 {
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);

      String [] names = new String[5];
      int [][] marks = new int[5][3];
      double [] averageStud = new double[5];
      double [] averageMod = new double[3];
      String [] grade = new String[5];
      int total;
      final double DISTINCTION = 70;
      final double PASS = 40;


      for (int i = 0; i < names.length; i++){
         System.out.print("Enter name of student " + (i+1) + ": ");
         names[i] = kb.next();
         for(int c = 0; c < 3; c++) {
            System.out.print("Enter mark " + (c+1) + " for " + names[i] + ": ");
            marks[i][c] = kb.nextInt();
         }
         System.out.println();
      }
      for(int i = 0; i < names.length; i++){
         total = 0;
         for(int c = 0; c < 3; c++){
            total=total+marks[i][c];
         }
         averageStud[i]=(double) total/3;
      }
      for(int col = 0; col<3; col++){
         total = 0;
         for (int row = 0; row< names.length; row++){
            total=total+marks[row][col];
         }
         averageMod[col] = (double)total/5;
      }

      for(int row = 0; row < names.length; row++){
            if(averageStud[row] >= DISTINCTION) {
               grade[row] = "Distinction";
            }
            else if(averageStud[row] >= PASS){
               grade[row] = "Pass";
         }
            else {
               grade[row] = "Fail";
            }
      }

      System.out.println("\nName\t\tMark 1\tMark 2\tMark 3\tAverage\tGrade");
      for(int row = 0; row < names.length; row++){
         System.out.print(names[row]);
         for(int col = 0; col < 3; col++){
            System.out.print("\t\t" + marks[row][col]);
         }
         System.out.println("\t\t" + averageStud[row] + "\t" + grade[row]);
      }
      System.out.println("Module Average\t");
      System.out.print("\t\t\t");
      for(int i = 0; i< 3; i++){
         System.out.print("\t" + averageMod[i] + "\t");
      }

   }//main
}//class
